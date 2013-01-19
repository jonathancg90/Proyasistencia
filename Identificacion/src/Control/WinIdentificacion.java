package Control;

import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import java.beans.Statement;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Utilitarios.Helpers;
import Utilitarios.Conexion;
import DAO.RegistroDAO;

public class WinIdentificacion extends javax.swing.JFrame implements Runnable{
    //Instancias
    private Helpers hp;
    private Conexion cn;
    private RegistroDAO reg;
    //Variables locales
    private String fechaActual;
    private String hora;
    private String minutos;
    private String segundos;
    private String ampm;
    private Calendar calendario;
    private Thread h1;
    private String _error = "Iden_Utilitarios_WinIdentificacion_";
    
    //Inicializacion
    public WinIdentificacion() {
        hp = new Helpers();
        initComponents();
        this.setResizable(false);
        h1 = new Thread(this);
        h1.start();
        
        setLocationRelativeTo(null);
        setVisible(true);
        LblFecha.setText(hp.ObtenerFecha());
    }
    //Segundero(Real time)
    public void run(){
        try{
            Thread ct = Thread.currentThread();
            while(ct == h1) {   
                calcula();
                lbHora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e) {}
            } 
        } catch(Exception e) {
            System.out.println(_error + "run");
        }
           
    }
    public void calcula () {
        try {
            Calendar calendario = new GregorianCalendar();
            Date fechaHoraActual = new Date();

            calendario.setTime(fechaHoraActual);
            ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
            if(ampm.equals("PM")){
                int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
                hora = h>9?""+h:"0"+h;
            }else{
                hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
            }
            minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
            segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
        } catch(Exception e) {
            System.out.println(_error + "run");
        }
    }
    
   public void  Llenar_Datos(String Id){
   LblCodigo.setText(Id);
   cn = new Conexion();
   try{
       cn.getConexion();
       
        ResultSet rs = null;
        rs = hp.Ejec_Consultas("select nombres,idare,idcar from empleado where idemp='"+Id+"'");
        rs.next();
        
        String StrNombre=rs.getString("nombre");
        String StrArea=rs.getString("idare");
        String StrCargo=rs.getString("idcar");
        
        
        cn.closeConexion();
        
        
       LblNombres.setText(StrNombre);
       //TODO:Verificar 
       //LblArea.setText(Obj_ret.Hallar_criterio("item_desc","001","id_item",StrArea));
       //LblCargo.setText(Obj_ret.Hallar_criterio("item_desc","002","id_item",StrCargo));
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "No se pudo extraer los datos del trabajador","Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
       }
   }
//Identificar huella  
 public void identificarHuella() throws IOException{
   try {
       cn.getConexion();
       PreparedStatement identificarStmt = cn.conexion.prepareStatement("SELECT idemp,huella FROM empleado");
       ResultSet rs = identificarStmt.executeQuery();
       while(rs.next()){
            byte templateBuffer[] = rs.getBytes("huella");
            String nombre=rs.getString("idemp");
            //Crear `lantilla
            DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
            setTemplate(referenceTemplate);
            //Comparacion
            DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());
            if (result.isVerified()){
                Llenar_Datos(nombre);
            return;
            }
       }
       JOptionPane.showMessageDialog(null, "No existe ningún registro que coincida con la huella", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
       
       BtnRegistrar.setEnabled(false);
       BtnConsultar.setEnabled(false);
       lblImagenHuella.setIcon(null);
       
       setTemplate(null);
       } catch (SQLException e) {
            System.err.println("Error al identificar huella dactilar."+e.getMessage());
       }finally{
            cn.closeConexion();
       }  
  }
public void CleanBox(){
      LblCodigo.setText("");
      txtArea.append("");
      LblNombres.setText("");
      LblArea.setText("");
      LblCargo.setText("");
      
      BtnRegistrar.setEnabled(false);
      BtnConsultar.setEnabled(false);
      
      Reclutador.clear();
      lblImagenHuella.setIcon(null);
      //start();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblCodigo = new javax.swing.JLabel();
        LblNombres = new javax.swing.JLabel();
        LblArea = new javax.swing.JLabel();
        LblCargo = new javax.swing.JLabel();
        BtnRegistrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblFecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        BtnConsultar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Scroll = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de asistencia S.C.A");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del trabajador"));

        jLabel3.setText("Nombre y apellidos");

        jLabel4.setText("Area");

        jLabel5.setText("Cargo");

        jLabel9.setText("Codigo");

        LblCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblNombres.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LblCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(LblCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addComponent(LblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(LblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(LblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(LblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 450, -1));

        BtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btncheck.png"))); // NOI18N
        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.setFocusCycleRoot(true);
        BtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Fecha");

        jLabel2.setText("Hora");

        LblFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LblFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(LblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbHora, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21))))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Huella digital"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHuella, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenHuella, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, -1, 160));

        BtnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnreloj.png"))); // NOI18N
        BtnConsultar.setText("Consultar");
        BtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 365, 250, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensaje"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        txtArea.setColumns(20);
        txtArea.setRows(5);
        Scroll.setViewportView(txtArea);

        jPanel4.add(Scroll, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 431, 460, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   Iniciar();
   start();
   EstadoHuellas();
    
   BtnConsultar.setEnabled(false);
   BtnRegistrar.setEnabled(false);
}//GEN-LAST:event_formWindowOpened

private void BtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarActionPerformed
//TODO:Verificar 
    /*    try {
        
        String StrHora=lbHora.getText();
        String StrFecha=LblFecha.getText();
        String StrCodigo=LblCodigo.getText();

        String StrDia=StrFecha.substring(0,2);
        String StrMes=StrFecha.substring(3,5);
        String StrAnho=StrFecha.substring(6,10);
        StrFecha=StrAnho+StrMes+StrDia;     

        int ICantReg=hp.Hallar_Cant_Reg(StrFecha,StrCodigo);
        System.out.println(ICantReg);
        if(ICantReg<4){
        int ITipo=hp.Hallar_Tipo_Reg(StrCodigo,StrFecha);

        String StrTipo=String.valueOf(ITipo);
        
        Obj_reg.Reg_registro("I","",StrCodigo,StrTipo,StrFecha,StrHora);

        txtArea.setText("");
        EnviarTexto("Registro ingresado con exito");
        EnviarTexto("Sensor activado: coloque su huella");

        CleanBox();       
        }
        else{
            EnviarTexto("Ya tienes ingresado las 4 marcas permitidas al dia\nConsulta tus entradas");  
            EnviarTexto("Sensor activado: coloque su huella");
            CleanBox(); 
        }
    }
    catch(Exception e){
        System.out.println("Error en el registro: "+e);
    }*/
}//GEN-LAST:event_BtnRegistrarActionPerformed

private void BtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarActionPerformed

    String StrFecha=LblFecha.getText();
    
    String StrDia=StrFecha.substring(0,2);
    String StrMes=StrFecha.substring(3,5);
    String StrAnho=StrFecha.substring(6,10);
    StrFecha=StrAnho+StrMes+StrDia;   
    
    String StrCodigo=LblCodigo.getText();
    
    String mensaje="";
    String query="select fecha,hora from registro where fecha='"+StrFecha+"' and idpers='"+StrCodigo+"'";
    try{
        cn.getConexion();
        ResultSet rs = null;
        rs = hp.Ejec_Consultas(query);
        int i=1;
        while(rs.next()) {
            mensaje=mensaje+"\n"+i+") "+rs.getString("hora");
            i++;
        }
        cn.closeConexion();
        EnviarTexto(mensaje);
    }
    catch(Exception e){
        System.out.println("Error Boton consultar: "+e);
    }
}//GEN-LAST:event_BtnConsultarActionPerformed

private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();
private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();
private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();
private DPFPTemplate template;
public static String TEMPLATE_PROPERTY = "template";

protected void Iniciar(){
    try {
        
   Lector.addDataListener(new DPFPDataAdapter() {
    @Override public void dataAcquired(final DPFPDataEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("La Huella Digital ha sido Capturada");
    ProcesarCaptura(e.getSample());
    }});}
   });

   Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
    @Override public void readerConnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("Sensor activado: coloque su huella");
    }});}
    @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    EnviarTexto("El sensor esta desactivado o desconectado");
    }});}
   });

   Lector.addSensorListener(new DPFPSensorAdapter() {
    @Override public void fingerTouched(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    //EnviarTexto("Huella digital ingresada");
    }});}
    @Override public void fingerGone(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    //EnviarTexto("");
    }});}
   });

   Lector.addErrorListener(new DPFPErrorAdapter(){
    public void errorReader(final DPFPErrorEvent e){
    SwingUtilities.invokeLater(new Runnable() {  public void run() {
    EnviarTexto("Error: "+e.getError());
    }});}
   });
    }
    catch(Exception e){
        System.out.println(_error + "Iniciar");
    }
}

 public DPFPFeatureSet featuresinscripcion;
 public DPFPFeatureSet featuresverificacion;

 public  void ProcesarCaptura(DPFPSample sample){
 try {
    // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
    featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
    // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
    featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
    // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
    if (featuresinscripcion != null)
        try{
           System.out.println("Las Caracteristicas de la Huella han sido creada");
           Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear
           // Dibuja la huella dactilar capturada.
           Image image=CrearImagenHuella(sample);
           DibujarHuella(image);
           BtnRegistrar.setEnabled(true);
           BtnConsultar.setEnabled(true);
           try{
              identificarHuella();
           }
           catch(Exception e){
           }
        }catch (DPFPImageQualityException ex) {
           System.err.println("Error: "+ex.getMessage());
        }
        finally {
           EstadoHuellas();
              switch(Reclutador.getTemplateStatus()){
                  case TEMPLATE_STATUS_READY:	// informe de éxito y detiene  la captura de huellas
                      stop();
                      setTemplate(Reclutador.getTemplate());
                      break;

                  case TEMPLATE_STATUS_FAILED: // informe de fallas y reiniciar la captura de huellas
                      Reclutador.clear();
                      stop();
                      EstadoHuellas();
                      setTemplate(null);
                      JOptionPane.showMessageDialog(WinIdentificacion.this, "La Plantilla de la Huella no pudo ser creada, Repita el Proceso", "Inscripcion de Huellas Dactilares", JOptionPane.ERROR_MESSAGE);
                      start();
                      break;
              }
        }
 } catch(Exception e){
    System.out.println(_error + "ProcesarCaptura");
 }
}
 public  DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
     DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
     try {
      return extractor.createFeatureSet(sample, purpose);
     } catch (DPFPImageQualityException e) {
      return null;
     }
}

  public  Image CrearImagenHuella(DPFPSample sample) {
	return DPFPGlobal.getSampleConversionFactory().createImage(sample);
}
  public void DibujarHuella(Image image) {
  try { 
      lblImagenHuella.setIcon(new ImageIcon(
      image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), Image.SCALE_DEFAULT)));
      repaint();
  } catch (Exception e){
      System.out.println(_error + "DibujarHuella");
  }
 }

public  void EstadoHuellas()
{
    //EnviarTexto("Muestra de Huellas Necesarias para Guardar Template "+ Reclutador.getFeaturesNeeded());
}

public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
}

public  void start(){
	Lector.startCapture();
	EnviarTexto("Sistema de asistencia (Spiral producciones SAC)");
}

public  void stop(){
        Lector.stopCapture();
        EnviarTexto("No se está usando el Lector de Huella Dactilar ");
        EnviarTexto("Cierre y vuela abrir el programa ");
}

public DPFPTemplate getTemplate() {
   return template;
}

public void setTemplate(DPFPTemplate template) {
    try {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);   
    } catch(Exception e){
        System.out.println(_error + "setTemplate");
    }
}
public void verificarHuella(String nom) 
{
    //TODO:Verificar 
/*    try 
    {
        int Id =Integer.parseInt(nom);
        Obj_Con.estableceConexion();

        nom=Obj_ret.Hallar_id("nombre","personal","idpers",nom);

        PreparedStatement verificarStmt;
        verificarStmt = cn.conexion.prepareStatement("SELECT huella FROM empleado WHERE idemp=?");
        verificarStmt.setInt(1,Id);
        ResultSet rs = verificarStmt.executeQuery();
        if (rs.next()){
        byte templateBuffer[] = rs.getBytes("huehuella");
        DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
        setTemplate(referenceTemplate);
        DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());

        if (result.isVerified()){
            //JOptionPane.showMessageDialog(null, "Las huella capturada coinciden con la de "+nom,"Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "La huella ingresada no se encuentra registrado", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
        }    
        //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
        } else {
            JOptionPane.showMessageDialog(null, "No existe un registro de huella para "+nom, "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos de la huella."+e);
    }finally{
       Obj_Con.cierraConexion();
    }

 
 
 */
 }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinIdentificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinIdentificacion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsultar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JLabel LblArea;
    private javax.swing.JLabel LblCargo;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblFecha;
    private javax.swing.JLabel LblNombres;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables


}
