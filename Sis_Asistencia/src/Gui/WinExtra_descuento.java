
package Gui;

import Dao.Extra_descuentoDAO;
import Javabeans.Extra_descuento;
import Utilitarios.Config;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WinExtra_descuento extends javax.swing.JInternalFrame {
    
    private Extra_descuento extrades;
    private Extra_descuentoDAO objextrades;
    private Query qs;
    private Config cg;
    private Helpers hp;
    private DateFormat format;
    private Date date;
    private Date date2;
    private Calendar calendar;
    private Calendar calendar2;
    private Validators val;
    private String _error="Gui_Extra_descuento";
    
    public WinExtra_descuento() {
        initComponents();
        format=new SimpleDateFormat("dd-MM-yyyy");
        cbodate.setDateFormat(format);
        cargaForm();
    }
    public void cargaForm(){
        try {
            objextrades = new Extra_descuentoDAO();
            qs = new Query();
            objextrades.findId(lblIdemp.getText(), tblextra, lblcant);
            lblIdemp.setVisible(false);
            qs.loadTypeextra(cbotipo,0);
            
            
        } catch (Exception e) {
            System.out.println(_error+"_CargaForm:"+e);
            
        }
    }
    
    public void cleanBox(){
        
        lblid.setText("");
        cbodate.setSelectedDate(null);
        txtMonto.setText("");
        cbotipo.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlDatos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbodate = new datechooser.beans.DateChooserCombo();
        txtMonto = new javax.swing.JTextField();
        cbotipo = new javax.swing.JComboBox();
        lblIdemp = new javax.swing.JLabel();
        pnlListado = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblextra = new javax.swing.JTable();
        lblcant = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemRegistrar = new javax.swing.JMenuItem();
        mitemUpdate = new javax.swing.JMenuItem();
        jmitemDelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de los estados (empleados)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.black));

        jLabel1.setText("Id");

        jLabel2.setText("Tipo");

        lblid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Date");

        jLabel4.setText("Monto");

        cbotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblIdemp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PnlDatosLayout = new javax.swing.GroupLayout(PnlDatos);
        PnlDatos.setLayout(PnlDatosLayout);
        PnlDatosLayout.setHorizontalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbodate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addComponent(lblid, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PnlDatosLayout.setVerticalGroup(
            PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(PnlDatosLayout.createSequentialGroup()
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PnlDatosLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlDatosLayout.createSequentialGroup()
                                .addComponent(lblIdemp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbodate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        getContentPane().add(PnlDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 290, 180));

        pnlListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        tblextra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblextra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblextraMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblextra);

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 310, -1));

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 20));

        jLabel5.setText("Total: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        mfile.setText("Archivo");

        mitemRegistrar.setText("Registrar");
        mitemRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemRegistrarMousePressed(evt);
            }
        });
        mfile.add(mitemRegistrar);

        mitemUpdate.setText("Actualizar");
        mitemUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemUpdateMousePressed(evt);
            }
        });
        mfile.add(mitemUpdate);

        jmitemDelete.setText("Eliminar");
        jmitemDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmitemDeleteMousePressed(evt);
            }
        });
        mfile.add(jmitemDelete);

        jMenuBar1.add(mfile);

        medit.setText("Edit");

        jMenuItem4.setText("Limpiar todo");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        medit.add(jMenuItem4);

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
    
    private void tblextraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblextraMousePressed
        hp=new Helpers();
        date = new Date();
        date2=new Date();
        calendar= new GregorianCalendar();
        calendar2= new GregorianCalendar();
        int fsel;
        fsel = this.tblextra.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        }
        else {
            try {
                extrades = new Extra_descuento();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblextra.getModel();
                String idEmp = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblid.setText(idEmp);
                extrades = objextrades.getValues(Integer.parseInt(idEmp));
                lblIdemp.setText(String.valueOf(extrades.getIdemp()));
                date2=format.parse(hp.getFormatDate(extrades.getDate()));
                calendar2.setTime(date2);
                cbodate.setSelectedDate(calendar2);
                qs.loadTypeextra(cbotipo,extrades.getTipo());

            }
            catch (Exception e) {
                System.out.println(_error+"_tblextra:"+e);
            }

        }

    }//GEN-LAST:event_tblextraMousePressed

    private void mitemRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemRegistrarMousePressed
        try{
        val = new Validators("extra_descuento");   
        
        hp=new Helpers();
        Object[] datos = {txtMonto.getText()};
        Object[] tipos = {4};
        if(val.validar(datos, tipos)){

            try{
                String fecha = hp.getFormatDate(cbodate.getText());
                int tipo = cbotipo.getSelectedIndex();
                float monto = Float.valueOf(txtMonto.getText());
                int idemp = Integer.parseInt(lblIdemp.getText());
                int i = objextrades.save(fecha,tipo,monto,idemp);
                if (i == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
                }
                else {
                    objextrades.getTableAll(tblextra, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva salarioextra registrado");
                }
            }catch(Exception e){}
        }
        else
            {
                JOptionPane.showMessageDialog(null,"Conflicto en tamaño de datos");
            }
        }catch(Exception e){
            System.out.println(_error+"_Register:"+e);
        }
    }//GEN-LAST:event_mitemRegistrarMousePressed

    private void mitemUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemUpdateMousePressed
        try{
        val = new Validators("extra_descuento");   
        
        hp=new Helpers();
        Object[] datos = {txtMonto.getText(),lblid.getText()};
        Object[] tipos = {4,1};
        if(val.validar(datos, tipos)){

            try{
                
                String fecha = hp.getFormatDate(cbodate.getText());
                int tipo = cbotipo.getSelectedIndex();
                float monto = Float.valueOf(txtMonto.getText());
                int idemp = Integer.parseInt(lblIdemp.getText());
                int i = objextrades.update(fecha,tipo,monto,idemp);
                if (i == 0) {

                    JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
                }
                else {
                    
                    cleanBox();
                    JOptionPane.showMessageDialog(null, "Horario actualizado");
                }
            }catch(Exception e){System.out.println(""+e);}
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Conflicto en tamaño de datos");
            }
        }catch(Exception e){
            System.out.println(_error+"_Update:"+e);
        }
    }//GEN-LAST:event_mitemUpdateMousePressed

    private void jmitemDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmitemDeleteMousePressed
       try{
        val = new Validators("extra_descuento"); 
        Object[] datos = {lblid.getText()};
        Object[] tipos = {};
        if(val.validar(datos, tipos)){
        int i;
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if(i==0){
                int id = Integer.valueOf(lblid.getText());

                i = objextrades.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el horario");
                }
                else {
                    objextrades.findId(lblIdemp.getText(), tblextra, lblcant);
                    cleanBox();
                }
            }
        }
       }catch(Exception e){
           System.out.println(_error+"_Delete:"+e);
       }
    }//GEN-LAST:event_jmitemDeleteMousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
       
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDatos;
    private datechooser.beans.DateChooserCombo cbodate;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmitemDelete;
    public javax.swing.JLabel lblIdemp;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblid;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemRegistrar;
    private javax.swing.JMenuItem mitemUpdate;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JTable tblextra;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
