
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Area;
import java.sql.Date;
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
            
            String campos[] = new String[2];
            campos[0]="idare";
            campos[1]="name";
            String Table = "area";
            qs= new Query();
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
            qs= new Query();
            String Table = "area";
            String now = hp.getDateNow();
            Date date = new Date(0000-00-00);
            
            objArea = new Area(name,now,now,false);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objArea.getName());
            pt.setBoolean(2,objArea.getState());
            pt.setDate(3,date.valueOf(objArea.getCreated()));
            pt.setDate(4,date.valueOf(objArea.getModified()));
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO: "+e);
            return i;
        }
    }
    
}
