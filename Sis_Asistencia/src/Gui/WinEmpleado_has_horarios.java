
package Gui;

import Dao.Empleado_has_horariosDAO;
import Javabeans.Empleado_has_horarios;
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

public class WinEmpleado_has_horarios extends javax.swing.JInternalFrame {

    private Empleado_has_horariosDAO objEmphorarios;
    private Empleado_has_horarios Emphorarios;
    private Query qs;
    private Config cg;
    private Helpers hp;
    private DateFormat format;
    private Date date;
    private Date date2;
    private Calendar calendar;
    private Calendar calendar2;
    private Validators val;
    
    public WinEmpleado_has_horarios() {
        initComponents();
        
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboF_inicio.setDateFormat(format);
        cboF_final.setDateFormat(format);
        
        
        
    }
    
    public void cargaForm(){
        try {
            objEmphorarios = new Empleado_has_horariosDAO();
            qs = new Query();
            objEmphorarios.findId(lblIdemp.getText(), tblEmpleado_has_horarios);
            lblIdemp.setVisible(false);
            qs.loadChoice(cbo_Horario,"horarios","nombre");
        } catch (Exception e) {
            System.out.println("Gui_WinEmpleado_has_horarios: " + e);
        }
    }
    
    public void cleanBox(){
        
        lblIdemp_horarios.setText("");
        cbo_Horario.setSelectedIndex(0);
        cboF_inicio.setSelectedDate(null);
        cboF_final.setSelectedDate(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblEmpleado_has_horarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblIdemp = new javax.swing.JLabel();
        lblIdemp_horarios = new javax.swing.JLabel();
        cboF_inicio = new datechooser.beans.DateChooserCombo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboF_final = new datechooser.beans.DateChooserCombo();
        cbo_Horario = new javax.swing.JComboBox();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de horarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        tblEmpleado_has_horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblEmpleado_has_horarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleado_has_horariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblEmpleado_has_horarios);

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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de horarios"));

        jLabel2.setText("idsalario");

        lblIdemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblIdemp_horarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Fecha de inicio");

        jLabel8.setText("Fecha final");

        jLabel3.setText("Tipo de horario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblIdemp_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(lblIdemp_horarios, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lblIdemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboF_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboF_final, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpleado_has_horariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleado_has_horariosMouseClicked
        hp=new Helpers();
        date = new Date();
        date2=new Date();
        calendar= new GregorianCalendar();
        calendar2= new GregorianCalendar();
        int fsel;
        fsel = this.tblEmpleado_has_horarios.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        }
        else {
            try {
                Emphorarios = new Empleado_has_horarios();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblEmpleado_has_horarios.getModel();
                String idEmphorarios = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblIdemp_horarios.setText(idEmphorarios);
                Emphorarios = objEmphorarios.getValues(Integer.parseInt(idEmphorarios));
                
                lblIdemp.setText(String.valueOf(Emphorarios.getIdemp()));
                
                date=format.parse(hp.getFormatDate(Emphorarios.getInicio()));
                calendar.setTime(date);
                cboF_inicio.setSelectedDate(calendar);

                date2=format.parse(hp.getFormatDate(Emphorarios.getFin()));
                calendar2.setTime(date2);
                cboF_final.setSelectedDate(calendar2);
                
                qs.loadChoiceDefault(cbo_Horario,"horarios","nombre",Emphorarios.getIdhor());

            }
            catch (Exception e) {
                System.out.println("Gui_Win_Empleado_has_horarios " + e);
            }

        }

    }//GEN-LAST:event_tblEmpleado_has_horariosMouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        val = new Validators();   
        
        hp=new Helpers();
        
        if(val.validarFechas(tblEmpleado_has_horarios, hp.getFormatDate(cboF_inicio.getText()), hp.getFormatDate(cboF_final.getText()))){
 
            try{
                
                String F_inicio=hp.getFormatDate(cboF_inicio.getText());
                String F_final=hp.getFormatDate(cboF_final.getText());
                int horario =  qs.idChoice("horarios","nombre",String.valueOf(cbo_Horario.getSelectedItem()));
                
                int idemp=Integer.valueOf(lblIdemp.getText());

                int i = objEmphorarios.save(F_inicio,F_final,horario,idemp);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
                }
                else {
                    objEmphorarios.findId(lblIdemp.getText(), tblEmpleado_has_horarios);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva Horario registrado");
                }
            }catch(Exception e){System.out.println(""+e);}
        }
        else
            {
                JOptionPane.showMessageDialog(null,"Conflicto en fechas");
            }
        
        

    }//GEN-LAST:event_mitemregisterMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
            val=new Validators();
            hp = new Helpers();
            if(val.validarFechas(tblEmpleado_has_horarios, hp.getFormatDate(cboF_inicio.getText()), hp.getFormatDate(cboF_final.getText()))){
            
                int idhorarios=Integer.parseInt(lblIdemp_horarios.getText());
                int horario =  qs.idChoice("horarios","nombre",String.valueOf(cbo_Horario.getSelectedItem()));
                int idemp=Integer.parseInt(lblIdemp.getText());
                String F_inicio=hp.getFormatDate(cboF_inicio.getText());
                String F_final=hp.getFormatDate(cboF_final.getText());



                int i = objEmphorarios.update(idhorarios,F_inicio,F_final,horario,idemp);
                if (i == 0) {

                    JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
                }
                else {
                    objEmphorarios.findId(lblIdemp.getText(), tblEmpleado_has_horarios);
                    cleanBox();
                    JOptionPane.showMessageDialog(null, "Horario actualizado");
                }
            
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Conflicto en fechas");
            }
        
        
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
       
            int i;
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if(i==0){
                int id = Integer.valueOf(lblIdemp_horarios.getText());

                i = objEmphorarios.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el horario");
                }
                else {
                    objEmphorarios.findId(lblIdemp.getText(), tblEmpleado_has_horarios);
                    cleanBox();
                }
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
    private javax.swing.JComboBox cbo_Horario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JLabel lblIdemp;
    private javax.swing.JLabel lblIdemp_horarios;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JTable tblEmpleado_has_horarios;
    // End of variables declaration//GEN-END:variables
}
