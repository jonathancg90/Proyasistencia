
package Dao;

import Javabeans.Modulos;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
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
    
    public void getTableAll(JTable tblDatos, JLabel lblcant){
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
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    
    /*
     * Registro de modulos
     */
    public int save(String name,boolean state){
       int i=0;
        try{
            //Preparando
            Date date = new Date(0000-00-00);
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String now = hp.getDateNow();
            String Table = this._table;
            objmod = new Modulos(0,name,state,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objmod.getName());
            pt.setDate(2,date.valueOf(objmod.getCreated()));
            pt.setDate(3,date.valueOf(objmod.getModified()));
            pt.setBoolean(4,objmod.isState());
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
     * Actualizacion de los modulos
     */
    public int update(int id, String name, boolean state){
       int i=0;
        try{           
            //Preparando
            getConexion();
            Date date = new Date(0000-00-00);
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objmod = new Modulos(id,name,state,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            
            pt.setInt(4,objmod.getIdmod());
            pt.setDate(2,date.valueOf(objmod.getModified()));
            pt.setBoolean(3,objmod.isState());
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
    public int find(String name,JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name.toUpperCase(); 
            }
            getTableAll(tblDatos, lblcant);
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
            objmod.setModified(campos[4]);
            objmod.setState(Boolean.valueOf(campos[5]));
            
            return objmod;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objmod;
        }
    }
}
