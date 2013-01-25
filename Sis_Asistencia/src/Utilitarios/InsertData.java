
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
    private String[] args =  new String[1];

    
    public static void main(String[] args) throws SQLException, 
            IOException, BiffException, WriteException {
        InsertData insert = new InsertData();
        insert.deleteRegister();
        insert.insertModulos();
        insert.insertRoles();
        insert.insertPermiso_Roles();
        insert.insertMoneda();
        insert.insertCiudad();
        insert.insertArea();
        insert.insertCargos();
        insert.insertEmpresa();
        insert.insertSucursal();
        insert.insertHorarios();
        insert.insertDetailHorarios();
        insert.insertTipoEmpleado();
        insert.insertEstadoEmpleado();
        insert.insertEmpleado();
        insert.insertHorarioEmpleado();
    }

    public void deleteRegister() throws SQLException {
        qs = new Query();
        System.out.println("Eliminando registross ...");
        qs.DeleteAll("usuario");
        qs.DeleteAll("registro_backlog");
        qs.DeleteAll("registro");
        qs.DeleteAll("empleado_has_horarios");
        qs.DeleteAll("empleado");
        qs.DeleteAll("tipoempleado");
        qs.DeleteAll("detailhorario");
        qs.DeleteAll("horarios");
        qs.DeleteAll("estadoemp");
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
    
    public void insertRoles() {
        rol = new RolesDAO();
        System.out.println("Insert data Roles ...");
        rol.save("Super administrador");
        rol.save("Administrador");
        rol.save("Consultor");
    }
    
    public void insertCiudad() throws WriteException, IOException, SQLException, BiffException {
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
        args[0] = "ciudad";
        String name = "ciudad_idciu_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
    }
    public void insertMoneda() throws WriteException, IOException, BiffException, SQLException {
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
        args[0] = "moneda";
        String name = "moneda_idmon_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "area";
        String name = "area_idare_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "cargo";
        String name = "cargo_idcar_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "empresa";
        String name = "empresa_idempr_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "empresa";
        String name = "sucursal_idsuc_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "horarios";
        String name = "horarios_idhor_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "detailhorario";
        String name = "detailhorario_iddet_hor_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "tipoempleado";
        String name = "tipoempleado_idtip_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "estadoemp";
        String name = "estadoemp_idest_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
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
        args[0] = "empleado";
        String name = "empleado_idemp_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
    }    
    public void insertHorarioEmpleado() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data  Horarios de empleados ...");
        String data[][];
        data = xls.ExcelUp("horario_personal");
        for(int r=1;r<data.length;r++){
            String [] reg = new String[data[r].length];
                for(int c=0;c<data[r].length;c++){
                    reg[c]=data[r][c];
                }
            qs.RegisterAll("empleado_has_horarios", reg);
        }
        args[0] = "empleado_has_horarios";
        String name = "empleado_has_horarios_NMID_seq";
        qs.AlterSecuence(name, qs.getCountRegister(args)+1);
    } 
   
}
