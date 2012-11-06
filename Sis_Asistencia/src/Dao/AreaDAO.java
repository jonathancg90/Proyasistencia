
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Area;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AreaDAO extends ConexionBd{

    Query qs;
    Area objArea;
    Helpers hp;
    
    
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            
            String campos[] = new String[2];
            campos[0]="idare";
            campos[1]="name";
            String Table = "area";

            datos = qs.getAll(campos,Table);
        
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_AreaDao: "+e);
        }
    
    }
    
    public int save(String name, int state){
       int i=0;
        try{
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "area";
            String now = hp.getDateNow();

            objArea = new Area(name,now,now,false);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objArea.getName());
            pt.setString(2,objArea.getModified());
            pt.setString(3,objArea.getCreated());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            conexion.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            return i;
        }
    }
    
}
