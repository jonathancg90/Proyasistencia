package Gui;

import Utilitarios.Query;
import Utilitarios.Config;
import Javabeans.Tipoempleado;

import Dao.TipoEmpleadoDAO;
import Javabeans.Area;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WinTipo_Empleado extends javax.swing.JInternalFrame {

    private TipoEmpleadoDAO objtipoemp;
    private Tipoempleado tipoemp;
    private Query qs;
    private Config cg;
    
    public WinTipo_Empleado() {
        initComponents();
        cargaForm();
        
    }

    public void cargaForm(){
        try {
            objtipoemp = new TipoEmpleadoDAO();
            qs = new Query();
            objtipoemp.getTableAll(tblTipoemp);
            qs.loadState(cmbEstate,false);
        } catch (Exception e) {
            System.out.println("Gui_WinMdi: " + e);
        }
    }        
    public void cleanBox(){
        lblId.setText("");
        txtName.setText("");
        lblModified.setText("");
        txtFilter.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoemp = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbEstate = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblModified = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        jLabel6.setText("Nombre");

        btnFind.setText("Ok");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblTipoemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTipoemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoempMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTipoemp);

        btnNext.setText(">");

        btnPrevious.setText("<");

        jLabel7.setText("1 / 5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnFind))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnPrevious)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(btnNext)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrevious)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

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
                    .addComponent(btnClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Estado");

        jLabel3.setText("Modificado");

        cmbEstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstateActionPerformed(evt);
            }
        });

        jLabel4.setText("Id");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblModified.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlMantenimientoLayout = new javax.swing.GroupLayout(pnlMantenimiento);
        pnlMantenimiento.setLayout(pnlMantenimientoLayout);
        pnlMantenimientoLayout.setHorizontalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMantenimientoLayout.createSequentialGroup()
                        .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(22, 22, 22)
                        .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                                .addComponent(lblModified, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlMantenimientoLayout.setVerticalGroup(
            pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMantenimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblModified, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pnlOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = txtFilter.getText();
        objtipoemp = new TipoEmpleadoDAO();
        objtipoemp.find(name, tblTipoemp);
    }//GEN-LAST:event_btnFindActionPerformed

    private void tblTipoempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoempMouseClicked
        int fsel;
        fsel = this.tblTipoemp.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        }
        else {
            try {
                tipoemp = new Tipoempleado();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblTipoemp.getModel();
                String idArea = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblId.setText(idArea);
                tipoemp = objtipoemp.getValues(Integer.parseInt(idArea));
                txtName.setText(tipoemp.getName());
                lblModified.setText(tipoemp.getModified());
                System.out.println(tipoemp.isEstado());
                qs.loadState(cmbEstate,tipoemp.isEstado());
            }
            catch (Exception e) {
                System.out.println("Gui_Win_area: " + e);
            }

        }
    }//GEN-LAST:event_tblTipoempMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        cg = new Config();
        String name = txtName.getText();
        boolean estate = Boolean.valueOf(cg.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
        objtipoemp = new TipoEmpleadoDAO();
        int i = objtipoemp.save(name, estate);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        }
        else {
            objtipoemp.getTableAll(tblTipoemp);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nuevo tipo empleado registrado");
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        cg = new Config();
        int id = Integer.valueOf(lblId.getText());
        String name = txtName.getText();
        boolean estate = Boolean.valueOf(cg.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
        objtipoemp = new TipoEmpleadoDAO();
        int i = objtipoemp.update(id,name,estate);
        if (i == 0) {

            JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
        }
        else {
            objtipoemp.getTableAll(tblTipoemp);
            cleanBox();
            JOptionPane.showMessageDialog(null, "tipo de empleado actualizado");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i;
        i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0){
            int id = Integer.valueOf(lblId.getText());

            objtipoemp = new TipoEmpleadoDAO();
            i = objtipoemp.delete(id);
            if(i==0) {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
            }
            else {
                objtipoemp.getTableAll(tblTipoemp);
                cleanBox();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cmbEstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbEstate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModified;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTable tblTipoemp;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
