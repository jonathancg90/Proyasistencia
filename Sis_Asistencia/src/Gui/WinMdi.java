
package Gui;

import Utilitarios.Validators;
import Utilitarios.Data;
import javax.swing.*;

public class WinMdi extends javax.swing.JFrame {
    Validators val;
    Data data;
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
        jmItemModulos = new javax.swing.JMenuItem();
        JmitemJustificacion = new javax.swing.JMenuItem();
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

        JmitemTipo.setText("Tipo empleado(contrato)");
        JmitemTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemTipoMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemTipo);

        Jmitemtpmon.setText("Monedas");
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

        jMenuItem1.setText("Estado. Empleado");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        SubmenuCrit.add(jMenuItem1);

        jmItemModulos.setText("Modulos");
        jmItemModulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jmItemModulosMousePressed(evt);
            }
        });
        SubmenuCrit.add(jmItemModulos);

        JmitemJustificacion.setText("Tipo justificacion");
        JmitemJustificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemJustificacionMousePressed(evt);
            }
        });
        SubmenuCrit.add(JmitemJustificacion);

        mdis.add(SubmenuCrit);

        JmitemUsu.setText("Usuarios");
        JmitemUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JmitemUsuMousePressed(evt);
            }
        });
        mdis.add(JmitemUsu);

        JmitemDis.setText("Diseño");
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
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
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
       data= new Data();
       String titulo=data.G_TITULOS[0];
       WinArea objArea= new WinArea();
       val = new Validators();
    
       objArea.setTitle(titulo);
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
       
    }//GEN-LAST:event_masiMousePressed

    private void mjusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mjusMousePressed
        WinJustificacion objJus = new WinJustificacion();
        
        data= new Data();
        String titulo=data.G_TITULOS[22];
        val = new Validators();
        objJus.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[16];
        val = new Validators();
        objHor.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[15];
        val = new Validators();
        objCon.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[14];
        val = new Validators();
        objRep.setTitle(titulo);
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
       data= new Data();
       String titulo=data.G_TITULOS[1];
       val = new Validators();
       objEmpresa.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[4];
        val = new Validators();
        objsucursal.setTitle(titulo);
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
        WinTipoEmpleado objtipo= new WinTipoEmpleado();
        data= new Data();
        String titulo=data.G_TITULOS[2];
        val = new Validators();
        objtipo.setTitle(titulo);
        objtipo.setResizable(true);
        objtipo.setMaximizable(true);
        objtipo.setIconifiable(true);
        WinMdi.jdpContenedor.add(objtipo);

        objtipo.setVisible(true);
    }//GEN-LAST:event_JmitemTipoMousePressed

    private void JmitemUsuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemUsuMousePressed
        WinUsuario objUsu= new WinUsuario();
        data= new Data();
        String titulo=data.G_TITULOS[13];
        val = new Validators();
        objUsu.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[17];
        val = new Validators();
        objEmp.setTitle(titulo);
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
        data= new Data();
        String titulo=data.G_TITULOS[5];
        val = new Validators();
        objUsu.setTitle(titulo);
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
        WinTipomoneda objmon= new WinTipomoneda();
        data= new Data();
        String titulo=data.G_TITULOS[3];
        val = new Validators();
        objmon.setTitle(titulo);
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

    private void jmItemModulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmItemModulosMousePressed
        WinModulos objmod= new WinModulos();
        data= new Data();
        String titulo=data.G_TITULOS[7];
        val = new Validators();
        objmod.setTitle(titulo);
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


    private void JmitemJustificacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmitemJustificacionMousePressed
        WinTipoJustificacion objjus= new WinTipoJustificacion();
        data= new Data();
        String titulo=data.G_TITULOS[8];
        val = new Validators();
        objjus.setTitle(titulo);
        objjus.setResizable(true);
        objjus.setMaximizable(true);
        objjus.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objjus);
        if(val.EntryForms()){
            objjus.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
    }//GEN-LAST:event_JmitemJustificacionMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        WinEstadoEmpleado objest= new WinEstadoEmpleado();
        data= new Data();
        String titulo=data.G_TITULOS[6];
        val = new Validators();
        objest.setTitle(titulo);
        objest.setResizable(true);
        objest.setMaximizable(true);
        objest.setIconifiable(true);
        //obj_Asis.setClosable(true);
        jdpContenedor.add(objest);
        if(val.EntryForms()){
            objest.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Cierre la ventana abierta para abrir otra");
        }
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
    private javax.swing.JMenuItem JmiBackup;
    private javax.swing.JMenuItem JmitemArea;
    private javax.swing.JMenuItem JmitemCiudad;
    private javax.swing.JMenuItem JmitemDis;
    private javax.swing.JMenuItem JmitemJustificacion;
    private javax.swing.JMenuItem JmitemRoles;
    private javax.swing.JMenuItem JmitemTipo;
    private javax.swing.JMenuItem JmitemUsu;
    private javax.swing.JMenuItem Jmitememp;
    private javax.swing.JMenuItem Jmitemhelp;
    private javax.swing.JMenuItem Jmitemtpmon;
    private javax.swing.JMenu SubmenuCrit;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
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
