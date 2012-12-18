
package Dao;


import Javabeans.Horarios;
import Utilitarios.Helpers;
import Utilitarios.ConexionBd;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class HorariosDAO extends ConexionBd{
    
    
    private Query qs;
    private Horarios objHor;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    
     public HorariosDAO(){
        _table = "horarios";
        _error = "Dao_HorariosDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idhor";
        campos[1]="nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
      //==========================================================================        
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(this.campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    /*
     * Registro de areas
     */
    public int save(String name, boolean state,int tipo,int iddet_hor){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objHor = new Horarios(0,name,tipo,state,now,now,iddet_hor);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objHor.getNombre());
            pt.setInt(2,objHor.getTipo());
            pt.setBoolean(3,objHor.isEstado());
            pt.setDate(4,date.valueOf(objHor.getCreated()));
            pt.setDate(5,date.valueOf(objHor.getModified()));
            pt.setInt(6,objHor.getIddet_hor());
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
    public int update(int id,String name,int tipo,boolean state,int iddet_hor){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objHor = new Horarios(id,name,tipo,state,now,now,iddet_hor);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
             pt.setString(1,objHor.getNombre());
            pt.setInt(2,objHor.getTipo());
            pt.setBoolean(3,objHor.isEstado());
            pt.setDate(4,date.valueOf(objHor.getCreated()));
            pt.setDate(5,date.valueOf(objHor.getModified()));
            pt.setInt(6,objHor.getIddet_hor());
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
            objHor = new Horarios();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objHor.setIdhora(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objHor.getIdhora());
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
    /*
     * Por defecto busca a travez de un like '%%'
     * int_ = Busqueda de entero
     * equ_ = busca exactamente la plabra
     */
   /*
     * Filtros de busqueda
     */
    public int find(String state,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(state)){
                filter = new String[1][2];
                filter[0][0] = "equ_estado";
                filter[0][1] = state; 
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
    public Horarios getValues(int idusu){
       objHor =  new Horarios();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords(_table,idusu);
            objHor.setNombre(campos[2]);
            objHor.setEstado(objVal.StringToBoolean(campos[3]));
            objHor.setCreated(campos[4]);
            objHor.setModified(campos[5]);
            
            return objHor;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objHor;
        }
    }

    
}
