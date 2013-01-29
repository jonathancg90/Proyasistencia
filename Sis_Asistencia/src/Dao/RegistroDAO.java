
package Dao;

import Javabeans.Registro;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RegistroDAO extends ConexionBd{
    
    private Query qs;
    private Registro objRegistro;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    
    public RegistroDAO(){
        
        _table = "registro";
        _error = "Dao_RegistroDAO_";
        filter = new String[0][0];
        campos = new String[4];
        campos[0]="idreg";
        campos[1]="idtip_reg";
        campos[2]="fecha";
        campos[3]="hora";
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
    
    public int save(int idtip_reg, Time hora, String fecha, int idemp,int op){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objRegistro = new Registro(0,idemp,idtip_reg,fecha,hora,now,now);
            //Iniciando consulta y asignando valores
            if (op>0){
                pt = qs.sqlRegister(Table);
            } else {  pt = qs.sqlRegister("registro_backlog");
            }
            pt.setInt(1,objRegistro.getIdemp());
            pt.setInt(2,objRegistro.getIdtip_reg());
            pt.setDate(3,date.valueOf(objRegistro.getFecha()));
            pt.setTime(4,objRegistro.getHora());
            pt.setDate(5,date.valueOf(objRegistro.getCreated()));
            pt.setDate(6,date.valueOf(objRegistro.getModified()));
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
    
    public int update(int idreg, int idtip_reg, Time hora, String fecha, int idemp){
    int i = 0;
    
    try {
        Date date = new Date(0000-00-00);
        //Preparando
        getConexion();
        hp = new Helpers();
        qs = new Query();
        String Table = this._table;
        String now = hp.getDateNow();
        objRegistro = new Registro(idreg,idemp,idtip_reg,fecha,hora,now,now);
        pt = qs.sqlUpdate(Table);
        pt.setInt(1,objRegistro.getIdemp());
        pt.setInt(2,objRegistro.getIdtip_reg());
        pt.setDate(3,date.valueOf(objRegistro.getFecha()));
        pt.setTime(4,objRegistro.getHora());
        pt.setDate(5,date.valueOf(objRegistro.getModified()));
        pt.setInt(6, objRegistro.getIdreg());
        //Ejecucion y cierre
        i= pt.executeUpdate();
        pt.close();
        closeConexion();
        return i;
    } catch (Exception e){
        System.out.println(_error + "save: "+e);
        return i;
    }
    }
    
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objRegistro =  new Registro();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objRegistro.setIdreg(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objRegistro.getIdreg());
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
    
    
    public Registro getValues(int id){
       objRegistro =  new Registro();
       
        try{
            
            
            qs= new Query();
            //Preparando
            String campos[] = new String[8];
            campos = qs.getRecords(_table,id);
            objRegistro.setIdreg(Integer.parseInt(campos[3]));
            objRegistro.setFecha(campos[4]);
            objRegistro.setHora(Time.valueOf(campos[5]));
            objRegistro.setCreated(campos[6]);
            objRegistro.setModified(campos[7]);
            return objRegistro;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objRegistro;
        }
    }
    
    public int findId(String id, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[1][2];
                filter[0][0] = "int_idemp";
                filter[0][1] = id;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
    public int findRegFecha(String id,String inicio, String fin, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[2][2];
                filter[0][0] = "int_idemp";
                filter[0][1] = id;
                filter[1][0] = "bet_fecha_"+inicio;
                filter[1][1] = fin;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
    
    public void getTableFilter(JTable tblDatos,String inicio,String fin, int id){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            String Table = this._table;
            
            datos = qs.getFechafilter(this.campos,Table,inicio,fin,"idemp",id);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error + "getTableFechaFilter: "+e);
        }
    
    }
    
    
    
    
    
}
