
package Utilitarios;

import java.io.*;


public class Helpers {
    
    /*Metodo optener contenido de un archivo de texto(Hosting)
     */
    public String leeArchivo(File lectura) throws IOException{
        
    BufferedReader entrada = new BufferedReader(new FileReader(lectura));
    String renglon;
    String Str_Texto="";
        while ((renglon = entrada.readLine()) != null){
            for (int i = 0; i < renglon.length(); i++){
               Str_Texto += String.valueOf(renglon.charAt(i)); 
            }
        }
    return Str_Texto;
    }
    
}
