
package Gui;

import Dao.SalariosDAO;
import Javabeans.Salarios;
import Utilitarios.Config;
import Utilitarios.Query;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.util.Calendar;

import Utilitarios.Helpers;
import Utilitarios.Validators;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class WinSalarios extends javax.swing.JInternalFrame {
    
    private SalariosDAO objSalarios;
    private Salarios Salarios;
    private Query qs;
    private Config cg;
    private Helpers hp;
    private DateFormat format;
    private Date date;
    private Date date2;
    private Calendar calendar;
    private Calendar calendar2;
    private Validators val;
    
    public WinSalarios() {
        initComponents();
        
        
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboF_inicio.setDateFormat(format);
        cboF_final.setDateFormat(format);
        
    }

    public void cargaForm(){
        try {
            objSalarios = new SalariosDAO();
            qs = new Query();
            objSalarios.findId(lblIdemp.getText(), tblSalarios);
            lblIdemp.setVisible(false);
        } catch (Exception e) {
            System.out.println("Gui_WinSalarios: " + e);
        }
    }
    
    public void cleanBox(){
        
        lblIdsalario.setText("");
        lblMod.setText("");
        txtMonto.setText("");
        cboF_inicio.setSelectedDate(null);
        cboF_final.setSelectedDate(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSalarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblIdemp = new javax.swing.JLabel();
        lblIdsalario = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        cboF_inicio = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        cboF_final = new datechooser.beans.DateChooserCombo();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de salarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        tblSalarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblSalarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSalariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSalarios);

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de salarios"));

        jLabel2.setText("idsalario");

        lblIdemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIdsalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("Default");

        jLabel5.setText("Modificado");

        lblMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Fecha de inicio");

        jLabel8.setText("Fecha final");

        jLabel3.setText("Monto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIdemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIdsalario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 320, 300));

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
        mitemupdate.setText("Actualizar");
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
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        jMenuBar1.add(medit);

        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        hp=new Helpers();
        val = new Validators();    
        Object[] datos = {txtMonto.getText()};
        if(val.validar(datos)){    
            try{
                
                String F_inicio=hp.getFormatDate(cboF_inicio.getText());
                String F_final=hp.getFormatDate(cboF_final.getText());
                
                boolean por_defecto=jCheckBox1.isSelected();
                double monto=Double.parseDouble(txtMonto.getText());
                int idemp=Integer.valueOf(lblIdemp.getText());

                int i = objSalarios.save(F_inicio,F_final,por_defecto,idemp,monto);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
                }
                else {
                    objSalarios.findId(lblIdemp.getText(), tblSalarios);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva salario registrado");
                }
            }catch(Exception e){System.out.println(""+e);}
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        val = new Validators();  
        hp = new Helpers();
        Object[] datos = {txtMonto.getText()};
        if(val.validar(datos)){
            
            int idsalario=Integer.parseInt(lblIdsalario.getText());
            int idemp=Integer.parseInt(lblIdemp.getText());
            String F_inicio=hp.getFormatDate(cboF_inicio.getText());
            String F_final=hp.getFormatDate(cboF_final.getText());
            
            boolean por_defecto=jCheckBox1.isSelected();
            double monto=Double.parseDouble(txtMonto.getText());

            int i = objSalarios.update(idsalario,F_inicio,F_final,por_defecto,idemp,monto);
            if (i == 0) {

                JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
            }
            else {
                objSalarios.findId(lblIdemp.getText(), tblSalarios);
                cleanBox();
                JOptionPane.showMessageDialog(null, "Salario actualizado");
            } 
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
        val = new Validators();    
        Object[] datos = {txtMonto.getText()};
        if(val.validar(datos)){
            int i;
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if(i==0){
                int id = Integer.valueOf(lblIdsalario.getText());


                i = objSalarios.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el salario");
                }
                else {
                    objSalarios.findId(lblIdemp.getText(), tblSalarios);
                    cleanBox();
                } 
             }
        }                                          
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }
        
        
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_mcloseMousePressed

    private void tblSalariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSalariosMouseClicked
        date = new Date();
        date2=new Date();
        calendar= new GregorianCalendar();
        calendar2= new GregorianCalendar();
        hp=new Helpers();
        int fsel;
        fsel = this.tblSalarios.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        } 
        else {
            try {
                Salarios = new Salarios();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblSalarios.getModel();
                String idSalarios = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblIdsalario.setText(idSalarios);
                Salarios = objSalarios.getValues(Integer.parseInt(idSalarios));
                txtMonto.setText(String.valueOf(Salarios.getMonto()));
                lblIdemp.setText(String.valueOf(Salarios.getIdemp()));
                lblMod.setText(hp.getFormatDate(Salarios.getModified()));
                date=format.parse(hp.getFormatDate(Salarios.getF_inicio()));
                calendar.setTime(date);
                cboF_inicio.setSelectedDate(calendar);
                
                date2=format.parse(hp.getFormatDate(Salarios.getF_final()));
                calendar2.setTime(date2);
                cboF_final.setSelectedDate(calendar2);
                
                }
            catch (Exception e) {
                System.out.println("Gui_Win_Salarios " + e);
            }
                
            }
        
        
    }//GEN-LAST:event_tblSalariosMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargaForm();
    }//GEN-LAST:event_formInternalFrameOpened

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo cboF_final;
    private datechooser.beans.DateChooserCombo cboF_inicio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblIdemp;
    private javax.swing.JLabel lblIdsalario;
    private javax.swing.JLabel lblMod;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblSalarios;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
