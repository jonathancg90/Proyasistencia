
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import Javabeans.Tipoempleado;
import Javabeans.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoEmpleadoDAO extends ConexionBd{
    
    private Query qs;
    private Tipoempleado objtipoemp;
    private Usuario objUsu;
    private Helpers hp;
    private Validators objVal;
    private String filter[][] = new String[0][0];
    
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de los tipos de empleados
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String campos[] = new String[2];
            campos[0]="idtip";
            campos[1]="nombre";
            String Table = "tipoempleado";
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_TipoEmpleadoDAO_getTableAll: "+e);
        }
    
    }
    /*
     * Registro de tipo de empleados
     */
    public int save(String name, boolean state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "tipoempleado";
            String now = hp.getDateNow();
            
            objtipoemp = new Tipoempleado(0,name,now,now,state);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objtipoemp.getName());
            pt.setBoolean(2,objtipoemp.isEstado());
            pt.setDate(3,date.valueOf(objtipoemp.getCreated()));
            pt.setDate(4,date.valueOf(objtipoemp.getModified()));
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipoEmpleadoDAO_save: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de tipo de empleados
     */
    public int update(int id, String name, boolean state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "tipoempleado";
            String now = hp.getDateNow();
            
            objtipoemp = new Tipoempleado(id,name,now,now,state);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objtipoemp.getName());
            pt.setBoolean(2,objtipoemp.isEstado());
            pt.setDate(3,date.valueOf(objtipoemp.getModified()));
            pt.setInt(4,objtipoemp.getIdtip());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipoEmpleadoDAO_update: "+e);
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
            objtipoemp = new Tipoempleado();
            hp = new Helpers();
            qs= new Query();
            String Table = "tipoempleado";
            
            objtipoemp.setIdtip(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objtipoemp.getIdtip());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipoEmpleadoDAO_delete: "+e);
            return i;
        }
    }
    
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println("Dao_TipoEmpleadoDAO_find : "+e);
        }
        return i;
    }
    

    /*
     * Cargar valores de busqueda al modelo 
     */
    public Tipoempleado getValues(int idusu){
       objtipoemp =  new Tipoempleado();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords("tipoempleado",idusu);
            objtipoemp.setName(campos[2]);
            System.out.println("Estado: "+objVal.StringToBoolean(campos[3]));
            objtipoemp.setEstado(objVal.StringToBoolean(campos[3]));
            objtipoemp.setCreated(campos[4]);
            objtipoemp.setModified(campos[5]);
            
            return objtipoemp;
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO_getValues: "+e);
            return objtipoemp;
        }
    }
    
}
