
package Dao;

import Utilitarios.ConexionBd;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Javabeans.Empresa;
import Javabeans.Usuario;
import Utilitarios.Validators;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class EmpresaDAO extends ConexionBd{
    private Query qs;
    private Empresa objEmpresa;
    private Helpers hp;
    private String filter[][] = new String[0][0];
    private Usuario objUsu;
    private Validators objVal;
    
    PreparedStatement  pt = null;
    
    public void getTableAll(JTable tblDatos){
        try{
            DefaultTableModel datos;
            qs= new Query();
            if (filter.length <= 0){
                filter = new String[0][0];
            }           

            String campos[] = new String[2];
            campos[0]="idempr";
            campos[1]="nombre";
            String Table = "empresa";
            datos = qs.getAll(campos,Table, filter);
            tblDatos.setModel(datos);   
        }
        catch(Exception e)
        {
            System.out.println("Dao_EmpresaDao: "+e);
        }
    
    }
    /*
     * Registro de Empresas
     */
    public int save(String name,String ruc, boolean statem,int trabajadores,int mon){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            String now = hp.getDateNow();
            
            objEmpresa = new Empresa(0,name,ruc,statem,now,now,trabajadores,mon);
            //Iniciando consulta y asignando valores
            pt = qs.sqlRegister(Table);
            pt.setString(1,objEmpresa.getName());
            pt.setString(2,objEmpresa.getRuc());
            pt.setBoolean(3,objEmpresa.isEstado());
            pt.setDate(4,date.valueOf(objEmpresa.getCreated()));
            pt.setDate(5,date.valueOf(objEmpresa.getModified()));
            pt.setInt(6,objEmpresa.getTrabajadores());
            pt.setInt(7,objEmpresa.getMon());
            
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_save: "+e);
            return i;
        }
    }
    
    /*
     * Actualizacion de Empresa
     */
    public int update(int id, String name,String ruc, boolean state,int trabajadores, int mon){
       int i=0;
        try{
            Date date = new Date(0000-00-00);
            //Preparando
            getConexion();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            String now = hp.getDateNow();
            
            objEmpresa = new Empresa(id,name,ruc,state,now,now,trabajadores,mon);
            //Iniciando consulta y asignando valores
            pt = qs.sqlUpdate(Table);
            pt.setString(1,objEmpresa.getName());
            pt.setString(2,objEmpresa.getRuc());
            pt.setBoolean(3,objEmpresa.isEstado());
            pt.setDate(4,date.valueOf(objEmpresa.getCreated()));
            pt.setDate(5,date.valueOf(objEmpresa.getModified()));
            pt.setInt(6,objEmpresa.getTrabajadores());
            pt.setInt(7,objEmpresa.getMon());
            //Ejecucion y cierre
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_update: "+e);
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
            objEmpresa = new Empresa();
            hp = new Helpers();
            qs= new Query();
            String Table = "empresa";
            
            objEmpresa.setIdempr(id);
            pt = qs.sqlDelete(Table);
            pt.setInt(1,objEmpresa.getIdempr());
            i= pt.executeUpdate();
            pt.close();
            closeConexion();
            return i;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_delete: "+e);
            return i;
        }
    }
    
    public int find(String name,JTable tblDatos) {
        int i = 0;
        try {
            if(!"".equals(name)){
                filter = new String[1][2];
                filter[0][0] = "nombre";
                filter[0][1] = name; 
            }
            getTableAll(tblDatos);
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_find : "+e);
        }
        return i;
    }
    
    /*
     * Cargar valores de busqueda al modelo 
     */
    public Empresa getValues(int idemp){
        objEmpresa =  new Empresa();
        objVal = new Validators();
        try{
            
            qs= new Query();
            //Preparando
            String campos[] = new String[7];
            campos = qs.getRecords("empresa",idemp);
            objEmpresa.setName(campos[1]);
            objEmpresa.setRuc(campos[2]);
            objEmpresa.setEstado(objVal.StringToBoolean(campos[3]));
            objEmpresa.setCreated(campos[4]);
            objEmpresa.setModified(campos[5]);
            objEmpresa.setTrabajadores(Integer.parseInt(campos[6]));
            objEmpresa.setMon(Integer.parseInt(campos[7]));
            
            
            
            
            return objEmpresa;
        }
        catch(Exception e){
            System.out.println("Dao_EmpresaDAO_getValues: "+e);
            return objEmpresa;
        }
    }
}