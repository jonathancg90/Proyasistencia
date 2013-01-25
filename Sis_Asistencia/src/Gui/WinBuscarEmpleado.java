
package Gui;
import Dao.BusquedaEmpleadoDAO;
import Utilitarios.Query;
import javax.swing.table.DefaultTableModel;
import Utilitarios.Data;


public class WinBuscarEmpleado extends javax.swing.JInternalFrame {
    private BusquedaEmpleadoDAO Bus;
    private Query qs;
    public int Form;
    public static String Nomape;
    public Data dt;
    
    public WinBuscarEmpleado() {
        initComponents();
        dt = new Data();
        this.setTitle(dt.G_TITULOS[27]);
        cargaForm();
        
    }
    private void cargaForm(){
        qs = new Query();
        Bus = new BusquedaEmpleadoDAO();
        
        qs.loadChoice(CboEstado,"estadoemp","nombre");
        
        qs.loadChoice(Cboarea,"area","nombre");
        qs.setIdentify("idare");
        qs.loadChoiceDefault(CboCargo,"cargo","nombre",
            Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(Cboarea.getSelectedItem()))));
        
        qs.loadChoice(CboEmpresa,"empresa","nombre");
        qs.setIdentify("idempr");
        qs.loadChoiceDefault(CboSucursal,"sucursal","nombre",
            Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(CboEmpresa.getSelectedItem()))));

        buscar();
    }
    private void buscar(){
        Bus = new BusquedaEmpleadoDAO();
        qs = new Query();
        String apellidos = Txtapellidos.getText();
        String idemp = qs.idChoice("empresa", "nombre", String.valueOf(CboEmpresa.getSelectedItem()));
        String idsuc = qs.idChoice("sucursal", "nombre", String.valueOf(CboSucursal.getSelectedItem()));
        String idarea = qs.idChoice("area", "nombre", String.valueOf(Cboarea.getSelectedItem()));
        String idcargo = qs.idChoice("cargo", "nombre", String.valueOf(CboCargo.getSelectedItem()));
        String estado = qs.idChoice("estadoemp", "nombre", String.valueOf(CboEstado.getSelectedItem()));
        Bus.find(apellidos,idarea,idcargo,idemp,idsuc,estado,Tblbuscador, lblcant);
    }
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txtapellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CboEmpresa = new javax.swing.JComboBox();
        CboSucursal = new javax.swing.JComboBox();
        CboCargo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Cboarea = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        CboEstado = new javax.swing.JComboBox();
        LblModulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tblbuscador = new javax.swing.JTable();
        lblcant = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Criterios de busqueda"));

        jLabel1.setText("Apellidos");

        jLabel2.setText("Empresa");

        jLabel3.setText("Sucursal");

        jLabel4.setText("Cargo");

        CboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboEmpresaActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Area");

        Cboarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboareaActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblModulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Txtapellidos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboEmpresa, 0, 209, Short.MAX_VALUE)
                            .addComponent(Cboarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CboSucursal, 0, 149, Short.MAX_VALUE)
                    .addComponent(CboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(CboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Cboarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(LblModulo)))
        );

        Tblbuscador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tblbuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TblbuscadorMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tblbuscador);

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Total: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboEmpresaActionPerformed
        qs = new Query();
        qs.setIdentify("idempr");
        qs.loadChoiceDefault(CboSucursal,"sucursal","nombre",
            Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(CboEmpresa.getSelectedItem()))));
    }//GEN-LAST:event_CboEmpresaActionPerformed

    private void CboareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboareaActionPerformed
        qs = new Query();
        qs.setIdentify("idare");
        qs.loadChoiceDefault(CboCargo,"cargo","nombre",
            Integer.parseInt(qs.idChoice("area","nombre",String.valueOf(Cboarea.getSelectedItem()))));
    }//GEN-LAST:event_CboareaActionPerformed

    private void TblbuscadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblbuscadorMousePressed
        int fsel;
        fsel = this.Tblbuscador.getSelectedRow();
        DefaultTableModel m = new DefaultTableModel();
        m = (DefaultTableModel) this.Tblbuscador.getModel();
        String idEmp = String.valueOf(m.getValueAt(fsel, 0));

        String Nomape = String.valueOf(m.getValueAt(fsel, 1));
        String ape = String.valueOf(m.getValueAt(fsel, 2));
        String area = String.valueOf(m.getValueAt(fsel, 3));
        String cargo = String.valueOf(m.getValueAt(fsel, 4));
        System.out.println("Hola"+ Form + " - " + Nomape);
        switch(LblModulo.getText()){
            case "1":
                Gui.WinConsulta.TxtName.setText(Nomape);
                System.out.println("Hola: "+Nomape);
                break;
            case "2": WinJustificacion jus = new WinJustificacion();
                    jus.lblID.setText(idEmp);
                    jus.lblNomape.setText(Nomape+" "+ape);
                    jus.Lblarea.setText(area);
                    jus.lblcargo.setText(cargo);
                    break; 
            
        }
    }//GEN-LAST:event_TblbuscadorMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CboCargo;
    private javax.swing.JComboBox CboEmpresa;
    private javax.swing.JComboBox CboEstado;
    private javax.swing.JComboBox CboSucursal;
    private javax.swing.JComboBox Cboarea;
    public javax.swing.JLabel LblModulo;
    private javax.swing.JTable Tblbuscador;
    private javax.swing.JTextField Txtapellidos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcant;
    // End of variables declaration//GEN-END:variables
}
