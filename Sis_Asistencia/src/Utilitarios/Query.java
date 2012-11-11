
package Utilitarios;

import Utilitarios.Config;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Query extends ConexionBd{
    
    
    DefaultTableModel datos; 
    ResultSet rs = null;
    Statement s = null;
    PreparedStatement  pt = null;
    DefaultComboBoxModel MChoice;
    Config cf;
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
            rs = s.executeQuery("select * from "+Table +" LIMIT 1 ");
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
            System.out.println("Utilitarios_Query_sqlRegister: "+e);
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
    public PreparedStatement sqlUpdate(String Table){
        pt = null;
        
        try{
            getConexion();
            String query;
            String condi="";
            String id = "id";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table);
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            query = "update "+Table+" set ";
            
            for(int i=1;i<=nCols;i++){
                if(!meta.isAutoIncrement(i)){
                    query = query + meta.getColumnName(i)
                    //+ ",";       
                    + "=?,";
                }
                else{
                    id =  meta.getColumnName(i);
                }
            }
            //query = query + " where "+id;
            query = query + " where "+id+"= ?";
            query = query.replace(", "," ");
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query_sqlUpdate: "+e);
            return pt;
        }
    }
     /*
     * Arma eliminacion
     */
    public PreparedStatement sqlDelete(String Table){
        pt = null;
        
        try{
            getConexion();
            String query;
            String id = "id";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table);
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();

            query = "delete from  "+Table+" where  ";
            
            for(int i=1;i<=nCols;i++){
                if(meta.isAutoIncrement(i)){
                    id =  meta.getColumnName(i);
                }
            }
            query = query + id + "=?";
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query_sqlDelete: "+e);
            return pt;
        }
    }
    
    /*
     * Armado de la consulta de listado y consulta
     */
    public String getQueryList(String[] args, String Table, String[][] Filter){
        
        String qs = "select ";
        for(int i=0;i<args.length;i++)
        {
            qs = qs + args[i];
            qs = qs + ",";
        }
        qs = qs +" from "+Table;
        qs = qs.replace(", "," ");
        
        if(Filter.length>0){
            qs = qs + " where ";
            for(int i=0;i<Filter.length;i++)
            {
                qs = qs + " " + Filter[i][0] + "='" + Filter[i][1] + "' ";
                if(Filter.length!=i+1){ 
                    qs = qs + "and";
                }
            }
        }

        return qs;
    }
    
    
    /*
     * Clase generica para realizar consulas en Jtable
     */
    public  DefaultTableModel  getAll(String[] args, String Table, String[][] Filter){
        try
        {
            datos = new DefaultTableModel();
            getConexion();
            
            Object[] fila; 
            
            s = conexion.createStatement();
            String qs = getQueryList(args,Table, Filter);
            rs = s.executeQuery(qs);
            
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            datos = new DefaultTableModel();
            
            for(int i=0; i<nCols; ++i)
            {    
                datos.addColumn(meta.getColumnName(i+1));
            }
            
            //Llenado registro Jtable
            fila = new Object[nCols];
            while(rs.next())
            {
                for(int i=0; i<nCols; ++i)
                {   
                    fila[i] = rs.getObject(i+1);
                }
                datos.addRow(fila);
            }
                
           //Cerrando conexion
           rs.close();
           closeConexion(); 
           
        }
        catch(Exception e)
        {
            System.out.println("Utilitarios_Query_getAll: "+e);
        }
        
        return datos;
        }
    /*
     * Autocarga de los estados activo, inactivo
     */
    public void loadState(JComboBox cmbState){
        try
        {
            cf = new Config();
            MChoice = new DefaultComboBoxModel();
            
            MChoice.addElement(cf.G_STATES[0]);
            MChoice.addElement(cf.G_STATES[1]);
            
            cmbState.setModel(MChoice);   
        }
        catch(Exception e)
        {
            System.out.println("Utilitarios_Query_loadState: "+e);
        }
        
        
    }
     /*
     * Autocarga de los combos
     */
    public void loadChoice(JComboBox cmbChoice, String Tbl, String Campo){
        try{
            getConexion();
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            rs = s.executeQuery("select " +Campo+ " from " +Tbl);
            while(rs.next()) {
              MChoice.addElement(rs.getString("nombre"));
            }     
            
            cmbChoice.setModel(MChoice);   
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query_loadChoice: "+e);
        }
    }
     
     /*
     * Autocarga de los combos
     */
    public int idChoice(String Tbl, String Campo, String value){
        int id=0;
        try{
            getConexion();
            String identify = getIdentify(Tbl);
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            rs = s.executeQuery("select " +identify+ " from " +Tbl+ " where " +Campo+ " = '"+value+"'");
            while(rs.next()) {
                id = rs.getInt(identify);
            }     
            
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query_idChoice: "+e);
        }
        return id;
    }
    /*
     * Obtener valores de la tabla 
     */
        public  String[] getRecords(String Table,int Id){
        String campos[] = new String[0];
        try{
            getConexion();
            String query;
            String identify="";
            identify = getIdentify(Table);
            query= "select * from "+Table+" where "+ identify +" = "+Id+"";
            s = conexion.createStatement();
            rs = s.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            campos = new String[nCols+1];
            int i=1;
            rs.next();
            for(;i<=nCols;i++){
                campos[i]=rs.getString(i);
                System.out.println(i + " - " + campos[i]);
            }
            rs.close();
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println("Utilitarios_Query_getRecords: "+e);
        }
        return campos;
    }
        /*
         * Obetener el indice de una tabla
         */
        private  String getIdentify(String Table){
            String identify="id";
            try{  
                Statement s = null;

                s = conexion.createStatement();
                rs = s.executeQuery("select * from "+Table +" LIMIT 1 ");
                //Llenado Cabecera Jtable
                ResultSetMetaData meta = rs.getMetaData();
                int nCols = meta.getColumnCount();
                
                for(int i=1;i<=nCols;i++){

                    if(meta.isAutoIncrement(i)){

                        identify = meta.getColumnName(i);
                    }
                }
            }
            catch(Exception e){
                System.out.println("Utilitarios_Query_getIdentify: "+e);
            }
                
            return identify;
        }
        /*
         * Obtener la cantidad de registros en una tabla
         */
        private  int getCountRegister(String query){
            int cant=0;
            try{  
                Statement s = null;

                s = conexion.createStatement();
                rs = s.executeQuery("select count(*) from "+query);
                rs.next();
                cant = rs.getInt(1); 
            }catch(Exception e){
                System.out.println("Utilitarios_Query_getCountRegister"+e);
            }
            return cant;
         } 
}
