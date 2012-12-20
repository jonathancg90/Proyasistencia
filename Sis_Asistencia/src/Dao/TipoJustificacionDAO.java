
package Dao;

import Javabeans.TipoJustificacion;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoJustificacionDAO extends ConexionBd{
    
    private Query qs;
    private TipoJustificacion objjus;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private int witdhcolum[];
    private String _table;
    private Validators objVal;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
    public TipoJustificacionDAO(){
        _table = "tipjustificacion";
        _error = "Dao_JustificacionesDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idjus";
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
     * Registro de TipoJustificacion
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
            objjus = new TipoJustificacion(0,name,state,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objjus.getName());
            pt.setDate(2,date.valueOf(objjus.getCreated()));
            pt.setDate(3,date.valueOf(objjus.getModified()));
            pt.setBoolean(4,objjus.isState());
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
     * Actualizacion de los TipoJustificacion
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
            objjus = new TipoJustificacion(id,name,state,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            
            pt.setInt(4,objjus.getIdjus());
            pt.setDate(2,date.valueOf(objjus.getModified()));
            pt.setBoolean(3,objjus.isState());
            pt.setString(1,objjus.getName());
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
            objjus = new TipoJustificacion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objjus.setIdjus(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objjus.getIdjus());
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
     * Cargar valores de busqueda al justificaciones 
     */
    public TipoJustificacion getValues(int idjus){
       objVal = new Validators(); 
       objjus =  new TipoJustificacion();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[1];
            campos = qs.getRecords(this._table,idjus);
            objjus.setName(campos[2]);
            objjus.setModified(campos[4]);
            objjus.setState(Boolean.valueOf(campos[5]));
            
            return objjus;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objjus;
        }
    }
}
