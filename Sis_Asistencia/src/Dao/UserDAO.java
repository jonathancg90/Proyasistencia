
package Dao;

import Javabeans.Area;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserDAO extends ConexionBd{
    
    ResultSet rs = null;
    Statement s = null;
    private Query qs;
    private Usuario objUsu;
    private Validators objVal;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private String _error="UserDAO_";
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
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
        catch(Exception e){
            System.out.println(_error+"getTableAll: "+e);
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
                    + "and pass='"+pas+"'";

            rs = s.executeQuery(qs);
            result = rs.next();
            
            closeConexion();
            rs.close();
            
            return result;

        }
        catch(Exception e){
            System.out.println(_error+"Auth: "+e);
            return false;
        }
    }     
    /*
     * Registro de usuarios
     */
    public int saveUsuario(String username, String password,int idemp,boolean estado,int rol){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "usuario";
            String now = hp.getDateNow();
            
            objUsu = new Usuario(0,username,password,idemp,now,now,estado,rol);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objUsu.getIdemp());
            pt.setString(2,objUsu.getUsername());
            pt.setString(3,objUsu.getPassword());
            pt.setDate(4,date.valueOf(objUsu.getCreated()));
            pt.setDate(5,date.valueOf(objUsu.getModified()));
            pt.setBoolean(6, objUsu.isEstado());
            pt.setInt(7, objUsu.getRol());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"saveUsuario: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de Usuario
     */
    public int updateUsuario(int id,String username, String password, int emp, boolean estado,int rol){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "usuario";
            String now = hp.getDateNow();
            
            objUsu = new Usuario(id,username,password,emp,now,now,estado,rol);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
           
            pt.setInt(1,objUsu.getIdemp());
            pt.setString(2,objUsu.getUsername());
            pt.setString(3,objUsu.getPassword());
            pt.setDate(4,date.valueOf(objUsu.getModified()));
            pt.setBoolean(5, objUsu.isEstado());
            pt.setInt(6, objUsu.getRol());
            pt.setInt(7, objUsu.getIdusu());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"update: "+e);
            return i;
        }
    }
    /*
     * Eliminar 
     */
    public int deleteUsuario(int idusu){
       int i=0;
        try{
            //Preparando
            getConexion();
            objUsu = new Usuario();
            hp = new Helpers();
            qs= new Query();
            String Table = "usuario";
            
            objUsu.setIdusu(idusu);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objUsu.getIdusu());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"delete: "+e);
            return i;
        }
    }
     /*
     * Filtros de busqueda
     */
    public int find(String state,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(state)){
                filter = new String[1][2];
                filter[0][0] = "estado";
                filter[0][1] = state; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
     /*
     * Cargar valores de busqueda al modelo 
     */
    public Usuario getValues(int idusu){
       objUsu =  new Usuario();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[8];
            campos = qs.getRecords("usuario",idusu);
            objUsu.setIdemp(Integer.parseInt(campos[2]));
            objUsu.setUsername(campos[3]);
            objUsu.setPassword(campos[4]);
            objUsu.setCreated(campos[5]);
            objUsu.setModified(campos[6]);
            objUsu.setEstado(objVal.StringToBoolean(campos[7]));
            objUsu.setRol(Integer.parseInt(campos[8]));
            System.out.println("roles -"+campos[8]);
            
            return objUsu;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objUsu;
        }
    }
}
