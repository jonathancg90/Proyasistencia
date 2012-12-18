
package Gui;
import Dao.EstadoEmpleadoDAO;
import Javabeans.EstadoEmp;
import Utilitarios.Data;
import Utilitarios.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WinEstadoEmpleado extends javax.swing.JInternalFrame {

    private EstadoEmpleadoDAO objest;
    private Query qs;
    private Data dt;
    private EstadoEmp est;

    public WinEstadoEmpleado() {
        initComponents();
        cargaForm();
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public void cargaForm(){
        try {
            objest = new EstadoEmpleadoDAO();
            qs = new Query();
            objest.getTableAll(tblest);
        } catch (Exception e) {
            System.out.println("Gui_WinWinEstadoEmpleado_cargaForm: " + e);
        }
    }        
    public void cleanBox(){
        lblid.setText("");
        txtnombre.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblest = new javax.swing.JTable();
        PnlDatos = new javax.swing.JPanel();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 22, -1, 200));

        PnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los estados (empleados)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        lblid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PnlDatosLayout = new javax.swing.GroupLayout(PnlDatos);
        PnlDatos.setLayout(PnlDatosLayout);
        PnlDatosLayout.setHorizontalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE)))
                .addContainerGap())
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
                        .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(86, 86, 86))
        );

        getContentPane().add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 22, 290, 202));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Registrar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Actualizar");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_jMenu3MousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        dt = new Data();
        String name = txtnombre.getText();
        objest = new EstadoEmpleadoDAO();
        int i = objest.save(name);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo grabar datos");
        }
        else {
            objest.getTableAll(tblest);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Nuevo estado registrado");      
        }
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
       cleanBox();
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
    if( !"".equals(lblid.getText())){
        dt = new Data();
        int id = Integer.parseInt(lblid.getText());
        String name = txtnombre.getText();
        objest = new EstadoEmpleadoDAO();
        int i = objest.update(id,name);
        if (i == 0) {
            JOptionPane.showMessageDialog(null,"No se pudo actualizar el estado");
        }
        else {
            objest.getTableAll(tblest);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Estado actualizado");      
        }
    }
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
    if( !"".equals(lblid.getText())){    
        dt = new Data();
        int id = Integer.parseInt(lblid.getText());
        objest = new EstadoEmpleadoDAO();
        int i = objest.delete(id);
        if (i == 0) {
            JOptionPane.showInputDialog(null,"No se pudo eliminar el estado");
        }
        else {
            objest.getTableAll(tblest);
            cleanBox();
            JOptionPane.showMessageDialog(null,"Estado eliminado");      
        }
    }
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void tblestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblestMousePressed
       est = new EstadoEmp();
       int fsel;
       fsel = this.tblest.getSelectedRow();
       DefaultTableModel m = new DefaultTableModel();
       m = (DefaultTableModel) this.tblest.getModel();
       String idArea = String.valueOf(m.getValueAt(fsel, 0));
       //Asigando valores obtenidos
       lblid.setText(idArea);
       est = objest.getValues(Integer.parseInt(idArea));
       txtnombre.setText(est.getNombre());
    }//GEN-LAST:event_tblestMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblid;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JTable tblest;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
