
package Gui;

import Appi.JExcel;
import Dao.EmpleadoDAO;
import Javabeans.Empleado;

import Dao.Empleado_has_horariosDAO;

import Dao.RegistroDAO;
import Javabeans.Registro;

import javax.swing.table.DefaultTableModel;

import Utilitarios.Query;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import Utilitarios.Helpers;
import Utilitarios.Validators;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import Utilitarios.Data;
import java.io.File;
import java.sql.Time;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WinAsistencia extends javax.swing.JInternalFrame {

    
    private Query qs;
    private EmpleadoDAO objEmpleado;
    private Empleado empleado;
    private Empleado_has_horariosDAO objEmpHor;
    private Registro registro;
    private RegistroDAO objRegistro;
    private DateFormat format;
    private Validators val;
    private Data dt;
    private Helpers hp;
    private Date date;
    private Date date2;
    private Calendar calendar;
    private GregorianCalendar calendar2;
    private JExcel xls;
    private String _error =  "Gui_WinAsistencia_";
    
    public WinAsistencia() {
        initComponents();
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboDia.setDateFormat(format);
        cboIni.setDateFormat(format);
        cboFin.setDateFormat(format);
        
        cargaForm();
    }
    
    public final void cargaForm(){
    
        try{
            qs=new Query();
            qs.loadChoice(cbotipo,"tipoempleado","nombre");
            qs.loadChoice(cboempr,"empresa","nombre");
            qs.setIdentify("idempr");
            qs.loadChoiceDefault(cbosuc,"sucursal","nombre",
                Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboempr.getSelectedItem())))
                );
            qs.loadGlobal(4, cboTiporeg, 1);
        }
        catch(Exception e){
            System.out.println("Gui_Asistencia"+ e);
        }
    }
    
    public void cleanBox(){
        Calendar rightNow = Calendar.getInstance();
        lblReg.setText("");
        lblMod.setText("");
        cboDia.setSelectedDate(rightNow);
    }
    
    private boolean asistenciaValidator(Time hra){
        boolean Validator= true;
        hp=new Helpers();
        val = new Validators();
        String[] args = new String[5];
        
        args[0] = "registro";
        args[1] = "idemp";
        args[2] = lblidEmp.getText();
        args[3] = "fecha";
        args[4] = "'"+hp.getFormatDate(cboDia.getText())+"'";
        
        if (Validator) {
            Validator = val.MaxRegistro(args, 4);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"Numero maximo de registros completos");
               return Validator;
            }
        }

        if (Validator) {
            int op = qs.loadGlobal(4, cboTiporeg, 0);
            Validator = val.validarRegistro(args, op, hra);
            if(!Validator){
               JOptionPane.showMessageDialog(null,"Mal uso del registro");
               return Validator;
            }
        }
        return Validator;
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApe = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblidEmp = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHorario = new javax.swing.JTable();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cboempr = new javax.swing.JComboBox();
        cbosuc = new javax.swing.JComboBox();
        cbotipo = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblempleado = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsistencia = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        cboDia = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TimIngreso = new com.lavantech.gui.comp.TimePanel();
        cboTiporeg = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFiltroFecha = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        cboIni = new datechooser.beans.DateChooserCombo();
        cboFin = new datechooser.beans.DateChooserCombo();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDateSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mman = new javax.swing.JMenu();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
        mver = new javax.swing.JMenu();
        mclose = new javax.swing.JMenu();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencias"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion"));

        jLabel1.setText("Nombres");

        jLabel2.setText("Apellidos");

        jLabel3.setText("DNI");

        lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblApe.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblDNI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Id");

        lblidEmp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Horario"));

        tblHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblHorario);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(lblApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(101, 101, 101))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(lblApe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnbuscar.setText("Buscar");
        btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarMouseClicked(evt);
            }
        });

        jLabel13.setText("Tipo");

        jLabel15.setText("Empresa");

        jLabel16.setText("Sucursal");

        cboempr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboemprActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Todo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbotipo, 0, 220, Short.MAX_VALUE)
                    .addComponent(cboempr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(115, 115, 115)
                        .addComponent(btnbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbosuc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 264, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cbosuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cboempr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1))
                    .addComponent(btnbuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 17, 850, 100));

        tblempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblempleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblempleado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de empleados", jPanel4);

        tblAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAsistenciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAsistencia);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de asistencia"));

        jLabel4.setText("Dia");

        jLabel5.setText("Hora");

        TimIngreso.setDisplayAnalog(false);
        TimIngreso.setSecDisplayed(false);

        jLabel6.setText("Tipo de registro");

        lblReg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("ID");

        jLabel8.setText("Modificado");

        lblMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegister.setText("ok");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(47, 47, 47)
                        .addComponent(lblMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(cboTiporeg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(46, 46, 46))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(28, 28, 28)
                                        .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cboTiporeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(TimIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnRegister)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Registrar asistencia", jPanel6);

        tblFiltroFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblFiltroFecha);

        jButton2.setText("Exportar");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Rango de busqueda"));

        jLabel9.setText("Fecha inicial");

        jLabel10.setText("Fecha final ");

        btnDateSearch.setText("Buscar");
        btnDateSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDateSearch)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnDateSearch)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver asistencias", jPanel7);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 451, 490));

        mman.setText("Mantenimiento");

        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mman.add(mitemupdate);

        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mman.add(mitemdelete);

        jMenuBar1.add(mman);

        medit.setText("Edit");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

        mver.setText("Ver asistencias");
        jMenuBar1.add(mver);

        mclose.setText("Cerrar");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void btnbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarMouseClicked
       if (jCheckBox1.isSelected()) {
           objEmpleado = new EmpleadoDAO();
           objEmpleado.getTableAll(tblempleado);
       } else {
           String tipo = String.valueOf(cbotipo.getSelectedIndex() + 1);
           String empresa = String.valueOf(cboempr.getSelectedIndex() + 1);
           String sucursal = String.valueOf(cbosuc.getSelectedIndex() + 1);
           objEmpleado = new EmpleadoDAO();
           objEmpleado.findAsistencia(tipo, empresa, sucursal, tblempleado);
        }
    }//GEN-LAST:event_btnbuscarMouseClicked

    private void cboemprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboemprActionPerformed
        qs = new Query();
        qs.setIdentify("idempr");
        qs.loadChoiceDefault(cbosuc,"sucursal","nombre",
                Integer.parseInt(qs.idChoice("empresa","nombre",String.valueOf(cboempr.getSelectedItem())))
                );
    }//GEN-LAST:event_cboemprActionPerformed

    private void tblempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblempleadoMouseClicked
        
        int fsel;
        fsel = this.tblempleado.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        } 
        else{
            empleado=new Empleado();
            DefaultTableModel m = new DefaultTableModel();
            m = (DefaultTableModel) this.tblempleado.getModel();
            String idempleado = String.valueOf(m.getValueAt(fsel, 0));
            lblidEmp.setText(idempleado);
            empleado=objEmpleado.getValues(Integer.parseInt(idempleado));
            lblNombre.setText(empleado.getNombres());
            lblApe.setText(empleado.getApellidos());
            lblDNI.setText(empleado.getDni());
            objEmpHor=new Empleado_has_horariosDAO();
            objEmpHor.findId(idempleado, tblHorario);
            
            objRegistro=new RegistroDAO();
            objRegistro.findId(lblidEmp.getText(), tblAsistencia);
        }
        
    }//GEN-LAST:event_tblempleadoMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
 
        hp=new Helpers();
        String inicio=hp.getFormatDate(cboIni.getText());
        String fin=hp.getFormatDate(cboFin.getText());
        int id = Integer.parseInt(lblidEmp.getText() );
        objRegistro= new RegistroDAO();
        val=new Validators();
        if(val.validarFechas(inicio, fin)){
            objRegistro.getTableFilter(tblFiltroFecha, inicio, fin,id);
            
        }
        else{
        JOptionPane.showMessageDialog(null,"Conflicto de fechas");
        }
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {                                           
         try{
        int id = Integer.parseInt(lblidEmp.getText());
        val = new Validators();
        
        hp=new Helpers();
        if(!"".equals(lblidEmp.getText())){
            
             //Validacion propia del evento
                
                dt = new Data();
                objRegistro= new RegistroDAO();

                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                
                Calendar ingreso = TimIngreso.getCalendar();
                
                Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
                String fecha=hp.getFormatDate(cboDia.getText());
                int tiporeg=qs.loadGlobal(4, cboTiporeg, 0);
                int i = objRegistro.save(tiporeg, ing, fecha, id,1);
                int j = objRegistro.save(tiporeg, ing ,fecha,id ,0);
                if (i == 0 && j == 0) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                }
                
                else {
                        objRegistro.findId(lblidEmp.getText(), tblAsistencia);
                        cleanBox();
                        JOptionPane.showMessageDialog(null,"Nueva asistencia registrado");
                    }
                
            
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
                }
        }
    catch(Exception e){
        System.out.println("Evento registrar: "+e);
    }
        
        
    }                                           

    private void btnDateSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDateSearchMouseClicked
       
    }//GEN-LAST:event_btnDateSearchMouseClicked

    private void tblAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsistenciaMouseClicked
        hp=new Helpers();
        date = new Date();
        calendar= new GregorianCalendar();
        calendar2 = new GregorianCalendar();
        int fsel;
        fsel=this.tblAsistencia.getSelectedRow();
        if (fsel == -1) {
            //No se ha seleccionado registo en Jtable
        } else {
            try {
                    registro = new Registro();
                    DefaultTableModel m = new DefaultTableModel();
                    m = (DefaultTableModel) this.tblAsistencia.getModel();
                    String idAsistencia = String.valueOf(m.getValueAt(fsel, 0));
                    lblReg.setText(idAsistencia);
                    registro=objRegistro.getValues(Integer.parseInt(idAsistencia));
                    date=format.parse(hp.getFormatDate(registro.getFecha()));
                    calendar.setTime(date);
                    cboDia.setSelectedDate(calendar);
                    lblMod.setText(hp.getFormatDate(registro.getModified()));
                    date2 = new Date(registro.getHora().getTime());
                    calendar2.setTime(date2);
                    TimIngreso.setCalendar(calendar2);
            } catch (Exception e){
                System.out.println("GUI_Asistencia"+e);
            }
        }
        
        
        
    }//GEN-LAST:event_tblAsistenciaMouseClicked

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed

        int i;
        i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(i==0){
            int id = Integer.valueOf(lblReg.getText());

            i = objRegistro.delete(id);
            if(i==0) {
                JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro de asistencia");
            }
            else {
                objRegistro.findId(lblidEmp.getText(), tblAsistencia);
                cleanBox();
            }
        }

    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
       try{
        int id = Integer.parseInt(lblidEmp.getText());
        val = new Validators();    
        qs=new Query();
        hp=new Helpers();
        if(!"".equals(lblidEmp.getText())){
            
             //Validacion propia del evento
                
                dt = new Data();
                objRegistro= new RegistroDAO();
                int idreg = Integer.parseInt(lblReg.getText());
                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                
                Calendar ingreso = TimIngreso.getCalendar();
                
                Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
                String fecha=hp.getFormatDate(cboDia.getText());
                int tiporeg=qs.loadGlobal(4, cboTiporeg, 0);
                int i = objRegistro.update(idreg, tiporeg, ing, fecha, id);
                
                if (i == 0 ) {
                    JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                }
                
                else {
                        objRegistro.findId(lblidEmp.getText(), tblAsistencia);
                        cleanBox();
                        JOptionPane.showMessageDialog(null,"Asistencia actualizada");
                    }
                
            
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
                }
        }
    catch(Exception e){
        System.out.println("Evento registrar: "+e);
    } 

    }//GEN-LAST:event_mitemupdateMousePressed

                                       

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
       try{
        int id = Integer.parseInt(lblidEmp.getText());
        val = new Validators();    
        qs=new Query();
        hp=new Helpers();
        if(!"".equals(lblidEmp.getText())){
            SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
            Calendar ingreso = TimIngreso.getCalendar();
            Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
             //Validacion propia del evento
                if(asistenciaValidator(ing)){
                    dt = new Data();
                    objRegistro= new RegistroDAO();
                    
                    String fecha=hp.getFormatDate(cboDia.getText());
                    int tiporeg=qs.loadGlobal(4, cboTiporeg, 0);
                    int i = objRegistro.save(tiporeg, ing, fecha, id,1);
                    int j = objRegistro.save(tiporeg, ing, fecha, id,0);
                    if (i == 0 && j == 0 ) {
                        JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                    }
                    else {
                            objRegistro.findId(lblidEmp.getText(), tblAsistencia);
                            cleanBox();
                        }
            }   
                
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
                }
        }
    catch(Exception e){
        System.out.println("Evento registrar: "+e);
    } 
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void ItemExportarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemExportarMousePressed
  try {
        JFileChooser Obj=new JFileChooser();
        xls = new JExcel();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xls", "xls","xlsx");
        Obj.setFileFilter(filter);
        Obj.setDialogTitle("Guardar reporte");
        int seleccion=Obj.showSaveDialog(tblempleado);
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
                    Confirma=xls.ExportJtable(tblempleado, fichero, "Asistencia");
                }
            } 
            else{
                Confirma=xls.ExportJtable(tblempleado, fichero, "Asistencia");
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
    private com.lavantech.gui.comp.TimePanel TimIngreso;
    private javax.swing.JButton btnDateSearch;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnbuscar;
    private datechooser.beans.DateChooserCombo cboDia;
    private datechooser.beans.DateChooserCombo cboFin;
    private datechooser.beans.DateChooserCombo cboIni;
    private javax.swing.JComboBox cboTiporeg;
    private javax.swing.JComboBox cboempr;
    private javax.swing.JComboBox cbosuc;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMod;
    private javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblidEmp;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JMenu mman;
    private javax.swing.JMenu mver;
    private javax.swing.JTable tblAsistencia;
    private javax.swing.JTable tblFiltroFecha;
    private javax.swing.JTable tblHorario;
    private javax.swing.JTable tblempleado;
    // End of variables declaration//GEN-END:variables
}
