
package Utilitarios;
import java.io.*;
import java.sql.*;
import Utilitarios.Helpers;

public class Conexion {
    public Connection conexion = null;
    private Helpers hp;
    //Pruba de conexion
    public static void main(String[] args) throws SQLException {
        Conexion x = new Conexion() ;
        x.getConexion();
        x.closeConexion();
    }
    
    public void getConexion() throws SQLException{
        try{
           hp = new Helpers(); 
           
           File archivo = new File("Host.txt");
           String user = "postgres";
           String password = "sp1r4ls4c";
           String bd = "asistencia"; 
           String host= hp.readFiles(archivo);
           
           String url = "Jdbc:postgresql://"+host+"/"+bd;
           Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(url,user,password);
           if (conexion !=null){
               //System.out.println("Conexion establecida");
           }
        }
        catch (Exception e) {   
            //System.out.println("ConexionBd_getConexion: "+e);
        }
    }
    public void closeConexion(){
        try{
            conexion.close();
            //System.out.println("Conexion cerrada");
        }
        catch(Exception e){
            //System.out.println("ConexionBd_closeConexion: "+e);
        }
    }
            
    
}
