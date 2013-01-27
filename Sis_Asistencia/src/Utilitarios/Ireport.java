
package Utilitarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.view.save.JRPdfSaveContributor.*;
import net.sf.jasperreports.view.JRViewer.*;
import net.sf.jasperreports.view.save.JRMultipleSheetsXlsSaveContributor.*;

public class Ireport {
    
    private Connection conn = null;
    private Helpers hp;
    private String[] args;
    private String _ubicacion = "reportes";
    private JasperReport masterReport= null;
    private Map parametro;
    private JasperPrint jasperPrint;
    private JasperViewer jviewer;
    
    public void setargs(String[] args) {
        this.args = args;
    }
    
    public void getConexionIreport() {
        try{
            //Obtener numero IP del servidor
            hp = new Helpers();
            File algun_archivo = new File("Host.txt");
            String IP=hp.readFiles(algun_archivo);
            String user = "postgres";
            String password = "sp1r4ls4c";
            String bd = "asistencia"; 
            String url = "Jdbc:postgresql://"+IP+":5432/"+bd;

            Class.forName("org.postgresql.Driver"); 
            conn = DriverManager.getConnection(url,user,password);
            if (conn != null){
               System.out.println("Conexion establecida");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void SelectReport(int op) throws JRException{
        switch(op){
            case 1:ReportEjemplo();break;
        }
        
    }
    
    public void ReportEjemplo() throws JRException{
       try {
            File miDir = new File (".");
            String archivo = miDir + "/" + _ubicacion + File.separatorChar + "Ejemplo.jasper";
            System.out.println(archivo);
            if(archivo == null){
                System.out.println("No se encuentra el archivo.");
            }
            try{
                masterReport= (JasperReport) JRLoader.loadObject(new File(archivo));
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            }
            Map parametro= new HashMap();
            parametro.put("nombre",args[0]);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,conn);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Ejemplo de reporte");
            jviewer.setVisible(true);
            }catch (Exception j){
                System.out.println("Mensaje de Error:"+j.getMessage());
            }

        }
}
