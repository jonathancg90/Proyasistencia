
package Gui;

import Dao.AreaDAO;
import Dao.UserDAO;
import Utilitarios.Query;
import javax.swing.JOptionPane;


public class WinUsuario extends javax.swing.JInternalFrame {
    private UserDAO objUser;
    boolean estado=false;
    private Query qs;
    
    /**
     * Creates new form WinUsuario
     */
    public WinUsuario() {
        initComponents();
        cargaForm();
    }

    public void cargaForm(){
        try {
            objUser = new UserDAO();
            qs = new Query();
            objUser.getTableAll(TblUsu);
            qs.loadState(cboestado);
        } catch (Exception e) {
            System.out.println("Gui_WinMdi: " + e);
        }
    }
     public void cleanBox(){
        lblidusu.setText("");
        lblidemp.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        dtcreated.setText("");
        dtmodified.setText("");
        cboestado.setSelectedIndex(0);
        lblidusu.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblidusu = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dtcreated = new datechooser.beans.DateChooserCombo();
        dtmodified = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        lblidemp = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblUsu = new javax.swing.JTable();
        cboestado = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMantenimiento.setLayout(null);

        jLabel1.setText("Username");
        pnlMantenimiento.add(jLabel1);
        jLabel1.setBounds(12, 52, 71, 17);

        jLabel2.setText("Password");
        pnlMantenimiento.add(jLabel2);
        jLabel2.setBounds(12, 85, 68, 17);

        jLabel3.setText("Fecha de creación");
        pnlMantenimiento.add(jLabel3);
        jLabel3.setBounds(12, 137, 126, 17);
        pnlMantenimiento.add(txtusername);
        txtusername.setBounds(165, 47, 168, 27);

        jLabel4.setText("Id usuario:");
        pnlMantenimiento.add(jLabel4);
        jLabel4.setBounds(12, 12, 94, 29);

        lblidusu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblidusu);
        lblidusu.setBounds(165, 12, 94, 29);
        pnlMantenimiento.add(txtpassword);
        txtpassword.setBounds(165, 80, 168, 27);

        jLabel5.setText("Fecha de modificación");
        pnlMantenimiento.add(jLabel5);
        jLabel5.setBounds(12, 160, 154, 17);
        pnlMantenimiento.add(dtcreated);
        dtcreated.setBounds(178, 127, 155, 27);
        pnlMantenimiento.add(dtmodified);
        dtmodified.setBounds(178, 160, 155, 27);

        jLabel9.setText("Id empresa:");
        pnlMantenimiento.add(jLabel9);
        jLabel9.setBounds(345, 12, 94, 51);

        lblidemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblidemp);
        lblidemp.setBounds(445, 23, 94, 29);

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

        pnlMantenimiento.add(jScrollPane2);
        jScrollPane2.setBounds(345, 69, 218, 151);

        pnlMantenimiento.add(cboestado);
        cboestado.setBounds(178, 193, 155, 27);

        jLabel6.setText("Estado");
        pnlMantenimiento.add(jLabel6);
        jLabel6.setBounds(12, 195, 94, 17);

        getContentPane().add(pnlMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 571, 228));

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
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

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
                .addContainerGap(186, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 234, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        int idusu=Integer.parseInt(lblidusu.getText());
        int idemp=Integer.parseInt(lblidemp.getText());
        String username = txtusername.getText();
        String password=txtpassword.getText();
        String created=dtcreated.getText();
        String modified=dtmodified.getText();
        int estate = cboestado.getSelectedIndex();
        if(estate==0){
            estado=false;
        }
        else{
            estado=true;
        }
        objUser = new UserDAO();
        int i = objUser.saveUsuario(idusu,username,password,idemp,created,modified,estado);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        }
        else {
            objUser.getTableAll(TblUsu);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nueva area registrada");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int idusu=Integer.parseInt(lblidusu.getText());
        int idemp=Integer.parseInt(lblidemp.getText());
        String username = txtusername.getText();
        String password=txtpassword.getText();
        String created=dtcreated.getText();
        String modified=dtmodified.getText();
        int estate = cboestado.getSelectedIndex();
        if(estate==0){
            estado=false;
        }
        else{
            estado=true;
        }
        objUser = new UserDAO();
        System.out.println("ID: "+idusu);
        int i = objUser.updateUsuario(idusu,username,password,idemp,created,modified,estado);
        if (i == 0) {

            JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
        }
        else {
            objUser.getTableAll(TblUsu);
            cleanBox();
            JOptionPane.showMessageDialog(null, "Area actualizada");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.valueOf(lblidusu.getText());

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
    }//GEN-LAST:event_btnCloseActionPerformed

    private void TblUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblUsuMouseClicked
        int fila = TblUsu.rowAtPoint(evt.getPoint());
            if (fila > -1){
                lblidusu.setText(String.valueOf(TblUsu.getValueAt(fila, 0)));
                txtusername.setText(String.valueOf(TblUsu.getValueAt(fila, 1)));
                txtpassword.setText(String.valueOf(TblUsu.getValueAt(fila, 2)));
                lblidemp.setText(String.valueOf(TblUsu.getValueAt(fila, 3)));
                dtcreated.setText(String.valueOf(TblUsu.getValueAt(fila, 4)));
                dtmodified.setText(String.valueOf(TblUsu.getValueAt(fila, 5)));
                if(Boolean.parseBoolean(""+TblUsu.getValueAt(fila, 5))==false){
                    cboestado.setSelectedIndex(0);
                }
                else{
                    cboestado.setSelectedIndex(1);
                }
                    
            }
                
    }//GEN-LAST:event_TblUsuMouseClicked

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblUsu;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cboestado;
    private datechooser.beans.DateChooserCombo dtcreated;
    private datechooser.beans.DateChooserCombo dtmodified;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblidemp;
    private javax.swing.JLabel lblidusu;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
