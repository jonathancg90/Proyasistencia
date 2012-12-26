
package Gui;


public class WinExtra_descuento extends javax.swing.JInternalFrame {

    
    public WinExtra_descuento() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlDatos = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        pnlListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblest = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemRegistrar = new javax.swing.JMenuItem();
        mitemUpdate = new javax.swing.JMenuItem();
        jmitemDelete = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        PnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los estados (empleados)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setText("Id");

        jLabel2.setText("Tipo");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Date");

        jLabel4.setText("Monto");

        javax.swing.GroupLayout PnlDatosLayout = new javax.swing.GroupLayout(PnlDatos);
        PnlDatos.setLayout(PnlDatosLayout);
        PnlDatosLayout.setHorizontalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(txtName))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(txtName1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtName2)))
                .addGap(23, 23, 23))
        );
        PnlDatosLayout.setVerticalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        tblest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblestMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblest);

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        mitemRegistrar.setText("Registrar");
        mitemRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemRegistrarMousePressed(evt);
            }
        });
        jMenu1.add(mitemRegistrar);

        mitemUpdate.setText("Actualizar");
        mitemUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemUpdateMousePressed(evt);
            }
        });
        jMenu1.add(mitemUpdate);

        jmitemDelete.setText("Eliminar");
        jmitemDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmitemDeleteMousePressed(evt);
            }
        });
        jMenu1.add(jmitemDelete);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem4.setText("Limpiar todo");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Cerrar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 13, Short.MAX_VALUE)
                    .addComponent(pnlListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(PnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 253, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 24, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 25, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblestMousePressed
        
    }//GEN-LAST:event_tblestMousePressed

    private void mitemRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemRegistrarMousePressed
       
    }//GEN-LAST:event_mitemRegistrarMousePressed

    private void mitemUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemUpdateMousePressed
       
    }//GEN-LAST:event_mitemUpdateMousePressed

    private void jmitemDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmitemDeleteMousePressed
       
    }//GEN-LAST:event_jmitemDeleteMousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
       
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_jMenu3MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmitemDelete;
    private javax.swing.JLabel lblId;
    private javax.swing.JMenuItem mitemRegistrar;
    private javax.swing.JMenuItem mitemUpdate;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JTable tblest;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    // End of variables declaration//GEN-END:variables
}
