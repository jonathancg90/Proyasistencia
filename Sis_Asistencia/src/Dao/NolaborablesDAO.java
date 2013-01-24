
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;

import Javabeans.Nolaborables;
import Utilitarios.Validators;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Gui.WinNolaborables;
import javax.swing.JLabel;

public class NolaborablesDAO extends ConexionBd{
    
    private Query qs;
    private Nolaborables objNolaborables;
    private Helpers hp;
    private String filter[][];
    private int witdhcolum[];
    private Validators objVal;
    private String campos[];
    private String _error;
    private String _table;
    
    PreparedStatement  pt = null;
    
     
     public NolaborablesDAO(){
        _table = "nolaborables";
        _error = "Dao_NolaborablesDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idnolab";
        campos[1]="fecha";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
        
     }
    
    public void getTableAll(JTable tblDatos, JLabel lblcant){
        
        try{
            
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(this.campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    
    }
    /*
     * Registro de Salarios
     */
    public int save(String fecha,boolean status,int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Date date2 = new Date(00-00-0000);
            
            //SimpleDateFormat formato = new SimpleDateFormat("dd")
            
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            
            String now = hp.getDateNow();
            objNolaborables = new Nolaborables(0,idempr,status,fecha,now,now);
            //Iniciando consulta y asignando 

            pt = qs.sqlRegister(_table);
            pt.setDate(1,date.valueOf(objNolaborables.getFecha()));
            pt.setBoolean(2,objNolaborables.isStatus());
            pt.setDate(3,date.valueOf(objNolaborables.getCreated()));
            pt.setDate(4,date.valueOf(objNolaborables.getModified()));
            pt.setInt(5,objNolaborables.getIdempr());
            
            //Ejecucion y cierre
            
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "save: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de tipo de empleados
     */
    public int update(int idnolaborables,String fecha,boolean status ,int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objNolaborables = new Nolaborables(idnolaborables,idempr,status,fecha,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setDate(1,date.valueOf(objNolaborables.getFecha()));
            pt.setBoolean(2,objNolaborables.isStatus());
            pt.setDate(3,date.valueOf(objNolaborables.getModified()));
            pt.setInt(4,objNolaborables.getIdempr());
            pt.setInt(5,objNolaborables.getIdnolab());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "update: "+e);
            return i;
        }
    }
    
    public Nolaborables getValues(int idnolaborables){
       objNolaborables =  new Nolaborables();
       objVal = new Validators();
       
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[7];
            campos = qs.getRecords(_table,idnolaborables);
            objNolaborables.setFecha((campos[2]));
            objNolaborables.setStatus(objVal.StringToBoolean(campos[3]));
            objNolaborables.setCreated(campos[4]);
            objNolaborables.setModified(campos[5]);
            objNolaborables.setIdempr(Integer.parseInt(campos[6]));
            return objNolaborables;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objNolaborables;
        }
    }
    
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objNolaborables = new Nolaborables();
            
            qs= new Query();
            String Table = this._table;
            
            objNolaborables.setIdnolab(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objNolaborables.getIdnolab());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "delete: "+e);
            return i;
        }
        
    }
    
    public int findId(String id,JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[1][2];
                filter[0][0] = "int_idempr";
                filter[0][1] = id;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
}
