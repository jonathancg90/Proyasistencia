
package Dao;
import Utilitarios.ConexionBd;
import java.sql.*;

import javax.swing.table.DefaultTableModel;


public class AreaDAO extends ConexionBd{
    
        private DefaultTableModel datos; 
        private ResultSet rs = null;
        private Statement s = null;
        private Object[] fila;
        
        
        //Envio de consulta a metodo generico de tablas
        public  DefaultTableModel  getAllEmpleados()
        {
            try{
                //Consulta
                getConexion();
                String qs = "select * from Empleado";
                rs = s.executeQuery(qs);
                
                //Llenado Cabecera Jtable
                ResultSetMetaData meta = rs.getMetaData();
                int nCols = meta.getColumnCount();
                datos = new DefaultTableModel();
                for(int i=0; i<nCols; ++i){
                    
                    datos.addColumn(meta.getColumnName(i+1));
                }
                
                //Llenado registro Jtable
                fila = new Object[nCols];
                while(rs.next()){
                    
                    for(int i=0; i<nCols; ++i){   
                        fila[i] = rs.getObject(i+1);
                    }
                    datos.addRow(fila);
                }
                
                //Cerrando conexion
                rs.close();
                closeConexion();
            } 
            catch (Exception e){
                System.out.println("Dao_AreaDao: "+e);
        }
        return datos;
    }
    
}
