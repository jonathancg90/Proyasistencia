
package Utilitarios;

import Utilitarios.Query;
import Utilitarios.Data;
import Appi.JExcel;
import Dao.ModulosDAO;
import Dao.RolesDAO;
import Dao.PermisoshasRolesDAO;
import Dao.TipomonedaDAO;
import Dao.CiudadDAO;
import java.io.IOException;
import java.sql.SQLException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class InsertData {
    
    private Query qs;
    private Data dt;
    private JExcel xls;
    private ModulosDAO mod;
    private RolesDAO rol;
    private PermisoshasRolesDAO per_mod;
    private TipomonedaDAO mon;
    private CiudadDAO ciu;

    
    public static void main(String[] args) throws SQLException, 
            IOException, BiffException, WriteException {
        InsertData insert = new InsertData();
        insert.deleteRegister();
        insert.insertModulos();
        insert.inserRoles();
        insert.insertPermiso_Roles();
        insert.inserMoneda();
        insert.inserCiudad();
        insert.insertArea();
        insert.insertCargos();
        insert.insertEmpresa();
        insert.insertSucursal();
        insert.insertHorarios();
        insert.insertDetailHorarios();
        insert.insertTipoEmpleado();
        insert.insertEstadoEmpleado();
        insert.insertEmpleado();
    }

    public void deleteRegister() throws SQLException {
        qs = new Query();
        System.out.println("Eliminando registross ...");
        qs.DeleteAll("empleado");
        qs.DeleteAll("estadoemp");
        qs.DeleteAll("tipoempleado");
        qs.DeleteAll("detailhorario");
        qs.DeleteAll("horarios");
        qs.DeleteAll("sucursal");
        qs.DeleteAll("empresa");
        qs.DeleteAll("cargo");
        qs.DeleteAll("area");
        qs.DeleteAll("permisos_has_roles");
        qs.DeleteAll("roles");
        qs.DeleteAll("modulos");
        qs.DeleteAll("moneda");
        qs.DeleteAll("ciudad");
        qs.DeleteAll("usuario");
    }
    
    public void insertModulos() {
        mod = new ModulosDAO();
        System.out.println("Insert data Modulos ...");
        dt = new Data();
        for(int i=0;i< dt.G_MODULOS.length;i++) {
            mod.save(dt.G_MODULOS[i], true);
        }
    }
    
    public void insertPermiso_Roles() {
        per_mod = new PermisoshasRolesDAO();
        qs = new Query();
        System.out.println("Insert data Permisos_has_roles ...");
        int _rol = Integer.parseInt(qs.idChoice("roles", "nombre", "Super administrador"));
        dt = new Data();
        for(int i=0;i< dt.G_MODULOS.length;i++) {
            int mod = Integer.parseInt(qs.idChoice("modulos", "nombre", dt.G_MODULOS[i]));
            per_mod.save(_rol, mod);
        }
    }
    
    public void inserRoles() {
        rol = new RolesDAO();
        System.out.println("Insert data Roles ...");
        rol.save("Super administrador");
        rol.save("Administrador");
        rol.save("Consultor");
    }
    
    public void inserCiudad() throws WriteException, IOException, SQLException, BiffException {
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Ciudades ...");
        String data[][];
        data = xls.ExcelUp("ciudades");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("ciudad", reg);
        }
    }
    public void inserMoneda() throws WriteException, IOException, BiffException, SQLException {
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Monedas ...");
        String data[][];
        data = xls.ExcelUp("monedas");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("moneda", reg);
        }

    }
    public void insertArea() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Areas ...");
        String data[][];
        data = xls.ExcelUp("area");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("area", reg);
        }
    }
    public void insertCargos() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Cargos ...");
        String data[][];
        data = xls.ExcelUp("cargos");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("cargo", reg);
        }
    }
    public void insertEmpresa() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data empresa ...");
        String data[][];
        data = xls.ExcelUp("empresa");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("empresa", reg);
        }
    }
    public void insertSucursal() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Sucursal ...");
        String data[][];
        data = xls.ExcelUp("sucursal");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("sucursal", reg);
        }
    }
    public void insertHorarios() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Horario ...");
        String data[][];
        data = xls.ExcelUp("horarios");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("horarios", reg);
        }
    }
   public void insertDetailHorarios() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Detalle de Horario ...");
        String data[][];
        data = xls.ExcelUp("det_horario");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("detailhorario", reg);
        }
    }  
   
   public void insertTipoEmpleado() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Tipo de Empleados ...");
        String data[][];
        data = xls.ExcelUp("tipo_empleado");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("tipoempleado", reg);
        }
    }   
   
       public void insertEstadoEmpleado() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data  Estado de Empleados ...");
        String data[][];
        data = xls.ExcelUp("estado_empleado");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("estadoemp", reg);
        }
    }   
       
    public void insertEmpleado() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data  Empleados ...");
        String data[][];
        data = xls.ExcelUp("Empleados");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("empleado", reg);
        }
    }    
   
}
