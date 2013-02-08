
package Dao;


import Javabeans.Empleado;
import Javabeans.Empresa;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoDAO extends ConexionBd{
    
    ResultSet rs = null;
    Statement s = null;
    private Query qs;
    private Empresa objEmpr;
    private Empleado objEmpl;
    private Helpers hp;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    PreparedStatement  pt = null;
    Validators objVal;
    /*
     * Middleware mostrar nombres de las areas
     */
     public EmpleadoDAO(){
        _table = "Empleado";
        _error = "Dao_EmpleadoDao";
        filter = new String[0][0];
        campos = new String[4];
        campos[0]="idemp";
        campos[1]="nombres";
        campos[2]="apellidos";
        campos[3]="idcar/cargo/nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }

    public void getTableAll(JTable tblDatos, JLabel lblcant){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length == 0){
                filter = new String[0][0];
            }
            datos = qs.getAll(campos,_table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e) {
            System.out.println(_error+"getTableAll: "+e);
        }
    
    }
    /*
     * Registro de usuarios
     */
    public int saveEmpleado(int idemp,String nombres, String apellidos, String dni, String telefono, int idare, int idtip, int idest, int idcar, int idempr,int idsuc){
       int i=0;
        try {
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String now = hp.getDateNow();
            //Grabar datos del empleado
            objEmpl = new Empleado( idemp,  nombres, apellidos, dni,  telefono,
                    now, 1,now, now, idare, idtip, idest,  idcar,  idempr,idsuc);
            pt = qs.sqlRegister(_table);
           
            pt.setString(1,objEmpl.getNombres());
            pt.setString(2,objEmpl.getApellidos());
            pt.setString(3, objEmpl.getDni());
            pt.setString(4, objEmpl.getTelefono());
            pt.setDate(5,Date.valueOf(objEmpl.getRetiro()));
            pt.setNull(6,java.sql.Types.VARBINARY);
            pt.setDate(7,date.valueOf(objEmpl.getCreated()));
            pt.setDate(8,date.valueOf(objEmpl.getModified()));
            pt.setInt(9, objEmpl.getIdare());
            pt.setInt(10, objEmpl.getIdtip());
            pt.setInt(11, objEmpl.getIdest());
            pt.setInt(12, objEmpl.getIdcar());
            pt.setInt(13, objEmpl.getIdempr());
            pt.setInt(14, objEmpl.getIdsuc());
            
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            if(i>0){
            //Actualizar cantidad de empleados por empresa
                i= UpdateEmpresa(objEmpl.getIdempr());
            }
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"save: "+e);
            return i;
        }
    }
    public int UpdateEmpresa(int empresa){
        int i=0;
        try {
            //Buscamos el id de la empresa a partir de su nombre
            if(empresa<0) {
                empresa = empresa * -1;
                qs.setIdentify("idempr");
                empresa = Integer.parseInt(qs.idChoice(_table,"idemp", ""+empresa));
            }
            objEmpr = new Empresa();
            String args[] = new String[3];
            args[0]="empleado";
            args[1]="idempr";
            args[2]=""+empresa;
            objEmpr.setTrabajadores(qs.getCountRegister(args));
            String query = "update empresa set trabajadores = ? where idempr = ?";
            pt = conexion.prepareStatement(query);
            System.out.println("3: pt");
            pt.setInt(1, objEmpr.getTrabajadores());
            pt.setInt(2, empresa);
            i= pt.executeUpdate();
            System.out.println("4");
            pt.close();
        } catch(Exception e) {
            System.out.println(_error + "UpdateEmpresa: "+e);
        }
        return i;
    }
    /*
     * Actualizacion de Empleado
     */
    public int updateEmpleado(int idemp,String nombres, String apellidos,
            String dni, String telefono, int idare, int idtip, int idest,
            int idcar, int idempr,int idsuc){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String now = hp.getDateNow();
            
            objEmpl = new Empleado( idemp,  nombres, apellidos, dni,  
                    telefono, now, 1,now, now, idare, idtip, idest,  
                    idcar,  idempr,idsuc);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(_table);
            
            pt.setString(1,objEmpl.getNombres());
            pt.setString(2,objEmpl.getApellidos());
            pt.setString(3, objEmpl.getDni());
            pt.setString(4, objEmpl.getTelefono());
            pt.setDate(5,date.valueOf(objEmpl.getRetiro()));
            pt.setNull(6,java.sql.Types.VARBINARY);
            pt.setDate(7,date.valueOf(objEmpl.getModified()));
            pt.setInt(8, objEmpl.getIdare());
            pt.setInt(9, objEmpl.getIdtip());
            pt.setInt(10, objEmpl.getIdest());
            pt.setInt(11, objEmpl.getIdcar());
            pt.setInt(12, objEmpl.getIdempr());
            pt.setInt(13, objEmpl.getIdsuc());
            pt.setInt(14, objEmpl.getIdemp());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            if(i>0){
            //Actualizar cantidad de empleados por empresa
                i= UpdateEmpresa(objEmpl.getIdempr());
            }
            closeConexion();
            return i;
        }
         catch(Exception e){
            System.out.println(_error+"update: "+e);
            return i;
        }
    }
    /*
     * Eliminar 
     */
    public int deleteEmpleado(int idemp){
       int i=0;
        try{
            //Preparando
            getConexion();
            objEmpl = new Empleado();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            
            objEmpl.setIdemp(idemp);
            qs.setIdentify("idempr");
            objEmpl.setIdempr(Integer.parseInt(qs.idChoice(_table,"idemp", ""+idemp)));
            
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmpl.getIdemp());
            i= pt.executeUpdate();
            if(i>0){
            //Actualizar cantidad de empleados por empresa
                i= UpdateEmpresa(objEmpl.getIdempr());
            }
            pt.close();
            closeConexion();
            return i;
            }
        catch(Exception e){
            System.out.println(_error+"delete: "+e);
            return i;
        }
    }
    /*
     * Filtros de busqueda
     */
    public int find(String idareaactivo,JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(idareaactivo)){
                filter = new String[1][2];
                filter[0][0] = "equ_idare";
                filter[0][1] = idareaactivo; 
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
        }
        return i;
    }
    /*
     * Cargar valores de busqueda al modelo 
     */
    public Empleado getValues(int idemp){
       objEmpl =  new Empleado();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[16];
            campos = qs.getRecords("Empleado",idemp);
            
            objEmpl.setNombres(campos[2]);
            objEmpl.setApellidos(campos[3]);
            objEmpl.setDni(campos[4]);
            objEmpl.setTelefono(campos[5]);
            objEmpl.setRetiro(campos[6]);
            objEmpl.setCreated(campos[8]);
            objEmpl.setModified(campos[9]);
            objEmpl.setIdare(Integer.parseInt(campos[10]));
            objEmpl.setIdtip(Integer.parseInt(campos[11]));
            objEmpl.setIdest(Integer.parseInt(campos[12]));
            objEmpl.setIdcar(Integer.parseInt(campos[13]));
            objEmpl.setIdempr(Integer.parseInt(campos[14]));
            objEmpl.setIdsuc(Integer.parseInt(campos[15]));
            
            return objEmpl;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objEmpl;
        }
    }
    /*
     * Filtros de busqueda
     */
    public int findAll(String idare,String idest, String apellido, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(apellido)){
                filter = new String[3][3];
                filter[0][0] = "equ_idare";
                filter[0][1] = idare;
                filter[1][0] = "int_idest";
                filter[1][1] = idest; 
                filter[2][0] = "apellidos";
                filter[2][1] = apellido.toUpperCase(); 
            }
            else {
                findState(idare, idest, tblDatos, lblcant);
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findAll: "+e);
        }
        return i;
    }
    public int findState(String idare,String idest, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(idare)){
                filter = new String[2][2];
                filter[0][0] = "equ_idare";
                filter[0][1] = idare; 
                filter[1][0] = "int_idest";
                filter[1][1] = idest; 
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findState: "+e);
        }
        return i;
    }
    public int findAsistencia(String tipo,String empresa,String Nombres,
            String Apellidos,String estado, JTable tblDatos, JLabel lblcant){
        int i=0;
        try {
            if(!"".equals(Nombres) && "".equals(Apellidos)){
                filter = new String[2][2];
                filter[0][0] = "nombres";
                filter[0][1] = Nombres;
                filter[1][0] = "equ_idest";
                filter[1][1] = estado;
            }
            else if(!"".equals(Apellidos) && "".equals(Nombres)){
                filter = new String[2][2];
                filter[0][0] = "apellidos";
                filter[0][1] = Apellidos;
                filter[1][0] = "equ_idest";
                filter[1][1] = estado;
            }
            else if(!"".equals(Nombres) && !"".equals(Apellidos)){
                filter = new String[3][2];
                filter[0][0] = "nombres";
                filter[0][1] = Nombres;
                filter[1][0] = "apellidos";
                filter[1][1] = Apellidos;
                filter[2][0] = "equ_idest";
                filter[2][1] = estado;
            }
            else if("".equals(Nombres) && "".equals(Apellidos)){
                filter = new String[3][2];
                filter[0][0] = "equ_idtip";
                filter[0][1] =  tipo;
                filter[1][0] = "equ_idempr";
                filter[1][1] = empresa;
                filter[2][0] = "equ_idest";
                filter[2][1] = estado;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findAsistencia: "+e);
        }
        
        
        
        return i;
    }
  
}
