package Utilitarios;
<<<<<<< HEAD
import Utilitarios.Data;
=======
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.sql.Date;
>>>>>>> b0e12efe963a703c7430e34180b79735f84bccf0

public class Validators {
    Data objdato;
    
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
    public boolean validar(Object[] datos,Object[] tipos) {
        objdato= new Data();
    for (int i = 0; i <= datos.length - 1; i++) {
        if (datos[i].toString().isEmpty()) {
            String a =tipos[i].toString();
            switch(a){
                    case "nombre":
                    case "apellido":
                    case "ubicacion":
                    case "direccion":
                    case "correo":if(a.length()<=objdato.DIMENTION[3]){return false;}break;
                    case "dni":
                    case "telefono":if(a.length()!=objdato.DIMENTION[0]){return false;}break;
                    case "ruc":
                    case "simbolo":if(a.length()!=objdato.DIMENTION[1]){return false;}break;
                    case "recibo":
                    case "ipcliente":if(a.length()!=objdato.DIMENTION[2]){return false;}break; 
                    case "username":
                    case "password":if(a.length()<=objdato.DIMENTION[4]){return false;}break;
                    case "motivo":if(a.length()!=objdato.DIMENTION[7]){return false;}break;
                    case "exception":if(a.length()<=objdato.DIMENTION[8]){return false;};
            }
            
         }
        
        }
    System.out.println(tipos[1].toString()+"<-->"+objdato.DIMENTION[3]+"<-->"+tipos[1].toString().length());
        
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
