
package Utilitarios;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.sql.*;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
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
    public void SelectReport(int op, JPanel pan){
        switch(op){
            case 1:ReportEjemplo(pan);break;
        }
        
    }
    
    public void ReportEjemplo(JPanel pan){
       try {
            /*String arch ="/home/platano/ejemplo.jasper";
            JasperReport Jas_Rep= JasperCompileManager.compileReport(arch);
            JasperPrint Jas_Prin= JasperFillManager.fillReport(Jas_Rep, null,conn);
            JasperViewer.viewReport(Jas_Prin);
           */
           
           getConexionIreport();
           JasperReport reporte = (JasperReport) JRLoader.loadObject("src/reportes/perro.jasper");
           JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conn);
           JasperViewer view = new JasperViewer(jasperPrint);
           Container container = view.getContentPane(); 
           pan.add(container); 
           
           
           
           /*
            getConexionIreport();
            File miDir = new File (".");
            String archivo = miDir + "/" + _ubicacion + File.separatorChar + "Ejemplo.jrxml";
            System.out.println(archivo);
            if(archivo == null){
                System.out.println("No se encuentra el archivo.");
            }
            String archivo2 = "reportes\\ejemplo.jrxml";
            try{
                masterReport= (JasperReport) JRLoader.loadObject("src/reportes/report1.jasper");
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            }
            Map parametro= new HashMap();
            parametro.put("nombre",args[0]);
            JasperPrint jasperPrint = JasperFillManager.fillReport(masterReport,parametro,conn);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle("Ejemplo de reporte");
            jviewer.setVisible(true);
            
            
            
            */
            
        }catch (Exception j){
                System.out.println("Mensaje de Error:"+j.getMessage());
        }

        }
}
