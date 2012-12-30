package Utilitarios;
import Utilitarios.ConexionBd;
import Utilitarios.Query;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Validators {
    Data objdato;
    private ResultSet rs = null;
    private Statement s = null;
    private String Table;
    private Query qs;

    public void setTable(String Table) {
        this.Table = Table;
    }
    public Validators(String table){
        this.Table = table;
    }

    public Validators() {
    }
    
    /**
     * Gestor de validaciones de formulario
     */
    public boolean formValidate(){ 
        boolean validate = false;
        
        
        
        return validate;
    }
    
    private void useComponent(int op){
        
        switch(op) {
            case 1: ;break;
            case 2: ;break;
            default : ;break;
        }
        
    }
    /**
     * Validador de entrada y salida a formualrios (1=abierto, 0=cerrado)
     */
    public boolean EntryForms(){
            boolean acces= false;
            
        switch(Utilitarios.Config.OPENWINDOWS){
            case 0: Utilitarios.Config.OPENWINDOWS = 1; 
                    acces = true;
            break;
            case 1: 
                    acces = false;
           break;
        }
                        
        
        
        return acces;
    }
    
    public boolean restrictAcces(){
        boolean acces= false;
            
        
        
        
        return acces;
    }
    
    
    /**
     * Validador de campos vacios
     */
    private  boolean validateEmpty(){
      boolean error=false;
 
      return error;
    }
    /**
     * Validador de solo letras 
     */
    private  boolean validateLeters(){
        boolean error=false;
        
        return error;
    }
    /**
     * Validador solo numeros (enteros o decimal)
     */
    private  boolean validateNumber(){
        boolean error=false;
        
        return error;
    }
    
    public boolean StringToBoolean(String value){
        if("t".equals(value)){
            return true;
        }else {
            return false;
        }
        
    }
    public boolean validar(Object[] datos,Object[] tipos) throws SQLException {
    objdato= new Data();
    qs = new Query();
    for (int i = 0; i <= datos.length - 1; i++) {
        if (datos[i].toString().isEmpty()) {
           return false;
        } 
        else {
            if(tipos.length != 0){
                String a =tipos[i].toString();
                int pres = qs.gettamColumn(this.Table,Integer.parseInt(tipos[i].toString()));
                if(datos[i].toString().length() > pres){
                    return false;
                }
            }
         }
        }
        
    return true;
    }  
    
    public boolean validarFechas(JTable tbldatos,String inicio,String fin){
        Date date = new Date(0000-00-00);
        
        boolean value;
        value=true;
        
        TableModel tablemodel=tbldatos.getModel();
        int rows= tablemodel.getRowCount();
        
        for(int i=0;i<rows;i++){
            
            if(date.valueOf(inicio).equals(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) ||
               date.valueOf(fin).equals(date.valueOf(String.valueOf(tablemodel.getValueAt(i,2)))) ||
               date.valueOf(inicio).after(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) &&
               date.valueOf(inicio).before(date.valueOf(String.valueOf(tablemodel.getValueAt(i,2)))) ||  
               date.valueOf(fin).after(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) &&
               date.valueOf(fin).before(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1))))     
                    ){
                
                value=false;
            }
        
        }
        
      
        return value;
    }
}
