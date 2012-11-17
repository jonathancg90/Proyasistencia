
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import Javabeans.Cargo;
import Javabeans.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CargosDAO extends ConexionBd{

    private Query qs;
    private Cargo objCargo;
    private Helpers hp;
    private Validators objVal;
    private String filter[][] = new String[0][0];
    private String _table = "cargo";
    private String _error = "Dao_CargoDao_";
    
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String campos[] = new String[2];
            campos[0]="idcar";
            campos[1]="nombre";
            String Table = this._table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println(_error+"getTableAll: "+e);
        }
    
    }
    /*
     * Registro de areas
     */
    public int save(int idArea, String name){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objCargo = new Cargo(0,name,idArea,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objCargo.getIdare());
            pt.setString(2,objCargo.getName());
            pt.setDate(3,date.valueOf(objCargo.getCreated()));
            pt.setDate(4,date.valueOf(objCargo.getModified()));
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
     * Actualizacion de areas
     */
    public int update(int id, int idArea, String name){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objCargo = new Cargo(0,name,idArea,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(1,objCargo.getIdare());
            pt.setString(2,objCargo.getName());
            pt.setDate(3,date.valueOf(objCargo.getCreated()));
            pt.setDate(4,date.valueOf(objCargo.getModified()));
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
            objCargo = new Cargo();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objCargo.setIdcar(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objCargo.getIdcar());
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

}
    