
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
    public int find(String apellidos,String idare, String idcar,String idemp,
            String idsuc,String state, JTable tblDatos) {
        int i = 0;
        try {
            i = 0;
            if(!"".equals(apellidos)){
                filter = new String[6][2];
                filter[i][0] = "apellidos";
                filter[i][1] = apellidos.toUpperCase();
                i++;
            } else{
                filter = new String[5][2];
                filter[i][0] = "int_idare";
                filter[i][1] = idare; i++;
                filter[i][0] = "int_idsuc";
                filter[i][1] = idsuc; i++;
                filter[i][0] = "int_idcar";
                filter[i][1] = idcar;i++;
                filter[i][0] = "int_idest";
                filter[i][1] = state;i++;
                filter[i][0] = "int_idempr";
                filter[i][1] = idemp; 
            }
            System.out.println("Tamaño: "+ filter.length);
            getTableAll(tblDatos);
            
        }
        catch(Exception e){
            System.out.println(_error + "find : "+e);
        }
        return i;
    }
        
}
