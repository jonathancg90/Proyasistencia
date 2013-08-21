
package Dao;

import Javabeans.Permisos_has_Roles;
import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PermisoshasRolesDAO extends ConexionBd{
    
    private Query qs;
    private Permisos_has_Roles objPerol;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    /*
     * Carga de datos
     */
    public PermisoshasRolesDAO(){
        _table = "permisos_has_roles";
        _error = "Dao_Permisos_has_RolesDAO_";
        filter = new String[0][0];
        campos = new String[1];
        campos[0]="idmod/modulos/nombre";
        witdhcolum = new int[0];
    } 
    public void getTableAll(JTable tblDatos, JLabel lblcant){
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
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    }
    public int find(String rol,JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
                filter = new String[1][2];
                filter[0][0] = "int_idrol";
                filter[0][1] = rol; 
                getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
    /*
     * Registro de areas
     */
    public int save(int rol, int modulo){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            
            objPerol = new Permisos_has_Roles(0,rol,modulo);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setInt(1,objPerol.getIdrol());
            pt.setInt(2,objPerol.getModulos_idmod());
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
     * Eliminar 
     */
    public int delete(int rol, int modulo){
       int i=0;
        try{
            //Preparando
            getConexion();
            objPerol = new Permisos_has_Roles();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objPerol.setIdrol(rol);
            objPerol.setModulos_idmod(modulo);
            String sqlDelete = "delete from  "+Table+" where  idrol=? and idmod=?";
            pt  = conexion.prepareStatement(sqlDelete);
            pt.setInt(1,objPerol.getIdrol());
            pt.setInt(2,objPerol.getModulos_idmod());
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
