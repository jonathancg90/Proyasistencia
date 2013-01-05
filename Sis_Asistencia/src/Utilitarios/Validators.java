package Utilitarios;

import Utilitarios.ConexionBd;
import Utilitarios.Query;
import java.sql.Time;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class Validators {
    
    public static void main(String[] args){
        Validators val = new Validators();

    }
    
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
     * Conversion de String a boolean
     */
    public boolean StringToBoolean(String value){
        if("t".equals(value)){
            return true;
        }else {
            return false;
        }
        
    }
    /**
     * Validaciones de formularios
     */
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
                if(!"0".equals(a)){
                    int pres = qs.gettamColumn(this.Table,Integer.parseInt(tipos[i].toString()));
                    if(datos[i].toString().length() > pres){
                        return false;
                    }
                }
            }
         }
        }
        
    return true;
    }  
    /**
     * Validacion de fechas orden correlativo
     */
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
               date.valueOf(fin).before(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1))))||
               date.valueOf(fin).before(date.valueOf(inicio))     
               ){
                value=false;
            }
        }
        return value;
    }
    /**
     * Restriccion de maximo registros(Table, condiciones)
     */
    public boolean MaxRegistro(String[] kargs, int max){
        boolean Value = true;//ahun no llego al maximo
        qs = new Query();
        //Obtenemos la cantiad de registros 
        int ind  = kargs.length;
        String[] args = new String[ind];
        for (int i=0;i<ind;i++){
            args[i] = kargs[i];
        }
        int cant = qs.getCountRegister(args);
        System.out.println("Cantidad :"+cant+" max: "+max);
        if(max<=cant){
            return false;
        }
        
        return Value;
    }
    /**
     * Comprobar si la hora es mayor
     */
    public boolean horaMayor(Time Ma_Hora, Time Me_Hora){
        boolean Value = false;
        return Value;
    }
    /**
     * Comprobar si la fehca es mayor
     */
    public boolean fechaMayor(Date Ma_fecha, Date Me_ffecha){
        boolean Value = false;
        return Value;
    }
    //Helpers
    /**
     * Resta dos horas
     */
    public boolean restaHoras(Time iHora, Time fHora){
        boolean Value = false;
        return Value;
    }
    /**
     * Suma horas
     */
    public boolean sumaHoras(Object[] datos){
        boolean Value = false;
        return Value;
    }
}
