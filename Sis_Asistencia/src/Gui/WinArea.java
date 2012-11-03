
package Gui;
import Dao.AreaDAO;
import javax.swing.JOptionPane;


public class WinArea extends javax.swing.JInternalFrame {

    AreaDAO area;
    
    public WinArea() {
        initComponents();
        cargaForm();
    }
    
    /*
     * Construccion de formualrio
     */
    
    public void cargaForm(){
        try{
            area = new AreaDAO();
            area.getTableAll(tblEmpleados);
        }
        catch(Exception e){
            System.out.println("Gui_WinMdi: "+e);
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
        tblEmpleados = new javax.swing.JTable();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("Nombre");

        jLabel2.setText("Estado");

        jLabel3.setText("Modificado");

        jLabel4.setText("Id");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Añadir cargos");

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
                                .add(27, 27, 27))))
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

        btnDelete.setText("Eliminar");

        btnClose.setText("Cerrar");

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

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblEmpleados);

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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnNext)
                .add(79, 79, 79))
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
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String name = txtName.getText();
        int estate = cmbEstate.getSelectedIndex();
        
        area = new AreaDAO();
        int i = area.save(name,estate);
        if(i==0)
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        else
            JOptionPane.showInputDialog(null,"Nueva area registrada");      
    }//GEN-LAST:event_btnRegisterActionPerformed

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
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
