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
import Utilitarios.Data;



public class Validators {
    
    public static void main(String[] args){
        Validators val = new Validators();

    }
    
    Data objdato;
    private ResultSet rs = null;
    private Statement s = null;
    private String Table;
    private Query qs;
    private Data dt;

    public void setTable(String Table) {
        this.Table = Table;
    }
    public Validators(String table){
        this.Table = table;
    }

    public Validators() {
    }
    public boolean UserAcces(int Form, int User) {
        boolean vali = true;
        if(User == 0){
            return true;
        }
        dt = new Data();
        qs = new Query();
        String[] args= new String[5];
        
        int mod = Integer.parseInt(qs.idChoice("modulos", "nombre", dt.G_MODULOS[Form]));
        qs.setIdentify("idrol");
        int rol = Integer.parseInt(qs.idChoice("usuario", "idusu", ""+User));
        args[0] = "permisos_has_roles";
        args[1] = "idrol";
        args[2] = ""+rol;
        args[3] = "idmod";
        args[4] = ""+mod;
        
        
        if(qs.getCountRegister(args) <= 0) {
            vali = false;
        }
        
        return vali;
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
    public boolean validarFechasTablas(JTable tbldatos,String inicio,String fin){
        Date date = new Date(0000-00-00);
        
        
        TableModel tablemodel=tbldatos.getModel();
        int rows= tablemodel.getRowCount();
        
        for(int i=0;i<rows;i++){
            if(date.valueOf(inicio).equals(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) ||
               date.valueOf(fin).equals(date.valueOf(String.valueOf(tablemodel.getValueAt(i,2)))) ||
               (date.valueOf(inicio).after(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) &&
               date.valueOf(inicio).before(date.valueOf(String.valueOf(tablemodel.getValueAt(i,2))))) ||  
               (date.valueOf(fin).after(date.valueOf(String.valueOf(tablemodel.getValueAt(i,1)))) &&
               date.valueOf(fin).before(date.valueOf(String.valueOf(tablemodel.getValueAt(i,2)))))
               
               ){
                return false;
            }
        }
        return true;
    }
    
    public boolean validarFechas(String inicio,String fin){
    Date date = new Date(0000-00-00);
    
    if (date.valueOf(fin).before(date.valueOf(inicio))||
        date.valueOf(inicio).equals(date.valueOf(fin))) {
        return false;
    }
    return true;
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
        if(max<=cant){
            return false;
        }
        
        return Value;
    }
    /**
     * Comprobar si la hora es mayor(Hayor,Menor)
     */
    public boolean horaMayor(Time Ma_Hora, Time Me_Hora){
        boolean Value = false;
        if(Ma_Hora.compareTo(Me_Hora) > 0){
            Value = true;
        }
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
     
    public boolean validarRegistro(String [] args, int op, Time hra){
        boolean Value = false;
        qs = new Query();
        int max = qs.getCountRegister(args);
        Time hora [] =qs.getHora(args, max);
        if (hora.length == 0 || horaMayor(hra, hora[max])) {
            if (max == 0 && op == 1) {
                    Value = true;
            }
            else if (max == 1 && op == 2 ) {
                    Value = true;
            }
            else if (max == 2 && op == 1 ) {
                    Value = true;
            }
            else if (max == 3 && op == 2 ) {
                    Value = true;
            }
        }    
        return Value;
    }
    public String getHora(String campo,String extra, String [] args){
        qs = new Query();
        String result = ""; 
        if("".equals(campo)) {
            campo =  "count(*)";
        }
        //d.ingreso,d.salida
        // idtip_reg = trabajo, refrigerio
        //Tipo de reg = trabajo refrigerio
        String query = "   select " + campo + "\n" +
                       " from empleado_has_horarios e, detailhorario d\n" +
                       " where \n" +
                       " d.horarios_idhor = e.idhor\n" +
                       " and idemp=" + args[0] + " \n" +
                       " and d.dia = " + args[1] + "\n" +
                       " and idtip_reg = " + args[2] + "\n" +
                       " and '" + args[3] + "'>=e.inicio and '" + args[3] + "'<=e.fin " + "\n" +
                       extra;
        //and d.ingreso < '9:00'
        System.out.println(query);
        result = qs.Execute(query);
        
        return result;
    }
}
