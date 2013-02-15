
package Gui;
import java.text.DateFormat;
import java.util.Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import Utilitarios.Ireport;
import Utilitarios.Data;

public class WinReportes extends javax.swing.JInternalFrame {

    private DateFormat format;
    private Date date,date2;
    private Calendar calendar,calendar2;
    private Ireport rep;
    private DefaultComboBoxModel MChoice;
    private Data dt;
    
    public WinReportes() {
        initComponents();
        format=new SimpleDateFormat("dd-MM-yyyy");
        CmbF_De.setDateFormat(format);
        CmbF_Hasta.setDateFormat(format);
        cargaChoice();
        Lblidemp.setVisible(false);
    }
    public void cargaChoice(){
        dt = new Data();
        MChoice = new DefaultComboBoxModel();
        for(int i= 0;i<dt.G_REPORTES.length;i++) {
            MChoice.addElement(dt.G_REPORTES[i]);
        }
        CmbTipo.setModel(MChoice);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CmbF_De = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        CmbF_Hasta = new datechooser.beans.DateChooserCombo();
        TxtEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Lblidemp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CmbTipo = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        mclose = new javax.swing.JMenu();

        Panel_datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del reporte"));

        jLabel2.setText("Empleado");

        jLabel3.setText("De");

        jLabel4.setText("Hasta");

        TxtEmpleado.setEditable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        jLabel5.setText("Buscar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Ingresar.png"))); // NOI18N
        jButton1.setText("Ver report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_datosLayout = new javax.swing.GroupLayout(Panel_datos);
        Panel_datos.setLayout(Panel_datosLayout);
        Panel_datosLayout.setHorizontalGroup(
            Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_datosLayout.createSequentialGroup()
                .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_datosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)))
                    .addGroup(Panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_datosLayout.createSequentialGroup()
                        .addComponent(TxtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(Panel_datosLayout.createSequentialGroup()
                        .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CmbF_De, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(CmbF_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26))
            .addGroup(Panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lblidemp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_datosLayout.setVerticalGroup(
            Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_datosLayout.createSequentialGroup()
                .addComponent(Lblidemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(Panel_datosLayout.createSequentialGroup()
                        .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6)
                        .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmbF_De, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(Panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(CmbF_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reportes"));

        jLabel1.setText("Tipo de reporte");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Cerrar.png"))); // NOI18N
        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        mclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcloseActionPerformed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed

    }//GEN-LAST:event_mcloseActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String args[] = new String[1];
     try {
        rep = new Ireport();
        rep.setargs(args);
        rep.getConexionIreport();
        args[0] =  "Saravia se lo come";
        rep.SelectReport(1);
     } catch (Exception ex) {
         System.out.println(ex);
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
    WinBuscarEmpleado objbus = new WinBuscarEmpleado();
    objbus.setResizable(true);
    objbus.setMaximizable(true);
    objbus.setIconifiable(true);
    objbus.setClosable(true);
    WinMdi.jdpContenedor.add(objbus);
    objbus.LblModulo.setText("3");
    objbus.setVisible(true);
    }//GEN-LAST:event_jLabel5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo CmbF_De;
    private datechooser.beans.DateChooserCombo CmbF_Hasta;
    private javax.swing.JComboBox CmbTipo;
    public static javax.swing.JLabel Lblidemp;
    private javax.swing.JPanel Panel_datos;
    public static javax.swing.JTextField TxtEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mclose;
    // End of variables declaration//GEN-END:variables
}
