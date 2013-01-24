
package Gui;

import Appi.JExcel;
import Dao.EmpresaDAO;
import Javabeans.Empresa;
import Utilitarios.Config;
import Utilitarios.Data;
import Utilitarios.Query;
import Utilitarios.Validators;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Utilitarios.Helpers;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WinEmpresa extends javax.swing.JInternalFrame {

    private EmpresaDAO objempresa;
    private Empresa empresa;
    private Query qs;
    private Config cg;
    private Data dt;
    private Validators val;
    private Helpers hp;
    private String _error = "Gui_Empresa";
    private JExcel xls;
    
    public WinEmpresa() {
        initComponents();
        cargaForm();
    }

    /*
     * Construccion de formualrio
     */
    
    public void cargaForm(){
        try{
            qs = new Query();
            objempresa = new EmpresaDAO();
            objempresa.getTableAll(tblempresa, lblcant);
            qs.loadState(cmbEstate,false);
            qs.loadChoice(cboMon,"moneda","nombre");
          
        }
        catch(Exception e){
            System.out.println(_error+"_CargaForm:"+e);
        }
    }
    
    public void cleanBox(){
        lblId.setText("");
        txtruc.setText("");
        txtName.setText("");
        lblModified.setText("");
        txtFilter.setText("");
        txtCantTrab.setText("");
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblempresa = new javax.swing.JTable();
        btnFind = new javax.swing.JButton();
        txtFilter = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtruc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboMon = new javax.swing.JComboBox();
        cmbEstate = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblModified = new javax.swing.JLabel();
        txtCantTrab = new javax.swing.JLabel();
        lblcant = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mfile = new javax.swing.JMenu();
        mitemregister = new javax.swing.JMenuItem();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        maño = new javax.swing.JMenu();
        nolaborables = new javax.swing.JMenu();
        mclose = new javax.swing.JMenu();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de empresas"));

        tblempresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblempresa);

        btnFind.setText("Ok");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnFind))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 330, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la empresa"));

        jLabel4.setText("Id");

        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Razon social");

        jLabel5.setText("RUC");

        jLabel8.setText("Cant. Trab");

        jLabel9.setText("Moneda");

        jLabel2.setText("Estado");

        jLabel3.setText("Modificado");

        lblModified.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCantTrab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtruc)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboMon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEstate, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModified, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(txtCantTrab, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbEstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblModified, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 60, 20));

        jLabel7.setText("Total: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

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
        medit.add(mitemclear);

        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

        maño.setText("Sucursales");
        maño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mañoMousePressed(evt);
            }
        });
        jMenuBar1.add(maño);

        nolaborables.setText("Dias no laborables");
        nolaborables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nolaborablesMousePressed(evt);
            }
        });
        jMenuBar1.add(nolaborables);

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

    private void tblempresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempresaMouseClicked
        hp=new Helpers();
        int fsel;
        fsel= this.tblempresa.getSelectedRow();
        if(fsel==-1){

        }
        else{
            try{
                empresa = new Empresa();
                DefaultTableModel m = new DefaultTableModel();
                m=(DefaultTableModel) this.tblempresa.getModel();
                String idEmpresa = String.valueOf(m.getValueAt(fsel, 0));
                //Asigando valores obtenidos
                lblId.setText(idEmpresa);
                empresa = objempresa.getValues(Integer.parseInt(idEmpresa));
                txtName.setText(empresa.getName());                
                txtruc.setText(empresa.getRuc());
                lblModified.setText(hp.getFormatDate(empresa.getModified()));                
                txtCantTrab.setText(String.valueOf(empresa.getTrabajadores()));
                qs.loadChoiceDefault(cboMon,"moneda","nombre",empresa.getMon());
                qs.loadState(cmbEstate,empresa.isEstado());
            }
            catch(Exception e){
                System.out.println(_error+"_Tblempresa:"+e);
            }

        }
    }//GEN-LAST:event_tblempresaMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = txtFilter.getText();
        objempresa = new EmpresaDAO();
        objempresa.find(name, tblempresa, lblcant);
    }//GEN-LAST:event_btnFindActionPerformed

    private void mañoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mañoMousePressed
        if(!"".equals(this.lblId.getText())){
            WinEmpresa_Sucursal objsucursal= new WinEmpresa_Sucursal();
            dt= new Data();
            String titulo=dt.G_TITULOS[10];
            objsucursal.setTitle(titulo);
            objsucursal.setResizable(true);
            objsucursal.lblidemp.setText(txtName.getText());
            objsucursal.lblIdemp.setText(lblId.getText());

            objsucursal.setMaximizable(true);
            objsucursal.setIconifiable(true);
            WinMdi.jdpContenedor.add(objsucursal);

            objsucursal.setVisible(true);   
        } else {
            JOptionPane.showMessageDialog(null,"Debe de seleccionar una empresa para poder ingresar sus sucursales");
        }
    }//GEN-LAST:event_mañoMousePressed

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
        try {
            val = new Validators("empresa");
            Object[] datos = {lblId.getText()};
            Object[] tipos = {};
                if (val.validar(datos,tipos))
                {
                    int i;      
                    i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

                    if(i==0) {
                        int id = Integer.valueOf(lblId.getText());
                        objempresa = new EmpresaDAO();
                        i = objempresa.delete(id);          
                        if(i==0) {
                              JOptionPane.showMessageDialog(null,"No se pudo eliminar la Empresa");
                        } 
                        else {
                              objempresa.getTableAll(tblempresa, lblcant);
                              cleanBox();
                        }
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
                }
        }catch(Exception e){
            System.out.println(_error+"_Delete:"+e);
        }
    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
        try{
        val = new Validators("empresa");
        Object[] datos = {txtName.getText(),txtruc.getText(),lblId.getText()};
        Object[] tipos = {2,3};
            if (val.validar(datos,tipos))
            {
                dt = new Data();
                int id = Integer.valueOf(lblId.getText());
                String name = txtName.getText();
                String ruc = txtruc.getText();
                boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
                //int estate = cmbEstate.getSelectedIndex();
                int trab = Integer.parseInt(txtCantTrab.getText());
                int mon = Integer.parseInt(qs.idChoice("moneda","nombre",String.valueOf(cboMon.getSelectedItem())));

                objempresa = new EmpresaDAO();
                int i = objempresa.update(id,name,ruc,estate,trab,mon);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo actualizar datos");
                }
                else {
                    objempresa.getTableAll(tblempresa, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva empresa registrada");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
            } 
            }catch(Exception e){
                System.out.println(_error+"_Update:"+e);
            }
    }//GEN-LAST:event_mitemupdateMousePressed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemregisterMousePressed
        try{
        val = new Validators("empresa");
        Object[] datos = {txtName.getText(),txtruc.getText()};
        Object[] tipos={2,3};
            if (val.validar(datos,tipos))
            {
                dt = new Data();
                String name = txtName.getText();
                String ruc = txtruc.getText();
                boolean estate = Boolean.valueOf(dt.G_BOOLEAN[cmbEstate.getSelectedIndex()]);
                //int estate = Integer.parseInt(txtCantTrab.getText());
                int trab = 0;
                int mon = Integer.parseInt(qs.idChoice("moneda","nombre",String.valueOf(cboMon.getSelectedItem())));

                objempresa = new EmpresaDAO();
                int i = objempresa.save(name,ruc,estate,trab,mon);
                if(i==0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar datos");
                }
                else {
                    objempresa.getTableAll(tblempresa, lblcant);
                    cleanBox();
                    JOptionPane.showMessageDialog(null,"Nueva empresa registrada");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Campos requeridos incompletos");
            } 
            }catch(Exception e){
                System.out.println(_error+"_Register:"+e);
            }
        
    }//GEN-LAST:event_mitemregisterMousePressed

    private void nolaborablesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nolaborablesMousePressed
       if(!"".equals(this.lblId.getText())){
           dt= new Data();
            String titulo=dt.G_TITULOS[11];
            WinNolaborables objnolaborables= new WinNolaborables();
            objnolaborables.setTitle(titulo);
            objnolaborables.setResizable(true);
            objnolaborables.lblIdempr.setText(lblId.getText());

            objnolaborables.setMaximizable(true);
            objnolaborables.setIconifiable(true);
            WinMdi.jdpContenedor.add(objnolaborables);

            objnolaborables.setVisible(true);   
        } else {
            JOptionPane.showMessageDialog(null,"Debe de seleccionar una empresa para poder ingresar sus dias no laborables");
        }
    }//GEN-LAST:event_nolaborablesMousePressed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(tblempresa);
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
                    Confirma=xls.ExportJtable(tblempresa, fichero, "Empresa");
                }
            } 
            else{
                Confirma=xls.ExportJtable(tblempresa, fichero, "Empresa");
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
    }//GEN-LAST:event_ItemExportarMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox cboMon;
    private javax.swing.JComboBox cmbEstate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblModified;
    private javax.swing.JLabel lblcant;
    private javax.swing.JMenu maño;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenu mfile;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemregister;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JMenu nolaborables;
    private javax.swing.JTable tblempresa;
    private javax.swing.JLabel txtCantTrab;
    private javax.swing.JTextField txtFilter;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
}
