
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import Javabeans.Cargo;
import Javabeans.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CargosDAO extends ConexionBd{

    private Query qs;
    private Cargo objCargo;
    private Helpers hp;
    private Validators objVal;
    
    private String filter[][];
    private int witdhcolum[];
    private String _table;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
     public CargosDAO(){
        _table = "cargo";
        _error = "Dao_CargoDao_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idcar";
        campos[1]="nombre";
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
            datos = qs.getAll(campos,this._table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error+"getTableAll: "+e);
        }
    
    }
    /*
     * Filtros de busquedas
     */
     public int find(String idare, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(idare)){
                filter = new String[1][2];
                filter[0][0] = "int_idare";
                filter[0][1] = idare;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO_find : "+e);
        }
        return i;
    }
    /*
     * Registro de areas
     */
    public int save(int idArea, String name){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objCargo = new Cargo(0,name,idArea,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objCargo.getIdare());
            pt.setString(2,objCargo.getName());
            pt.setDate(3,date.valueOf(objCargo.getCreated()));
            pt.setDate(4,date.valueOf(objCargo.getModified()));
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
     * Actualizacion de areas
     */
    public int update(int id, int idArea, String name){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objCargo = new Cargo(id,name,idArea,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(1,objCargo.getIdare());
            pt.setString(2,objCargo.getName());
            pt.setDate(3,date.valueOf(objCargo.getModified()));
            pt.setInt(4,objCargo.getIdcar());
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
     /*
     * Eliminar 
     */
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objCargo = new Cargo();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objCargo.setIdcar(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objCargo.getIdcar());
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
    public Cargo getValues(int id){
       objCargo =  new Cargo();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords(_table,id);
            objCargo.setName(campos[3]);
            objCargo.setModified(campos[5]);
            
            return objCargo;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objCargo;
        }
    }

}
    