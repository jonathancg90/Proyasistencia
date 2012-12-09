
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Empleado;
import Javabeans.Salarios;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SalariosDAO extends ConexionBd {
    
    private Query qs;
    private Salarios objSalarios;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Empleado objEmp;
    private Validators objVal;
    private String _error = "Dao_SalariosDAO_";
    private String _table = "salarios";
    
    PreparedStatement  pt = null;
    
    public void getTableAll(JTable tblDatos){
        
        
    
    }
    /*
     * Registro de Salarios
     */
    public int save(String f_inicio,String f_final, boolean por_defecto,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            
            String now = hp.getDateNow();
            
            objSalarios = new Salarios(0,idemp,f_inicio,f_final,por_defecto,now,now);
            //Iniciando consulta y asignando 
            
            pt = qs.sqlRegister(_table);
            pt.setInt(1,objSalarios.getIdemp());
            pt.setDate(2,date.valueOf(objSalarios.getF_inicio()));
            pt.setDate(3,date.valueOf(objSalarios.getF_final()));
            pt.setBoolean(4,objSalarios.isPor_defecto());
            pt.setDate(5,date.valueOf(objSalarios.getCreated()));
            pt.setDate(6,date.valueOf(objSalarios.getModified()));
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
    
}