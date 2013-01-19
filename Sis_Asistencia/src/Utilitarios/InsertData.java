
package Utilitarios;

import Dao.ModulosDAO;

public class InsertData {
    
    private ModulosDAO mod;
    
    public static void main(String[] args) {
        
    }
    
    public void insertModulos() {
        mod = new ModulosDAO();
        mod.save("Asistencia", true);
        mod.save("Justificaciones", true);
        mod.save("Empleados", true);
        mod.save("Horarios", true);
        mod.save("Consulta", true);
        mod.save("Configuraciones", true);
        mod.save("Reportes", true);
        
    }
    
}
