
package Gui;


import Dao.EmpleadoDAO;
import Javabeans.Empleado;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public  class WinEmpleado extends javax.swing.JInternalFrame {
    private EmpleadoDAO objempl;
    private Query qs;
    private Validators val;
    private Empleado modemp;
    private Data dt ;
    
    

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
            qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem())));
            qs.loadChoice(cboArea,"area","nombre");
            qs.setIdentify("idare");
            qs.loadChoiceDefault(cboCargo,"cargo","nombre",
            qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem())));
            qs.loadChoice(cboTipo,"tipoempleado","nombre");
            
            

        } catch (Exception e) {
            System.out.println("Gui_Win_area: " + e);
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
        mhor = new javax.swing.JMenu();
        msue = new javax.swing.JMenu();
        mvac = new javax.swing.JMenu();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        pnlMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));
        pnlMantenimiento.setLayout(null);

        jLabel1.setText("Nombres");
        pnlMantenimiento.add(jLabel1);
        jLabel1.setBounds(10, 80, 64, 17);

        jLabel2.setText("Apellidos");
        pnlMantenimiento.add(jLabel2);
        jLabel2.setBounds(300, 90, 63, 17);
        pnlMantenimiento.add(txtnombres);
        txtnombres.setBounds(120, 80, 168, 27);

        jLabel4.setText("ID");
        pnlMantenimiento.add(jLabel4);
        jLabel4.setBounds(10, 30, 30, 29);
        pnlMantenimiento.add(txtapellidos);
        txtapellidos.setBounds(380, 80, 160, 27);

        jLabel7.setText("DNI");
        pnlMantenimiento.add(jLabel7);
        jLabel7.setBounds(10, 120, 100, 20);
        pnlMantenimiento.add(txtdni);
        txtdni.setBounds(120, 120, 160, 30);
        pnlMantenimiento.add(txttelefono);
        txttelefono.setBounds(380, 120, 160, 30);

        jLabel8.setText("Telefono");
        pnlMantenimiento.add(jLabel8);
        jLabel8.setBounds(300, 120, 70, 20);

        jLabel6.setText("Estado");
        pnlMantenimiento.add(jLabel6);
        jLabel6.setBounds(310, 40, 48, 17);

        lblidempleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblidempleado);
        lblidempleado.setBounds(120, 30, 70, 30);

        cboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEmpresaActionPerformed(evt);
            }
        });
        pnlMantenimiento.add(cboEmpresa);
        cboEmpresa.setBounds(120, 160, 160, 27);

        pnlMantenimiento.add(cboSucursal);
        cboSucursal.setBounds(380, 160, 160, 27);

        jLabel5.setText("Empresa");
        pnlMantenimiento.add(jLabel5);
        jLabel5.setBounds(10, 170, 70, 17);

        jLabel9.setText("Sucursal");
        pnlMantenimiento.add(jLabel9);
        jLabel9.setBounds(300, 170, 70, 17);

        jLabel10.setText("Area");
        pnlMantenimiento.add(jLabel10);
        jLabel10.setBounds(10, 210, 70, 17);

        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });
        pnlMantenimiento.add(cboArea);
        cboArea.setBounds(120, 200, 160, 27);

        jLabel11.setText("Cargo");
        pnlMantenimiento.add(jLabel11);
        jLabel11.setBounds(300, 210, 49, 17);

        pnlMantenimiento.add(cboCargo);
        cboCargo.setBounds(380, 200, 160, 27);

        pnlMantenimiento.add(cboEstado);
        cboEstado.setBounds(380, 40, 160, 27);

        jLabel12.setText("Tipo");
        pnlMantenimiento.add(jLabel12);
        jLabel12.setBounds(10, 250, 30, 17);

        pnlMantenimiento.add(cboTipo);
        cboTipo.setBounds(120, 240, 160, 27);

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
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

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        jMenuBar1.add(medit);

        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
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
   val = new Validators();    
   Object[] datos = {txtnombres.getText(),txtapellidos.getText(),
                     txtdni.getText(),txttelefono.getText()};
   if(val.validar(datos)){ 
        Data dt = new Data();
        qs = new Query();
        String nombre = txtnombres.getText();
        String dni=txtdni.getText();
        String apellido=txtapellidos.getText();
        String telefono=txttelefono.getText();
        int empresa =  qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem()));
        int area =  qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem()));
        int tipo =  qs.idChoice("tipoempleado","nombre",String.valueOf(cboTipo.getSelectedItem()));
        int sucursal =  qs.idChoice("sucursal","nombre",String.valueOf(cboSucursal.getSelectedItem()));
        int cargo =  qs.idChoice("cargo","nombre",String.valueOf(cboCargo.getSelectedItem()));
        int estate =  qs.idChoice("estadoemp","nombre",String.valueOf(cboEstado.getSelectedItem()));

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
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
    val = new Validators();    
    Object[] datos = {txtnombres.getText(),txtapellidos.getText(),
                      txtdni.getText(),txttelefono.getText(),lblidempleado.getText()};
    if(val.validar(datos)){ 
        Data dt = new Data();
        qs = new Query();
        int id = Integer.parseInt(lblidempleado.getText());
        String nombre = txtnombres.getText();
        String dni=txtdni.getText();
        String apellido=txtapellidos.getText();
        String telefono=txttelefono.getText();
        int empresa =  qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem()));
        int area =  qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem()));
        int tipo =  qs.idChoice("tipoempleado","nombre",String.valueOf(cboTipo.getSelectedItem()));
        int sucursal =  qs.idChoice("sucursal","nombre",String.valueOf(cboSucursal.getSelectedItem()));
        int cargo =  qs.idChoice("cargo","nombre",String.valueOf(cboCargo.getSelectedItem()));
        int estate =  qs.idChoice("estadoemp","nombre",String.valueOf(cboEstado.getSelectedItem()));
       
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
    }//GEN-LAST:event_mitemupdateMousePressed

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
     try {       int fsel;
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
                qs.loadState(cboEstado,Boolean.valueOf(""+modemp.getIdest()));
                qs.loadChoiceDefault(cboCargo,"cargo","nombre",modemp.getIdcar());
                qs.loadChoiceDefault(cboEmpresa,"empresa","nombre",modemp.getIdempr());
                qs.loadChoiceDefault(cboSucursal,"sucursal","nombre",modemp.getIdsuc());
                }
            catch (Exception e) {
                System.out.println("Gui_Win_area: " + e);
            }     
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
    val = new Validators();    
    Object[] datos = {lblidempleado.getText()};
    if(val.validar(datos)){ 
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
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void msueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msueMousePressed
    if(!"".equals(lblidempleado.getText())){
        dt= new Data();
        String titulo=dt.G_TITULOS[19];
        WinSalarios objsalarios= new WinSalarios();
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
        WinVacaciones objvacaciones= new WinVacaciones();
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
        String titulo=dt.G_TITULOS[18];
        WinEmpleado_has_horarios objEmpleado_has_horarios= new WinEmpleado_has_horarios();
        objEmpleado_has_horarios.setTitle(titulo);
        objEmpleado_has_horarios.lblIdemp.setText(lblidempleado.getText());
        objEmpleado_has_horarios.setResizable(true);
        objEmpleado_has_horarios.setMaximizable(true);
        objEmpleado_has_horarios.setIconifiable(true);
        WinMdi.jdpContenedor.add(objEmpleado_has_horarios);
      } else {
           JOptionPane.showMessageDialog(null,"Debe de seleccionar un empleado para poder asignarle sus horarios");
       }
    }//GEN-LAST:event_mhorMousePressed

    private void cboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEmpresaActionPerformed
    qs = new Query();
    qs.setIdentify("idempr");
    qs.loadChoiceDefault(cboSucursal,"sucursal","nombre",qs.idChoice("empresa","nombre",String.valueOf(cboEmpresa.getSelectedItem())));
    }//GEN-LAST:event_cboEmpresaActionPerformed

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
    qs = new Query();
    qs.setIdentify("idare");
    qs.loadChoiceDefault(cboCargo,"cargo","nombre",qs.idChoice("area","nombre",String.valueOf(cboArea.getSelectedItem())));
    }//GEN-LAST:event_cboAreaActionPerformed

    private void btnFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroMouseClicked
        dt = new Data();
        String  idarea = String.valueOf(cboAreaFilter.getSelectedIndex()+1);
        objempl = new EmpleadoDAO();
        objempl.find(idarea, tblEmpleado);
    }//GEN-LAST:event_btnFiltroMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblidempleado;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenu mhor;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
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
