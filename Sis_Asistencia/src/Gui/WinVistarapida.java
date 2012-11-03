
package Gui;


public class WinVistarapida extends javax.swing.JFrame {

    /**
     * Creates new form WinVistarapida
     */
    public WinVistarapida() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblAsiste = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblJusti = new javax.swing.JTable();
        BtnPrintJus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LblTraba = new javax.swing.JLabel();
        LblTotal = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        LblJTardanza = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        LblExtras = new javax.swing.JLabel();
        LblFalJus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        LblDNI = new javax.swing.JLabel();
        LblNom = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblTelf = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblTip = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LblCargo = new javax.swing.JLabel();
        LblLocal = new javax.swing.JLabel();
        LblEst = new javax.swing.JLabel();
        LblArea = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cal_Ini = new datechooser.beans.DateChooserCombo();
        Cal_Fin = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CmbEmp = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Resultados")));

        TblAsiste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblAsiste);

        jButton2.setText("Imprimir");

        jButton3.setText("Exportar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Asistencia", jPanel4);

        TblJusti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TblJusti);

        BtnPrintJus.setText("Imprimir");

        jButton1.setText("Exportar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnPrintJus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPrintJus)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Justificaciones", jPanel5);

        jLabel6.setText("Horas trabajadas");

        LblTraba.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setText("Total acumulado");

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Permisos"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Horas extras");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 60, 21));

        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 60, 21));

        jLabel8.setText("Cant. tardanza");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 60, 21));

        LblJTardanza.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(LblJTardanza, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 46, 21));

        jLabel12.setText("Justificadas");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel22.setText("Cant faltas");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel27.setText("Justificadas");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel29.setText("Horas tardanza");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        LblExtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(LblExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 60, 21));

        LblFalJus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.add(LblFalJus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 46, 21));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(LblTraba, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(LblTraba, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(LblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Resumen", jPanel6);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 120, 120));

        jLabel5.setText("DNI:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        LblDNI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 85, 20));

        LblNom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 400, 23));

        jLabel4.setText("Telefonos");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        LblTelf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 160, 20));

        jLabel10.setText("Nombres y Apellidos");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        LblTip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblTip, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 20));

        jLabel13.setText("Tipo");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, -1, -1));

        jLabel14.setText("Area");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel15.setText("Cargo");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, -1, -1));

        jLabel16.setText("Local");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel17.setText("Estado");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        LblCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 20));

        LblLocal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 20));

        LblEst.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 160, 20));

        LblArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(LblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 20));

        jTabbedPane1.addTab("Datos", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(16, 16, 16))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros"));

        jLabel1.setText("Nombre :");

        jLabel2.setText("De");

        jLabel3.setText("Hasta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cal_Ini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cal_Fin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CmbEmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CmbEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Cal_Ini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Cal_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton5.setText("Cerrar");

        jButton6.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addContainerGap(444, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinVistarapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinVistarapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinVistarapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinVistarapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinVistarapida().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPrintJus;
    private datechooser.beans.DateChooserCombo Cal_Fin;
    private datechooser.beans.DateChooserCombo Cal_Ini;
    private javax.swing.JComboBox CmbEmp;
    private javax.swing.JLabel LblArea;
    private javax.swing.JLabel LblCargo;
    private javax.swing.JLabel LblDNI;
    private javax.swing.JLabel LblEst;
    private javax.swing.JLabel LblExtras;
    private javax.swing.JLabel LblFalJus;
    private javax.swing.JLabel LblJTardanza;
    private javax.swing.JLabel LblLocal;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblTelf;
    private javax.swing.JLabel LblTip;
    private javax.swing.JLabel LblTotal;
    private javax.swing.JLabel LblTraba;
    private javax.swing.JTable TblAsiste;
    private javax.swing.JTable TblJusti;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
