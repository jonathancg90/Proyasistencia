
package Gui;

import Dao.CargosDAO;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WinArea_Cargos extends javax.swing.JInternalFrame {

    private CargosDAO objCar;
    private Query qs;
    private String _error = "Gui_WinArea_";
    private Validators val;
    
    public WinArea_Cargos() {
        initComponents();
        lblidArea.setVisible(false);
        
    }

    /**
     * Formulario para el mantenimiento de las areas de la empresa.
    */
    public void cargaForm(){
        try {
            objCar = new CargosDAO();
            qs = new Query();
            
            objCar.find(lblidArea.getText(),TblCargos);
        } catch (Exception e) {
            System.out.println(_error + "Cargos: " + e);
        }
    }                 
    public void cleanBox(){
        txtname.setText("");

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblCargos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblidArea = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        TblCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblCargos);

        jLabel1.setText("Total ");

        jLabel2.setText("Cant");

        jLabel3.setText("Area >> ");

        lblidArea.setText("0");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo cargo"));

        jLabel5.setText("Nombre");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mfile.setText("Archivo");

        mitemregister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        mfile.add(mitemregister);

        mitemupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemupdate.setText(" Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mfile.add(mitemupdate);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        medit.add(mitemclear);

        jMenuBar1.add(medit);

        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        mclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcloseActionPerformed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblArea, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblidArea)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblArea, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lblidArea)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     cargaForm();
    }//GEN-LAST:event_formInternalFrameOpened

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;        
    }//GEN-LAST:event_mcloseActionPerformed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
     val = new Validators();    
     Object[] datos = {txtname.getText()};
     if(val.validar(datos)){   
        String name = txtname.getText();
            int idArea = Integer.parseInt(lblidArea.getText());
            objCar = new CargosDAO();
            int i = objCar.save(idArea,name);
            if (i == 0) {
                JOptionPane.showInputDialog(null,"No se pudo grabar datos");
            }
            else {
                objCar.find(lblidArea.getText(),TblCargos);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nuevo cargo registrado");      
            } 
      }                                          
      else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
      }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
    val = new Validators();    
    Object[] datos = {txtname.getText()};
    if(val.validar(datos)){   
        int fsel;
            fsel = this.TblCargos.getSelectedRow();
            if (fsel == -1) {
                //No se ha seleccionado registo en Jtable
            } 
            else {
                try {
                   int i;
                   i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                   if(i==0){
                       DefaultTableModel m = new DefaultTableModel();
                       m = (DefaultTableModel) this.TblCargos.getModel();
                       int id = Integer.parseInt(String.valueOf(m.getValueAt(fsel, 0)));

                       objCar = new CargosDAO();
                       i = objCar.delete(id);
                       if(i==0) {
                           JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
                       }
                       else {
                           objCar.find(lblidArea.getText(),TblCargos);
                           cleanBox();
                       } 
                    }                       
                }catch(HeadlessException | NumberFormatException e) {

                }
            }
        }                                          
    else {
        JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
    }
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        val = new Validators();    
        Object[] datos = {txtname.getText()};
        if(val.validar(datos)){    
            int fsel;
                fsel = this.TblCargos.getSelectedRow();
                if (fsel == -1) {
                    //No se ha seleccionado registo en Jtable
                } 
                else {

                    try { 
                           DefaultTableModel m = new DefaultTableModel();
                           m = (DefaultTableModel) this.TblCargos.getModel();
                           int id = Integer.parseInt(String.valueOf(m.getValueAt(fsel, 0)));
                           String name = String.valueOf(m.getValueAt(fsel, 1));
                           int idarea = Integer.parseInt(lblidArea.getText());
                           objCar = new CargosDAO();

                           int i = objCar.update(id,idarea,name);
                           if(i==0) {
                               JOptionPane.showMessageDialog(null,"No se pudo actualizar el cargo");
                           }
                           else {
                               objCar.find(lblidArea.getText(),TblCargos);
                               cleanBox();
                           } 
                        }                       
                    catch(NumberFormatException | HeadlessException e) {

                    }
                }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_mcloseMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblCargos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblArea;
    public javax.swing.JLabel lblidArea;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
