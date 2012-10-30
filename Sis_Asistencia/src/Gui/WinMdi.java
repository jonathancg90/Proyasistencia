
package Gui;

import javax.swing.*;

public class WinMdi extends javax.swing.JFrame {

    /*
     * Creacion del WinMdi
     */
    public WinMdi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuasi = new javax.swing.JMenu();
        menujus = new javax.swing.JMenu();
        menuemp = new javax.swing.JMenu();
        menuhor = new javax.swing.JMenu();
        menuvis = new javax.swing.JMenu();
        menudis = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        menurep = new javax.swing.JMenu();
        menusal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpContenedor.setBounds(0, 0, 760, 440);
        jDesktopPane1.add(jdpContenedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuasi.setText("Asistencia");
        jMenuBar1.add(menuasi);

        menujus.setText("Justificaciones");
        jMenuBar1.add(menujus);

        menuemp.setText("Empleados");
        jMenuBar1.add(menuemp);

        menuhor.setText("Horarios");
        jMenuBar1.add(menuhor);

        menuvis.setText("Consulta");
        jMenuBar1.add(menuvis);

        menudis.setText("Configuraciones");

        jMenu1.setText("Criterios");

        jMenuItem1.setText("Area");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Empresa");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Tipo empleado");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Sucursal");
        jMenu1.add(jMenuItem4);

        menudis.add(jMenu1);

        jMenuItem5.setText("Usuarios");
        menudis.add(jMenuItem5);

        jMenuItem6.setText("Diseño");
        menudis.add(jMenuItem6);

        jMenuItem7.setText("Backup");
        menudis.add(jMenuItem7);

        jMenuItem8.setText("Help");
        menudis.add(jMenuItem8);

        jMenuBar1.add(menudis);

        menurep.setText("Reportes");
        jMenuBar1.add(menurep);

        menusal.setText("Salir");
        menusal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menusalMousePressed(evt);
            }
        });
        jMenuBar1.add(menusal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menusalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalMousePressed
    WinLogin objusuario;
    int i;
    i= JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
     if(i==0){
        objusuario=new WinLogin();
        objusuario.show();
        objusuario.setLocationRelativeTo(this);
        this.dispose();
        }  
    }//GEN-LAST:event_menusalMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed

       WinArea objarea= new WinArea();
    
       objarea.setResizable(true);
       objarea.setMaximizable(true);
       objarea.setIconifiable(true);
           
       
       //obj_Asis.setClosable(true);
       

       jdpContenedor.add(objarea);

       objarea.setVisible(true);
       
    }//GEN-LAST:event_jMenuItem1MousePressed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinMdi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinMdi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    public static javax.swing.JDesktopPane jdpContenedor;
    private javax.swing.JMenu menuasi;
    private javax.swing.JMenu menudis;
    private javax.swing.JMenu menuemp;
    private javax.swing.JMenu menuhor;
    private javax.swing.JMenu menujus;
    private javax.swing.JMenu menurep;
    private javax.swing.JMenu menusal;
    private javax.swing.JMenu menuvis;
    // End of variables declaration//GEN-END:variables
}
