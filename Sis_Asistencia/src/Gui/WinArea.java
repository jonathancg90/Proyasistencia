
package Gui;

import Utilitarios.Query;
import Utilitarios.Config;
import Javabeans.Area;

import Dao.AreaDAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
public class WinArea extends javax.swing.JInternalFrame {
    
    private AreaDAO objarea;
    private Area area;
    private Query qs;
    private Config cg;
    
    public WinArea() {
        initComponents();
        cargaForm();
        
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public void cargaForm(){
        try {
            objarea = new AreaDAO();
            qs = new Query();
            objarea.getTableAll(tblArea);
            qs.loadState(cmbEstate);
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

        pnlMantenimiento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbEstate = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblModified = new javax.swing.JLabel();
        pnlOpciones = new javax.swing.JPanel();
        btnRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArea = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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

        jLabel8.setText("Añadir cargos");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        lblModified.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        org.jdesktop.layout.GroupLayout pnlMantenimientoLayout = new org.jdesktop.layout.GroupLayout(pnlMantenimiento);
        pnlMantenimiento.setLayout(pnlMantenimientoLayout);
        pnlMantenimientoLayout.setHorizontalGroup(
            pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlMantenimientoLayout.createSequentialGroup()
                        .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel4))
                        .add(42, 42, 42)
                        .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtName)
                            .add(pnlMantenimientoLayout.createSequentialGroup()
                                .add(lblId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jLabel8)
                                .add(30, 30, 30))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlMantenimientoLayout.createSequentialGroup()
                        .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel2))
                        .add(22, 22, 22)
                        .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(pnlMantenimientoLayout.createSequentialGroup()
                                .add(cmbEstate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 84, Short.MAX_VALUE))
                            .add(pnlMantenimientoLayout.createSequentialGroup()
                                .add(lblModified, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlMantenimientoLayout.setVerticalGroup(
            pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMantenimientoLayout.createSequentialGroup()
                .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pnlMantenimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(lblId, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel8))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 15, Short.MAX_VALUE)
                .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(cmbEstate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(lblModified, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(22, 22, 22))
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

        org.jdesktop.layout.GroupLayout pnlOpcionesLayout = new org.jdesktop.layout.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .add(btnRegister)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnUpdate)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnDelete)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnClose)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnRegister)
                    .add(btnDelete)
                    .add(btnUpdate)
                    .add(btnClose))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        jLabel6.setText("Nombre");

        btnFind.setText("Ok");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArea);

        btnNext.setText(">");

        btnPrevious.setText("<");

        jLabel7.setText("1 / 5");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel6)
                .add(4, 4, 4)
                .add(txtFilter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 12, Short.MAX_VALUE)
                .add(btnFind))
            .add(jPanel1Layout.createSequentialGroup()
                .add(34, 34, 34)
                .add(btnPrevious)
                .add(26, 26, 26)
                .add(jLabel7)
                .add(31, 31, 31)
                .add(btnNext)
                .addContainerGap())
            .add(jPanel1Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(txtFilter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnFind))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnNext)
                    .add(btnPrevious)
                    .add(jLabel7))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlMantenimiento, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pnlOpciones, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(pnlMantenimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(6, 6, 6)
                        .add(pnlOpciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName.getText();
        int estate = cmbEstate.getSelectedIndex();
        objarea = new AreaDAO();
        int i = objarea.save(name, estate);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        }
        else {
            objarea.getTableAll(tblArea);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nueva area registrada");      
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int id = Integer.valueOf(lblId.getText());
        String name = txtName.getText();
        int estate = cmbEstate.getSelectedIndex();
        objarea = new AreaDAO();
        System.out.println("ID: "+id);
        int i = objarea.update(id,name,estate);
        if (i == 0) {
            
            JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
        }
        else {
            objarea.getTableAll(tblArea);
            cleanBox();
            JOptionPane.showMessageDialog(null, "Area actualizada");
        } 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAreaMouseClicked
        int fsel;
        fsel = this.tblArea.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        } 
        else {
            try {
                area = new Area();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblArea.getModel();
                String idArea = String.valueOf(m.getValueAt(fsel, 0));
                lblId.setText(idArea);
                objarea.getValues(Integer.parseInt(idArea));
                txtName.setText(area.getName());
                }
            catch (Exception e) {
                System.out.println("Gui_Win_area: " + e);
            }
                
            }
    }//GEN-LAST:event_tblAreaMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int id = Integer.valueOf(lblId.getText());
        
        objarea = new AreaDAO();
        int i = objarea.delete(id);
        if(i==0) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
        }
        else {
            objarea.getTableAll(tblArea);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Area eliminada");
        } 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       WinArea_Cargos objCargo= new WinArea_Cargos();
    
       objCargo.setResizable(true);
       objCargo.setMaximizable(true);
       objCargo.setIconifiable(true);
       //obj_Asis.setClosable(true);
       WinMdi.jdpContenedor.add(objCargo);

       objCargo.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = txtFilter.getText();
        objarea = new AreaDAO();
        objarea.find(name, tblArea);
    }//GEN-LAST:event_btnFindActionPerformed

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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModified;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTable tblArea;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
