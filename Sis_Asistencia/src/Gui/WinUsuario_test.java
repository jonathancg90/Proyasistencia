/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Dao.UserDAO;
import Javabeans.Area;
import Javabeans.Usuario;
import Utilitarios.Data;
import Utilitarios.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WinUsuario_test extends javax.swing.JInternalFrame {
    private UserDAO objUser;
    private Query qs;
    private Usuario modusu;
    private Data dt ;
    /**
     * Creates new form WinUsuario_test
     */
    public WinUsuario_test() {
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
            objUser.getTableAll(TblUsu);
            qs.loadState(cboEstado,false);
            qs.loadChoice(cboEmp,"empleado","nombres");
            qs.loadChoice(cboRol,"roles","nombre");
            
            
        } catch (Exception e) {
            System.out.println("Gui_WinMdi: " + e);
        }
    }
     public void cleanBox(){
        lblUsu.setText("");
        cboEmp.setSelectedIndex(0);
        txtUsername.setText("");
        txtPassword.setText("");
        //dtcreated.setText("");
        //dtmodified.setText("");
        cboEstado.setSelectedIndex(0);
        lblUsu.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOpciones = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblUsu = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        cboEmp = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox();
        cboRol = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnList.setText("Listar");

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcionesLayout = new javax.swing.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnList)
                    .addComponent(btnClose))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));

        jLabel1.setText("Id usuario:");

        lblUsu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Id empleado :");

        jLabel5.setText("Usename:");

        jLabel4.setText("Password:");

        jLabel6.setText("ESstado:");

        jLabel7.setText("Rol:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboEmp, 0, 85, Short.MAX_VALUE)))))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(94, 94, 94)
                                .addComponent(cboRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)
                                .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        dt = new Data();
        String username = txtUsername.getText();
        String password=txtPassword.getText();
        int idemp = cboEmp.getSelectedIndex();
        
        boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboEstado.getSelectedIndex()]);
        int rol = cboRol.getSelectedIndex();
       
        objUser = new UserDAO();
        int i = objUser.saveUsuario(username,password,idemp,estate,rol);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
            objUser.getTableAll(TblUsu);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nueva area registrada");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        dt = new Data();
        int id = Integer.parseInt(lblUsu.getText());
        String username = txtUsername.getText();
        String password=txtPassword.getText();
        int idemp = cboEmp.getSelectedIndex();
        
        boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cboEstado.getSelectedIndex()]);
        int rol = cboRol.getSelectedIndex();
        
        objUser = new UserDAO();
        int i = objUser.updateUsuario(id,username,password,idemp,estate,rol);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
            objUser.getTableAll(TblUsu);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nueva area registrada");
        }  
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.valueOf(lblUsu.getText());

        objUser = new UserDAO();
        int i = objUser.deleteUsuario(id);
        if(i==0) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
        }
        else {
            objUser.getTableAll(TblUsu);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Area eliminada");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_btnCloseActionPerformed

    private void TblUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblUsuMouseClicked
    try {       int fsel;
                fsel = this.TblUsu.getSelectedRow();
                objUser = new UserDAO();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.TblUsu.getModel();
                String idUsu = String.valueOf(m.getValueAt(fsel, 0));
                
                //crear objeto modusu
                modusu = objUser.getValues(Integer.parseInt(idUsu));
                //Asigando valores obtenidos
                lblUsu.setText(idUsu);
                txtUsername.setText(modusu.getUsername());
                txtPassword.setText(modusu.getPassword());
              
                qs.loadState(cboEstado,modusu.isEstado());
                }
            catch (Exception e) {
                System.out.println("Gui_Win_area: " + e);
            }
    }//GEN-LAST:event_TblUsuMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblUsu;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cboEmp;
    private javax.swing.JComboBox cboEstado;
    private javax.swing.JComboBox cboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
