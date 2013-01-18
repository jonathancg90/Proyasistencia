
package Dao;

import Javabeans.Area;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserDAO extends ConexionBd{

    ResultSet rs = null;
    Statement s = null;
    private Query qs;
    private Usuario objUsu;
    private Validators objVal;
    private Helpers hp;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _error;
    private String _table;
    private String abc1 = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQ123456789";

    PreparedStatement  pt = null;
    /*
    * Carga de datos
    */
    public UserDAO(){
        _table = "usuario";
        _error = "UserDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idusu";
        campos[1]="username";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            Object [] fila = new Object[2];
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            fila[0] ="< "+qs.getcount("usuario")+" >";
            fila[1] = "total de registros";
            String Table = _table;
            datos = qs.getAll(this.campos,Table,filter);
            datos.addRow(fila);
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
                    + "and pass='"+pas+"'";

            rs = s.executeQuery(qs);
            result = rs.next();
            
            closeConexion();
            rs.close();
            
            return result;

        }
        catch(Exception e){
            System.out.println(_error+"userAuth: "+e);
            return false;
        }
    }     
    /*
     * Registro de usuarios
     */
    public int saveUsuario(String username, String password,int idemp,
            boolean estado,int rol, String correo){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = _table;
            String now = hp.getDateNow();
            
            objUsu = new Usuario(0,username,password,idemp,now,now,estado,rol,correo);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objUsu.getIdemp());
            pt.setString(2,objUsu.getUsername());
            pt.setString(3,objUsu.getPassword());
            pt.setDate(4,date.valueOf(objUsu.getCreated()));
            pt.setDate(5,date.valueOf(objUsu.getModified()));
            pt.setBoolean(6, objUsu.isEstado());
            pt.setInt(7, objUsu.getRol());
            pt.setString(8, objUsu.getCorreo());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"saveUsuario: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de Usuario
     */
    public int updateUsuario(int id,String username, String password, int emp,
            boolean estado,int rol, String correo){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = _table;
            String now = hp.getDateNow();
            
            objUsu = new Usuario(id,username,password,emp,now,now,estado,rol,correo);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
           
            pt.setInt(1,objUsu.getIdemp());
            pt.setString(2,objUsu.getUsername());
            pt.setString(3,objUsu.getPassword());
            pt.setDate(4,date.valueOf(objUsu.getModified()));
            pt.setBoolean(5, objUsu.isEstado());
            pt.setInt(6, objUsu.getRol());
            pt.setString(7, objUsu.getCorreo());
            pt.setInt(8, objUsu.getIdusu());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"updateUsuario: "+e);
            return i;
        }
    }
    /*
     * Eliminar 
     */
    public int deleteUsuario(int idusu){
       int i=0;
        try{
            //Preparando
            getConexion();
            objUsu = new Usuario();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            
            objUsu.setIdusu(idusu);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objUsu.getIdusu());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error+"deleteUsuario: "+e);
            return i;
        }
    }
     /*
     * Filtros de busqueda
     */
    public int find(String state,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(state)){
                filter = new String[1][2];
                filter[0][0] = "equ_estado";
                filter[0][1] = state; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
     /*
     * Cargar valores de busqueda al modelo 
     */
    public Usuario getValues(int idusu){
       objUsu =  new Usuario();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[8];
            campos = qs.getRecords(_table,idusu);
            objUsu.setIdemp(Integer.parseInt(campos[2]));
            objUsu.setUsername(campos[3]);
            objUsu.setPassword(campos[4]);
            objUsu.setCreated(campos[5]);
            objUsu.setModified(campos[6]);
            objUsu.setEstado(objVal.StringToBoolean(campos[7]));
            objUsu.setRol(Integer.parseInt(campos[8]));
            System.out.println(campos[8]);
            objUsu.setCorreo(campos[9]);
            
            return objUsu;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objUsu;
        }
    }
    //función string encriptar
    public String encriptar(String info_a_encriptar) {
        String info_encriptada = "" ;
        //variable
        Boolean cambio = false;
        for (int i = 0; i < info_a_encriptar.length(); i++) {
            for (int j = 0; j < abc1.length(); j++) {
                if (info_a_encriptar.charAt(i) == abc1.charAt(j)) {
                    cambio = true;
                    if ((j == 24) || (j == 25) || (j == 26) || (j == 51)
                            || (j == 52) || (j == 53)) {
                        info_encriptada = info_encriptada + abc1.charAt(j - 24);
                    } else {
                        info_encriptada = info_encriptada + abc1.charAt(j + 3);
                    }
                    j = 53;
                }
            }
            if (!cambio) {
                info_encriptada = info_encriptada + info_a_encriptar.charAt(i);
            }
            cambio = false;
        }
        info_a_encriptar = info_encriptada;
        return info_a_encriptar;
    }

     //función string desencriptar
    public String desencriptar(String info_a_desencriptar) {
        String info_desencriptada = "";
        Boolean cambio = false;

        for (int i = 0; i < info_a_desencriptar.length(); i++) {
            for (int j = 0; j < abc1.length(); j++) {
                if (info_a_desencriptar.charAt(i) == abc1.charAt(j)) {
                    cambio = true;
                    if ((j == 0) || (j == 1) || (j == 2) || (j == 27) || (j == 28) || (j == 29)) {
                        info_desencriptada = info_desencriptada + abc1.charAt(j + 24);
                    } else {
                        info_desencriptada = info_desencriptada + abc1.charAt(j - 3);
                    }
                    j = 53;
                }
            }
            if (!cambio) {
                info_desencriptada = info_desencriptada + info_a_desencriptar.charAt(i);
            }
            cambio = false;
        }
        info_a_desencriptar = info_desencriptada;
        return info_a_desencriptar;
    }
    
    public boolean onlyuserAuth(String user){
        boolean result;
        try{
            getConexion();
           
            s = conexion.createStatement();
            String qs = "select * from usuario "
                    + "where username='"+user+"'";

            rs = s.executeQuery(qs);
            result = rs.next();
            
            closeConexion();
            rs.close();
            
            return result;

        }
        catch(Exception e){
            System.out.println(_error+"userAuth: "+e);
            return false;
        }
    }    
}