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
    
    PreparedStatement  pt = null;
    
     public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs = new Query();            
            if (filter.length <= 0){
                filter = new String[0][0];
            } 
            String campos[] = new String[2];
            campos[0]="idare";
            campos[1]="name";
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
            pt.setString(1,objSucursal.getName());
            pt.setString(2,objSucursal.getDireccion());
            pt.setInt(3,objSucursal.getIdciu());
            pt.setInt(4,objSucursal.getIdempr());
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
            pt.setString(1,objSucursal.getName());
            pt.setString(2,objSucursal.getDireccion());
            pt.setInt(3,objSucursal.getIdciu());
            pt.setInt(4,objSucursal.getIdempr());
            pt.setInt(5,objSucursal.getIdsuc());
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
                filter[0][0] = "name";
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
    public int getValues(int idusu){
       int i=0;
        try{
            objSucursal =  new Sucursal();
            qs= new Query();
            //Preparando
            String campos[] = new String[4];
            campos = qs.getRecords("area",idusu);
            objSucursal.setName(campos[1]);
            objSucursal.setDireccion(campos[2]);
            objSucursal.setIdciu(Integer.valueOf(campos[3]));
            objSucursal.setIdempr(Integer.valueOf(campos[4]));
            i=1;
            
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_SucursalDAO_delete: "+e);
            return i;
        }
    }
}
