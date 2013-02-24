
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
import java.awt.Image;
import java.io.File;
import java.sql.Time;
import javax.swing.ImageIcon;
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
    private String TIPOREG[][]= new String[3][4];
    private String signal[][]= new String[3][4];
    
    public WinAsistencia() {
        initComponents();
        format=new SimpleDateFormat("dd-MM-yyyy");
        cboDia.setDateFormat(format);
        cboIni.setDateFormat(format);
        cboFin.setDateFormat(format);
        //Trabajo - entrada/salida *Cantidad de registros
        TIPOREG[1][0]="d.ingreso ";
        TIPOREG[1][1]="d.salida ";
        TIPOREG[1][3]="d.salida ";
        //Refrigerio
        TIPOREG[2][1]="d.ingreso ";
        TIPOREG[2][2]="d.salida ";
        
        
        signal[1][0]=" >= ";
        signal[1][1]=" <= ";
        signal[1][3]=" <= ";
        signal[2][1]=" <= ";
        signal[2][2]=" <= ";
        
        cargaForm();
    }
    
    public final void cargaForm(){
        try{

            qs=new Query();
            qs.loadChoice(cbotipo,"tipoempleado","nombre");
            qs.loadChoice(cboempr,"empresa","nombre");
            qs.loadChoice(CboEstado,"estadoemp","nombre");
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
        args[4] = ""+hp.getFormatDate(cboDia.getText());
        
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
        lblcant4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cboempr = new javax.swing.JComboBox();
        cbotipo = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        CboEstado = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblempleado = new javax.swing.JTable();
        lblcant = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        lblcant2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblcant1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblReg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboDia = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTiporeg = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        lblMod = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        BtnVer = new javax.swing.JButton();
        Sphour = new javax.swing.JSpinner();
        Spmin = new javax.swing.JSpinner();
        Cbotiempo = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAsistencia = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        lblcant3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mman = new javax.swing.JMenu();
        mitemupdate = new javax.swing.JMenuItem();
        mitemdelete = new javax.swing.JMenuItem();
        medit = new javax.swing.JMenu();
        mitemclear = new javax.swing.JMenuItem();
        ItemExportar = new javax.swing.JMenuItem();
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

        lblcant4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Total: ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(lblcant4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(lblApe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(lblidEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(lblApe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbuscarMouseClicked(evt);
            }
        });
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Tipo");

        jLabel15.setText("Empresa");

        cboempr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboemprActionPerformed(evt);
            }
        });

        jLabel24.setText("Nombres");

        jLabel25.setText("Apellidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cboempr, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(Txtnombre)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(46, 46, 46)
                        .addComponent(cbotipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar)
                    .addComponent(CboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cboempr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cbotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        lblcant.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Total: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblcant, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lista de empleados", jPanel4);

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

        btnDateSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/consulta.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnDateSearch)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblcant2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Total: ");

        jLabel14.setText("Total: ");

        lblcant1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14)
                .addGap(17, 17, 17)
                .addComponent(lblcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(54, 54, 54))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(lblcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Ver asistencias", jPanel7);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro"));

        jLabel4.setText("ID");

        lblReg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Dia");

        cboDia.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                cboDiaOnSelectionChange(evt);
            }
        });

        jLabel6.setText("Hora");

        jLabel7.setText("Tipo de Registro");

        jLabel8.setText("Modificado");

        lblMod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/registrar.png"))); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        BtnVer.setText("Ver");
        BtnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerActionPerformed(evt);
            }
        });

        Sphour.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        Spmin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        Cbotiempo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboTiporeg, 0, 128, Short.MAX_VALUE)
                                    .addComponent(lblMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegister))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(Sphour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Spmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cbotiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnVer)))
                        .addGap(66, 66, 66))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lblReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnVer))))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sphour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Spmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cbotiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboTiporeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lblMod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnRegister)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane5.setViewportView(tblAsistencia);

        jLabel18.setText("Total: ");

        lblcant3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(17, 17, 17)
                        .addComponent(lblcant3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(lblcant3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Registrar Asistencia", jPanel2);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 451, 490));

        mman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Archivo.png"))); // NOI18N
        mman.setText("Archivo");

        mitemupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/actualizar.png"))); // NOI18N
        mitemupdate.setText("Actualizar");
        mitemupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemupdateMousePressed(evt);
            }
        });
        mman.add(mitemupdate);

        mitemdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/eliminar.png"))); // NOI18N
        mitemdelete.setText("Eliminar");
        mitemdelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemdeleteMousePressed(evt);
            }
        });
        mman.add(mitemdelete);

        jMenuBar1.add(mman);

        medit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Editar.png"))); // NOI18N
        medit.setText("Editar");

        mitemclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mitemclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/limpiar.png"))); // NOI18N
        mitemclear.setText("Limpiar");
        mitemclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mitemclearMousePressed(evt);
            }
        });
        medit.add(mitemclear);

        ItemExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/exportar.png"))); // NOI18N
        ItemExportar.setText("Exportar");
        ItemExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemExportarMousePressed(evt);
            }
        });
        medit.add(ItemExportar);

        jMenuBar1.add(medit);

        mclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Utilitarios/Img/Cerrar.png"))); // NOI18N
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcloseMousePressed
        this.setVisible(false);
        Utilitarios.Config.OPENWINDOWS =0;
    }//GEN-LAST:event_mcloseMousePressed

    private void btnbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbuscarMouseClicked

       String tipo = qs.idChoice("tipoempleado","nombre",String.valueOf(cbotipo.getSelectedItem()));
       String empresa = qs.idChoice("empresa","nombre",String.valueOf(cboempr.getSelectedItem()));
       String Nombres = this.Txtnombre.getText().toUpperCase();
       String Apellidos = this.TxtApellido.getText().toUpperCase();
       String estado =  qs.idChoice("estadoemp","nombre",String.valueOf(CboEstado.getSelectedItem()));
       objEmpleado = new EmpleadoDAO();
       objEmpleado.findAsistencia(tipo, empresa, Nombres,Apellidos,estado, tblempleado, lblcant);

    }//GEN-LAST:event_btnbuscarMouseClicked

    private void cboemprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboemprActionPerformed

    }//GEN-LAST:event_cboemprActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void mitemregisterMousePressed(java.awt.event.MouseEvent evt) {                                           
    }                                           

    private void btnDateSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDateSearchMouseClicked
       
    }//GEN-LAST:event_btnDateSearchMouseClicked

    private void mitemclearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemclearMousePressed
        cleanBox();
    }//GEN-LAST:event_mitemclearMousePressed

    private void mitemdeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemdeleteMousePressed
    int i;
    objRegistro = new RegistroDAO();
    i= JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este registro?","Aviso",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
    if(i==0){
        int id = Integer.valueOf(lblReg.getText());

        i = objRegistro.delete(id,0);
        i = objRegistro.delete(id,1);
        if(i==0) {
            JOptionPane.showMessageDialog(null,"No se pudo eliminar el registro de asistencia");
        }
         else {
            String fecha=hp.getFormatDate(cboDia.getText());
            objRegistro.findRegFecha(lblidEmp.getText(), fecha, fecha, tblAsistencia, lblcant3);
            cleanBox();
        }
     }

    }//GEN-LAST:event_mitemdeleteMousePressed

    private void mitemupdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mitemupdateMousePressed
       /*if(!"".equals(lblidEmp.getText())){
        try{
        int id = Integer.parseInt(lblidEmp.getText());
        val = new Validators();    
        qs=new Query();
        hp=new Helpers();
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
                    objRegistro.findRegFecha(lblidEmp.getText(), fecha, fecha, tblAsistencia, lblcant3);
                        cleanBox();
                        JOptionPane.showMessageDialog(null,"Asistencia actualizada");
                    }
                
            
        
        } catch(Exception e){
            System.out.println("Evento registrar: "+e);
        } 
    } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
    }*/
    }//GEN-LAST:event_mitemupdateMousePressed

                                       

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
            else {
                Confirma = xls.ExportJtable(tblempleado, fichero, "Asistencia");
            }
                if (Confirma == true) {
                    JOptionPane.showMessageDialog(null, "El documento se grabo exitosamente","Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo grabar el documento", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                }
        }
    } catch (Exception e)
    {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la exportacion del documento","Error",JOptionPane.ERROR_MESSAGE);
        System.out.println(_error + "Exportar :"+e);
    }
    }//GEN-LAST:event_ItemExportarMousePressed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(!"".equals(lblidEmp.getText())){
            hp=new Helpers();
            String inicio=hp.getFormatDate(cboIni.getText());
            String fin=hp.getFormatDate(cboFin.getText());
            int id = Integer.parseInt(lblidEmp.getText() );
            objRegistro= new RegistroDAO();
            val=new Validators();
            if(val.validarFechas(inicio, fin)){
                //objRegistro.getTableFilter(tblFiltroFecha, inicio, fin,id);
                objRegistro=new RegistroDAO();
                objRegistro.findRegFecha(lblidEmp.getText(), inicio, fin, tblFiltroFecha, lblcant1);
            }
            else{
                JOptionPane.showMessageDialog(null,"Conflicto de fechas");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void tblAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAsistenciaMouseClicked
        hp=new Helpers();
        date = new Date();
        calendar= new GregorianCalendar();
        calendar2 = new GregorianCalendar();
        objRegistro= new RegistroDAO();
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
            } catch (Exception e){
                System.out.println("GUI_Asistencia"+e);
            }
        }
    }//GEN-LAST:event_tblAsistenciaMouseClicked

    private int get_tipo(int cant, String [] args) {
        int count = 0;
        args[2] = "1";
        count = Integer.parseInt(val.getHora("","",args));
        args[2] = "2";
        count = count + Integer.parseInt(val.getHora("","",args));
        if(count == 2) {
            if(cant == 0 || cant == 3) {
                return 1;//Trabajo
            }
            if(cant == 1 || cant == 2) {
                return 2;//Refrigerio
            }
            //Tiene trabajo y refrigerio
        } else if (count == 1) {
            return 1;//Solo tiene trabajo
        } 
        //Si arroja 0 no tiene horario
        return count;
        
        
    }
    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        if(!"".equals(lblidEmp.getText())){
            try{
                int id = Integer.parseInt(lblidEmp.getText());
                val = new Validators();

                hp=new Helpers();
                
                SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
                Calendar ingreso = hp.getCalendar(Sphour,Spmin,Cbotiempo);
                Time ing =  Time.valueOf(fhora.format(ingreso.getTime()));
                String fecha;
                //Validacion propia del evento
                if(asistenciaValidator(ing)){
                    Time ing_reg = ing;
                    fecha=hp.getFormatDate(cboDia.getText());
                    int tipohor = qs.loadGlobal(4, cboTiporeg, 0); // Saber q tipo de registro es(refrigferio o trabajo)*si retorna 0 su horario esta desactualizado
                    int cantidad = Integer.parseInt(lblcant3.getText());
                    String[] args = new String[4];
                    String dia = qs.getDayOfTheWeek(fecha);
                    args[0] = ""+id;
                    args[1] = dia;
                    args[3] = ""+fecha;
                    int tiporeg = get_tipo(cantidad, args);
                    if (tiporeg > 0) {
                        args[2] = ""+tiporeg;
                        String extra = "and " + TIPOREG[tiporeg][cantidad] + signal[tiporeg][cantidad] + " '" + ing_reg + "'";
                        int count = Integer.valueOf(val.getHora("",extra,args));
                        if (count > 0) {
                            ing_reg = Time.valueOf(val.getHora(TIPOREG[tiporeg][cantidad],"",args));
                        }
                        dt = new Data();
                        objRegistro = new RegistroDAO();

                        int i = objRegistro.save(tipohor, ing_reg, fecha, id,1);
                        int j = objRegistro.save(tipohor, ing ,fecha,id ,0);
                        if (i == 0 && j == 0) {
                            JOptionPane.showMessageDialog(null,"No se pudo grabar el detalle");
                        } else {
                            objRegistro= new RegistroDAO();
                            fecha = cboDia.getText();
                            objRegistro.findRegFecha(lblidEmp.getText(), fecha, fecha, tblAsistencia, lblcant3);
                            cleanBox();
                            JOptionPane.showMessageDialog(null,"Nueva asistencia registrado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Actualize el horario del empleado");
                    }
                }
            }
            catch(Exception e){
                System.out.println(_error + "Evento registrar: "+e);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder ingresar sus asistencia");
        }
    }//GEN-LAST:event_btnRegisterMousePressed

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
            objEmpHor.findId(idempleado, tblHorario, lblcant4);

            objRegistro=new RegistroDAO();
            String fecha = cboDia.getText();
            objRegistro.findRegFecha(lblidEmp.getText(), fecha, fecha, tblAsistencia, lblcant3);
            
            File archivo = new  File("src/imagenes/"+idempleado+".jpg");
             if(archivo.exists()){
                 String archivoimg = "src/imagenes/"+idempleado+".jpg";
                 ImageIcon imagenfoto = new ImageIcon(archivoimg);
                 
                 Image iamgendimen = imagenfoto.getImage();
                  Image newimg = iamgendimen.getScaledInstance(142,121,java.awt.Image.SCALE_SMOOTH);
                  ImageIcon newIcon = new ImageIcon(newimg);
                  lblFoto.setIcon(newIcon);
             }else{
                 System.out.println("no eres file");
           
            ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/imagenes/defecto.jpg"));
           Image iamgendimen = imagenFondo.getImage();
                  Image newimg = iamgendimen.getScaledInstance(142,121,java.awt.Image.SCALE_SMOOTH);
                  ImageIcon newIcon = new ImageIcon(newimg);
            lblFoto.setIcon(newIcon);
             }
        }
    }//GEN-LAST:event_tblempleadoMouseClicked

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void cboDiaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_cboDiaOnSelectionChange

    }//GEN-LAST:event_cboDiaOnSelectionChange

    private void BtnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerActionPerformed
        if(lblidEmp.getText()!="") {
            objRegistro= new RegistroDAO();
            String fecha = cboDia.getText();
            objRegistro.findRegFecha(lblidEmp.getText(), fecha, fecha, tblAsistencia, lblcant3);
            //objRegistro.findId(lblidEmp.getText(), tblAsistencia, lblcant3);
        } else {
            JOptionPane.showMessageDialog(null,"Seleccione un empleado para poder consultar");
        }

    }//GEN-LAST:event_BtnVerActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVer;
    private javax.swing.JComboBox CboEstado;
    private javax.swing.JComboBox Cbotiempo;
    private javax.swing.JMenuItem ItemExportar;
    private javax.swing.JSpinner Sphour;
    private javax.swing.JSpinner Spmin;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JButton btnDateSearch;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnbuscar;
    private datechooser.beans.DateChooserCombo cboDia;
    private datechooser.beans.DateChooserCombo cboFin;
    private datechooser.beans.DateChooserCombo cboIni;
    private javax.swing.JComboBox cboTiporeg;
    private javax.swing.JComboBox cboempr;
    private javax.swing.JComboBox cbotipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApe;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblMod;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReg;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblcant1;
    private javax.swing.JLabel lblcant2;
    private javax.swing.JLabel lblcant3;
    private javax.swing.JLabel lblcant4;
    private javax.swing.JLabel lblidEmp;
    private javax.swing.JMenu mclose;
    private javax.swing.JMenu medit;
    private javax.swing.JMenuItem mitemclear;
    private javax.swing.JMenuItem mitemdelete;
    private javax.swing.JMenuItem mitemupdate;
    private javax.swing.JMenu mman;
    private javax.swing.JTable tblAsistencia;
    private javax.swing.JTable tblFiltroFecha;
    private javax.swing.JTable tblHorario;
    private javax.swing.JTable tblempleado;
    // End of variables declaration//GEN-END:variables
}
