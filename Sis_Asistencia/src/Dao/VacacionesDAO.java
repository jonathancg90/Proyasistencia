
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;

import Javabeans.Vacaciones;
import Utilitarios.Validators;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Gui.WinVacaciones;

public class VacacionesDAO extends ConexionBd {
    
    private Query qs;
    private Vacaciones objVacaciones;
    private Helpers hp;
    private String filter[][];
    private int witdhcolum[];
    private Validators objVal;
    String campos[];
    private String _error;
    private String _table;
    
    PreparedStatement  pt = null;
    
     
     public VacacionesDAO(){
        _table = "vacaciones";
        _error = "Dao_VacacionesDAO_";
        filter = new String[0][0];
        campos = new String[3];
        campos[0]="idvacaciones";
        campos[1]="f_inicio";
        campos[2]="f_final";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
        
     }
    
    public void getTableAll(JTable tblDatos){
        
        try{
            
            DefaultTableModel datos;
            qs= new Query();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(this.campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println(_error + "getTableAll: "+e);
        }
    
    
    }
    /*
     * Registro de Salarios
     */
    public int save(String f_inicio,String f_final,int idemp){
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
            objVacaciones = new Vacaciones(0,idemp,f_inicio,f_final,now,now);
            //Iniciando consulta y asignando 

            pt = qs.sqlRegister(_table);
            pt.setInt(1,objVacaciones.getIdemp());
            pt.setDate(2,date.valueOf(objVacaciones.getF_ini()));
            pt.setDate(3,date.valueOf(objVacaciones.getF_final()));
            pt.setDate(4,date.valueOf(objVacaciones.getCreated()));
            pt.setDate(5,date.valueOf(objVacaciones.getModified()));
            
            
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
    public int update(int idsalario,String f_inicio,String f_final,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objVacaciones = new Vacaciones(idsalario,idemp,f_inicio,f_final,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(1,objVacaciones.getIdemp());
            pt.setDate(2,date.valueOf(objVacaciones.getF_ini()));
            pt.setDate(3,date.valueOf(objVacaciones.getF_final()));
            pt.setDate(4,date.valueOf(objVacaciones.getModified()));
            pt.setInt(5,objVacaciones.getIdvac());
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
    
    public Vacaciones getValues(int idVacaciones){
       objVacaciones =  new Vacaciones();
       
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[7];
            campos = qs.getRecords(_table,idVacaciones);
            objVacaciones.setIdemp(Integer.parseInt(campos[2]));
            objVacaciones.setF_ini(campos[3]);
            objVacaciones.setF_final(campos[4]);
            objVacaciones.setCreated(campos[5]);
            objVacaciones.setModified(campos[6]);
            
            
            return objVacaciones;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objVacaciones;
        }
    }
    
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objVacaciones = new Vacaciones();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objVacaciones.setIdvac(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objVacaciones.getIdvac());
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
}
