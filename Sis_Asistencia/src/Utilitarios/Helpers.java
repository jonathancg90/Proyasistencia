
package Utilitarios;

import java.io.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Helpers extends ConexionBd{
    
    DefaultTableModel datos; 
    ResultSet rs = null;
    Statement s = null;
    
    /*
     * Metodo optener contenido de un archivo de texto
     */
    public String leeArchivo(File lectura) throws IOException{
        
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String Str_Texto="";
        while ((renglon = entrada.readLine()) != null){
            for (int i = 0; i < renglon.length(); i++){
               Str_Texto += String.valueOf(renglon.charAt(i)); 
            }
        }
    return Str_Texto;
    }
    
    /*
     * Clase generica para realizar consulas en Jtable
     */
    
    public  DefaultTableModel  getAll(String[] args, String Table){
        try{
            datos = new DefaultTableModel();
            getConexion();
            
            Object[] fila; 
            
            s = conexion.createStatement();
            String qs = "select ";
            for(int i=0;i<args.length;i++){
                qs =qs + args[i];
            }
            qs = qs +" from "+Table;
            rs = s.executeQuery(qs);
            
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            datos = new DefaultTableModel();
            
            for(int i=0; i<nCols; ++i){    
                datos.addColumn(meta.getColumnName(i+1));
            }
            
            //Llenado registro Jtable
            fila = new Object[nCols];
            while(rs.next()){
                for(int i=0; i<nCols; ++i){   
                    fila[i] = rs.getObject(i+1);
                }
                datos.addRow(fila);
            }
                
           //Cerrando conexion
           rs.close();
            closeConexion(); 
            
        }
        catch(Exception e){
            System.out.println("Utilitarios_Helpers: "+e);
        }
        
        return datos;
        }
    
}
