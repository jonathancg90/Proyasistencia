
package Gui;

import Appi.JExcel;
import Dao.UserDAO;
import Javabeans.Usuario;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class WinUsuario extends javax.swing.JInternalFrame {
    private UserDAO objUser;
    private Query qs;
    private Usuario modusu;
    private Data dt;
    private Validators val;
    private String _error="Gui_Usuario";
    private JExcel xls;
    
    /**
     * Creates new form WinUsuario
     */
    public WinUsuario() {
        initComponents();
        cargaForm();
    }
    /**
     *Carga de formualrio
     */
    public final void cargaForm(){
        try {
            objUser = new UserDAO();
            qs = new Query();
            objUser.getTableAll(TblUsu, lblcant);
            qs.loadState(cboEstado, false); 
            qs.loadState(cboFilter, false);
            qs.loadChoice(cboEmp, "empleado", "nombres");
            qs.loadChoice(cboRol, "roles", "nombre");
    } catch (Exception e) {
            System.out.println(_error+"_CargaForm:"+e);
        }
    }
     public void cleanBox(){
        lblUsu.setText("");
        cboEmp.setSelectedIndex(0);
        txtUsername.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        cboEstado.setSelectedIndex(0);
        lblUsu.requestFocus();
        Txtcorreo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        cboEmp = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox();
        cboRol = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        Txtcorreo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblUsu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cboFilter = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lblcant = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Id usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        lblUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 31, 92, 17));

        jPanel1.add(cboEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 66, 130, -1));

        jLabel3.setText("empleado :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 71, -1, -1));

        jLabel5.setText("Usename:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 112, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 140, -1));

        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 174, -1));

        jPanel1.add(cboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 174, -1));

        jLabel7.setText("Rol:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel8.setText("Re - Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        jPanel1.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 224, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 224, -1));

        jLabel9.setText("E - mail");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 144, -1, -1));
        jPanel1.add(Txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 144, 224, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(1, 1, 1)));

        TblUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblUsuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblUsu);

        jLabel2.setText("Estado");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Total: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboFilter, 0, 119, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Archivo.png"))); // NOI18N
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
        mitemupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemupdateActionPerformed(evt);
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

        medit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

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
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblUsuMouseClicked
    try {       
        int fsel;
        fsel = this.TblUsu.getSelectedRow();
        objUser = new UserDAO();
        DefaultTableModel m = new DefaultTableModel();
        m = (DefaultTableModel) this.TblUsu.getModel();
        String idUsu = String.valueOf(m.getValueAt(fsel, 0));
        modusu = objUser.getValues(Integer.parseInt(idUsu));
        lblUsu.setText(idUsu);   
        txtUsername.setText(modusu.getUsername());
        txtPassword.setText(modusu.getPassword());
        txtRePassword.setText(modusu.getPassword());
        qs.loadChoiceDefault(cboRol, "roles", "nombre", modusu.getRol());
        qs.loadChoiceDefault(cboEmp, "empleado", "nombres", modusu.getIdemp());
        Txtcorreo.setText(modusu.getCorreo());
        qs.loadState(cboEstado, modusu.isEstado());
       } catch (Exception e) {
                System.out.println(_error+"_tblusu:"+e);
       }
    }//GEN-LAST:event_TblUsuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dt = new Data();
        String  state = dt.G_BOOLEAN[cboFilter.getSelectedIndex()].substring(0, 1);
        objUser = new UserDAO();
        objUser.find(state, TblUsu, lblcant);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        try{
            objUser = new UserDAO();
            val = new Validators("usuario");    
            Object[] datos = {txtUsername.getText(), txtPassword.getPassword(), Txtcorreo.getText()};
            Object[] tipos = {3, 4, 9};
            if (val.validar(datos, tipos)) {     
                dt = new Data();
                String username = txtUsername.getText();
                String password = objUser.encriptar(String.valueOf(txtPassword.getPassword()).toLowerCase());
                String nomemp = String.valueOf(cboEmp.getSelectedItem());
                qs = new Query();
                int idemp = Integer.parseInt(qs.idChoice("empleado", "nombres", nomemp));
                int idState = dt.getEstado(String.valueOf(cboEstado.getSelectedItem()));
                boolean estate = Boolean.valueOf(dt.G_BOOLEAN[idState]);
                int rol = Integer.parseInt(qs.idChoice("roles", "nombre", String.valueOf(cboRol.getSelectedItem())));
                String correo = Txtcorreo.getText();
                objUser = new UserDAO();
                int i = objUser.saveUsuario(username, password, idemp, estate, rol, correo);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null, "No se pudo grabar datos");
                } else {
                    objUser.getTableAll(TblUsu, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null, "Nuevo usuario registrado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Campos requeridos incompletos");
            } 
        } catch(Exception e) {
            System.out.println(_error+"_Register:"+e);
        }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        try{
        //objUser = new UserDAO ();
        val = new Validators("usuario");    
        Object[] datos = {txtUsername.getText(),txtPassword.getPassword(),Txtcorreo.getText(),lblUsu.getText()};
        Object[] tipos = {3,4,9,0};
        if(val.validar(datos,tipos)){     
            dt = new Data();
            int id = Integer.parseInt(lblUsu.getText());
            String username = txtUsername.getText();
            //String password=objUser.encriptar(String.valueOf(txtPassword.getPassword()).toLowerCase());
            String nomemp = String.valueOf(cboEmp.getSelectedItem());
            qs = new Query();
            int idemp = Integer.parseInt(qs.idChoice("empleado","nombres", nomemp));
            int idState = dt.getEstado(String.valueOf(cboEstado.getSelectedItem()));
            boolean estate = Boolean.valueOf(dt.G_BOOLEAN[idState]);
            int rol = Integer.parseInt(qs.idChoice("roles","nombre",String.valueOf(cboRol.getSelectedItem())));
            String correo = Txtcorreo.getText();
            objUser = new UserDAO();
            String password=objUser.encriptar(String.valueOf(txtPassword.getPassword()).toLowerCase());
            int i = objUser.updateUsuario(id,username,password,idemp,estate,rol,correo);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
            }
            else {
                objUser.getTableAll(TblUsu, lblcant);
                cleanBox();
                JOptionPane.showMessageDialog(null,"usuario actualizado");
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }

        }catch(Exception e){
            System.out.println(_error+"_Update:"+e);
        }

    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
        try{
        val = new Validators("usuario");    
        Object[] datos = {lblUsu.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){    
            int i;      
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

            if(i==0) {    
                int id = Integer.valueOf(lblUsu.getText());

                objUser = new UserDAO();
                i = objUser.deleteUsuario(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el usuario");
                }
                else {
                    objUser.getTableAll(TblUsu, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"usuario eliminado");
                }
            }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){
            System.out.println(_error+"_Delete:"+e);
        }
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mitemupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemupdateActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(TblUsu);
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
                    Confirma=xls.ExportJtable(TblUsu, fichero, "Usuarios");
                }
            } 
            else{
                Confirma=xls.ExportJtable(TblUsu, fichero, "Usuarios");
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
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JTable TblUsu;
    private javax.swing.JTextField Txtcorreo;
    private javax.swing.JComboBox cboEmp;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboFilter;
    private javax.swing.JComboBox cboRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
