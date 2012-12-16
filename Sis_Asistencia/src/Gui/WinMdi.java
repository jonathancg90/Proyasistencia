
package Gui;

import Utilitarios.Validators;
import javax.swing.*;

public class WinMdi extends javax.swing.JFrame {
    Validators val;
    /*
     * Creacion del WinMdi
     */
    public WinMdi() {
        initComponents();
        jdpContenedor.setSize(this.getWidth(), this.getHeight());
        setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        masi = new javax.swing.JMenu();
        mjus = new javax.swing.JMenu();
        memp = new javax.swing.JMenu();
        mhor = new javax.swing.JMenu();
        mvis = new javax.swing.JMenu();
        mdis = new javax.swing.JMenu();
        SubmenuCrit = new javax.swing.JMenu();
        JmitemArea = new javax.swing.JMenuItem();
        Jmitememp = new javax.swing.JMenuItem();
        JmitemTipo = new javax.swing.JMenuItem();
        Jmitemtpmon = new javax.swing.JMenuItem();
        JmitemRoles = new javax.swing.JMenuItem();
        JmitemCiudad = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmItemModulos = new javax.swing.JMenuItem();
        JmitemUsu = new javax.swing.JMenuItem();
        JmitemDis = new javax.swing.JMenuItem();
        JmiBackup = new javax.swing.JMenuItem();
        Jmitemhelp = new javax.swing.JMenuItem();
        mrep = new javax.swing.JMenu();
        mclose = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        masi.setText("Asistencia");
        masi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                masiMousePressed(evt);
            }
        });
        jMenuBar1.add(masi);

        mjus.setText("Justificaciones");
        mjus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mjusMousePressed(evt);
            }
        });
        jMenuBar1.add(mjus);

        memp.setText("Empleados");
        memp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mempMousePressed(evt);
            }
        });
        jMenuBar1.add(memp);

        mhor.setText("Horarios");
        mhor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mhorMousePressed(evt);
            }
        });
        jMenuBar1.add(mhor);

        mvis.setText("Consulta");
        mvis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mvisMousePressed(evt);
            }
        });
        jMenuBar1.add(mvis);

        mdis.setText("Configuraciones");

        SubmenuCrit.setText("Criterios");

        JmitemArea.setText("Area");
        JmitemArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemAreaMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemArea);

        Jmitememp.setText("Empresa");
        Jmitememp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemempMousePressed(evt);
            }
        });
        SubmenuCrit.add(Jmitememp);

        JmitemTipo.setText("Tipo empleado");
        JmitemTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemTipoMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemTipo);

        Jmitemtpmon.setText("Tipo de Moneda");
        Jmitemtpmon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemtpmonMousePressed(evt);
            }
        });
        SubmenuCrit.add(Jmitemtpmon);

        JmitemRoles.setText("Roles");
        JmitemRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemRolesMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemRoles);

        JmitemCiudad.setText("Ciudad");
        JmitemCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemCiudadMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemCiudad);

        jMenuItem1.setText("Est. Empleado");
        SubmenuCrit.add(jMenuItem1);

        jMenuItem2.setText("Dias no laborables");
        SubmenuCrit.add(jMenuItem2);

        jMenuItem3.setText("Tipo de horario");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        SubmenuCrit.add(jMenuItem3);

        jmItemModulos.setText("Modulos");
        jmItemModulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmItemModulosMousePressed(evt);
            }
        });
        SubmenuCrit.add(jmItemModulos);

        mdis.add(SubmenuCrit);

        JmitemUsu.setText("Usuarios");
        JmitemUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemUsuMousePressed(evt);
            }
        });
        mdis.add(JmitemUsu);

        JmitemDis.setText("Diseño");
        JmitemDis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemDisMousePressed(evt);
            }
        });
        mdis.add(JmitemDis);

        JmiBackup.setText("Backup");
        mdis.add(JmiBackup);

        Jmitemhelp.setText("Help");
        mdis.add(Jmitemhelp);

        jMenuBar1.add(mdis);

        mrep.setText("Reportes");
        mrep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mrepMousePressed(evt);
            }
        });
        jMenuBar1.add(mrep);

        mclose.setText("Salir");
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
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
    WinLogin objusuario;
    int i;
    i= JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
     if(i==0){
        objusuario=new WinLogin();
        objusuario.show();
        objusuario.setLocationRelativeTo(this);
        this.dispose();
        }
    }//GEN-LAST:event_mcloseMousePressed

    private void JmitemAreaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemAreaMousePressed

       WinArea objArea= new WinArea();
       val = new Validators();
    
       objArea.setResizable(true);
       objArea.setMaximizable(true);
       objArea.setIconifiable(true);
       //obj_Asis.setClosable(true);
       jdpContenedor.add(objArea);
       if(val.EntryForms()){
            objArea.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
       
    }//GEN-LAST:event_JmitemAreaMousePressed

    private void masiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masiMousePressed
        WinAsistencia objAsis = new WinAsistencia();
        val = new Validators();
        objAsis.setResizable(true);
        objAsis.setMaximizable(true);
        objAsis.setIconifiable(true);
        jdpContenedor.add(objAsis);
        
       if(val.EntryForms()){
            objAsis.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
    }//GEN-LAST:event_masiMousePressed

    private void mjusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mjusMousePressed
        WinJustificacion objJus = new WinJustificacion();
        val = new Validators();
        objJus.setResizable(true);
        objJus.setMaximizable(true);
        objJus.setIconifiable(true);
        
        jdpContenedor.add(objJus);
       if(val.EntryForms()){
            objJus.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
        
    }//GEN-LAST:event_mjusMousePressed

    private void mhorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mhorMousePressed
        WinHorario objHor = new WinHorario();
        val = new Validators();
        objHor.setResizable(true);
        objHor.setMaximizable(true);
        objHor.setIconifiable(true);
        jdpContenedor.add(objHor);
       if(val.EntryForms()){
            objHor.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }

    }//GEN-LAST:event_mhorMousePressed

    private void mvisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mvisMousePressed
        WinConsulta objCon = new WinConsulta();
        val = new Validators();
        objCon.setResizable(true);
        objCon.setMaximizable(true);
        objCon.setIconifiable(true);
        jdpContenedor.add(objCon);
        if(val.EntryForms()){
            objCon.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
        
    }//GEN-LAST:event_mvisMousePressed

    private void mrepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mrepMousePressed
        WinReportes objRep = new WinReportes();
        val = new Validators();
        objRep.setResizable(true);
        objRep.setMaximizable(true);
        objRep.setIconifiable(true);
        jdpContenedor.add(objRep);
        if(val.EntryForms()){
            objRep.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
          
    }//GEN-LAST:event_mrepMousePressed

    private void JmitemempMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemempMousePressed
       WinEmpresa objEmpresa= new WinEmpresa();
       val = new Validators();
       objEmpresa.setResizable(true);
       objEmpresa.setMaximizable(true);
       objEmpresa.setIconifiable(true);
       //obj_Asis.setClosable(true);
       jdpContenedor.add(objEmpresa);
       if(val.EntryForms()){
            objEmpresa.setVisible(true);
       } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
       }
       
    }//GEN-LAST:event_JmitemempMousePressed

    private void JmitemRolesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemRolesMousePressed
        WinRoles objsucursal= new WinRoles();
        val = new Validators();
        objsucursal.setResizable(true);
        objsucursal.setMaximizable(true);
        objsucursal.setIconifiable(true);
        WinMdi.jdpContenedor.add(objsucursal);
        if(val.EntryForms()){
            objsucursal.setVisible(true);
        } else {
           JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
        
    }//GEN-LAST:event_JmitemRolesMousePressed

    private void JmitemTipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemTipoMousePressed
        WinTipo_Empleado objtipo= new WinTipo_Empleado();
        val = new Validators();
        objtipo.setResizable(true);
        objtipo.setMaximizable(true);
        objtipo.setIconifiable(true);
        WinMdi.jdpContenedor.add(objtipo);

        objtipo.setVisible(true);
    }//GEN-LAST:event_JmitemTipoMousePressed

    private void JmitemDisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemDisMousePressed
        WinArea objUsu= new WinArea();
        val = new Validators();
        objUsu.setResizable(true);
        objUsu.setMaximizable(true);
        objUsu.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objUsu);
        if(val.EntryForms()){
            objUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }

    }//GEN-LAST:event_JmitemDisMousePressed

    private void JmitemUsuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemUsuMousePressed
        WinUsuario objUsu= new WinUsuario();
        val = new Validators();
        objUsu.setResizable(true);
        objUsu.setMaximizable(true);
        objUsu.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objUsu);
        if(val.EntryForms()){
            objUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        } 
    }//GEN-LAST:event_JmitemUsuMousePressed


    private void mempMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mempMousePressed
        WinEmpleado objEmp= new WinEmpleado();
        val = new Validators();
        objEmp.setResizable(true);
        objEmp.setMaximizable(true);
        objEmp.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objEmp);
        if(val.EntryForms()){
            objEmp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_mempMousePressed

    private void JmitemCiudadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemCiudadMousePressed
        WinCiudad objUsu= new WinCiudad();
        val = new Validators();
        objUsu.setResizable(true);
        objUsu.setMaximizable(true);
        objUsu.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objUsu);
        if(val.EntryForms()){
            objUsu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_JmitemCiudadMousePressed

    private void JmitemtpmonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemtpmonMousePressed
        WinTipo_moneda objmon= new WinTipo_moneda();
        val = new Validators();
        objmon.setResizable(true);
        objmon.setMaximizable(true);
        objmon.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objmon);
        if(val.EntryForms()){
            objmon.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_JmitemtpmonMousePressed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        WinTipo_Horario objtiphor= new WinTipo_Horario();
        val = new Validators();
        objtiphor.setResizable(true);
        objtiphor.setMaximizable(true);
        objtiphor.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objtiphor);
        if(val.EntryForms()){
            objtiphor.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_jMenuItem3MousePressed

    private void jmItemModulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmItemModulosMousePressed
        WinModulos objmod= new WinModulos();
        val = new Validators();
        objmod.setResizable(true);
        objmod.setMaximizable(true);
        objmod.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objmod);
        if(val.EntryForms()){
            objmod.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_jmItemModulosMousePressed


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
    private javax.swing.JMenuItem JmiBackup;
    private javax.swing.JMenuItem JmitemArea;
    private javax.swing.JMenuItem JmitemCiudad;
    private javax.swing.JMenuItem JmitemDis;
    private javax.swing.JMenuItem JmitemRoles;
    private javax.swing.JMenuItem JmitemTipo;
    private javax.swing.JMenuItem JmitemUsu;
    private javax.swing.JMenuItem Jmitememp;
    private javax.swing.JMenuItem Jmitemhelp;
    private javax.swing.JMenuItem Jmitemtpmon;
    private javax.swing.JMenu SubmenuCrit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    public static javax.swing.JDesktopPane jdpContenedor;
    private javax.swing.JMenuItem jmItemModulos;
    private javax.swing.JMenu masi;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu mdis;
    private javax.swing.JMenu memp;
    private javax.swing.JMenu mhor;
    private javax.swing.JMenu mjus;
    private javax.swing.JMenu mrep;
    private javax.swing.JMenu mvis;
    // End of variables declaration//GEN-END:variables
}
