
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;

import Javabeans.Empleado_has_horarios;
import Utilitarios.Validators;

import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Gui.WinEmpleado_horarios;

public class Empleado_has_horariosDAO extends ConexionBd {
    
    private Query qs;
    private Empleado_has_horarios objEmp_horarios;
    private Helpers hp;
    
    private String filter[][] = new String[0][0];
    private int witdhcolum[];
    private Validators objVal;
    private String campos[];
    private String _error;
    private String _table;
    
    PreparedStatement  pt = null;
    
     
     public Empleado_has_horariosDAO(){
        _table = "empleado_has_horarios";
        _error = "Dao_Empleado_has_horariosDAO_";
        filter = new String[0][0];
        campos = new String[4];
        campos[0]="\"NMID\"";
        campos[1]="inicio";
        campos[2]="fin";
        campos[3]="idhor";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
     }
    
    public void getTableAll(JTable tblDatos){
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
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    
    }
    /*
     * Registro de Salarios
     */
    public int save(String f_inicio,String f_final, int idhor,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Date date2 = new Date(00-00-0000);
            
            //SimpleDateFormat formato = new SimpleDateFormat("dd")
            
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            
            
            objEmp_horarios = new Empleado_has_horarios(0,idemp,idhor,f_inicio,f_final);
            //Iniciando consulta y asignando 

            pt = qs.sqlRegister(_table);
            pt.setInt(1,objEmp_horarios.getIdemp());
            pt.setInt(2,objEmp_horarios.getIdhor());
            pt.setDate(3,date.valueOf(objEmp_horarios.getInicio()));
            pt.setDate(4,date.valueOf(objEmp_horarios.getFin()));
            
            
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
    public int update(int NMID,String f_inicio,String f_final, int idhor,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            
            qs= new Query();
            String Table = this._table;
            
            
            objEmp_horarios = new Empleado_has_horarios(NMID,idemp,idhor,f_inicio,f_final);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(1,objEmp_horarios.getIdemp());
            pt.setInt(2,objEmp_horarios.getIdhor());
            pt.setDate(3,date.valueOf(objEmp_horarios.getInicio()));
            pt.setDate(4,date.valueOf(objEmp_horarios.getFin()));
            pt.setInt(5,objEmp_horarios.getNMID());
            
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
    
    public Empleado_has_horarios getValues(int NMID){
       objEmp_horarios =  new Empleado_has_horarios();
       
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords(_table,NMID);
            objEmp_horarios.setIdemp(Integer.parseInt(campos[2]));
            objEmp_horarios.setIdhor(Integer.parseInt(campos[3]));
            objEmp_horarios.setInicio(campos[4]);
            objEmp_horarios.setFin(campos[5]);
            
            
            return objEmp_horarios;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objEmp_horarios;
        }
    }
    
    public int delete(int NMID){
       int i=0;
        try{
            //Preparando
            getConexion();
            objEmp_horarios =  new Empleado_has_horarios();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objEmp_horarios.setNMID(NMID);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmp_horarios.getNMID());
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
    
    public int findId(String id,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[1][2];
                filter[0][0] = "int_idemp";
                filter[0][1] = id;
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
    
}
