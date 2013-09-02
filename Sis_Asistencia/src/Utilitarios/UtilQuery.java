/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;
import Utilitarios.Query;
import Utilitarios.ConexionBd;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author platano
 */
public class UtilQuery {
    private Query qs;
    private ConexionBd con;
    private Connection conexion;
    private Statement s = null;
    private ResultSet rs = null;
    
    //Existe registro de asistencia en un fecha determinada
    public boolean is_exists_asistent(String fecha, String empleado){
        boolean result = false;
        qs = new Query();
        String args[] = new String[5];
            args[0]="registro";
            args[1]="fecha";
            args[2]=""+fecha;
            args[3]="idemp";
            args[4]=""+empleado;
        int cant = qs.getCountRegister(args);
        if(cant>0){
            result=true;
        }
        return result;
    }
    
    //Trabaja en una fecha determinada
    public boolean is_work_day(String emp, String fecha, int dia) throws SQLException{
        boolean val = false;
        con = new ConexionBd();
        con.getConexion();
        conexion = con.getConetion();
        s = conexion.createStatement();
        
        String Consulta = "select dia "
                 + "from empleado_has_horarios  c, detailhorario d "
                 + "where idemp= "+emp+" "
                 + "and '"+fecha+"' >= inicio  "
                 + "and '"+fecha+"' <= fin "
                 + "and c.idhor = d.horarios_idhor";
            rs = s.executeQuery(Consulta);
            while(rs.next()){
                //Si trabaja ese dia = true
                if(rs.getInt(1) == dia) {
                    return true;
                }
            }
        
        return val;
    }
    
    //Tiene permiso en un determinado dia
    public boolean has_permition(String emp, String fecha, String tipo){
        boolean result = false;
        qs = new Query();
        String args[] = new String[7];
            args[0]="justificaciones";
            args[1]="fecha";
            args[2]=""+fecha;
            args[3]="empleado_idemp";
            args[4]=""+emp;
            args[5]="idtip_jus";
            args[6]=""+tipo;
        int cant = qs.getCountRegister(args);
        if(cant>0){
            result=true;
        }
        return result;
    }
    public boolean is_holiday(String fecha){
        boolean result = false;
        qs = new Query();
        String args[] = new String[3];
            args[0]="nolaborables";
            args[1]="fecha";
            args[2]=""+fecha;
        int cant = qs.getCountRegister(args);
        if(cant>0){
            result=true;
        }
        return result;
    }
    
    //Hora que llego en un determinado dia
    public String arrival_day(String emp, String fecha){
        String llegada = "";
        qs = new Query();
        String query = "select hora from registro "
                + "where idemp="+emp+" "
                + "and idtip_reg=1 "
                + "and fecha='"+fecha+"' "
                + "order by hora asc";
        llegada = qs.Execute(query);
        return llegada;
    }

    
    //Hora de ingreso o salida segun su horario de un determinado dia
    public String arrival_schedule(String emp, String fecha, String opcion, int dia){
        String llegada = "";
        qs = new Query();
        String query = "select "+opcion+" " +
                        "from empleado_has_horarios  c, detailhorario d " +
                        "where idemp= "+emp+" " +
                        "and '"+fecha+"' >= inicio " +
                        "and '"+fecha+"' <= fin " +
                        "and c.idhor = d.horarios_idhor " +
                        "and d.idtip_reg = 1" +
                        "and d.dia="+dia;
        llegada = qs.Execute(query);
        return llegada;
    }
    //Crear tabla de injustificaciones
    public void createTableInjustificaciones(){
        qs = new Query();
        String query = "create table injustificaciones( "
                + "tipo varchar(30),"
                + "fecha varchar(30),"
                + "horas varchar(30)"
                + ");";
        
        qs.ExecuteUpdating(query);
    }
    //elimina tabla de injustificaciones    
    public void dropTableInjustificaciones(){
        qs = new Query();
        String query = "drop table injustificaciones";
        qs.ExecuteUpdating(query);
    }
    //inserta injustificacion en la tabla de injustificaciones
    public void insert_injustificacion(String tipo, String fecha, String horas){
        qs = new Query();
        String query = "insert into injustificaciones values('"+tipo+"','"+fecha+"','"+horas+"')";
        qs.ExecuteUpdating(query);
    }
}
