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
}
