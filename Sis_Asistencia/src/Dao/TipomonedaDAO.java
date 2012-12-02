
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Tipomoneda;
import Javabeans.Usuario;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipomonedaDAO extends ConexionBd{
    
    private Query qs;
    private Tipomoneda objmoneda;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private String _table = "moneda";
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
            campos[0]="idtipmon";
            campos[1]="nombre";
            String Table = this._table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_Tipomoneda: "+e);
        }
    
    }
    
    /*
     * Registro de Ciudad
     */
    public int save(String name){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "moneda";
            objmoneda = new Tipomoneda(0,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objmoneda.getName());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipomonedaDAO_save: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de los Ciudad
     */
    public int update(int id, String name){
       int i=0;
        try{           
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "moneda";
            objmoneda = new Tipomoneda(id,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(2,objmoneda.getIdtipmon());           
            pt.setString(1,objmoneda.getName());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipomonedaDAO: "+e);
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
            String Table = "moneda";
            
            objmoneda.setIdtipmon(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objmoneda.getIdtipmon());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_TipomonedaDAO: "+e);
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
            System.out.println("Dao_TipomonedaDAO_find : "+e);
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
            campos = qs.getRecords("moneda",idtipmon);
            objmoneda.setName(campos[2]);
            
            return objmoneda;
        }
        catch(Exception e){
            System.out.println("Dao_TipomonedaDAO_delete: "+e);
            return objmoneda;
        }
    }
}
