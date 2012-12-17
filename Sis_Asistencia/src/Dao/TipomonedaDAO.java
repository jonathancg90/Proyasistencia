
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Tipomoneda;
import Javabeans.Usuario;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipomonedaDAO extends ConexionBd{
    
    private Query qs;
    private Tipomoneda objmoneda;
    private Helpers hp;
    private String filter[][];
    private Usuario objUsu;
    private int witdhcolum[];
    private String _table = "moneda";
    private Validators objVal;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
    public TipomonedaDAO(){
        _table = "moneda";
        _error = "Dao_Tipomoneda_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idmon";
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
     * Registro de Ciudad
     */
    public int save(String name,String simbol,boolean def){
       int i=0;
        try{
            //Preparando
            Date date = new Date(0000-00-00);
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            String now = hp.getDateNow();
            
            objmoneda = new Tipomoneda(0,name,simbol,def,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objmoneda.getNombre());
            pt.setString(2,objmoneda.getSimbol());
            pt.setBoolean(3,objmoneda.isPor_defecto());
            pt.setDate(4,date.valueOf(objmoneda.getCreated()));
            pt.setDate(5,date.valueOf(objmoneda.getModified()));
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
     * Actualizacion de los Ciudad
     */
    public int update(int id, String name,String simbol, boolean def){
       int i=0;
        try{           
            //Preparando
            getConexion();
            Date date = new Date(0000-00-00);
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            String now = hp.getDateNow();
            objmoneda = new Tipomoneda(id,name,simbol,def,now,now);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objmoneda.getNombre());
            pt.setString(2,objmoneda.getSimbol());
            pt.setBoolean(3,objmoneda.isPor_defecto());
            pt.setDate(4,date.valueOf(objmoneda.getCreated()));
            pt.setDate(5,date.valueOf(objmoneda.getModified()));
            pt.setInt(6,objmoneda.getIdtipmon());
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
            objmoneda = new Tipomoneda();
            hp = new Helpers();
            qs= new Query();
            String Table = _table;
            
            objmoneda.setIdtipmon(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objmoneda.getIdtipmon());
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
    public Tipomoneda getValues(int idtipmon){
       objVal = new Validators(); 
       objmoneda =  new Tipomoneda();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[1];
            campos = qs.getRecords(_table,idtipmon);
            objmoneda.setNombre(campos[2]);
            objmoneda.setSimbol(campos[3]);
            objmoneda.setPor_defecto(Boolean.parseBoolean(campos[4]));
            objmoneda.setModified(campos[5]);
            
            return objmoneda;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objmoneda;
        }
    }
}
