
package Dao;

import Javabeans.Tipohorario;
import Javabeans.Usuario;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TipoHorarioDAO extends ConexionBd{
    private Query qs;
    private Tipohorario objtiphor;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private String _table;
    private Validators objVal;
    private String _error;
    private String campos[];
    
    PreparedStatement  pt = null;
    
    public TipoHorarioDAO(){
        _table = "tipohorario";
        _error = "Dao_Tipohorario_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idtipohor";
        campos[1]="nombre";
    }
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs = new Query();            
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    
    }
    
    /*
     * Registro de tipohorario
     */
    public int save(String name){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            objtiphor = new Tipohorario(0,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objtiphor.getName());
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
     * Actualizacion de los tipos de horarios
     */
    public int update(int id, String name){
       int i=0;
        try{           
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            objtiphor = new Tipohorario(id,name);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setInt(2,objtiphor.getIdtiphor());           
            pt.setString(1,objtiphor.getName());
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
            objtiphor = new Tipohorario();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objtiphor.setIdtiphor(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objtiphor.getIdtiphor());
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
    public Tipohorario getValues(int idtiphor){
       objVal = new Validators(); 
       objtiphor =  new Tipohorario();
       try{           
            qs= new Query();
            //Preparando
            String campos[] = new String[1];
            campos = qs.getRecords(this._table,idtiphor);
            objtiphor.setName(campos[2]);
            
            return objtiphor;
        }
        catch(Exception e){
            System.out.println(_error + "getValues: "+e);
            return objtiphor;
        }
    }
    
}
