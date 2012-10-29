//GEN-LINE:initComponents
package Gui;

import java.awt.event.*;
import javax.swing.*;


public class WinEntrada extends javax.swing.JFrame {
    private Timer timer;
    int cont;

    /*
     * Creacion del WinEntrada
     */
    public WinEntrada() {
        initComponents();
        cont =-1;
        pgbcargador.setValue(0);
        pgbcargador.setStringPainted(true);
        timer = new Timer(50, new Timerlistener());
        timer.start();
    }
    
    /*
     * Metodo para que el progress bar avance graficamente
     */
    class Timerlistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            cont++;
            pgbcargador.setValue(cont);
            if(cont==100){
                timer.stop();   
                cerrar();
                WinUsuario objmdi = new WinUsuario();
                objmdi.setVisible(true);
                objmdi.show();
                objmdi.setLocationRelativeTo(null);
                }          
            }
    }
    /*
     * Creacion del WinEntrada
     */
    public void cerrar(){
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pgbcargador = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pgbcargador, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 234, Short.MAX_VALUE)
                .addComponent(pgbcargador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(WinEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WinEntrada().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JProgressBar pgbcargador;
    // End of variables declaration                   
}
