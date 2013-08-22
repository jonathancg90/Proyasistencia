
package Utilitarios;

import java.io.*;
import java.util.Calendar;
import javax.swing.JTable;
import Utilitarios.Data;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

/**
* Clase para facilitar procesos externos del sistema
* @author Jonathan Carrasco
* @version Worktec 1.0
*/
public class Helpers {

    private Data dt;
    /**
     * Metodo para leer el contenido de un txt.
     * @return Texto del file
     */
    public String readFiles(File lectura) throws IOException{
        
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String Str_Texto="";
        while ((renglon = entrada.readLine()) != null) {
            for (int i = 0; i < renglon.length(); i++) {
               Str_Texto += String.valueOf(renglon.charAt(i)); 
            }
        }
    return Str_Texto;
    }
    /**
     * Obtener la fecha actual.
     */
    public String getDateNow(){
        String date;
        
        Calendar c = Calendar.getInstance();
        int mesact = c.get(Calendar.MONTH);
        if(mesact == 0){
            mesact = mesact +1;
        }
        
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(mesact);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        date = annio+"-"+mes+"-"+dia;
                
        return date;
    }
     /**
     * Modificar el tamaño de columnas de los Jtable.
     */
    public void setWidthJtable(JTable tblDatos, int[] args) {
        for(int i=0;i<args.length;i++){
            tblDatos.getColumnModel().getColumn(i).setPreferredWidth(args[i]);
            tblDatos.getColumnModel().getColumn(i).setMinWidth(args[i]);
            tblDatos.getColumnModel().getColumn(i).setMaxWidth(args[i]);    
        }
    }
     /**
     * Formatear fecha ().
     */
    public String getFormatDate(String fecha)
    {
        String date;
        String [] arrayfecha = fecha.split("-");
        date = arrayfecha[2]+"-"+arrayfecha[1]+"-"+arrayfecha[0];
        return date;
    }
    /**
     * Convertir hora y minuto a decimal.
     */
    public double getConvertTime(String hora)
    {
        double convert;
        String [] arrayfecha = hora.split(":");
        convert = Double.parseDouble(arrayfecha[0]+"."+arrayfecha[1]);
        return convert;
    }
    /**
     * Obtener valores de una constante.
     */
    public String[] getConstantData(String op){
        dt = new Data();
        String[] camp;
        switch(op){
            case "G_TIPOREG": camp = dt.G_TIPOREG;break;
            case "G_TIPOH": camp = dt.G_TIPOH;break;
            case "G_DIAS": camp = dt.G_DIAS;break;
            default: camp = new String[0];
        }
        
        return camp;
    } 
    
    public String formatFecha(String fecha) {
        String fechFormato = "";
        String[] temp;
        temp = fecha.split("-");
        fechFormato = temp[2] + "-" + temp[1] + "-" + temp[0];
        return fechFormato;
    }
    /*
     * Conversion de spiner a calendar
    */
    public Calendar getCalendar(JSpinner hora, JSpinner min, JComboBox tiempo) throws ParseException {
        Calendar cal = Calendar.getInstance();
        
        int i_hora = Integer.parseInt(hora.getValue().toString());
        int i_min = Integer.parseInt(min.getValue().toString());
        String S_tiempo = tiempo.getSelectedItem().toString();
        
        cal.set(Calendar.AM_PM,Calendar.AM);
        
        if("PM".equals(S_tiempo)) {
            i_hora = i_hora + 12;
            if (i_hora == 12) {
                i_hora = 24;
            }
        }
       
        cal.set(1, 1, 1, i_hora, i_min, 0);
        
        return cal;
    }
//Ingreso dos horas me devuelve la diferencua entre las horas
//Ingreso empleado, dia me devuelve su horario de ese dia (entradas salidas)            
}
