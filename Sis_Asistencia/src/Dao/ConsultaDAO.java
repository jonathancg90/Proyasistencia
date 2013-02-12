
package Dao;

import Appi.TimeOPeration;
import Javabeans.Area;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.ConexionBd;
import Utilitarios.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ConsultaDAO {
    
    private Query qs;
    private Area objArea;
    private Helpers hp;
    private Data dt;
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
    private TimeOPeration tm;

    public ConsultaDAO(){
        _error = "Dao_ConsultaDAO_";
        filter = new String[0][0];
        campos = new String[0];
        witdhcolum = new int[6];
        witdhcolum[0]=180;
        witdhcolum[1]=75;
        witdhcolum[2]=75;
        witdhcolum[3]=75;
        witdhcolum[4]=75;
        witdhcolum[5]=60;
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
            String[] camp = new String[2];
            camp[0] = "fecha";
            //camp[1] = "idtip_reg%G_TIPOREG";
            camp[1] = "hora";
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
            String fechInicio, String fechFinal) throws SQLException, ParseException{
        qs= new Query();
        hp= new Helpers();
        dt = new Data();
        
        //Declaracion
        SimpleDateFormat fhora = new SimpleDateFormat("HH:mm:ss");
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
        int dia = 0;
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
            String[] campReg;
            campReg = new String[6];
            dia = Integer.parseInt(qs.getDayOfTheWeek(fechActual));
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
                    //Temporal
                    if(ind >= 2 && i == 1 ){
                        campReg[ind]=String.valueOf(fila[i]);
                        ind++;
                    }
                    if(ind < 2){
                        if(ind == 0) {
                            fila[i] = fila[i] + " (" + dt.G_DIAS[dia] + ")";
                        }
                        campReg[ind]=String.valueOf(fila[i]);
                        ind++;
                    }
                }
            }
            //Suma
            if(countReg == true) {
                if(ind == 3){
                    campReg[4] = campReg[2];
                    campReg[2] = "";
                    campReg[3] = "";
                    campReg[5] = calculoHoras(campReg, 2);
                } else if(ind == 5){
                    campReg[5] = calculoHoras(campReg, 4);
                }
            }
            //No existen registros del dia
            if(countReg == false) { 
                campReg = new String[2];
                campReg[0]=String.valueOf(fechActual + " (" + dt.G_DIAS[dia] + ")");
                //Domingo
                if(dia == 7) {
                    campReg[1]=String.valueOf("");
                }
                else {
                    campReg[1]=String.valueOf("Falto");
                }
                //Verificar si el dia es parte de su horario
                    //Verificar si es por sus vacaciones
                    //Verificar si es dia no laborable
                    //Verificar si tiene justificacion de falta
               
            }
            register_report(campReg);
        fechActual = qs.getDay(fechActual, "+");
        } while(!fechActual.equals(fechFinal));
    }
        
    public String calculoHoras(String[] args, int op){
                String suma="";
        try {
            tm = new TimeOPeration();
            DateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            if (op == 2) {
                String inicio = args[1];
                String termino = args[4];
                Date date_ini = sdf.parse(inicio);
                Date date_fin = sdf.parse(termino);
                Time hrs = tm.restarTime(Time.valueOf(sdf.format(date_fin)),
                        Time.valueOf(sdf.format(date_ini)));
                suma = String.valueOf(hrs);
            }
            if(op == 4) {
                String inicio = args[1];
                String termino = args[4];
                String ref_inicio = args[2];
                String ref_termino = args[3];
                Date date_ini = sdf.parse(inicio);
                Date date_fin = sdf.parse(termino);
                Date date_ref_ini = sdf.parse(ref_inicio);
                Date date_ref_fin = sdf.parse(ref_termino);
                Time hrs_trabajo = tm.restarTime(Time.valueOf(sdf.format(date_ref_ini)),
                        Time.valueOf(sdf.format(date_ini)));
                Time hrs_refrigerio = tm.restarTime(Time.valueOf(sdf.format(date_fin)),
                        Time.valueOf(sdf.format(date_ref_fin)));
                System.out.println("Trabajo: "+hrs_trabajo+"Refrigerio: "+hrs_refrigerio);
                Time hrs = tm.sumarTime(hrs_trabajo, hrs_refrigerio);
                System.out.println("suma: "+hrs);
                suma = String.valueOf(hrs);
            } 
        } catch(Exception e) {
            System.out.println(_error + "calculoHoras: "+e);
        }
        return suma;
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
