
package Gui;

import Appi.JExcel;
import Dao.EmpleadoDAO;
import Javabeans.Empleado;

import Dao.justificacionesDAO;

import Dao.RegistroDAO;
import Javabeans.Registro;

import javax.swing.table.DefaultTableModel;

import Utilitarios.Query;
import Dao.RegistroDAO;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import Utilitarios.Helpers;
import Utilitarios.Validators;
import Utilitarios.UtilQuery;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Utilitarios.Data;
import Appi.TimeOPeration;
import java.io.File;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
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
    private TimeOPeration tm;
    private String _error = "Gui_WinJustificacion_";
    private RegistroDAO reg;
    private UtilQuery ut;
    
    public WinJustificacion() {
        initComponents();
        cargaForm();
    }

    public final void cargaForm(){
        try{
            format=new SimpleDateFormat("dd-MM-yyyy");
            cboDia.setDateFormat(format);
            cboIni.setDateFormat(format);
            cboFin.setDateFormat(format);
            
            qs=new Query();
            qs.loadChoice(cboTipojus,"tipo_justificaciones","nombre");
            Lblidemp.setVisible(false);
            jLabel5.setVisible(false);
        }
        catch(Exception e) {
            System.out.println("Gui_Asistencia"+ e);
        }
    }

    public void cleanBox(){
        lblID.setText("");
        lblNomape.setText("");
        Calendar rightNow = Calendar.getInstance();
        Lblarea.setText("");
        lblcargo.setText("");
        cboDia.setSelectedDate(rightNow);
    }
    public void cleanForm() {
        TxtNum.setText("");
        Txtaobservacion.setText("");
    }
    public void cargarLog() {
        try {
            reg = new RegistroDAO();
            hp =  new Helpers();
            String fecha=hp.getFormatDate(cboDia.getText());
            if (!"".equals(lblID.getText())) {
               reg.findRegFecha(lblID.getText(),fecha, fecha, JtblLog, jLabel5);  
            } else {
                JOptionPane.showMessageDialog(null,"Seleccione un empleado para consultar");
            }   
        } catch(Exception e) {
            System.out.println(_error + "cargaLog: " + e);
        }
    }
    public void buscar_justificaciones(){
        if(!"".equals(lblID.getText())){
            hp=new Helpers();
            String inicio=hp.getFormatDate(cboIni.getText());
            String fin=hp.getFormatDate(cboFin.getText());
            //int id = Integer.parseInt(lblidEmp.getText() );
            objjusti= new justificacionesDAO();
            val=new Validators();
            if(val.validarFechas(inicio, fin)){
               objjusti.findJusti(lblID.getText() ,inicio, fin,TblJusti, lblcant);
            }
            else{
                JOptionPane.showMessageDialog(null,"Conflicto de fechas");
            }
       } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
      }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        cboTipojus = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNum = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Txtaobservacion = new javax.swing.JTextArea();
        cboDia = new datechooser.beans.DateChooserCombo();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtblLog = new javax.swing.JTable();
        BtnVer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        SpIhour = new javax.swing.JSpinner();
        SpImin = new javax.swing.JSpinner();
        cboItiempo = new javax.swing.JComboBox();
        SpShour = new javax.swing.JSpinner();
        SpSmin = new javax.swing.JSpinner();
        cboStiempo = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblJusti = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        cboIni = new datechooser.beans.DateChooserCombo();
        cboFin = new datechooser.beans.DateChooserCombo();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnDateSearch = new javax.swing.JButton();
        lblrecal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        lblcant = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.add(cboTipojus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 230, -1));

        jLabel2.setText("Tipo ");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel7.setText("Fecha");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel5.add(TxtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 230, -1));

        jLabel13.setText("Recibo");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel10.setText("Motivo");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel12.setText("Ingreso");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel11.setText("Salida");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        Txtaobservacion.setColumns(20);
        Txtaobservacion.setRows(5);
        jScrollPane3.setViewportView(Txtaobservacion);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 590, -1));
        jPanel5.add(cboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 230, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log de asistencia"));

        JtblLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JtblLog);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 290, 140));

        BtnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });
        jPanel5.add(BtnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        SpIhour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel5.add(SpIhour, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        SpImin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel5.add(SpImin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        cboItiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        jPanel5.add(cboItiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        SpShour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel5.add(SpShour, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        SpSmin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel5.add(SpSmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        cboStiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));
        jPanel5.add(cboStiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        jTabbedPane1.addTab("Registro", jPanel5);

        TblJusti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TblJusti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblJustiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblJusti);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de busqueda"));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(cboIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 19, -1, -1));
        jPanel10.add(cboFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 58, -1, -1));

        jLabel14.setText("Fecha inicial");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 29, -1, -1));

        jLabel15.setText("Fecha final ");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 68, -1, -1));

        btnDateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        btnDateSearch.setText("Buscar");
        btnDateSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDateSearchjButton5MouseClicked(evt);
            }
        });
        btnDateSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDateSearchActionPerformed(evt);
            }
        });
        jPanel10.add(btnDateSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 42, -1, -1));

        lblrecal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.add(lblrecal, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 53, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/configuraciones.png"))); // NOI18N
        jButton1.setText("Recalcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jLabel16.setText("Total: ");

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/no_laborables.png"))); // NOI18N
        jButton2.setText("No justificadas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Listado", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 710, 410));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Trabajador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setText("Area");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setText("Cargo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        lblcargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 140, 30));

        Lblarea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Lblarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, 30));

        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 30));

        jLabel18.setText("ID");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblNomape.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lblNomape, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 340, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/empleado.png"))); // NOI18N
        jLabel17.setText("Buscar");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));
        jPanel1.add(Lblidemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 110, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 700, 140));

        mfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Archivo.png"))); // NOI18N
        mfile.setText("Archivo");

        mitemregister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/registrar.png"))); // NOI18N
        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        mfile.add(mitemregister);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/eliminar.png"))); // NOI18N
        mitemdelete.setText("Eliminar");
        mitemdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemdeleteActionPerformed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/limpiar.png"))); // NOI18N
        mitemclear.setText("Limpiar");
        medit.add(mitemclear);

        ItemExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/exportar.png"))); // NOI18N
        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemdeleteActionPerformed
        hp = new Helpers();        
        String inicio=hp.getFormatDate(cboIni.getText());
        String fin=hp.getFormatDate(cboFin.getText());
        int fsel;
        fsel = this.TblJusti.getSelectedRow();
        objjusti= new justificacionesDAO();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        } else{
            DefaultTableModel m = new DefaultTableModel();
            m = (DefaultTableModel) this.TblJusti.getModel();
            String idempleado = String.valueOf(m.getValueAt(fsel, 0));
            int i;
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if(i==0){
                int id = Integer.valueOf(idempleado);

                i = objjusti.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro de asistencia");
                }
                else {
                    JOptionPane.showMessageDialog(null,"Justificacion eliminada");
                    objjusti.findJusti(lblID.getText() ,inicio, fin,TblJusti, lblcant);
                }
            }
        }
        
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
        buscar_justificaciones();

    }//GEN-LAST:event_btnDateSearchjButton5MouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        if(!"".equals(lblID.getText())){
        try{
            int id = Integer.parseInt(lblID.getText());
            val = new Validators();
            dt = new Data();
            tm = new TimeOPeration();
            qs = new Query();
            hp = new Helpers();
            int dia;
            
            //Validacion propia del evento
            objjusti = new justificacionesDAO();
            
            SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
            Calendar ingreso = hp.getCalendar(SpIhour,SpImin,cboItiempo);
            Calendar salida = hp.getCalendar(SpShour,SpSmin,cboStiempo);
            String motivo = Txtaobservacion.getText();
            String recivo = TxtNum.getText();

            Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
            Time sal =  Time.valueOf(fhora.format(salida.getTime()));
            //System.out.println("Resta de horas: "+sal + " - " +ing+" : "+tm.restarTime(ing,sal));
            Time hrs = tm.restarTime(sal,ing);
            String fecha=hp.getFormatDate(cboDia.getText());
            if (val.horaMayor(sal, ing)) {
                int tipojus =  Integer.parseInt(qs.idChoice("tipo_justificaciones","nombre",String.valueOf(cboTipojus.getSelectedItem())));
                int i = objjusti.save(id,tipojus,fecha,motivo,recivo,hrs,ing,sal);
                cleanForm();
                if (i == 0 ) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                }
                else {
                      JOptionPane.showMessageDialog(null,"justificacion grabada");
                      Dao.ConsultaDAO djus =  new Dao.ConsultaDAO();
                      dia = Integer.parseInt(qs.getDayOfTheWeek(fecha));
                      System.out.println("grabando: "+tipojus+" value :"+djus.getDiasTrabajo(lblID.getText(), fecha, dia));
                      if(djus.getDiasTrabajo(lblID.getText(), fecha, dia) == false && tipojus == 4) {
                            RegistroDAO objRegistro;
                            objRegistro = new RegistroDAO();
                            System.out.println("grabando");
                            objRegistro.save(1, ing, fecha, id,1);
                            objRegistro.save(2, sal, fecha, id,1);
                            objRegistro.save(1, ing ,fecha,id ,0);
                            objRegistro.save(2, sal ,fecha,id ,0);
                        }
                     }
            } else {
                JOptionPane.showMessageDialog(null,"conflicto de horas");
            }
        }
    catch(Exception e){
        System.out.println("Evento registrar: "+e);
    }  
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar su justificacion");
                }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        WinBuscarEmpleado objbus = new WinBuscarEmpleado();
        //objbus.setTitle(titulo);
        objbus.setResizable(true);
        objbus.setMaximizable(true);
        objbus.setIconifiable(true);
        objbus.setClosable(true);
        WinMdi.jdpContenedor.add(objbus);
        objbus.LblModulo.setText("2");
        objbus.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
     cargarLog();
    }//GEN-LAST:event_BtnVerActionPerformed

    private void TblJustiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblJustiMouseClicked
        int fsel;
        fsel= this.TblJusti.getSelectedRow();
        if(fsel==-1){

        }
        else{
            try{
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.TblJusti.getModel();
                String idjus = String.valueOf(m.getValueAt(fsel, 0));
                this.lblrecal.setText(idjus);
            }
            catch(Exception e){
                System.out.println(_error+"_Tblciudad:"+e);
            }

        }
    }//GEN-LAST:event_TblJustiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String id =  lblrecal.getText();
            int i = objjusti.update(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo  recalcular las horas");
                } else {
                    JOptionPane.showMessageDialog(null,"Justificacion recalculada");
                    buscar_justificaciones();
                }
                
        } catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDateSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDateSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDateSearchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       if(!"".equals(lblID.getText())){
            qs = new Query();
            hp = new Helpers();
            ut = new UtilQuery();
            int dia =0;
            String idEmp =lblID.getText();
            String fecha_inicio =  hp.formatFecha(cboIni.getText());
            String fecha_final =  hp.formatFecha(cboFin.getText());
            String idFalta = qs.Execute("select idtip_jus from tipo_justificaciones where nombre='FALTA JUSTIFICADA'");
            String idTardanza = qs.Execute("select idtip_jus from tipo_justificaciones where nombre='FALTA JUSTIFICADA'");
            fecha_final = qs.getDay(fecha_final, "+");
            String fechActual = fecha_inicio;
            do{
                try{
                    dia = Integer.parseInt(qs.getDayOfTheWeek(fechActual));
                    if(ut.is_exists_asistent(fechActual,idEmp)){
                        
                    } else {
                        if(ut.is_work_day(idEmp, fechActual, dia)){
                            if(!ut.has_permition(idEmp, fechActual, idFalta)){
                                System.out.println("falto: "+fechActual);
                            }
                        }
                    }

                    fechActual = qs.getDay(fechActual, "+");
                } catch(Exception e){
                    System.out.println("Error: "+ e);
                    fechActual = qs.getDay(fechActual, "+");
                }
            } while(!fechActual.equals(fecha_final));
           
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
        } 
        
        
        //Recorrer las fechas
            //revisar si tienen registro
                //de no tenerlo ¿tienen justificaciones?
                    //¿Es dia laborable?
                        //de no tener justificacion es falta no justificada
                //de si tenerlo comparar primer registro con su hora de entrada
                    //de ser mayor de 5 min de su entrada revisar si tiene 
                    //justificacion de tardanza
        
                    //de no tenerlo es tardanza no justificada
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVer;
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JTable JtblLog;
    public static final javax.swing.JLabel Lblarea = new javax.swing.JLabel();
    public static final javax.swing.JLabel Lblidemp = new javax.swing.JLabel();
    private javax.swing.JSpinner SpIhour;
    private javax.swing.JSpinner SpImin;
    private javax.swing.JSpinner SpShour;
    private javax.swing.JSpinner SpSmin;
    private javax.swing.JTable TblJusti;
    private javax.swing.JTextField TxtNum;
    private javax.swing.JTextArea Txtaobservacion;
    private javax.swing.JButton btnDateSearch;
    private datechooser.beans.DateChooserCombo cboDia;
    private datechooser.beans.DateChooserCombo cboFin;
    private datechooser.beans.DateChooserCombo cboIni;
    private javax.swing.JComboBox cboItiempo;
    private javax.swing.JComboBox cboStiempo;
    private javax.swing.JComboBox cboTipojus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static final javax.swing.JLabel lblFoto = new javax.swing.JLabel();
    public static final javax.swing.JLabel lblID = new javax.swing.JLabel();
    public static final javax.swing.JLabel lblNomape = new javax.swing.JLabel();
    private javax.swing.JLabel lblcant;
    public static final javax.swing.JLabel lblcargo = new javax.swing.JLabel();
    private javax.swing.JLabel lblrecal;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    // End of variables declaration//GEN-END:variables
}
