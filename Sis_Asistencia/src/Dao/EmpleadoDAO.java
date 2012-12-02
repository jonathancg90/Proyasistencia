
package Dao;


import Javabeans.Empleado;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoDAO extends ConexionBd{
    
    ResultSet rs = null;
    Statement s = null;
    private Query qs;
    private Empleado objEmpl;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            System.out.println("hola");
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String campos[] = new String[2];
            campos[0]="idusu";
            campos[1]="username";
            String Table = "usuario";
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("UserDAO_getTableAll: "+e);
        }
    
    }
    /* 
     * Validacion de ingreso de usuarios al sistema
     */
    public boolean userAuth(String user, String pas){
        boolean result;
        try{
            getConexion();
           
            s = conexion.createStatement();
            String qs = "select * from usuario "
                    + "where username='"+user+"' "
                    + "and password='"+pas+"'";

            rs = s.executeQuery(qs);
            result = rs.next();
            
            closeConexion();
            rs.close();
            
            return result;

        }
        catch(Exception e){
            System.out.println("UserDAO_Auth: "+e);
            return false;
        }
    }     
    /*
     * Registro de usuarios
     */
    public int saveEmpleado(int idemp,String nombres, String apellidos, String dni, String telefono, int idare, int idtip, int idest, int idcar, int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "usuario";
            String now = hp.getDateNow();
            
            objEmpl = new Empleado( idemp,  nombres, apellidos, dni,  telefono,  now, 1,now, now, idare, idtip, idest,  idcar,  idempr);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
           /*
            pt.setString(1,objUsu.getUsername());
            pt.setString(2,objUsu.getPassword());
            pt.setBoolean(3, objUsu.isEstado());
            pt.setString(4,objUsu.getCreated());
            pt.setString(5,objUsu.getModified());*/
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("UserDAO_saveUsuario: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de Usuario
     */
    public int updateEmpleado(int idemp,String nombres, String apellidos, String dni, String telefono, int idare, int idtip, int idest, int idcar, int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "usuario";
            String now = hp.getDateNow();
            
            objEmpl = new Empleado(idemp,  nombres, apellidos, dni,  telefono,  now, 1,now, now, idare, idtip, idest,  idcar,  idempr);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
           
           /* pt.setString(1,objUsu.getUsername());
            pt.setString(2,objUsu.getPassword());
            pt.setBoolean(3, objUsu.isEstado());
            pt.setString(4,objUsu.getCreated());
            pt.setString(5,objUsu.getModified());*/
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("UserDAO_update: "+e);
            return i;
        }
    }
    /*
     * Eliminar 
     */
    public int deleteEmpleado(int idemp){
       int i=0;
        try{
            //Preparando
            getConexion();
            objEmpl = new Empleado();
            hp = new Helpers();
            qs= new Query();
            String Table = "usuario";
            
            objEmpl.setIdemp(idemp);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmpl.getIdemp());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("UserDAO_delete: "+e);
            return i;
        }
    }
    
}
