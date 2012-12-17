/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Sucursal;
import Javabeans.Usuario;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class SucursalDao extends ConexionBd{
    
    private Query qs;
    private Sucursal objSucursal;
    private Helpers hp;
    private String filter[][];
    private int witdhcolum[];
    private Usuario objUsu;
    private Validators objVal;
    private String _table;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
    public SucursalDao(){
        _table = "sucursal";
        _error = "Dao_Sucursal_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idsuc";
        campos[1]="nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    
     public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs = new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = _table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
     
     /*
     * Registro de Empresas
     */
    public int save(String name, String direccion,int idciu, int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            String now = hp.getDateNow();
            
            objSucursal = new Sucursal(0,name,direccion,idciu,idempr);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objSucursal.getIdciu());
            pt.setString(2,objSucursal.getName());
            pt.setString(3,objSucursal.getDireccion());            
            pt.setInt(4,objSucursal.getIdempr());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "save: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de Empresa
     */
    public int update(int id, String name, String direccion,int idciu, int idempr){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            String now = hp.getDateNow();
            
            objSucursal = new Sucursal(id,name,direccion,idciu,idempr);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(1,objSucursal.getIdciu());
            pt.setString(2,objSucursal.getName());
            pt.setString(3,objSucursal.getDireccion());
            pt.setInt(4,objSucursal.getIdempr());
            pt.setInt(5,objSucursal.getIdsuc());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "update: "+e);
            return i;
        }
    }
    
    /*
     * Eliminar 
     */
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objSucursal = new Sucursal();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            
            objSucursal.setIdsuc(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objSucursal.getIdsuc());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "delete: "+e);
            return i;
        }
    }
    public int findName(String name,String id, JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[2][2];
                filter[0][0] = "nombre";
                filter[0][1] = name.toUpperCase();
                filter[1][0] = "int_idempr";
                filter[1][1] = id;
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "findName : "+e);
        }
        return i;
    }
    public int findId(String id,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[1][2];
                filter[0][0] = "int_idempr";
                filter[0][1] = id;
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
    
    /*
     * Cargar valores de busqueda al modelo 
     */
    public Sucursal getValues(int idusu){
       objVal = new Validators(); 
       objSucursal =  new Sucursal();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[4];
            campos = qs.getRecords(_table,idusu);
            objSucursal.setName(campos[3]);
            objSucursal.setDireccion(campos[4]);
            objSucursal.setIdciu(Integer.valueOf(campos[2]));
            objSucursal.setIdempr(Integer.valueOf(campos[5]));
            
            return objSucursal;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objSucursal;
        }
    }
}
