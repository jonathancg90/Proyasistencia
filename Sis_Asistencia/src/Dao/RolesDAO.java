
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Roles;
import Javabeans.Usuario;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RolesDAO extends ConexionBd{
    private Query qs;
    private Roles objRoles;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
        private String _table = "roles";
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
            campos[0]="idrol";
            campos[1]="nombre";
            String Table = this._table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_Roles: "+e);
        }
    
    }
    
    /*
     * Registro de Roles
     */
    public int save(String name){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "roles";
            objRoles = new Roles(0,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objRoles.getName());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_RolesDAO_save: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de los Roles
     */
    public int update(int id, String name){
       int i=0;
        try{           
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "roles";
            objRoles = new Roles(id,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(2,objRoles.getIdrol());           
            pt.setString(1,objRoles.getName());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_RolesDAO: "+e);
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
            objRoles = new Roles();
            hp = new Helpers();
            qs= new Query();
            String Table = "roles";
            
            objRoles.setIdrol(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objRoles.getIdrol());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_RolesDAO: "+e);
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
            System.out.println("Dao_RolesDAO_find : "+e);
        }
        return i;
    }
    
    /*
     * Cargar valores de busqueda al modelo 
     */
    public Roles getValues(int idrol){
       objVal = new Validators(); 
       objRoles =  new Roles();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[1];
            campos = qs.getRecords("roles",idrol);
            objRoles.setName(campos[2]);
            
            return objRoles;
        }
        catch(Exception e){
            System.out.println("Dao_RolesDAO_delete: "+e);
            return objRoles;
        }
    }

}
