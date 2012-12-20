
package Dao;


import Javabeans.Empleado;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoDAO extends ConexionBd{
    
    ResultSet rs = null;
    Statement s = null;
    private Query qs;
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
        _error = "Dao_EmpleadoDao_";
        filter = new String[0][0];
        campos = new String[4];
        campos[0]="idemp";
        campos[1]="nombres";
        campos[2]="apellidos";
        campos[3]="idcar";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            
            datos = qs.getAll(campos,_table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error+"getTableAll: "+e);
        }
    
    }
    /* 
     * Validacion de ingreso de usuarios al sistema
     */
    public boolean userAuth(String user, String pas){
        boolean result;
        try{
            getConexion();
           
            s = conexion.createStatement();
            String qs = "select * from usuario "
                    + "where username='"+user+"' "
                    + "and password='"+pas+"'";

            rs = s.executeQuery(qs);
            result = rs.next();
            
            closeConexion();
            rs.close();
            
            return result;

        }
        catch(Exception e){
            System.out.println("UserDAO_Auth: "+e);
            return false;
        }
    }     
    /*
     * Registro de usuarios
     */
    public int saveEmpleado(int idemp,String nombres, String apellidos, String dni, String telefono, int idare, int idtip, int idest, int idcar, int idempr,int idsuc){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String now = hp.getDateNow();
            objEmpl = new Empleado( idemp,  nombres, apellidos, dni,  telefono, now, 1,now, now, idare, idtip, idest,  idcar,  idempr,idsuc);
            //Iniciando consulta y asignando valores
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
            pt.setInt(13, objEmpl.getIdemp());
            pt.setInt(14, objEmpl.getIdsuc());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            System.out.println("---->"+i);
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"save: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de Usuario
     */
    public int updateEmpleado(int idemp,String nombres, String apellidos, String dni, String telefono, int idare, int idtip, int idest, int idcar, int idempr,int idsuc){
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
            String Table = "Empleado";
            
            objEmpl.setIdemp(idemp);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmpl.getIdemp());
            i= pt.executeUpdate();
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
            for(int i=0;i<campos.length;i++){
                System.out.println(campos[i]);
            }
            objEmpl.setNombres(campos[2]);
            objEmpl.setApellidos(campos[3]);
            objEmpl.setDni(campos[4]);
            objEmpl.setTelefono(campos[5]);
            objEmpl.setRetiro(campos[6]);
            objEmpl.setHuella(Integer.parseInt(campos[7]));
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
    
}
