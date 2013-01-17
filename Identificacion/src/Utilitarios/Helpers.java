
package Utilitarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import Utilitarios.Conexion;

public class Helpers extends Conexion{
    private String _error = "Identificacion_Utilitarios_Helpers_";
    
    
    //Obtiene la fecha actual
    public String ObtenerFecha(){
        Calendar Cal= Calendar.getInstance();
        String StrDia=String.valueOf(Cal.get(Cal.DATE));
        String StrMes=String.valueOf(Cal.get(Cal.MONTH)+1);
        String StrAnho=String.valueOf(Cal.get(Cal.YEAR));
        
        if(StrMes.length()==1){
            StrMes="0"+StrMes;
        }
        if(StrDia.length()==1){
            StrDia="0"+StrDia;
        }
        String fecha= StrDia+"/"+StrMes+"/"+StrAnho;
        return fecha;
    }
    //Leer ficheros
    public String readFiles(File lectura) throws IOException{
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String Str_Texto="";
        while ((renglon = entrada.readLine()) != null)
        {
            for (int i = 0; i < renglon.length(); i++)
            {
               Str_Texto += String.valueOf(renglon.charAt(i)); 
            }
        }
    return Str_Texto;
    }
    //Intermedirario para ejecutar consultas
    public ResultSet Ejec_Consultas(String consulta){
        ResultSet rs = null;
        Statement s = null;
        try{
            s = conexion.createStatement();
            rs = s.executeQuery(consulta);
        }catch (Exception e){
            System.out.println(_error + "e");
        }
        return rs;
    }
}
