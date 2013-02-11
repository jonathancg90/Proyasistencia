
package Dao;

import Javabeans.Area;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.ConexionBd;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ConsultaDAO {
    
    private Query qs;
    private Area objArea;
    private Helpers hp;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    private ResultSet rs = null;
    private Statement s = null;
    private PreparedStatement  pt = null;
    private ConexionBd con;
    private Connection conexion;

    public ConsultaDAO(){
        _error = "Dao_ConsultaDAO_";
        filter = new String[0][0];
        campos = new String[0];
        witdhcolum = new int[1];
        witdhcolum[0]=50;
        _table = "report";
    }
    public void getTableAll(JTable tblDatos , JLabel lblcant){
        try{
            DefaultTableModel datos;
            qs= new Query();
            hp = new Helpers();
            if (filter.length <= 0){
                filter = new String[0][0];
            }
            String Table = this._table;
            datos = qs.getAll(this.campos,Table,filter);
            tblDatos.setModel(datos);
            hp.setWidthJtable(tblDatos,witdhcolum);
            int num = tblDatos.getRowCount();
            lblcant.setText(String .valueOf(num));
        }
        catch(Exception e){
            System.out.println(_error + "getTableAll: "+e);
        }
    }
    public void findAsistencia(String args[], JTable tblDatos, JLabel lblcant) {
        qs= new Query();
        Statement s = null;
        con = new ConexionBd();
        try {
            //Campos de la tabla report
            String lista[];
            campos = set_camp_registro();
            //Campos para la consulta
            qs.create_report(campos);
            String[] camp = new String[3];
            camp[0] = "idtip_reg%G_TIPOREG";
            camp[1] = "fecha";
            camp[2] = "hora";
            //Filtros
            filter = new String[2][2];
            filter[0][0] = "int_idemp";
            filter[0][1] = args[0];
            filter[1][0] = "bet_fecha_" + args[1];
            filter[1][1] = args[2];
     
            helper_asistencia(filter, camp, args[1], args[2]);
            filter = new String[0][0];
            getTableAll(tblDatos,lblcant);
            qs.destroid_report();
        }
        catch(Exception e){
            System.out.println(_error + "findAsistencia : "+e);
        }
    }
    //Ejecucion de la consulta
    private void helper_asistencia(String filter[][], String camp[],
            String fechInicio, String fechFinal) throws SQLException{
        qs= new Query();
        hp= new Helpers();
        //Declaracion
        Date date = new Date(0000-00-00);
        String Consulta = "";
        Object[] fila;
        String[] temp;
        String tbl;
        con.getConexion();
        conexion = con.getConetion();
        s = conexion.createStatement();
        //Titulos
        Consulta = qs.getQueryList(camp, "registro/fecha", filter);
        rs = s.executeQuery(Consulta);
        ResultSetMetaData meta = rs.getMetaData();
        int nCols = meta.getColumnCount();
        fila = new Object[nCols];
        int count = 0;
        int ind = 0;
        //Logica
        fechFinal = qs.getDay(fechFinal, "+");
        String fechActual = fechInicio;
        do {
            ind = 0;
            //Ejecucion de consulta
            filter[1][0] = "bet_fecha_" + fechActual;
            filter[1][1] = fechActual;
            Consulta = qs.getQueryList(camp, "registro/fecha", filter);
            System.out.println(Consulta);
            rs = s.executeQuery(Consulta);
            boolean countReg = false;
            //Registro del reporte
            String[] campReg = new String[nCols*2];
            while(rs.next()){
            countReg = true;
            count++;
            for(int i=0; i<nCols; ++i){
                fila[i] = rs.getObject(i+1);
                temp = camp[i].split("%");
                if(temp.length>1){
                    String[] campo;
                    tbl = temp[1];
                    campo =  hp.getConstantData(tbl);
                    fila[i] = campo[rs.getInt(i+1)];
                    }
                    System.out.println("Indice: "+ind+"limite: "+campReg.length);
                    //Temporal
                    if(ind < 6){
                        campReg[ind]=String.valueOf(fila[i]);
                        System.out.println(campReg[i]);
                    }
                    ind++;
                }
            }
            //No existen registros del dia
            if(countReg == false) { 
                System.out.println("No hay registro: "+fechActual);
                //Domingo
                //Verificar si el dia es parte de su horario
                    //Verificar si es por sus vacaciones
                    //Verificar si es dia no laborable
                    //Verificar si tiene justificacion de falta
               
            }
            register_report(campReg);
        fechActual = qs.getDay(fechActual, "+");
        } while(!fechActual.equals(fechFinal));
    }
        
    public void register_report(String[] args) {
        pt = null;
        try {
            String query = "insert into report values(";
            for(int i=0;i<args.length;i++){
                query = query + "'" + args[i] + "'";
                if(args.length!=i+1) { 
                    query = query + ",";
                }
            }
            query = query + ")";
            pt  = conexion.prepareStatement(query);
            pt.executeUpdate();
            pt.close();   
        }
        catch(Exception e){
            System.out.println(_error + "register_findAsistencia : "+e);
        }
    }
    
    public String[] set_camp_registro(){
        String campos[] = new String[6];
        campos[0] = "fecha";
        campos[1] = "ingreso";
        campos[2] = "refrigerio_ing";
        campos[3] = "refrigerio_sal";
        campos[4] = "salida";
        campos[5] = "horas";
        return campos;
    }
    
    /**/
}
