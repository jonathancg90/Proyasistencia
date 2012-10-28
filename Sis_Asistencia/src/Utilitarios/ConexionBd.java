package Utilitarios;

import java.io.*;
import java.sql.*;

public class ConexionBd {
    
    public Connection conexion = null;
    Helpers hp;
    
    /*Prueba de conexion
     */
    public static void main(String[] args) throws SQLException {
        
        ConexionBd x = new ConexionBd() ;
        x.getConexion();
    }
    
    /*Metodo de conexion por Jdbc al motor de Bd postgres
     */
    public void getConexion() throws SQLException{
        try{
           hp = new Helpers(); 
           
           File archivo = new File("Host.txt");
           String user = "postgres";
           String password = "sp1r4ls4c";
           String bd = "asistencia";
           
           String host=hp.leeArchivo(archivo);
           String url = "Jdbc:postgresql://"+host+"/"+bd;
           Class.forName("org.postgresql.Driver");
           conexion = DriverManager.getConnection(url,user,password);
           if (conexion !=null){
               System.out.println("Conexion establecida");
           }
        }
        catch (Exception e) {   
            System.out.println("ConexionBd_estableceConexion:"+e);
        }
    }      
}
