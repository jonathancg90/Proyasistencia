package Utilitarios;


public class Validators {
    
    
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
    public boolean validar(Object[] datos) {
    for (int i = 0; i <= datos.length - 1; i++) {
        if (datos[i].toString().isEmpty()) {
            return false;
        }
        }
    return true;
    }   
}
