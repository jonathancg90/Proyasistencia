
package Gui;

import Dao.EmpleadoDAO;
import javax.swing.JOptionPane;


public class WinEmpleado extends javax.swing.JInternalFrame {
    private EmpleadoDAO objempl;
    /**
     * Creates new form WinEmpleado
     */
    public WinEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dtcreated = new datechooser.beans.DateChooserCombo();
        dtmodified = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        lblidemp = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblEmpl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtretiro = new javax.swing.JTextField();
        pnlOpciones = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        pnlMantenimiento.setLayout(null);

        jLabel1.setText("Nombres");
        pnlMantenimiento.add(jLabel1);
        jLabel1.setBounds(12, 52, 64, 17);

        jLabel2.setText("Apellidos");
        pnlMantenimiento.add(jLabel2);
        jLabel2.setBounds(12, 85, 63, 17);

        jLabel3.setText("Fecha de creación");
        pnlMantenimiento.add(jLabel3);
        jLabel3.setBounds(10, 200, 126, 17);
        pnlMantenimiento.add(txtnombres);
        txtnombres.setBounds(165, 47, 168, 27);

        jLabel4.setText("Id empleado");
        pnlMantenimiento.add(jLabel4);
        jLabel4.setBounds(12, 12, 94, 29);

        lblempleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblempleado);
        lblempleado.setBounds(165, 12, 94, 29);
        pnlMantenimiento.add(txtapellidos);
        txtapellidos.setBounds(173, 80, 160, 27);

        jLabel5.setText("Fecha de modificación");
        pnlMantenimiento.add(jLabel5);
        jLabel5.setBounds(10, 220, 154, 17);
        pnlMantenimiento.add(dtcreated);
        dtcreated.setBounds(170, 190, 155, 27);
        pnlMantenimiento.add(dtmodified);
        dtmodified.setBounds(170, 220, 155, 27);

        jLabel9.setText("Id empresa:");
        pnlMantenimiento.add(jLabel9);
        jLabel9.setBounds(345, 12, 94, 30);

        lblidemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlMantenimiento.add(lblidemp);
        lblidemp.setBounds(440, 10, 94, 30);

        TblEmpl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TblEmpl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblEmplMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblEmpl);

        pnlMantenimiento.add(jScrollPane2);
        jScrollPane2.setBounds(360, 60, 218, 151);

        jLabel7.setText("DNI");
        pnlMantenimiento.add(jLabel7);
        jLabel7.setBounds(10, 120, 100, 20);
        pnlMantenimiento.add(txtdni);
        txtdni.setBounds(170, 110, 160, 30);
        pnlMantenimiento.add(txttelefono);
        txttelefono.setBounds(170, 150, 160, 30);

        jLabel8.setText("Telefono");
        pnlMantenimiento.add(jLabel8);
        jLabel8.setBounds(10, 150, 70, 20);

        jLabel10.setText("Retiro");
        pnlMantenimiento.add(jLabel10);
        jLabel10.setBounds(10, 250, 70, 20);
        pnlMantenimiento.add(txtretiro);
        txtretiro.setBounds(160, 250, 170, 30);

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
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblEmplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblEmplMouseClicked
        int fila = TblEmpl.rowAtPoint(evt.getPoint());
        if (fila > -1){

            txtnombres.setText(String.valueOf(TblEmpl.getValueAt(fila, 1)));
            txtapellidos.setText(String.valueOf(TblEmpl.getValueAt(fila, 2)));

        }

    }//GEN-LAST:event_TblEmplMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

        String username = txtnombres.getText();
        String password=txtapellidos.getText();

        objempl = new EmpleadoDAO();
        int i=0;
        //i = objempl.saveEmpleado(username,password);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        }
        else {
            
            
            JOptionPane.showMessageDialog(null,"Nueva area registrada");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String username = txtnombres.getText();
        String password=txtapellidos.getText();
        
        objempl = new EmpleadoDAO();
        int i =0; 
        //i = objempl.updateUsuario(username,password);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
        }
        else {
          
           
            JOptionPane.showMessageDialog(null,"Nueva area registrada");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.valueOf(lblempleado.getText());

        objempl = new EmpleadoDAO();
        int i = 0;
        //objempl.deleteEmpleado(id);
        if(i==0) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
        }
        else {
           //objempl.getTableAll(TblEmpl);
          
            JOptionPane.showMessageDialog(null,"Area eliminada");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        objempl = new EmpleadoDAO();
        //objempl.getTableAll(TblEmpl);
    }//GEN-LAST:event_btnListActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblEmpl;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private datechooser.beans.DateChooserCombo dtcreated;
    private datechooser.beans.DateChooserCombo dtmodified;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblempleado;
    private javax.swing.JLabel lblidemp;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtretiro;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
