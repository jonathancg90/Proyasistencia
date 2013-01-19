
package Utilitarios;

import Utilitarios.Query;
import Dao.ModulosDAO;
import Dao.RolesDAO;
import java.sql.SQLException;

public class InsertData {
    
    private Query qs;
    private ModulosDAO mod;
    private RolesDAO rol;
    
    public static void main(String[] args) throws SQLException {
        InsertData insert = new InsertData();
        insert.deleteRegister();
        insert.insertModulos();
        insert.inserRoles();
    }
    
    public void deleteRegister() throws SQLException {
        qs = new Query();
        System.out.println("Eliminando registros ...");
        qs.DeleteAll("roles"); 
        qs.DeleteAll("modulos");
    }
    
    public void insertModulos() {
        mod = new ModulosDAO();
        System.out.println("Insert data Modulos ...");
        mod.save("Asistencia", true);
        mod.save("Justificaciones", true);
        mod.save("Empleados", true);
        mod.save("Horarios", true);
        mod.save("Consulta", true);
        mod.save("Configuraciones", true);
        mod.save("Reportes", true);
    }
    
    public void inserRoles() {
        rol = new RolesDAO();
        System.out.println("Insert data Roles ...");
        rol.save("Super administrador");
        rol.save("Administrador");
        rol.save("Consultor");
    }
    
}
