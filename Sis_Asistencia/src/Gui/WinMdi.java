
package Gui;

import javax.swing.*;

public class WinMdi extends javax.swing.JFrame {

    
    public WinMdi() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuasi = new javax.swing.JMenu();
        menujus = new javax.swing.JMenu();
        menuemp = new javax.swing.JMenu();
        menuhor = new javax.swing.JMenu();
        menuvis = new javax.swing.JMenu();
        menudoc = new javax.swing.JMenu();
        menurep = new javax.swing.JMenu();
        menusal = new javax.swing.JMenu();
        menudis = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuasi.setText("Asistencia");
        jMenuBar1.add(menuasi);

        menujus.setText("Justificaciones");
        jMenuBar1.add(menujus);

        menuemp.setText("Empleados");
        jMenuBar1.add(menuemp);

        menuhor.setText("Horarios");
        jMenuBar1.add(menuhor);

        menuvis.setText("Vista Rapida");
        jMenuBar1.add(menuvis);

        menudoc.setText("Documentos");
        jMenuBar1.add(menudoc);

        menurep.setText("Reportajes");
        jMenuBar1.add(menurep);

        menusal.setText("Salir");
        menusal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menusalMousePressed(evt);
            }
        });
        jMenuBar1.add(menusal);

        menudis.setText("Diseño");
        jMenuBar1.add(menudis);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menusalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menusalMousePressed
    int i;
    i= JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
     if(i==0){
                this.dispose();
        }  
    }//GEN-LAST:event_menusalMousePressed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuasi;
    private javax.swing.JMenu menudis;
    private javax.swing.JMenu menudoc;
    private javax.swing.JMenu menuemp;
    private javax.swing.JMenu menuhor;
    private javax.swing.JMenu menujus;
    private javax.swing.JMenu menurep;
    private javax.swing.JMenu menusal;
    private javax.swing.JMenu menuvis;
    // End of variables declaration//GEN-END:variables
}
