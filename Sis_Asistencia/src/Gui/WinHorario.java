
package Gui;
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
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WinHorario extends javax.swing.JInternalFrame {

    private Query qs;
    private HorariosDAO objhora;
    private DetailHorarioDAO objdetail;
    private Horarios hora;
    private Data dt;
    private Validators val;
    private Helpers hp;
    
    public WinHorario() {
        initComponents();
        cargaForm();
    }
    private void cargaForm(){
        try {
            objhora = new HorariosDAO();
            qs = new Query();
            objhora.getTableAll(tblhora);
            qs.loadState(cbofindestado,false);
            qs.loadState(cboestado,false);
            qs.loadGlobal(1,cbofindtipo,1);
            qs.loadGlobal(1,cbotipo,1);
            //Detalles de horarios
            qs.loadGlobal(2,cboDia,1);
            qs.loadGlobal(3,cbotipoReg,1);

        } catch (Exception e) {
            System.out.println("Gui_WinHorarios_cargaForm: " + e);
        }
    }
    private void cargaDetalle(){
        objdetail = new DetailHorarioDAO();
        String horario = lblId.getText();
        objdetail.find(horario,JtblDetail);
       //objdetail.getTableAll(JtblDetail);
    }
    
    private void cleanBox(){
        lblId.setText("");
        txtnombre.setText("");
        lblModified.setText("");
    }
    private boolean HoraValidator(){
        boolean Validator= true;
        val = new Validators();
        String[] args = new String[3];
        String[] kargs = new String[5];
        
        args[0] = "detailhorario";
        args[1] = "horarios_idhor";
        args[2] = lblId.getText();
        System.out.println("Validator1"+Validator );
        if(Validator){
            Validator = val.MaxRegistro(args, 14);
        }
        System.out.println("Validator2"+Validator );
        if(Validator){
            kargs = args;
            kargs[3] = "dia";
            for (int i=1;i<=7;i++){
                System.out.println("Validator3"+Validator );
                kargs[4] = ""+i;
                Validator = val.MaxRegistro(args, 2);
                if(!Validator){
                    JOptionPane.showMessageDialog(null,"No se permite otro registro de ese mismo dia");
                    return Validator;
                }
            }
        }
        System.out.println("Validator4"+Validator );
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
        jLabel2 = new javax.swing.JLabel();
        cbofindtipo = new javax.swing.JComboBox();
        cbofindestado = new javax.swing.JComboBox();
        btnfind = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
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
        TimSalida = new com.lavantech.gui.comp.TimePanel();
        TimIngreso = new com.lavantech.gui.comp.TimePanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
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

        jLabel2.setText("Estado");

        btnfind.setText("Ok");
        btnfind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfindMouseClicked(evt);
            }
        });

        jCheckBox1.setText("Mostrar todo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(cbofindestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnfind))
                            .addComponent(cbofindtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbofindtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbofindestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        BtnAgree.setText("Agregar");
        BtnAgree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgreeActionPerformed(evt);
            }
        });

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

        TimSalida.setDisplayAnalog(false);
        TimSalida.setSecDisplayed(false);

        TimIngreso.setDisplayAnalog(false);
        TimIngreso.setSecDisplayed(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BtnAgree)
                        .addGap(37, 37, 37)
                        .addComponent(BtnRemove)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TimSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbotipoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
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
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TimIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgree)
                    .addComponent(BtnRemove))
                .addGap(50, 50, 50))
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
                    .addComponent(jTabbedPane1))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

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
                        objhora.getTableAll(tblhora);
                        cleanBox();
                }
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }
    catch(Exception e){}
       
    }//GEN-LAST:event_mitemdeleteActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed

    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        try{
            val = new Validators();    
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
                objhora.getTableAll(tblhora);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nueva area registrada");      
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }
    catch(Exception e){}
        
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
                System.out.println("Gui_WinHorario: " + e);
            }
    }//GEN-LAST:event_tblhoraMouseClicked

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        try{
            val = new Validators();    
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
                objhora.getTableAll(tblhora);
                cleanBox();
                JOptionPane.showMessageDialog(null, "Horario actualizado");
            } 
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }
    catch(Exception e){}
        
    }//GEN-LAST:event_mitemupdateMousePressed

    private void btnfindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfindMouseClicked
        dt = new Data();
        String  state = dt.G_BOOLEAN[cbofindestado.getSelectedIndex()].substring(0,1);
        objhora = new HorariosDAO();
        objhora.find(state, tblhora);
    }//GEN-LAST:event_btnfindMouseClicked

    private void BtnAgreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgreeActionPerformed
    try{
        int id = Integer.parseInt(lblId.getText());
        val = new Validators();    
        Object[] datos = {lblId.getText()};
        Object[] tipos={};
        if(val.validar(datos,tipos)){ //Validacion generica
            System.out.println("Entro 1");
            if(HoraValidator()){ //Validacion propia del evento
                System.out.println("Entro 2 :"+HoraValidator());
                dt = new Data();
                objdetail = new DetailHorarioDAO();

                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                int dia  = qs.loadGlobal(2,cboDia,0);
                int tipo = qs.loadGlobal(3,cbotipoReg,0);
                Calendar ingreso = TimIngreso.getCalendar();
                Calendar salida = TimSalida.getCalendar();
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
        System.out.println("Evento registrar: "+e);
    }
    
    }//GEN-LAST:event_BtnAgreeActionPerformed

    private void BtnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemoveActionPerformed
       hp=new Helpers(); 
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
       
    }//GEN-LAST:event_BtnRemoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgree;
    private javax.swing.JButton BtnRemove;
    private javax.swing.JTable JtblDetail;
    private com.lavantech.gui.comp.TimePanel TimIngreso;
    private com.lavantech.gui.comp.TimePanel TimSalida;
    private javax.swing.JButton btnfind;
    private javax.swing.JComboBox cboDia;
    private javax.swing.JComboBox cboestado;
    private javax.swing.JComboBox cbofindestado;
    private javax.swing.JComboBox cbofindtipo;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JComboBox cbotipoReg;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
