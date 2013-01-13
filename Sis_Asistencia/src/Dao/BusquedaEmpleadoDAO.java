
package Dao;

import Javabeans.Empleado;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class BusquedaEmpleadoDAO {
    
    private Query qs;
    private Helpers hp;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    PreparedStatement  pt = null;
    /*
     * Carga de datos
     */
    public BusquedaEmpleadoDAO(){
        _table = "empleado";
        _error = "Dao_BusquedaEmpleadoDAO_";
        filter = new String[0][0];
        campos = new String[5];
        campos[0]="idemp";
        campos[1]="nombres";
        campos[2]="apellidos";
        campos[3]="idare/area/nombre";
        campos[4]="idcar/cargo/nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
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
    public int find(String apellidos,String idcar,String idemp,
            String idsuc,String state, JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(apellidos)){
                filter = new String[1][2];
                filter[0][0] = "apellidos";
                filter[0][1] = apellidos.toUpperCase();
                filter[1][0] = "idare";
                filter[1][1] = apellidos.toUpperCase(); 
                filter[2][0] = "idsuc";
                filter[2][1] = apellidos.toUpperCase(); 
                filter[3][0] = "idcar";
                filter[3][1] = apellidos.toUpperCase();
                filter[4][0] = "idest";
                filter[4][1] = apellidos.toUpperCase(); 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
        
}
