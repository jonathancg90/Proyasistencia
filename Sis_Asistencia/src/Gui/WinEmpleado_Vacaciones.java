
package Gui;


import Dao.VacacionesDAO;
import Javabeans.Vacaciones;
import Utilitarios.Config;
import Utilitarios.Query;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utilitarios.Helpers;
import Utilitarios.Validators;

import java.text.DateFormat;
import java.util.Calendar;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class WinEmpleado_Vacaciones extends javax.swing.JInternalFrame {

    private VacacionesDAO objVacaciones;
    private Vacaciones Vacaciones;
    private Query qs;
    private Config cg;
    private Helpers hp;
    private DateFormat format;
    private Date date,date2;
    private Calendar calendar_inicio,calendar_final;
    private Validators val;
    private String _error = "Gui_Win_EmpleadoVacaciones_";
    
    
    public WinEmpleado_Vacaciones() {
        initComponents();
        
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboF_inicio.setDateFormat(format);
        cboF_final.setDateFormat(format);
        
        
    }
    
    
     public void cargaForm(){
        try {
            objVacaciones = new VacacionesDAO();
            qs = new Query();
            objVacaciones.findId(lblIdemp.getText(), tblVacaciones, lblcant);
            lblIdemp.setVisible(false);
        } catch (Exception e) {
            System.out.println(_error + "_cargaForm:" + e);
        }
    }
    
    public void cleanBox(){
        Calendar rightNow = Calendar.getInstance();
        lblIdvacaciones.setText("");
        lblMod.setText("");
        cboF_inicio.setSelectedDate(rightNow);
        cboF_final.setSelectedDate(rightNow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVacaciones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblIdemp = new javax.swing.JLabel();
        lblIdvacaciones = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        cboF_inicio = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cboF_final = new datechooser.beans.DateChooserCombo();
        lblcant = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de vacaciones"));

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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblIdvacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblIdvacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIdemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Total: ");

        mfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Archivo.png"))); // NOI18N
        mfile.setText("Archivo");

        mitemregister.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mitemregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/registrar.png"))); // NOI18N
        mitemregister.setText("Registrar");
        mitemregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemregisterMousePressed(evt);
            }
        });
        mfile.add(mitemregister);

        mitemupdate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/actualizar.png"))); // NOI18N
        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mfile.add(mitemupdate);

        mitemdelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/eliminar.png"))); // NOI18N
        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mfile.add(mitemdelete);

        jMenuBar1.add(mfile);

        medit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/limpiar.png"))); // NOI18N
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        jMenuBar1.add(medit);

        mclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Cerrar.png"))); // NOI18N
        mclose.setText("Cerrar");
        mclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mcloseMousePressed(evt);
            }
        });
        jMenuBar1.add(mclose);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVacacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVacacionesMouseClicked
        date = new Date();
        date2=new Date();
        hp=new Helpers();
        calendar_inicio= new GregorianCalendar();
        calendar_final= new GregorianCalendar();
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
                lblMod.setText(hp.getFormatDate(Vacaciones.getModified()));
                
                date=format.parse(hp.getFormatDate(Vacaciones.getF_ini()));
                calendar_inicio.setTime(date);
                cboF_inicio.setSelectedDate(calendar_inicio);
                
                date2=format.parse(hp.getFormatDate(Vacaciones.getF_final()));
                calendar_final.setTime(date2);
                cboF_final.setSelectedDate(calendar_final);

            }
            catch (Exception e) {
                System.out.println(_error + "_Tblvacaciones:" + e);
            }
        }
    }//GEN-LAST:event_tblVacacionesMouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        
        try{
        hp = new Helpers();

        val = new Validators("vacaciones"); 

        String F_inicio=hp.getFormatDate(cboF_inicio.getText());
        String F_final=hp.getFormatDate(cboF_final.getText());
        if(val.validarFechasTablas(tblVacaciones, F_inicio,F_final)&&
           val.validarFechas(F_inicio, F_final)){   
                int idemp=Integer.valueOf(lblIdemp.getText());

                int i = objVacaciones.save(F_inicio,F_final,idemp);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
                }
                else {
                    objVacaciones.findId(lblIdemp.getText(), tblVacaciones, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva vacacion registrado");
                }
            
        
       
        }else{
                JOptionPane.showMessageDialog(null,"Conflicto en fechas");
            } 
        }catch(Exception e)
        {System.out.println(_error+"_Register:"+e);}
            
        
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
       try{
        val= new Validators("vacaciones");
        hp = new Helpers();

        Object[] datos = {lblIdvacaciones.getText()};
        Object[] tipos = {};

        String F_inicio=hp.getFormatDate(cboF_inicio.getText());
        String F_final=hp.getFormatDate(cboF_final.getText());
        
        if(val.validarFechas(F_inicio, F_final)){
            int idsalario=Integer.parseInt(lblIdvacaciones.getText());
            int idemp=Integer.parseInt(lblIdemp.getText());
                int i = objVacaciones.update(idsalario,F_inicio,F_final,idemp);
                if (i == 0) {

                    JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
                }
                else {
                    objVacaciones.findId(lblIdemp.getText(), tblVacaciones, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null, "Vacacion actualizado");
                }
            }
            else {
                    JOptionPane.showMessageDialog(null,"Conflicto en fechas");
                }
        
       }catch(Exception e){
           System.out.println(_error+"_Update:"+e);
       }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
        try{
        val= new Validators("vacaciones");
        hp = new Helpers();
        Object[] datos = {lblIdvacaciones.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){
        int i;
        i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0){
            int id = Integer.valueOf(lblIdvacaciones.getText());

            i = objVacaciones.delete(id);
            if(i==0) {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar la vacacion");
            }
            else {
                objVacaciones.findId(lblIdemp.getText(), tblVacaciones, lblcant);
                cleanBox();
            }
        }
        }
        }catch(Exception e){
            System.out.println(_error+"_Delete:"+e);
        }

    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_mcloseMousePressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargaForm();
    }//GEN-LAST:event_formInternalFrameOpened

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo cboF_final;
    private datechooser.beans.DateChooserCombo cboF_inicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblIdemp;
    private javax.swing.JLabel lblIdvacaciones;
    private javax.swing.JLabel lblMod;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblVacaciones;
    // End of variables declaration//GEN-END:variables
}
