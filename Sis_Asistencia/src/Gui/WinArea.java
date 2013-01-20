package Gui;

import Dao.AreaDAO;
import Javabeans.Area;
import Utilitarios.Data;
import Utilitarios.Query;
import Appi.JExcel;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utilitarios.Helpers;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.postgresql.util.PSQLException;

/**
 * Formulario para el registro de las areas de la empresa.
 * Cada Empresa estara subdividida por areas
 * @author Jonathan Carrasco
 */
public class WinArea extends javax.swing.JInternalFrame {   
    private AreaDAO objarea;
    private Area area; //aaa
    private Query qs;
    private Data dt;
    private Validators val;
    private Data data;
    private Helpers hp;
    private String _error = "Gui_WinArea_";
    private JExcel xls;
    
    public WinArea() {
        initComponents();
        cargaForm();
    }
    /**
     * Formulario para el mantenimiento de las areas de la empresa.
     */
    public void cargaForm(){
        try {
            objarea = new AreaDAO();
            qs = new Query();
            objarea.getTableAll(tblArea, lblcant);
            
            qs.loadState(cmbEstate, false);
            
        } catch (Exception e) {
            System.out.println(_error + "_cargaForm:" + e);
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
        pnlOpciones = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbEstate = new javax.swing.JComboBox();
        lblModified = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArea = new javax.swing.JTable();
        lblcant = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemeliminar = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        maña = new javax.swing.JMenu();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del area"));

        jLabel4.setText("Id");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nombre");

        jLabel2.setText("Estado");

        cmbEstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstateActionPerformed(evt);
            }
        });

        lblModified.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Modificado");

        org.jdesktop.layout.GroupLayout pnlOpcionesLayout = new org.jdesktop.layout.GroupLayout(pnlOpciones);
        pnlOpciones.setLayout(pnlOpcionesLayout);
        pnlOpcionesLayout.setHorizontalGroup(
            pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlOpcionesLayout.createSequentialGroup()
                        .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel4))
                        .add(42, 42, 42)
                        .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtName)
                            .add(lblId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlOpcionesLayout.createSequentialGroup()
                        .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel3))
                        .add(22, 22, 22)
                        .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(cmbEstate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 146, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblModified, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlOpcionesLayout.setVerticalGroup(
            pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(txtName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(cmbEstate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlOpcionesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblModified, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout pnlMantenimientoLayout = new org.jdesktop.layout.GroupLayout(pnlMantenimiento);
        pnlMantenimiento.setLayout(pnlMantenimientoLayout);
        pnlMantenimientoLayout.setHorizontalGroup(
            pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOpciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMantenimientoLayout.setVerticalGroup(
            pnlMantenimientoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlOpciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlMantenimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 12, 350, 260));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de areas"));

        jLabel6.setText("Nombre");

        btnFind.setText("Ok");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        tblArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArea);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtFilter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 134, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnFind)
                .add(0, 7, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, -1));

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 60, 20));

        jLabel5.setText("Total: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

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
        mitemupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemupdateActionPerformed(evt);
            }
        });
        mfile.add(mitemupdate);

        mitemeliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mitemeliminar.setText("Eliminar");
        mitemeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemeliminarMousePressed(evt);
            }
        });
        mfile.add(mitemeliminar);

        jMenuBar1.add(mfile);

        medit.setText("Editar");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        jMenuItem1.setText("Exportar");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        medit.add(jMenuItem1);

        jMenuBar1.add(medit);

        maña.setText("Cargos");
        maña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mañaMousePressed(evt);
            }
        });
        jMenuBar1.add(maña);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAreaMouseClicked
        hp = new Helpers();
        int fsel;
        fsel = this.tblArea.getSelectedRow();
            try {
                area = new Area();
                DefaultTableModel m = new DefaultTableModel();
                m = (DefaultTableModel) this.tblArea.getModel();
                String idArea = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblId.setText(idArea);
                area = objarea.getValues(Integer.parseInt(idArea));
                txtName.setText(area.getName());
                
                lblModified.setText(area.getModified());
                
                qs.loadState(cmbEstate,area.getState());
                }
            catch (Exception e) {
                System.out.println(_error +"_tblArea:"+ e);
            }
    }//GEN-LAST:event_tblAreaMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = txtFilter.getText();
        objarea = new AreaDAO();
        objarea.find(name, tblArea,lblcant);
    }//GEN-LAST:event_btnFindActionPerformed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mitemeliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemeliminarMousePressed
    try {
        val = new Validators("area");    
        Object[] datos = {lblId.getText()};
        Object[] tipos = {};
        if(val.validar(datos,tipos)){ 
            int i;      
            i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
            if (i==0) {    
                int id = Integer.valueOf(lblId.getText());  
                objarea = new AreaDAO();
                i = objarea.delete(id);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar el area");
                }
                else if (i>0){
                    JOptionPane.showMessageDialog(null,"Area eliminada");
                    objarea.getTableAll(tblArea,lblcant);
                    cleanBox();
                }
                else {
                    JOptionPane.showMessageDialog(null,"No se pudo eliminar este registro porque tiene dependencias \n\rSe ha cambiado a inactivo");
                    cleanBox();
                }
        }
    }//GEN-LAST:event_mitemeliminarMousePressed
    else {
        JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
    }
    }
    catch(Exception e){
        System.out.println(_error +"_Delete:"+ e);
    }
}
    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
    try {
    val = new Validators("area");
    Object[] datos = {txtName.getText(),lblId.getText()};
    Object[] tipos={1,0};
    if(val.validar(datos,tipos)){
        dt = new Data();
        int id = Integer.valueOf(lblId.getText());
        String name = txtName.getText();
        boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
        objarea = new AreaDAO();
        int i = objarea.update(id,name,estate);
        if (i == 0) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar datos");
        }
        else {
            objarea.getTableAll(tblArea,lblcant);
            cleanBox();
            JOptionPane.showMessageDialog(null, "Area actualizada");
        }
    }//GEN-LAST:event_mitemupdateMousePressed
    else {
        JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
    }
    } catch(Exception e) {
        System.out.println(_error+"_Update: " + e);
    }
}
    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
    try{
        val = new Validators("area");    
        Object[] datos = {txtName.getText()};
        Object[] tipos={2};
        if(val.validar(datos,tipos)){
            dt = new Data();
            String name = txtName.getText();
            boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
            objarea = new AreaDAO();
            int i = objarea.save(name, estate);
            if (i == 0) {
                JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
            }
            else {
                objarea.getTableAll(tblArea,lblcant);
                cleanBox();
                JOptionPane.showMessageDialog(null,"Nueva area registrada");      
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
        }  
        }catch(Exception e){
        System.out.println(_error+"_Register:" + e);
        }
    }//GEN-LAST:event_mitemregisterMousePressed

    private void mañaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mañaMousePressed
        if(!"".equals(lblId.getText())){
            data= new Data();
            String titulo=data.G_TITULOS[9];
            WinArea_Cargos objCargo= new WinArea_Cargos();
            objCargo.setTitle(titulo);
            objCargo.lblidArea.setText(lblId.getText());
            objCargo.lblArea.setText(txtName.getText());
            objCargo.setResizable(true);
            objCargo.setMaximizable(false);
            objCargo.setIconifiable(true);
            objCargo.setClosable(true);
            WinMdi.jdpContenedor.add(objCargo);
            objCargo.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Debe de seleccionar una area para poder asignar cargos");
       }
    }//GEN-LAST:event_mañaMousePressed

    private void mitemupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemupdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemupdateActionPerformed

    private void mcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcloseActionPerformed
   
    }//GEN-LAST:event_mcloseActionPerformed

    private void cmbEstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstateActionPerformed

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
      cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(tblArea);
        //Guardar
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File fichero = Obj.getSelectedFile();
            String filePath = fichero.getPath();
            if(!filePath.toLowerCase().endsWith(".xls")){
                fichero = new File(filePath + ".xls");
            }
            boolean Confirma;
            if((fichero).exists()) {
                if(JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(this,"El fichero existe,deseas reemplazarlo?","Reemplazar",JOptionPane.YES_NO_OPTION));{
                    Confirma=xls.ExportJtable(tblArea, fichero, "Areas");
                }
            } 
            else{
                Confirma=xls.ExportJtable(tblArea, fichero, "Areas");
            }
                if(Confirma==true){
                    JOptionPane.showMessageDialog(null, "El documento se grabo exitosamente","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo grabar el documento", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                }
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la exportacion del documento","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(_error + "Exportar :"+e);
    }
    }//GEN-LAST:event_jMenuItem1MousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox cmbEstate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModified;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu maña;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemeliminar;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JPanel pnlMantenimiento;
    private javax.swing.JPanel pnlOpciones;
    private javax.swing.JTable tblArea;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
