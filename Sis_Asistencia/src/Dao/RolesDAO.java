
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Roles;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RolesDAO extends ConexionBd{
    private Query qs;
    private Roles objRoles;
    private Helpers hp;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    private Validators objVal;
    
    public RolesDAO(){
        _table = "roles";
        _error = "Dao_Roles_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idrol";
        campos[1]="nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    
    PreparedStatement  pt = null;
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            Object [] fila = new Object[2];
            qs = new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            fila[0] = "< " + qs.getcount("roles") + " >";
            fila[1] = "total de registros";
            String Table = _table;
            datos = qs.getAll(campos,Table,filter);
            datos.addRow(fila);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e)
        {
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    
    /*
     * Registro de Roles
     */
    public int save(String name){
       int i=0;
        try{
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            objRoles = new Roles(0,name);
            pt = qs.sqlRegister(Table);
            pt.setString(1,objRoles.getName());
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
     * Actualizacion de los Roles
     */
    public int update(int id, String name){
       int i=0;
        try{           
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            objRoles = new Roles(id,name);
            pt = qs.sqlUpdate(Table);
            pt.setInt(2,objRoles.getIdrol());           
            pt.setString(1,objRoles.getName());
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
            objRoles = new Roles();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            
            objRoles.setIdrol(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objRoles.getIdrol());
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
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name.toUpperCase(); 
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
    public Roles getValues(int idrol){
       objVal = new Validators(); 
       objRoles =  new Roles();
       try{           
            qs= new Query();
            String campos[] = new String[1];
            campos = qs.getRecords(_table,idrol);
            objRoles.setName(campos[2]);
            
            return objRoles;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objRoles;
        }
    }

}
