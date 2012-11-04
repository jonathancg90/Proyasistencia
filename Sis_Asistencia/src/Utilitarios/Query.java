
package Utilitarios;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Query extends ConexionBd{
    
    
    DefaultTableModel datos; 
    ResultSet rs = null;
    Statement s = null;
    PreparedStatement  pt = null;
    /*
     * Arma registro
     */
    public  PreparedStatement sqlRegister(String Table){
        
        pt = null;
        try{
            getConexion();
            String query;
            String campos="";
            String values="";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table);
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            
            for(int i=1;i<=nCols;i++){
                if(!meta.isAutoIncrement(i)){
                    campos = campos + meta.getColumnName(i);
                    values = values + "?";
                    if(i<nCols){
                        campos = campos + ",";
                        values = values + ","; 
                    }
                }
            }
           
            query= "insert into "+Table+" ("+campos+") values("+values+")";
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query: "+e);
            return pt;
        }
        
    }
    /*
     * Arma busqueda
     */
    public String sqlsearch(){
        
        String query="";
    
        return query;
    }
     /*
     * Arma actualizacion
     */
    public String sqlUpdate(){
        
        String query="";
    
        return query;
    }
     /*
     * Arma eliminacion
     */
    public String sqlDelete(){
        
        String query="";
    
        return query;
    }
    
    /*
     * Armado de la consulta de listado
     */
    public String getQueryList(String[] args, String Table){
        
        String qs = "select ";
        for(int i=0;i<args.length;i++){
            qs = qs + args[i];
            qs = qs + ",";
        }
        qs = qs +" from "+Table;
        qs = qs.replace(", "," ");
        
        return qs;
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
            String qs = getQueryList(args,Table);
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
