
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Area;
import Javabeans.Usuario;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AreaDAO extends ConexionBd{

    private Query qs;
    private Area objArea;
    private Usuario objUsu;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    
    PreparedStatement  pt = null;
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            System.out.println();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String campos[] = new String[2];
            campos[0]="idare";
            campos[1]="name";
            String Table = "area";
            datos = qs.getAll(campos,Table,filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_AreaDao_getTableAll: "+e);
        }
    
    }
    /*
     * Registro de areas
     */
    public int save(String name, int state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs = new Query();
            String Table = "area";
            String now = hp.getDateNow();
            
            objArea = new Area(0,name,now,now,false);
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
            System.out.println("Dao_AreaDAO_save: "+e);
            return i;
        }
    }
    /*
     * Actualizacion de areas
     */
    public int update(int id, String name, int state){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "area";
            String now = hp.getDateNow();
            
            objArea = new Area(id,name,now,now,false);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objArea.getName());
            pt.setBoolean(2,objArea.getState());
            //pt.setDate(3,date.valueOf(objArea.getModified()));
            pt.setDate(3,date.valueOf(objArea.getCreated()));
            pt.setDate(4,date.valueOf(objArea.getModified()));
            pt.setInt(5,objArea.getIdare());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO_update: "+e);
            return i;
        }
    }
     /*
     * Eliminar 
     */
    public int delete(int id){
       int i=0;
        try{
            //Preparando
            getConexion();
            objArea = new Area();
            hp = new Helpers();
            qs= new Query();
            String Table = "area";
            
            objArea.setIdare(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objArea.getIdare());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO_delete: "+e);
            return i;
        }
    }
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "name";
                filter[0][1] = name; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println("Dao_AreaDAO_find : "+e);
        }
        return i;
    }
    
}
    