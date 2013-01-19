package Gui;


import Dao.EmpleadoDAO;
import Javabeans.Empleado;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Appi.JExcel;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.write.WriteException;

public  class WinEmpleado extends javax.swing.JInternalFrame {
    private EmpleadoDAO objempl;
    private Query qs;
    private Validators val;
    private Empleado modemp;
    private Data dt ;
    private JExcel xl;
    private String _error = "Gui_WinEmpleado_";
    private JFileChooser fileChooser;
    private FileNameExtensionFilter fl;
    private JExcel xls;
    

    public WinEmpleado() {
        initComponents();
        cargaForm();
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public final void cargaForm(){
        try {
            objempl = new EmpleadoDAO();
            qs = new Query();
            objempl.getTableAll(tblEmpleado);
            qs.loadChoice(cboEstado,"estadoemp","nombre");
            qs.loadChoice(cboAreaFilter,"area","nombre");
            qs.loadChoice(cboEmpresa,"empresa","nombre");
            qs.setIdentify("idempr");
            qs.loadChoiceDefault(cboSucursal,"sucursal","nombre",
            Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem()))));
            qs.loadChoice(cboArea,"area","nombre");
            qs.setIdentify("idare");
            qs.loadChoiceDefault(cboCargo,"cargo","nombre",
            Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem()))));
            qs.loadChoice(cboTipo,"tipoempleado","nombre");

        } catch (Exception e) {
            System.out.println(_error+"_CaragForm:" + e);
        }
    }  
    public void cleanBox(){
        txtapellidos.setText("");
        txtdni.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txttelefono.setText("");
        cboArea.setSelectedIndex(0);
        cboCargo.setSelectedIndex(0);
        cboEmpresa.setSelectedIndex(0);
        cboEstado.setSelectedIndex(0);
        cboSucursal.setSelectedIndex(0);
        cboTipo.setSelectedIndex(0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblidempleado = new javax.swing.JLabel();
        cboEmpresa = new javax.swing.JComboBox();
        cboSucursal = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        cboCargo = new javax.swing.JComboBox();
        cboEstado = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cboAreaFilter = new javax.swing.JComboBox();
        chkactivo = new javax.swing.JCheckBox();
        btnFiltro = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        miteninfo = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        jmhuella = new javax.swing.JMenu();
        mhor = new javax.swing.JMenu();
        msue = new javax.swing.JMenu();
        mvac = new javax.swing.JMenu();
        jmfoto = new javax.swing.JMenu();
        mAbrirFoto = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();
        mExtra = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        pnlMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));
        pnlMantenimiento.setLayout(null);

        jLabel1.setText("Nombres");
        pnlMantenimiento.add(jLabel1);
        jLabel1.setBounds(10, 80, 64, 17);

        jLabel2.setText("Apellidos");
        pnlMantenimiento.add(jLabel2);
        jLabel2.setBounds(370, 80, 63, 17);
        pnlMantenimiento.add(txtnombres);
        txtnombres.setBounds(120, 80, 190, 27);

        jLabel4.setText("ID");
        pnlMantenimiento.add(jLabel4);
        jLabel4.setBounds(10, 30, 30, 29);
        pnlMantenimiento.add(txtapellidos);
        txtapellidos.setBounds(450, 80, 190, 27);

        jLabel7.setText("DNI");
        pnlMantenimiento.add(jLabel7);
        jLabel7.setBounds(10, 120, 100, 20);
        pnlMantenimiento.add(txtdni);
        txtdni.setBounds(120, 120, 190, 30);
        pnlMantenimiento.add(txttelefono);
        txttelefono.setBounds(450, 120, 190, 30);

        jLabel8.setText("Telefono");
        pnlMantenimiento.add(jLabel8);
        jLabel8.setBounds(370, 120, 70, 20);

        jLabel6.setText("Estado");
        pnlMantenimiento.add(jLabel6);
        jLabel6.setBounds(380, 30, 48, 17);

        lblidempleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblidempleado);
        lblidempleado.setBounds(120, 30, 70, 30);

        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });
        pnlMantenimiento.add(cboEmpresa);
        cboEmpresa.setBounds(120, 160, 190, 27);

        pnlMantenimiento.add(cboSucursal);
        cboSucursal.setBounds(450, 160, 190, 27);

        jLabel5.setText("Empresa");
        pnlMantenimiento.add(jLabel5);
        jLabel5.setBounds(10, 170, 70, 17);

        jLabel9.setText("Sucursal");
        pnlMantenimiento.add(jLabel9);
        jLabel9.setBounds(370, 160, 70, 17);

        jLabel10.setText("Area");
        pnlMantenimiento.add(jLabel10);
        jLabel10.setBounds(10, 210, 70, 17);

        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });
        pnlMantenimiento.add(cboArea);
        cboArea.setBounds(120, 200, 190, 27);

        jLabel11.setText("Cargo");
        pnlMantenimiento.add(jLabel11);
        jLabel11.setBounds(370, 210, 49, 17);

        pnlMantenimiento.add(cboCargo);
        cboCargo.setBounds(450, 200, 190, 27);

        pnlMantenimiento.add(cboEstado);
        cboEstado.setBounds(450, 30, 190, 27);

        jLabel12.setText("Tipo");
        pnlMantenimiento.add(jLabel12);
        jLabel12.setBounds(10, 250, 30, 17);

        pnlMantenimiento.add(cboTipo);
        cboTipo.setBounds(120, 240, 190, 27);

        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        pnlMantenimiento.add(lblFoto);
        lblFoto.setBounds(670, 60, 140, 170);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(1, 1, 1)));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jLabel3.setText("Area");

        chkactivo.setText("Activos");

        btnFiltro.setText("Ok");
        btnFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(cboAreaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFiltro)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboAreaFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkactivo)
                    .addComponent(btnFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mfile.add(mitemupdate);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        miteninfo.setText("Informacion");
        miteninfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miteninfoMousePressed(evt);
            }
        });
        medit.add(miteninfo);

        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

        jmhuella.setText("Huella digital");
        jMenuBar1.add(jmhuella);

        mhor.setText("Horarios");
        mhor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mhorMousePressed(evt);
            }
        });
        jMenuBar1.add(mhor);

        msue.setText("Salarios");
        msue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                msueMousePressed(evt);
            }
        });
        jMenuBar1.add(msue);

        mvac.setText("Vacaciones");
        mvac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvacMousePressed(evt);
            }
        });
        jMenuBar1.add(mvac);

        jmfoto.setText("Foto");

        mAbrirFoto.setText("Abrir");
        mAbrirFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mAbrirFotoMousePressed(evt);
            }
        });
        jmfoto.add(mAbrirFoto);

        jMenuBar1.add(jmfoto);

        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        jMenuBar1.add(mclose);

        mExtra.setText("Calculos");
        mExtra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mExtraMousePressed(evt);
            }
        });
        jMenuBar1.add(mExtra);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 174, Short.MAX_VALUE))
                    .addComponent(pnlMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(pnlMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
   try{
        val = new Validators("empleado");    
   Object[] datos = {txtnombres.getText(),txtapellidos.getText(),
                     txtdni.getText(),txttelefono.getText()};
   Object[] tipos = {2,3,4,5};
   if(val.validar(datos,tipos)){ 
        Data dt = new Data();
        qs = new Query();
        String nombre = txtnombres.getText();
        String dni=txtdni.getText();
        String apellido=txtapellidos.getText();
        String telefono=txttelefono.getText();
        int empresa =  Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem())));
        int area =  Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem())));
        int tipo =  Integer.parseInt(qs.idChoice("tipoempleado","nombre",String.valueOf(cboTipo.getSelectedItem())));
        int sucursal =  Integer.parseInt(qs.idChoice("sucursal","nombre",String.valueOf(cboSucursal.getSelectedItem())));
        int cargo =  Integer.parseInt(qs.idChoice("cargo","nombre",String.valueOf(cboCargo.getSelectedItem())));
        int estate =  Integer.parseInt(qs.idChoice("estadoemp","nombre",String.valueOf(cboEstado.getSelectedItem())));
        
        objempl = new EmpleadoDAO();
        int i = objempl.saveEmpleado(0,nombre,apellido,dni, telefono,area, tipo, estate,cargo,empresa,sucursal);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
            objempl.getTableAll(tblEmpleado);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nuevo usuario registrado");
        }
    } else {
        JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
    }
   }catch(Exception e){
       System.out.println(_error+"_Register:"+e);
    }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
    try{
        val = new Validators("empleado");    
        Object[] datos = {txtnombres.getText(),txtapellidos.getText(),
                          txtdni.getText(),txttelefono.getText(),lblidempleado.getText()};
        Object[] tipos = {2,3,4,5};
        if(val.validar(datos,tipos)){ 
            Data dt = new Data();
            qs = new Query();
            
            int id = Integer.parseInt(lblidempleado.getText());
            String nombre = txtnombres.getText();
            String dni=txtdni.getText();
            String apellido=txtapellidos.getText();
            String telefono=txttelefono.getText();
            
            int empresa =  Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem())));
            int area =  Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem())));
            int tipo =  Integer.parseInt(qs.idChoice("tipoempleado","nombre",String.valueOf(cboTipo.getSelectedItem())));
            int sucursal =  Integer.parseInt(qs.idChoice("sucursal","nombre",String.valueOf(cboSucursal.getSelectedItem())));
            int cargo =  Integer.parseInt(qs.idChoice("cargo","nombre",String.valueOf(cboCargo.getSelectedItem())));
            int estate =  Integer.parseInt(qs.idChoice("estadoemp","nombre",String.valueOf(cboEstado.getSelectedItem())));

            objempl = new EmpleadoDAO();
            objempl.UpdateEmpresa(id*-1);
            int i = objempl.updateEmpleado(id,nombre,apellido,dni, telefono,area, tipo, estate,cargo,empresa,sucursal);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
            }
            else {
                objempl.getTableAll(tblEmpleado);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nuevo usuario actualizado");
            }   
            }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }catch(Exception e){
        System.out.println(_error + "_Update:" + e);
    }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
     try {       
         int fsel;
         fsel = this.tblEmpleado.getSelectedRow();

         objempl = new EmpleadoDAO();
         modemp = new Empleado();

         DefaultTableModel m = new DefaultTableModel();
         m = (DefaultTableModel) this.tblEmpleado.getModel();
         String idEmp = String.valueOf(m.getValueAt(fsel, 0));
         System.out.println(idEmp);
                //crear objeto modusu
                
         modemp = objempl.getValues(Integer.parseInt(idEmp));
                //Asigando valores obtenidos
         lblidempleado.setText(idEmp);
         txtnombres.setText(modemp.getNombres());
         txtapellidos.setText(modemp.getApellidos());
         txtdni.setText(modemp.getDni());
         txttelefono.setText(modemp.getTelefono());
         qs.loadChoiceDefault(cboArea,"area","nombre",modemp.getIdare());
         qs.loadChoiceDefault(cboTipo,"tipoempleado","nombre",modemp.getIdtip());
         qs.loadChoiceDefault(cboEstado,"estadoemp","nombre",modemp.getIdest());
         qs.loadChoiceDefault(cboCargo,"cargo","nombre",modemp.getIdcar());
         qs.loadChoiceDefault(cboEmpresa,"empresa","nombre",modemp.getIdempr());
         qs.loadChoiceDefault(cboSucursal,"sucursal","nombre",modemp.getIdsuc());
         }
         catch (Exception e) {
            System.out.println(_error + "tblempleado:" + e);
         }     
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
    try{
        val = new Validators("empleado");    
    Object[] datos = {lblidempleado.getText()};
    Object[] tipos = {};
    if(val.validar(datos,tipos)){ 
        int i;      
        i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

        if(i==0) {    
            int id = Integer.valueOf(lblidempleado.getText());

            objempl = new EmpleadoDAO();
            i = objempl.deleteEmpleado(id);
            if(i==0) {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el empleado(Se cambio su esatdo a inactivo)");
                //TODO: IMPLEMENTAR CAMBIO DE ESTADO (INACTIVO)
            }
            else {
                objempl.getTableAll(tblEmpleado);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Empleado eliminada");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
    }
    }catch(Exception e){
        System.out.println(_error+"_Delete:"+e);
    }
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void msueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msueMousePressed
    if(!"".equals(lblidempleado.getText())){
        dt= new Data();
        String titulo=dt.G_TITULOS[19];
        WinEmpleado_Salarios objsalarios= new WinEmpleado_Salarios();
        objsalarios.setTitle(titulo);
        objsalarios.lblIdemp.setText(lblidempleado.getText());
        objsalarios.setResizable(true);
        objsalarios.setMaximizable(true);
        objsalarios.setIconifiable(true);
        WinMdi.jdpContenedor.add(objsalarios);

        objsalarios.setVisible(true);
     } else {
           JOptionPane.showMessageDialog(null,"Debe de seleccionar un empleado para poder asignarle sus salarios");
     }
    }//GEN-LAST:event_msueMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mvacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvacMousePressed
    if(!"".equals(lblidempleado.getText())){
        dt= new Data();
        String titulo=dt.G_TITULOS[20];
        WinEmpleado_Vacaciones objvacaciones= new WinEmpleado_Vacaciones();
        objvacaciones.setTitle(titulo);
        objvacaciones.lblIdemp.setText(lblidempleado.getText());
        objvacaciones.setResizable(true);
        objvacaciones.setMaximizable(true);
        objvacaciones.setIconifiable(true);
        WinMdi.jdpContenedor.add(objvacaciones);

        objvacaciones.setVisible(true); 
    } else {
           JOptionPane.showMessageDialog(null,"Debe de seleccionar un empleado para poder asignarle vacaciones");
    }
    }//GEN-LAST:event_mvacMousePressed

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    private void mhorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhorMousePressed
   if(!"".equals(lblidempleado.getText())){
        dt= new Data();
        WinEmpleado_horarios objEmpleado_has_horarios= new WinEmpleado_horarios();
        objEmpleado_has_horarios.setTitle(dt.G_TITULOS[18]);
        objEmpleado_has_horarios.lblIdemp.setText(lblidempleado.getText());
        objEmpleado_has_horarios.setResizable(true);
        objEmpleado_has_horarios.setMaximizable(true);
        objEmpleado_has_horarios.setIconifiable(true);
        WinMdi.jdpContenedor.add(objEmpleado_has_horarios);
        objEmpleado_has_horarios.setVisible(true);
        
      } else {
           JOptionPane.showMessageDialog(null,"Debe de seleccionar un empleado para poder asignarle sus horarios");
       }
    }//GEN-LAST:event_mhorMousePressed

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
    qs = new Query();
    qs.setIdentify("idempr");
    qs.loadChoiceDefault(cboSucursal,"sucursal","nombre",Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem()))));
    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
    qs = new Query();
    qs.setIdentify("idare");
    qs.loadChoiceDefault(cboCargo,"cargo","nombre",Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem()))));
    }//GEN-LAST:event_cboAreaActionPerformed

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        
        String  idarea = String.valueOf(cboAreaFilter.getSelectedIndex()+1);
        objempl = new EmpleadoDAO();
        objempl.find(idarea, tblEmpleado);
    }//GEN-LAST:event_btnFiltroMouseClicked

    private void miteninfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miteninfoMousePressed
        try {
            String id = lblidempleado.getText();
            xl = new JExcel();
            xl.XlsEmpleado_Informacion(id);
            xl.ExcelTest();

        } catch (Exception ex) {
            Logger.getLogger(WinEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miteninfoMousePressed

    private void mAbrirFotoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mAbrirFotoMousePressed
        if(!"".equals(this.lblidempleado.getText())){
            fileChooser= new JFileChooser();
            fl= new FileNameExtensionFilter("jpg & png", "jpg", "png");
            fileChooser.setAcceptAllFileFilterUsed(false);
            fileChooser.setFileFilter(fl);
            int imagenElegida= fileChooser.showOpenDialog(this);
            if(imagenElegida == JFileChooser.APPROVE_OPTION) 
                {
                    String file= fileChooser.getSelectedFile().getAbsolutePath();
                    //Modificando la imagen
                    ImageIcon icon = new ImageIcon(file);
                    // se extrae la imagen del icono
                    Image img = icon.getImage();
                    //Se modifica su tamaño
                    Image newimg = img.getScaledInstance(140,170,java.awt.Image.SCALE_SMOOTH);
                    // se genera el Image icon con la nueva imagen
                    ImageIcon newIcon = new ImageIcon(newimg);
                    lblFoto.setIcon(newIcon); // se coloca el nuevo icono modificado
                    lblFoto.setSize(140,170); // se cambia el tamaño de la etiqueta
                }
        } else {
            JOptionPane.showMessageDialog(null,"Debe de seleccionar una empleado para poder ingresar sus dias no laborables");
        }
    }//GEN-LAST:event_mAbrirFotoMousePressed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(tblEmpleado);
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
                    Confirma=xls.ExportJtable(tblEmpleado, fichero, "Empleados");
                }
            } 
            else{
                Confirma=xls.ExportJtable(tblEmpleado, fichero, "Empleados");
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

    private void mExtraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mExtraMousePressed
    if(!"".equals(this.lblidempleado.getText())){
           dt= new Data();
            String titulo=dt.G_TITULOS[21];
            WinExtra_descuento objextra= new WinExtra_descuento();
            objextra.setTitle(titulo);
            objextra.lblIdemp.setText(lblidempleado.getText());
            objextra.setResizable(true);
            objextra.setMaximizable(true);
            objextra.setIconifiable(true);
            WinMdi.jdpContenedor.add(objextra);

            objextra.setVisible(true);   
        } else {
            JOptionPane.showMessageDialog(null,"Debe de seleccionar una empleado para poder ingresar sus dias no laborables");
        }
    }//GEN-LAST:event_mExtraMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JButton btnFiltro;
    private javax.swing.JComboBox cboArea;
    private javax.swing.JComboBox cboAreaFilter;
    private javax.swing.JComboBox cboCargo;
    private javax.swing.JComboBox cboEmpresa;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboSucursal;
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JCheckBox chkactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmfoto;
    private javax.swing.JMenu jmhuella;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblidempleado;
    private javax.swing.JMenuItem mAbrirFoto;
    private javax.swing.JMenu mExtra;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenu mhor;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JMenuItem miteninfo;
    private javax.swing.JMenu msue;
    private javax.swing.JMenu mvac;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
