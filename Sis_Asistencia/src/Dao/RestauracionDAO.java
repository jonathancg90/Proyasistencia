
package Dao;

import Utilitarios.ConexionBd;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class RestauracionDAO extends ConexionBd{
    ResultSet rs = null;
    Statement s = null;
    
        public  String getpass(String username){
            String pass="";
            try{
                getConexion();
                String query;
                query= "select* from usuario where username = " + "'"+username+"'";
                s = conexion.createStatement();
                rs = s.executeQuery(query);
                
                while(rs.next()) {
                    pass = rs.getString("pass");
                }
                rs.close();
                closeConexion();
            }
            catch(Exception e){
                System.out.println("RestauracionDAO getpass: "+e);
            }
            System.out.println("el pass es " +pass);
            return pass;
        }
        
        
        public  String getcorreo(String username){
            String correo="";
            try{
                getConexion();
                String query;
                query= "select* from usuario where username = " + "'"+username+"'";
                s = conexion.createStatement();
                rs = s.executeQuery(query);

                while(rs.next()) {
                    correo = rs.getString("correo");
                }
                rs.close();
                closeConexion(); 
            }
            catch(Exception e){
                System.out.println("RestauracionDAO getcorreo: "+e);
            }
            System.out.println("el correo es " +correo);
            return correo;
        }
}
