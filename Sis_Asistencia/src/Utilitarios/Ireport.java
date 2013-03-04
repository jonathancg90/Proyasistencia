
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
import Utilitarios.ConexionBd;
import Dao.ConsultaDAO;

public class Ireport  extends  ConexionBd{
    
    private Connection conn = null;
    private Helpers hp;
    private String[] args;
    private String _ubicacion = "reportes";
    private JasperReport masterReport= null;
    private Map parametro;
    private JasperPrint jasperPrint;
    private JasperViewer jviewer;
    private ConsultaDAO consul;
    private String idEmp;

    public void setargs(String[] args){
        this.args = args;
    }
    public void SelectReport(int op){
        
        switch(op) {
            case 1:ReportAsistencia(); break;
            case 2:ReportAsistencia_Log(); break;
            case 3:ReportJustificaciones(); break;
            case 4:ReportAsistencia_Log(); break;
            case 5:Justificaciones(); break;
            default:break;
        }
    }
    /*
     * Reporte de asistencia.
     */
    public void ReportAsistencia(){
    try{
        ConsultaDAO consul = new ConsultaDAO();
        getConexion();
        conn = getConetion();
        File archivo = new  File("reportes/asistencia.jasper");
        consul.setTable("registro");
        consul.findAsistencia(this.args);
        //crear reporte
        System.out.println("Cargando desde: " + archivo);
        if(archivo == null){
            System.out.println("No se encuentra el archivo.");
        }
        JasperReport masterReport= null;
        try {
            masterReport= (JasperReport) JRLoader.loadObject(archivo);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
        }
        System.out.println("Enviado: "+this.args[0]);
        Map parametro= new HashMap();
        parametro.put("idemp",Integer.parseInt(this.args[0]));
        
        JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
        JasperViewer jviewer= new JasperViewer(jasperPrint,false);
        jviewer.setTitle("Asistencia Personal");
        jviewer.setVisible(true);
        consul.destroid_report();
        closeConexion();
    } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
  }
  /*
  * Reporte de asistencia Log.
  */
  private void ReportAsistencia_Log() {
    try{
        ConsultaDAO consul = new ConsultaDAO();
        getConexion();
        conn = getConetion();
        File archivo = new  File("reportes/asistencia_log.jasper");
        consul.setTable("registro_backlog");
        consul.findAsistencia(this.args);
        //crear reporte
        System.out.println("Cargando desde: " + archivo);
        if(archivo == null){
            System.out.println("No se encuentra el archivo.");
        }
        JasperReport masterReport= null;
        try {
            masterReport= (JasperReport) JRLoader.loadObject(archivo);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
        }
        System.out.println("Enviado: "+this.args[0]);
        Map parametro= new HashMap();
        parametro.put("idemp",Integer.parseInt(this.args[0]));
        
        JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
        JasperViewer jviewer= new JasperViewer(jasperPrint,false);
        jviewer.setTitle("Asistencia Personal");
        jviewer.setVisible(true);
        consul.destroid_report();
        closeConexion();
    } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
    }
    /*
  * Reporte de asistencia Log.
  */
  private void ReportJustificaciones() {
    try{
        ConsultaDAO consul = new ConsultaDAO();
        getConexion();
        conn = getConetion();
        File archivo = new  File("reportes/lista_justificaciones.jasper");
        consul.create_report_justificaciones(this.args);
        //crear reporte
        System.out.println("Cargando desde: " + archivo);
        if(archivo == null){
            System.out.println("No se encuentra el archivo.");
        }
        JasperReport masterReport= null;
        try {
            masterReport= (JasperReport) JRLoader.loadObject(archivo);
        } catch (JRException e) {
            System.out.println("Error cargando el reporte maestro: " + e.getMessage());
        }
        Map parametro= new HashMap();
        parametro.put("idemp",Integer.parseInt(this.args[0]));
        
        JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
        JasperViewer jviewer= new JasperViewer(jasperPrint,false);
        jviewer.setTitle("Justificaciones Personal");
        jviewer.setVisible(true);
        //consul.destroid_report();
        closeConexion();
    } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
    }
    private void Justificaciones() {
        try{
            Date date = new Date(0000-00-00);    
            getConexion();
            conn = getConetion();
            File archivo = new  File("reportes/justificaciones.jasper");
            //crear reporte
            System.out.println("Cargando desde: " + archivo);
            if(archivo == null){
                System.out.println("No se encuentra el archivo.");
            }
            JasperReport masterReport= null;
            try {
                masterReport= (JasperReport) JRLoader.loadObject(archivo);
            } catch (JRException e) {
                System.out.println("Error cargando el reporte maestro: " + e.getMessage());
            }
            System.out.println("Enviado: "+this.args[0]);
            Map parametro= new HashMap();
            parametro.put("id",Integer.parseInt(this.args[0]));
            parametro.put("inicio", date.valueOf(this.args[1]));
            parametro.put("fin", date.valueOf(this.args[2]));
            JasperPrint jasperPrint= JasperFillManager.fillReport(masterReport,parametro,conn);
            JasperViewer jviewer= new JasperViewer(jasperPrint,false);
            jviewer.setTitle("JUstificaciones");
            jviewer.setVisible(true);
            closeConexion();
        } catch (Exception j) {
        System.out.println("Mensaje de Error:"+j);
    }
}
}