
package Dao;
import Utilitarios.ConexionBd;
import java.sql.*;

public class UserDAO extends ConexionBd{
    
    ResultSet rs = null;
    Statement s = null;
    
    public static void main(String[] args) throws SQLException {
        UserDAO x = new UserDAO() ;
        System.out.println(x.userAuth("JONATHAN", "123"));
    }
    
    /* Validacion de ingreso de usuarios al sistema
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
            return result;

        }
        catch(Exception e){
            System.out.println("Dao_userAuth: "+e);
            return false;
        }
    }
            
    
}
