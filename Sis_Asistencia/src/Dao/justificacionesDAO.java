
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;

import Javabeans.Justificaciones;
import Utilitarios.Validators;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Gui.WinEmpleado_Vacaciones;
import java.sql.Time;
import javax.swing.JLabel;

public class justificacionesDAO extends ConexionBd{
    private Query qs;
    private Justificaciones objjusti;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    
    public justificacionesDAO(){
        
        _table = "justificaciones";
        _error = "Dao_justificacionesDAO_";
        filter = new String[0][0];
        campos = new String[6];
        campos[0]="idjus";
        campos[1]="idtip_jus/tipo_justificaciones/nombre";
        campos[2]="fecha";
        campos[3]="inicio";
        campos[4]="fin";
        campos[5]="horas";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
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
    
   public int save(int idemp,int idtip_reg, String fecha,String motivo,String recibo,Time horas,Time inicio, Time fin){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            qs = new Query();
            String Table = this._table;
            objjusti = new Justificaciones(0,idemp,idtip_reg,fecha,motivo,recibo,horas,inicio,fin);
            pt = qs.sqlRegister(Table);
            
            pt.setInt(1,objjusti.getEmpleado_idemp());
            pt.setInt(2,objjusti.getTipo_justificaciones_idtip_jus());
            pt.setString(3,objjusti.getMotivo());
            pt.setString(4,objjusti.getRecibo());
            pt.setTime(5,objjusti.getHoras());
            pt.setDate(6,date.valueOf(objjusti.getFecha()));
            pt.setTime(7,objjusti.getInicio());
            pt.setTime(8,objjusti.getFin());
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
   
   public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objjusti =  new Justificaciones();
            hp = new Helpers();
            qs= new Query();
            String Table = this._table;
            
            objjusti.setIdjus(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objjusti.getIdjus());
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
   public int findJusti(String id,String inicio, String fin, JTable tblDatos, JLabel lblcant) {
        int i = 0;
        try {
            if(!"".equals(id)){
                filter = new String[2][2];
                filter[0][0] = "int_empleado_idemp";
                filter[0][1] = id;
                filter[1][0] = "bet_fecha_"+inicio;
                filter[1][1] = fin;
            }
            getTableAll(tblDatos, lblcant);
        }
        catch(Exception e){
            System.out.println(_error + "findId : "+e);
        }
        return i;
    }
}
