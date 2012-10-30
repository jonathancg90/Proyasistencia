
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AreaDAO extends ConexionBd{

    Helpers hp;
    
    /*
     * Middleware mostrar nombres de las areas
     */
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            
            String campo[] = new String[2];
            campo[0]="idare,";
            campo[1]="name";
            
            hp= new Helpers();
            datos = hp.getAll(campo,"area");
        
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_AreaDao: "+e);
        }
    
    }
    
}
