
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
    }

    public void deleteRegister() throws SQLException {
        qs = new Query();
        System.out.println("Eliminando registross ...");
        qs.DeleteAll("empleado");
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
    
    public void inserMoneda() {
        mon = new TipomonedaDAO();
        System.out.println("Insert data Monedas ...");
        mon.save("Nuevo Sol", "S/.", true);
        mon.save("Dolar", "$", false);

    }
    
    public void inserCiudad() {
        ciu = new CiudadDAO();
        System.out.println("Insert data Ciudades ...");   
        ciu.save("LIma");
        ciu.save("Callao");
    }
    
    public void insertArea() throws IOException, BiffException, WriteException, SQLException{
        xls = new JExcel();
        qs = new Query();
        System.out.println("Insert data Areas ...");
        String data[][];
        data = xls.ExcelUp("area");
        System.out.println(data.length + " - "+data[0].length);
        for(int c=0;c<data.length;c++){
            String [] reg = new String[data[c].length];
                for(int r=0;r<data[c].length;r++){
                    reg[r]=data[c][r];
                }
            qs.RegisterAll("area", reg);
        }
    }
    
}
