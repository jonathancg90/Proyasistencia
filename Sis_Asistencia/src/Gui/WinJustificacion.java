
package Gui;

import Appi.JExcel;
import Dao.EmpleadoDAO;
import Javabeans.Empleado;

import Dao.justificacionesDAO;

import Dao.RegistroDAO;
import Javabeans.Registro;

import javax.swing.table.DefaultTableModel;

import Utilitarios.Query;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import Utilitarios.Helpers;
import Utilitarios.Validators;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Utilitarios.Data;
//import com.sun.xml.internal.bind.v2.model.core.ID;
import java.io.File;
import java.sql.Time;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WinJustificacion extends javax.swing.JInternalFrame {

    private Query qs;
    private Empleado empleado;
    private justificacionesDAO objjusti;
    private DateFormat format;
    private Validators val;
    private Data dt;
    private Helpers hp;
    private Date date;
    private Date date2;
    private Calendar calendar;
    private GregorianCalendar calendar2;
    private JExcel xls;
    private String _error = "Gui_WinJustificacion_";
    
    public WinJustificacion() {
        initComponents();
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboDia.setDateFormat(format);
        cboIni.setDateFormat(format);
        cboFin.setDateFormat(format);
        
        cargaForm();
    }

    public final void cargaForm(){
    
        try{
            qs=new Query();
           qs.loadChoice(Cmb_Empleado,"tipoempleado","nombre");
            qs.loadGlobal(4, cboTiporeg, 1);
        }
        catch(Exception e){
            System.out.println("Gui_Asistencia"+ e);
        }
    }
    
    public void cleanBox(){
        Calendar rightNow = Calendar.getInstance();
        Lblarea.setText("");
        Lblcargo.setText("");
        cboDia.setSelectedDate(rightNow);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        cboTiporeg = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txtaobservacion = new javax.swing.JTextArea();
        cboDia = new datechooser.beans.DateChooserCombo();
        TimIngreso = new com.lavantech.gui.comp.TimePanel();
        TimIngreso1 = new com.lavantech.gui.comp.TimePanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblJusti = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        cboIni = new datechooser.beans.DateChooserCombo();
        cboFin = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnDateSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lblcargo = new javax.swing.JLabel();
        Lblarea = new javax.swing.JLabel();
        Cmb_Empleado = new javax.swing.JComboBox();
        lblcant = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.add(cboTiporeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 12, 230, -1));

        jLabel2.setText("Tipo ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel7.setText("Fecha");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 55, -1, -1));
        jPanel5.add(TxtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 85, 130, -1));

        jLabel13.setText("Recibo");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, -1, -1));

        jLabel10.setText("Motivo");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, -1, -1));

        jLabel6.setText(":");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 212, 10, -1));

        jLabel5.setText(":");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 212, 10, -1));

        jLabel9.setText(":");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 244, 10, -1));

        jLabel8.setText(":");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 249, 10, -1));

        jLabel12.setText("Ingreso");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 212, -1, -1));

        jLabel11.setText("Salida");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        Txtaobservacion.setColumns(20);
        Txtaobservacion.setRows(5);
        jScrollPane3.setViewportView(Txtaobservacion);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 113, -1, -1));
        jPanel5.add(cboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 45, -1, -1));

        TimIngreso.setDisplayAnalog(false);
        TimIngreso.setSecDisplayed(false);
        jPanel5.add(TimIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 70));

        TimIngreso1.setDisplayAnalog(false);
        TimIngreso1.setSecDisplayed(false);
        jPanel5.add(TimIngreso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 70));

        jTabbedPane1.addTab("Registro", jPanel5);

        TblJusti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TblJusti);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de busqueda"));

        jLabel14.setText("Fecha inicial");

        jLabel15.setText("Fecha final ");

        btnDateSearch.setText("Buscar");
        btnDateSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDateSearchjButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(cboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDateSearch)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnDateSearch)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ver", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 138, 520, 320));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Trabajador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jLabel3.setText("Area");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Cargo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        Lblcargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 110, 20));

        Lblarea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Lblarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, 20));

        jPanel1.add(Cmb_Empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 507, 130));

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 60, 20));

        jLabel16.setText("Total: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        mfile.setText("Archivo");

        mitemregister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        mfile.add(mitemregister);

        mitemupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemupdate.setText("Actualizar");
        mfile.add(mitemupdate);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setText("Eliminar");
        mitemdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemdeleteActionPerformed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        medit.add(mitemclear);

        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemdeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemdeleteActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(TblJusti);
        //Guardar
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = Obj.getSelectedFile();
            String filePath = fichero.getPath();
            if(!filePath.toLowerCase().endsWith(".xls")){
                fichero = new File(filePath + ".xls");
            }
            boolean Confirma;
            if((fichero).exists()) {
                if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(this,"El fichero existe,deseas reemplazarlo?","Reemplazar",JOptionPane.YES_NO_OPTION));{
                    Confirma=xls.ExportJtable(TblJusti, fichero, "Justificaciones");
                }
            } 
            else{
                Confirma=xls.ExportJtable(TblJusti, fichero, "Justificaciones");
            }
                if(Confirma==true){
                    JOptionPane.showMessageDialog(null, "El documento se grabo exitosamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo grabar el documento", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                }
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la exportacion del documento","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(_error + "Exportar :"+e);
    }
    }//GEN-LAST:event_ItemExportarMousePressed

    private void btnDateSearchjButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDateSearchjButton5MouseClicked

        hp=new Helpers();
        String inicio=hp.getFormatDate(cboIni.getText());
        String fin=hp.getFormatDate(cboFin.getText());
        //int id = Integer.parseInt(lblidEmp.getText() );
        objjusti= new justificacionesDAO();
        val=new Validators();
        if(val.validarFechas(inicio, fin)){
           // objRegistro.getTableFilter(TblJusti, inicio, fin,Lblarea);

        }
        else{
            JOptionPane.showMessageDialog(null,"Conflicto de fechas");
        }

    }//GEN-LAST:event_btnDateSearchjButton5MouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
       /* try{
        int id = Integer.parseInt(Lblarea.getText());
        val = new Validators();    
        qs=new Query();
        hp=new Helpers();
        if(!"".equals(Lblarea.getText())){
            
             //Validacion propia del evento
                
                dt = new Data();
                objjusti= new justificacionesDAO();
                
                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                
                Calendar ingreso = TimIngreso.getCalendar();
                Calendar salida = TimIngreso1.getCalendar();
                
                Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
                Time sal =  Time.valueOf(fhora.format(salida.getTime()));
                String fecha=hp.getFormatDate(cboDia.getText());
                int tiporeg=qs.loadGlobal(4, cboTiporeg, 0);
                int i = objjusti.save(tiporeg, ing,sal,fecha, id,1);
                int j = objjusti.save(tiporeg, ing,sal,fecha, id,0);
                if (i == 0 && j == 0 ) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                }
                
                else {
                        objjusti.findId(Lblarea.getText(), TblJusti);
                        cleanBox();
                    }
                
            
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
                }
        }
    catch(Exception e){
        System.out.println("Evento registrar: "+e);
    }  **/
    }//GEN-LAST:event_mitemregisterMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cmb_Empleado;
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JLabel Lblarea;
    private javax.swing.JLabel Lblcargo;
    private javax.swing.JTable TblJusti;
    private com.lavantech.gui.comp.TimePanel TimIngreso;
    private com.lavantech.gui.comp.TimePanel TimIngreso1;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextArea Txtaobservacion;
    private javax.swing.JButton btnDateSearch;
    private datechooser.beans.DateChooserCombo cboDia;
    private datechooser.beans.DateChooserCombo cboFin;
    private datechooser.beans.DateChooserCombo cboIni;
    private javax.swing.JComboBox cboTiporeg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    // End of variables declaration//GEN-END:variables
}
