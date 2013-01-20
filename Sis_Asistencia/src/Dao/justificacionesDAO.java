
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
        campos = new String[4];
        campos[0]="idreg";
        campos[1]="idtip_reg";
        campos[2]="fecha";
        campos[3]="hora";
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
    
   /* public int save(int idemp,int idtip_reg, String fecha,String motivo,String recibo, int op,Time horas){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = this._table;
            String now = hp.getDateNow();
            objjusti = new Justificaciones(0,idemp,idtip_reg,fecha,motivo,recibo,horas);
            //Iniciando consulta y asignando valores
            if (op>0){
                pt = qs.sqlRegister(Table);
            } else {  pt = qs.sqlRegister("registro_backlog");
            }
            pt.setInt(1,objjusti.getEmpleado_idemp());
            pt.setInt(2,objjusti.getTipo_justificaciones_idtip_jus());
            pt.setDate(3,date.valueOf(""+objjusti.getFecha()));
            pt.setString(4,objjusti.getMotivo());
            pt.setString(5,objjusti.getRecibo());
            pt.setTime(6,objjusti.getHoras());;
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
    }*/
}
