
package Dao;

import Javabeans.Extra_descuento;
import Utilitarios.Helpers;
import Utilitarios.ConexionBd;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Extra_descuentoDAO extends ConexionBd{
    
    private Query qs;
    private Extra_descuento objdes;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    
     public Extra_descuentoDAO(){
        _table = "Extra_descuento";
        _error = "Dao_Extra_descuentoDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="id";
        campos[1]="monto";
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
    public int save(String fecha,int tipo,float monto,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objdes = new Extra_descuento(i, tipo, fecha, monto, idemp);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objdes.getTipo());
            pt.setDate(2,date.valueOf(objdes.getDate()));
            pt.setFloat(3,objdes.getMonto());
            pt.setInt(4,objdes.getIdemp());
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
    public int update(String fecha,int tipo,float monto,int idemp){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            
            objdes = new Extra_descuento(i, tipo, fecha, monto, idemp);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objdes.getTipo());
            pt.setDate(2,date.valueOf(objdes.getDate()));
            pt.setFloat(3,objdes.getMonto());
            pt.setInt(4,objdes.getIdemp());
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
            objdes = new Extra_descuento();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objdes.setId(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objdes.getId());
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
     * Cargar valores de busqueda al modelo 
     */
    public Extra_descuento getValues(int idusu){
       objdes =  new Extra_descuento();
       objVal = new Validators();
        try{
            qs= new Query();
            //Preparando
            String campos[] = new String[6];
            campos = qs.getRecords(_table,idusu);
            objdes.setTipo(Integer.parseInt(campos[2]));
            objdes.setDate(campos[3]);
            objdes.setMonto(Float.valueOf(campos[4]));
            objdes.setIdemp(Integer.parseInt(campos[5]));
            
            return objdes;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objdes;
        }
    }
    public int findId(String id,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[1][2];
                filter[0][0] = "int_empleado_idemp";
                filter[0][1] = id;
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
}

