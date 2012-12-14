
package Gui;


import Dao.VacacionesDAO;
import Javabeans.Vacaciones;
import Utilitarios.Config;
import Utilitarios.Query;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utilitarios.Helpers;

public class WinVacaciones extends javax.swing.JInternalFrame {

    private VacacionesDAO objVacaciones;
    private Vacaciones Vacaciones;
    private Query qs;
    private Config cg;
    private Helpers hp;
    
    
    public WinVacaciones() {
        initComponents();
        cargaForm();
        
    }
    
    
     public void cargaForm(){
        try {
            objVacaciones = new VacacionesDAO();
            qs = new Query();
            objVacaciones.getTableAll(tblVacaciones);
        } catch (Exception e) {
            System.out.println("Gui_WinVacaciones: " + e);
        }
    }
    
    public void cleanBox(){
        
        lblIdvacaciones.setText("");
        lblMod.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVacaciones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIdemp = new javax.swing.JLabel();
        lblIdvacaciones = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        cboF_inicio = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboF_final = new datechooser.beans.DateChooserCombo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de vacaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        tblVacaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblVacaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVacacionesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblVacaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de vacaciones"));

        jLabel1.setText("idemp");

        jLabel2.setText("idvacaciones");

        lblIdemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIdvacaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Modificado");

        lblMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Fecha de inicio");

        jLabel8.setText("Fecha final");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(87, 87, 87)
                        .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdvacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblIdvacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );

        jMenu1.setText("Archivo");

        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        jMenu1.add(mitemregister);

        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        jMenu1.add(mitemupdate);

        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        jMenu1.add(mitemdelete);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Cerrar");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Lista de vacaciones");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVacacionesMouseClicked

        int fsel;
        fsel = this.tblVacaciones.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        }
        else {
            try {
                Vacaciones = new Vacaciones();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblVacaciones.getModel();
                String idVacaciones = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblIdvacaciones.setText(idVacaciones);
                Vacaciones = objVacaciones.getValues(Integer.parseInt(idVacaciones));
                
                lblIdemp.setText(String.valueOf(Vacaciones.getIdemp()));
                lblMod.setText(Vacaciones.getModified());

            }
            catch (Exception e) {
                System.out.println("Gui_Win_Vacaciones " + e);
            }

        }

    }//GEN-LAST:event_tblVacacionesMouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        try{
            hp = new Helpers();
            String F_inicio=hp.getFormatDate(cboF_inicio.getText());
            String F_final=hp.getFormatDate(cboF_final.getText());
            System.out.println(F_inicio +" - " +F_final);
            
            
            int idemp=Integer.valueOf(lblIdemp.getText());

            int i = objVacaciones.save(F_inicio,F_final,idemp);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
            }
            else {
                objVacaciones.getTableAll(tblVacaciones);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nueva vacacion registrado");
            }
        }catch(Exception e){System.out.println(""+e);}

    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed

        hp = new Helpers();
        int idsalario=Integer.parseInt(lblIdvacaciones.getText());
        int idemp=Integer.parseInt(lblIdemp.getText());
        String F_inicio=hp.getFormatDate(cboF_inicio.getText());
        String F_final=hp.getFormatDate(cboF_final.getText());

        

        int i = objVacaciones.update(idsalario,F_inicio,F_final,idemp);
        if (i == 0) {

            JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
        }
        else {
            objVacaciones.getTableAll(tblVacaciones);
            cleanBox();
            JOptionPane.showMessageDialog(null, "Vacacion actualizado");
        }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed

        int i;
        i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0){
            int id = Integer.valueOf(lblIdvacaciones.getText());

            i = objVacaciones.delete(id);
            if(i==0) {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar la vacacion");
            }
            else {
                objVacaciones.getTableAll(tblVacaciones);
                cleanBox();
            }
        }

    }//GEN-LAST:event_mitemdeleteMousePressed

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        this.setVisible(false);
    }//GEN-LAST:event_jMenu5MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo cboF_final;
    private datechooser.beans.DateChooserCombo cboF_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblIdemp;
    private javax.swing.JLabel lblIdvacaciones;
    private javax.swing.JLabel lblMod;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblVacaciones;
    // End of variables declaration//GEN-END:variables
}
