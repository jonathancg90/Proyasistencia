
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Queryset;
import Javabeans.Area;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AreaDAO extends ConexionBd{

    Queryset qs;
    Area area;
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
            qs= new Queryset();
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
            qs= new Queryset();
            String Table = "area";
            String now = hp.getDateNow();
            
            
            area = new Area(name,now,now,false);

            pt = qs.sqlRegister(Table);
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
