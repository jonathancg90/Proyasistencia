
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
        campos[0]="idjus";
        campos[1]="tipo_justificaciones_idtip_jus";
        campos[2]="fecha";
        campos[3]="hora";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    public void getTableFilter(JTable tblDatos,String inicio,String fin, int id){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            String Table = this._table;
            
            datos = qs.getFechafilter(this.campos,Table,inicio,fin,"empleado_idemp",id);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
        }
        catch(Exception e){
            System.out.println(_error + "getTableFechaFilter: "+e);
        }
    
    }
    
   public int save(int idemp,int idtip_reg, String fecha,String motivo,String recibo,Time horas){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            qs = new Query();
            String Table = this._table;
            objjusti = new Justificaciones(0,idemp,idtip_reg,fecha,motivo,recibo,horas);
            //Iniciando consulta y asignando valores
            
            pt.setInt(1,objjusti.getEmpleado_idemp());
            pt.setInt(2,objjusti.getTipo_justificaciones_idtip_jus());
            pt.setDate(3,date.valueOf(objjusti.getFecha()));
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
}
