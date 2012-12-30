
package Gui;
import Dao.EstadoEmpleadoDAO;
import Javabeans.EstadoEmp;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WinEstadoEmpleado extends javax.swing.JInternalFrame {

    private EstadoEmpleadoDAO objest;
    private Query qs;
    private Data dt;
    private EstadoEmp est;
    private Validators val;

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
        lblId.setText("");
        txtName.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblest = new javax.swing.JTable();
        PnlDatos = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemRegistrar = new javax.swing.JMenuItem();
        mitemUpdate = new javax.swing.JMenuItem();
        jmitemDelete = new javax.swing.JMenuItem();
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

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                    .addComponent(txtName)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(86, 86, 86))
        );

        getContentPane().add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 22, 290, 202));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_jMenu3MousePressed

    private void mitemRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemRegistrarMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {txtName.getText()};
        Object[] tipos = {2};
        if(val.validar(datos,tipos)){    
            dt = new Data();
            String name = txtName.getText();
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
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){}
    }//GEN-LAST:event_mitemRegistrarMousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
       cleanBox();
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void mitemUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemUpdateMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {txtName.getText(),lblId.getText()};
        Object[] tipos = {2};
        if(val.validar(datos,tipos)){      
            if( !"".equals(lblId.getText())){
                dt = new Data();
                int id = Integer.parseInt(lblId.getText());
                String name = txtName.getText();
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
       }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){}
    }//GEN-LAST:event_mitemUpdateMousePressed

    private void jmitemDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmitemDeleteMousePressed
        try{
        val = new Validators("estadoemp");    
        Object[] datos = {txtName.getText(),lblId.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){ 
             int i;      
             i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

             if(i==0) {   
                if( !"".equals(lblId.getText())){    
                    dt = new Data();
                    int id = Integer.parseInt(lblId.getText());
                    objest = new EstadoEmpleadoDAO();
                    i = objest.delete(id);
                    if (i == 0) {
                        JOptionPane.showInputDialog(null,"No se pudo eliminar el estado");
                    }
                    else {
                        objest.getTableAll(tblest);
                        cleanBox();
                        JOptionPane.showMessageDialog(null,"Estado eliminado");      
                    }
                }
             }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        }catch(Exception e){}
    }//GEN-LAST:event_jmitemDeleteMousePressed

    private void tblestMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblestMousePressed
       est = new EstadoEmp();
       int fsel;
       fsel = this.tblest.getSelectedRow();
       DefaultTableModel m = new DefaultTableModel();
       m = (DefaultTableModel) this.tblest.getModel();
       String idArea = String.valueOf(m.getValueAt(fsel, 0));
       //Asigando valores obtenidos
       lblId.setText(idArea);
       est = objest.getValues(Integer.parseInt(idArea));
       txtName.setText(est.getNombre());
    }//GEN-LAST:event_tblestMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}
