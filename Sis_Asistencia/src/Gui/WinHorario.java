package Gui;

import Appi.JExcel;
import java.sql.Time;
import java.sql.Timestamp;
import Utilitarios.Data;
import Utilitarios.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Dao.HorariosDAO;
import Dao.DetailHorarioDAO;
import Javabeans.Horarios;
import Utilitarios.Query;
import Utilitarios.Validators;
import Utilitarios.Helpers;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WinHorario extends javax.swing.JInternalFrame {

    private Query qs;
    private HorariosDAO objhora;
    private DetailHorarioDAO objdetail;
    private Horarios hora;
    private Data dt;
    private Validators val;
    private Helpers hp;
    private String _error="Gui_Horario";
    private JExcel xls;
    
    public WinHorario() {
        initComponents();
        cargaForm();
    }
    private void cargaForm(){
        try {
            objhora = new HorariosDAO();
            qs = new Query();
            objhora.getTableAll(tblhora, lblcant);
            //qs.loadState(cbofindestado,false);
            qs.loadState(cboestado,false);
            qs.loadGlobal(1,cbofindtipo,1);
            qs.loadGlobal(1,cbotipo,1);
            //Detalles de horarios
            qs.loadGlobal(2,cboDia,1);
            qs.loadGlobal(3,cbotipoReg,1);
            FilterFind();

        } catch (Exception e) {
            System.out.println(_error+"_CargaForm:"+e);
        }
    }
    private void FilterFind(){
        objhora = new HorariosDAO();
        String  state = String.valueOf(!Chkinactivo.isSelected());
        String tipo = String.valueOf(qs.loadGlobal(1,cbofindtipo,0));
        objhora = new HorariosDAO();
        objhora.find(state, tipo, tblhora, lblcant);
    }
    private void cargaDetalle(){
        objdetail = new DetailHorarioDAO();
        String horario = lblId.getText();
        objdetail.find(horario,JtblDetail, lblcant1);
       //objdetail.getTableAll(JtblDetail);
    }
    
    private void cleanBox(){
        lblId.setText("");
        txtnombre.setText("");
        lblModified.setText("");
    }
    private boolean HoraValidator_Delete() throws ParseException{
        boolean Validator= true;
        val = new Validators();
        hp = new Helpers();
        String[] args = new String[3];
        String[] kargs = new String[5];
        String[] Wargs = new String[7];
        
        args[0] = "detailhorario";
        args[1] = "horarios_idhor";
        args[2] = lblId.getText();
        if(Validator){
            Validator = val.MaxRegistro(args, 14);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"Numero maximo de registros completos");
               return Validator;
            }
        }
        if(Validator){
            for(int i=0;i<args.length;i++){
                kargs[i] = args[i];
            }
            kargs[3] = "dia";
            kargs[4] = String.valueOf(qs.loadGlobal(2,cboDia,0));
            Validator = val.MaxRegistro(kargs, 2);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"No se permite otro registro de ese mismo dia");
               return Validator;
            }
        }
        if(Validator){
            for(int i=0;i<kargs.length;i++){
                Wargs[i] = kargs[i];
            }
            Wargs[5] = "idtip_reg";
            Wargs[6] = String.valueOf(qs.loadGlobal(3,cbotipoReg,0));
            Validator = val.MaxRegistro(Wargs, 1);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"No se permite otro registro del mismo tipo");
               return Validator;
            }
        }
        if(Validator) {
            SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
            Calendar ingreso = hp.getCalendar(SpIhour,SpImin,cboItiempo);
            Calendar salida = hp.getCalendar(SpShour,SpSmin,cboStiempo);
            Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
            Time sal =  Time.valueOf(fhora.format(salida.getTime()));
            Validator = val.horaMayor(sal, ing);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"Verificar horas seleccionadas");
               return Validator;
            }
        }
        return Validator;         
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhora = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbofindtipo = new javax.swing.JComboBox();
        btnfind = new javax.swing.JButton();
        lblcant = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Chkinactivo = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        cbotipo = new javax.swing.JComboBox();
        cboestado = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lblModified = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtblDetail = new javax.swing.JTable();
        BtnAgree = new javax.swing.JButton();
        BtnRemove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cbotipoReg = new javax.swing.JComboBox();
        lblcant1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SpIhour = new javax.swing.JSpinner();
        SpImin = new javax.swing.JSpinner();
        SpShour = new javax.swing.JSpinner();
        SpSmin = new javax.swing.JSpinner();
        cboItiempo = new javax.swing.JComboBox();
        cboStiempo = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de horarios"));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de horarios"));

        tblhora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblhora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhoraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhora);

        jLabel1.setText("Tipo");

        btnfind.setText("Ok");
        btnfind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfindMouseClicked(evt);
            }
        });

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Total: ");

        Chkinactivo.setText("Inactivo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(cbofindtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btnfind))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Chkinactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbofindtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnfind))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Chkinactivo))
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 130, -1));

        jPanel1.add(cbotipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));

        jPanel1.add(cboestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 127, -1));

        jLabel6.setText("Modificado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        lblModified.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblModified, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 128, 25));

        jLabel12.setText("Id");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 29));

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, 29));

        jTabbedPane1.addTab("Datos principales", jPanel1);

        JtblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(JtblDetail);

        BtnAgree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/registrar.png"))); // NOI18N
        BtnAgree.setText("Registrar");
        BtnAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgreeActionPerformed(evt);
            }
        });

        BtnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/eliminar.png"))); // NOI18N
        BtnRemove.setText("Eliminar");
        BtnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemoveActionPerformed(evt);
            }
        });

        jLabel8.setText("Dia");

        jLabel9.setText("Ingreso");

        jLabel10.setText("Salida");

        jLabel11.setText("Tipo");

        lblcant1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Total: ");

        SpIhour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SpImin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        SpShour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        SpSmin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        cboItiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        cboStiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel9))
                    .addComponent(jLabel10))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbotipoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SpIhour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpImin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboItiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SpShour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboStiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(BtnAgree)
                                .addGap(37, 37, 37)
                                .addComponent(BtnRemove))
                            .addComponent(lblcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(cbotipoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(SpIhour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpImin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboItiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SpShour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SpSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboStiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(lblcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgree)
                    .addComponent(BtnRemove))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Detalle del horario", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

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

        mitemupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/actualizar.png"))); // NOI18N
        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mfile.add(mitemupdate);

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

    private void mitemdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemdeleteActionPerformed
        try{
             val = new Validators();    
            Object[] datos = {lblId.getText()};
            Object[] tipos = {};
            if(val.validar(datos,tipos)){    
                int i;      
                i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

                if(i==0) {    
                    int id = Integer.valueOf(lblId.getText());

                    objhora = new HorariosDAO();
                    i = objhora.delete(id);
                    if(i==0) {
                        JOptionPane.showMessageDialog(null,"No se pudo eliminar el horario");

                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Horario eliminado");
                        FilterFind();
                        cleanBox();
                }
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }
    catch(Exception e){
        System.out.println(_error+"_Delete:"+e);
    }
       
    }//GEN-LAST:event_mitemdeleteActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed

    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
    try{
        val = new Validators("horarios");    
        Object[] datos = {txtnombre.getText()};
        Object[] tipos = {2};
        if(val.validar(datos,tipos)){    
            dt = new Data();
            String name = txtnombre.getText();
            boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboestado.getSelectedIndex()]);
            int tipo= qs.loadGlobal(1,cbotipo,0);
            objhora = new HorariosDAO();
            int i = objhora.save(name, estate,tipo);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
            }
            else {
                objhora.getTableAll(tblhora, lblcant);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nueva area registrada");      
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }
    catch(Exception e){
        System.out.println(_error+"_Register:"+e);
    }
        
    }//GEN-LAST:event_mitemregisterMousePressed

    private void tblhoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhoraMouseClicked
        hp=new Helpers(); 
        try {       
                int fsel;
                fsel = this.tblhora.getSelectedRow();
                objhora = new HorariosDAO();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblhora.getModel();
                String idUsu = String.valueOf(m.getValueAt(fsel, 0));
                
                //crear objeto modusu
                hora = objhora.getValues(Integer.parseInt(idUsu));
                //Asigando valores obtenidos
                lblId.setText(idUsu);
                txtnombre.setText(hora.getNombre());
                lblModified.setText(hp.getFormatDate(hora.getModified()));
                qs.loadGlobal(1,cbotipo,hora.getTipo());
                qs.loadState(cboestado,hora.isEstado());
                cargaDetalle();
              }
            catch (Exception e) {
                System.out.println(_error+"_tblhora:"+e);
            }
    }//GEN-LAST:event_tblhoraMouseClicked

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        try{
            val = new Validators("horarios");    
            Object[] datos = {txtnombre.getText()};
            Object[] tipos = {2};
            if(val.validar(datos,tipos)){    
                dt = new Data();
                int id = Integer.valueOf(lblId.getText());
                String name = txtnombre.getText();
                boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboestado.getSelectedIndex()]);
                int tipo= qs.loadGlobal(1,cbotipo,0);

                objhora = new HorariosDAO();
                int i = objhora.update(id,name,tipo,estate);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
                }
                else {
                    FilterFind();
                    cleanBox();
                    JOptionPane.showMessageDialog(null, "Horario actualizado");
                } 
            }                                          
            else {
                JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
            }
        }
        catch(Exception e){
            System.out.println(_error+"_Update:"+e);
        }
        
    }//GEN-LAST:event_mitemupdateMousePressed

    private void btnfindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfindMouseClicked

        FilterFind();
    }//GEN-LAST:event_btnfindMouseClicked

    private void BtnAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgreeActionPerformed
    try{
        int id = Integer.parseInt(lblId.getText());
        val = new Validators("horarios");
        hp = new Helpers();
        Object[] datos = {lblId.getText()};
        Object[] tipos={};
        if(val.validar(datos,tipos)){ //Validacion generica
            if(HoraValidator_Delete()){ //Validacion propia del evento
                dt = new Data();
                objdetail = new DetailHorarioDAO();

                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                int dia  = qs.loadGlobal(2,cboDia,0);
                int tipo = qs.loadGlobal(3,cbotipoReg,0);
                Calendar ingreso = hp.getCalendar(SpIhour,SpImin,cboItiempo);
                Calendar salida = hp.getCalendar(SpShour,SpSmin,cboStiempo);
                Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
                Time sal =  Time.valueOf(fhora.format(salida.getTime()));

                int i = objdetail.save(dia, tipo, ing, sal, id);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                }
                cargaDetalle();
            }
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un horario para poder ingresar sus detalles");
                }
        }
    catch(Exception e){
        System.out.println(_error+"Evento registrar: "+e);
    }
    
    }//GEN-LAST:event_BtnAgreeActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
       try{
        val = new Validators("horarios");    
        Object[] datos = {lblId.getText()};
        Object[] tipos={};
        if(val.validar(datos,tipos)){
        try {       
                int fsel;
                fsel = this.JtblDetail.getSelectedRow();
                
                if (fsel == -1) {
                    JOptionPane.showMessageDialog(null,"Seleccione un detalle para proceder a eliminarlo");
                } 
                else {
                    objdetail = new DetailHorarioDAO();
                    DefaultTableModel m = new DefaultTableModel();
                    m = (DefaultTableModel) this.JtblDetail.getModel();
                    int iddetail = Integer.parseInt(String.valueOf(m.getValueAt(fsel, 0)));
                    int i = objdetail.delete(iddetail);
                    if (i == 0) {
                        JOptionPane.showMessageDialog(null,"No se pudo eliminar su registro");
                    }
                    cargaDetalle();
                }
        } catch(Exception e){
           
        }
        }
       }catch(Exception e){
           System.out.println(_error+"_Remove:"+e);
        }
       
    }//GEN-LAST:event_BtnRemoveActionPerformed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(tblhora);
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
                    Confirma=xls.ExportJtable(tblhora, fichero, "Horarios");
                }
            } 
            else{
                Confirma=xls.ExportJtable(tblhora, fichero, "Horarios");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgree;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JCheckBox Chkinactivo;
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JTable JtblDetail;
    private javax.swing.JSpinner SpIhour;
    private javax.swing.JSpinner SpImin;
    private javax.swing.JSpinner SpShour;
    private javax.swing.JSpinner SpSmin;
    private javax.swing.JButton btnfind;
    private javax.swing.JComboBox cboDia;
    private javax.swing.JComboBox cboItiempo;
    private javax.swing.JComboBox cboStiempo;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cbofindtipo;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JComboBox cbotipoReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModified;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblcant1;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblhora;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
