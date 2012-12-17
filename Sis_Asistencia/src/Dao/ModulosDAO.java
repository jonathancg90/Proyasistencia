
package Dao;

import Javabeans.Modulos;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ModulosDAO extends ConexionBd{
    
    private Query qs;
    private Modulos objmod;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private int witdhcolum[];
    private String _table;
    private Validators objVal;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
    public ModulosDAO(){
        _table = "modulos";
        _error = "Dao_ModulosDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idmod";
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
            String Table = this._table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    
    /*
     * Registro de modulos
     */
    public int save(String name){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            objmod = new Modulos(0,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objmod.getName());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println(_error + "_save: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de los modulos
     */
    public int update(int id, String name){
       int i=0;
        try{           
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            objmod = new Modulos(id,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(2,objmod.getIdmod());           
            pt.setString(1,objmod.getName());
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
            objmod = new Modulos();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objmod.setIdmod(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objmod.getIdmod());
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
    public Modulos getValues(int idmod){
       objVal = new Validators(); 
       objmod =  new Modulos();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[1];
            campos = qs.getRecords(this._table,idmod);
            objmod.setName(campos[2]);
            
            return objmod;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objmod;
        }
    }
}
