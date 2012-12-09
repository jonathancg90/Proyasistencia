
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Empleado;
import Javabeans.Salarios;
import Utilitarios.Validators;
import java.math.BigDecimal;
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
    String campos[];
    private String _error;
    private String _table;
    
    PreparedStatement  pt = null;
    
     public SalariosDAO(){
        _table = "salarios";
        _error = "Dao_SalariosDAO_";
        filter = new String[0][0];
        campos = new String[4];
        campos[0]="idsalario";
        campos[1]="f_inicio";
        campos[2]="f_final";
        campos[3]="monto";
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
    public int save(String f_inicio,String f_final, boolean por_defecto,int idemp,double monto){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            Date date2 = new Date(00-00-0000);
            
            //SimpleDateFormat formato = new SimpleDateFormat("dd")
            
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            
            String now = hp.getDateNow();
            System.out.println("SI FUNCIONA "+ now);
            objSalarios = new Salarios(0,idemp,f_inicio,f_final,por_defecto,now,now,monto);
            //Iniciando consulta y asignando 

            pt = qs.sqlRegister(_table);
            pt.setInt(1,objSalarios.getIdemp());
            pt.setDate(2,date2.valueOf(objSalarios.getF_inicio()));
            pt.setDate(3,date2.valueOf(objSalarios.getF_final()));
            pt.setBoolean(4,objSalarios.isPor_defecto());
            pt.setDate(5,date.valueOf(objSalarios.getCreated()));
            pt.setDate(6,date.valueOf(objSalarios.getModified()));
            pt.setDouble(7, objSalarios.getMonto());
            
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