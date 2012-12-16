
package Utilitarios;

import Utilitarios.Data;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Query extends ConexionBd{
    
    
    DefaultTableModel datos; 
    ResultSet rs = null;
    Statement s = null;
    PreparedStatement  pt = null;
    DefaultComboBoxModel MChoice;
    Data dt;
    String _error = "Utilitarios_Query_";
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
            System.out.println(_error+"sqlRegister: "+e);
            return pt;
        }
        
    }
    /*
     * Arma busqueda
     */
    public String sqlSearch(){
        
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
            rs = s.executeQuery("select * from "+Table+" LIMIT 1 ");
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            query = "update "+Table+" set ";
            
            for(int i=1;i<=nCols;i++){
                if(!meta.isAutoIncrement(i)){
                    for(int x=0;x<Utilitarios.Data.G_EXCLUDE.length;x++){
                        if(meta.getColumnName(i).equals(Utilitarios.Data.G_EXCLUDE[x])){
                            //Este campo ha sido excluido
                        } else {
                            query = query + meta.getColumnName(i)+ "=?,";
                        }
                    }  

                }
                else{
                    id =  meta.getColumnName(i);
                }
            }
            query = query + " where "+id+"= ?";
            query = query.replace(", "," ");
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println(_error+"sqlUpdate: "+e);
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
            rs = s.executeQuery("select * from "+Table+" LIMIT 1 ");
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
            System.out.println(_error+"sqlDelete: "+e);
            return pt;
        }
    }
    
    /*
     * Armado de la consulta de listado y consulta
     */
    public String getQueryList(String[] args, String Table, String[][] Filter){
        String type;
        String camp;
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
                type = Filter[i][0].substring(0, 3);
                camp = Filter[i][0];
                camp = camp.substring(4, camp.length());
                
                switch(type){
                    case "int":qs = qs + " " + camp + "=" + Filter[i][1] + " ";
                         break;
                    case "equ":qs = qs + " " + camp + "='" + Filter[i][1] + "' ";
                         break;
                    default:qs = qs + " " + Filter[i][0] + " like '%" + Filter[i][1] + "%' ";
                         break;
                    
                }

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
            System.out.println(_error+"getAll: "+e);
        }
        
        return datos;
        }
    /*
     * Autocarga de los estados activo, inactivo
     */
    public void loadState(JComboBox cmbState, boolean value){
        try{
            dt = new Data();
            MChoice = new DefaultComboBoxModel();
            if(value == false){
                MChoice.addElement(dt.G_STATES[0]);
                MChoice.addElement(dt.G_STATES[1]);
            }
            else{
                MChoice.addElement(dt.G_STATES[1]);
                MChoice.addElement(dt.G_STATES[0]);
            }
                
            cmbState.setModel(MChoice);   
        }
        catch(Exception e){
            System.out.println(_error+"loadState: "+e);
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
              MChoice.addElement(rs.getString(Campo));
            }     
            
            cmbChoice.setModel(MChoice);   
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"loadChoice: "+e);
        }
    }
       /*
     * Autocarga de los combos
     */
    public void loadChoiceDefault(JComboBox cmbChoice, String Tbl, String Campo, int value){
        try{
            getConexion();
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            String identify = getIdentify(Tbl);
            
            rs = s.executeQuery("select " +Campo+ " from " +Tbl + " where " + identify + "=" +value);
            while(rs.next()) {
              MChoice.addElement(rs.getString(Campo));
            }
            rs = s.executeQuery("select " +Campo+ " from " +Tbl + " where " + identify + "!=" +value);
            
            while(rs.next()) {
              MChoice.addElement(rs.getString(Campo));
            } 
            
            cmbChoice.setModel(MChoice);   
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"loadChoiceDefault: "+e);
        }
    }
     
     /*
     * Me devuelve el id de 
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
            System.out.println(_error+"idChoice: "+e);
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
            
            rs.next();
            for(int i=1;i<=nCols;i++){
                if(campos[i]==null){
                campos[i]="holaaaaa";
                }
                campos[i]=rs.getString(i);
                
            }
            rs.close();
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"getRecords: "+e);
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
                System.out.println(_error+"getIdentify: "+e);
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
                System.out.println(_error+"getCountRegister"+e);
            }
            return cant;
         }

   
            
        }
        

