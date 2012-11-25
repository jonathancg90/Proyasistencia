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
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private Validators objVal;
    
    PreparedStatement  pt = null;
    
     public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs = new Query();            
            if (filter.length <= 0){
                filter = new String[0][0];
            } 
            String campos[] = new String[2];
            campos[0]="idsuc";
            campos[1]="nombre";
            String Table = "sucursal";
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_Sucursal: "+e);
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
            String Table = "sucursal";
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
            System.out.println("Dao_SucursalDAO_save: "+e);
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
            String Table = "sucursal";
            String now = hp.getDateNow();
            
            objSucursal = new Sucursal(0,name,direccion,idciu,idempr);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(3,objSucursal.getName());
            pt.setString(4,objSucursal.getDireccion());
            pt.setInt(2,objSucursal.getIdciu());
            pt.setInt(5,objSucursal.getIdempr());
            pt.setInt(1,objSucursal.getIdsuc());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_SucursalDAO: "+e);
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
            String Table = "sucursal";
            
            objSucursal.setIdsuc(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objSucursal.getIdsuc());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_SucursalDAO: "+e);
            return i;
        }
    }
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println("Dao_SucursalDAO_find : "+e);
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
            campos = qs.getRecords("sucursal",idusu);
            objSucursal.setName(campos[2]);
            objSucursal.setDireccion(campos[3]);
            objSucursal.setIdciu(Integer.valueOf(campos[1]));
            objSucursal.setIdempr(Integer.valueOf(campos[4]));
            
            return objSucursal;
        }
        catch(Exception e){
            System.out.println("Dao_SucursalDAO_delete: "+e);
            return objSucursal;
        }
    }
}