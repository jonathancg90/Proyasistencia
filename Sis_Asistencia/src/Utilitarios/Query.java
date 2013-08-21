package Utilitarios;
/**
* Clase para formar sentecias query
* @author Gustavo Pajuelo
* @version Worktec 1.0
*/
import Utilitarios.Data;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Query extends ConexionBd{    
    
    private DefaultTableModel datos; 
    private ResultSet rs = null;
    private Statement s = null;
    private PreparedStatement  pt = null;
    private DefaultComboBoxModel MChoice;
    private Data dt;
    private String _error = "Utilitarios_Query_";
    private String identify="";
    private String idcamp="";

    public void setIdentify(String identify) {
        this.idcamp = identify;
        this.identify = identify;
    }
    
    public void DeleteAll(String table) throws SQLException {
        try {
            getConexion();
            pt = null;
            Statement s = null;
            s = conexion.createStatement();
            String id = getIdentify(table);
            pt  = conexion.prepareStatement("delete from "+table+" where "+id+" is not null");
            pt.executeUpdate();
            pt.close();
            closeConexion();   
        } catch(Exception e) {
            System.out.println(_error+"DeleteAll: "+e);
        }
    }
    public void RegisterAll(String table,String[] args) throws SQLException {
        try {
            getConexion();
            pt = null;
            Statement s = null;
            s = conexion.createStatement();
            String id = getIdentify(table);
            String query= "insert into "+ table+ " values(";
            for(int i=0;i<args.length;i++){
                if("NULL".equals(args[i].toUpperCase())){
                   query = query + "" + args[i].toLowerCase() + ""; 
                } else {
                   query = query + "'" + args[i].toUpperCase() + "'";   
                }
                if(i+1<args.length){
                        query = query + ",";
                }
            }
            query =  query + ")";
            pt  = conexion.prepareStatement(query);
            pt.executeUpdate();
            pt.close();
            closeConexion();   
        } catch(Exception e) {
            System.out.println(_error+"RegisterAll: "+e);
        }
    }
    public  PreparedStatement sqlRegister(String Table){
        pt = null;
        try{
            getConexion();
            String query;
            String campos="";
            String values="";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table +" LIMIT 1 ");
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            
            for(int i=1;i<=nCols;i++){
                if(!meta.isAutoIncrement(i)){
                    campos = campos + meta.getColumnName(i);
                    values = values + "?";
                    if(i<nCols){
                        campos = campos + ",";
                        values = values + ","; 
                    }
                }
            }
            query= "insert into "+Table+" ("+campos+") values("+values+")";
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
        }
        catch(Exception e){
            System.out.println(_error+"sqlRegister: "+e);
            return pt;
        }
    }
    public void AlterSecuence(String name, int start) throws SQLException{
        try {
            getConexion();
            pt = null;
            Statement s = null;
            s = conexion.createStatement();
            String query ="ALTER SEQUENCE "+name+" RESTART WITH "+start;
            pt  = conexion.prepareStatement(query);
            pt.executeUpdate();
            pt.close();
            closeConexion();
         } catch(Exception e) {
             System.out.println(_error+"AlterSecuence: "+e);
         }
    }
     /*
     * Arma actualizacion
     */
    public PreparedStatement sqlUpdate(String Table){
        pt = null;
        
        try{
            getConexion();
            String query;
            String condi="";
            String id = "id";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table+" LIMIT 1 ");
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            query = "update "+Table+" set ";
            
            for(int i=1;i<=nCols;i++){
                if(!meta.isAutoIncrement(i)){
                    for(int x=0;x<Utilitarios.Data.G_EXCLUDE.length;x++){
                        if(meta.getColumnName(i).equals(Utilitarios.Data.G_EXCLUDE[x])){
                            //Este campo ha sido excluido
                        } else {
                            query = query + meta.getColumnName(i)+ "=?,";
                        }
                    }  
                }
                else{
                    id =  meta.getColumnName(i);
                }
            }
            if(id.equals("NMID")){
                id="\"NMID\"";
            }
            query = query + " where "+id+"= ?";
            query = query.replace(", "," ");
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println(_error+"sqlUpdate: "+e);
            return pt;
        }
    }
     /*
     * Arma eliminacion
     */
    public PreparedStatement sqlDelete(String Table){
        pt = null;
        
        try{
            getConexion();
            String query;
            String id = "id";
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+Table+" LIMIT 1 ");
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();

            query = "delete from  "+Table+" where  ";
            
            for(int i=1;i<=nCols;i++){
                if(meta.isAutoIncrement(i)){
                    id =  meta.getColumnName(i);
                }
            }
            if(id.equals("NMID")){
            id="\"NMID\"";
            }
            query = query + id + "=?";
            pt  = conexion.prepareStatement(query);
            rs.close();
            return pt;
            
        }
        catch(Exception e){
            System.out.println(_error+"sqlDelete: "+e);
            return pt;
        }
    }
    
    /*
     * Armado de la consulta de listado y consulta
     */
    public String getQueryList(String[] args, String Table, String[][] Filter){
        String type;
        String camp;
        String[] temp;
        String[] order;
        String by_order="";
        String[] kargs =  new String[args.length];
        
        for(int i=0;i<args.length;i++){
            kargs[i] = args[i];
        }
        
        String qs = "select ";
        for(int i=0;i<kargs.length;i++)
        {
            temp = kargs[i].split("/");
            if(temp.length>=1){
                kargs[i] = temp[0];
            }
            temp = kargs[i].split("%");
            if(temp.length>=1){
                kargs[i] = temp[0];
            }
            qs = qs + kargs[i];
            qs = qs + ",";
        }
        order = Table.split("/");
        if(order.length>1){
            Table = order[0];
            by_order = "order by " + order[1] + " asc";
        }
        
        qs = qs +" from "+Table;
        qs = qs.replace(", "," ");
        
        if(Filter.length>0){
            qs = qs + " where ";
            for(int i=0;i<Filter.length;i++)
            {
                type = Filter[i][0].substring(0, 3);
                camp = Filter[i][0];
                camp = camp.substring(4, camp.length());
                
                switch(type){
                    case "int":qs = qs + " " + camp + "=" + Filter[i][1] + " ";
                         break;
                    case "equ":qs = qs + " " + camp + "='" + Filter[i][1] + "' ";
                         break;
                    case "bet":
                        String[] between;
                        between = camp.split("_");
                        qs = qs +" "+ between[0] + " between '" + between[1] + "' and '" + Filter[i][1] + "' ";
                         break;
                    default:qs = qs + " " + Filter[i][0] + " like '%" + Filter[i][1] + "%' ";
                         break;
                }
                if (Filter.length != i+1) { 
                    qs = qs + "and";
                }
            }
            qs = qs + by_order;
        }
        return qs;
    }
    /*
     * Clase generica para realizar consulas en Jtable
     */
    public  DefaultTableModel getAll(String[] args, String Table, String[][] Filter){
        try{
            ResultSet rs_all = null;
            hp = new Helpers();
            datos = new DefaultTableModel();
            getConexion();
            String id;
            Object[] fila; 
            String[] temp;
            String tbl;
            s = conexion.createStatement();
            String qs = getQueryList(args,Table, Filter);
            rs_all = s.executeQuery(qs);
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs_all.getMetaData();
            int nCols = meta.getColumnCount();
            String[] colum = new String[nCols];
            for (int i=0; i<nCols; ++i) {
                datos.addColumn(meta.getColumnName(i+1));
                colum[i]=meta.getColumnName(i+1);
                id = meta.getColumnName(i+1).substring(0, 2);
            }
            //Llenado registro Jtable
            fila = new Object[nCols];
            rs_all = s.executeQuery(qs);
            while(rs_all.next()){
                for(int i=0; i<nCols; ++i){   
                    fila[i] = rs_all.getObject(i+1);
                    temp = args[i].split("/");
                    if(temp.length>1){
                        tbl = temp[1];
                        this.identify = "str_"+temp[2];
                        fila[i] =  idChoice(tbl,colum[i], String.valueOf(rs_all.getObject(i+1)));
                    }
                    temp = args[i].split("%");
                    if(temp.length>1){
                        String[] camp;
                        tbl = temp[1];
                        camp =  hp.getConstantData(tbl);
                        fila[i] = camp[rs_all.getInt(i+1)];
                    }
                }
                datos.addRow(fila);
            }
           //Cerrando conexion
           rs_all.close();
           closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"getAll: "+e);
        }
        
        return datos;
        }
    /*
     * Autocarga de los estados activo, inactivo
     */
    public void loadState(JComboBox cmbState, boolean value){
        try{
            dt = new Data();
            MChoice = new DefaultComboBoxModel();
            if(value == false){
                MChoice.addElement(dt.G_STATES[0]);
                MChoice.addElement(dt.G_STATES[1]);
            }
            else{
                MChoice.addElement(dt.G_STATES[1]);
                MChoice.addElement(dt.G_STATES[0]);
            }
                
            cmbState.setModel(MChoice);   
        }
        catch(Exception e){
            System.out.println(_error+"loadState: "+e);
        }
    }
    
    /*
     * Autocarga de los estados activo, inactivo
     */
    public void loadTypeextra(JComboBox cmbState, int tipo){
        try{
            dt = new Data();
            MChoice = new DefaultComboBoxModel();
            if(tipo == 0){
                MChoice.addElement(dt.G_TIPOEXTRA[0]);
                MChoice.addElement(dt.G_TIPOEXTRA[1]);
            }
            else{
                MChoice.addElement(dt.G_TIPOEXTRA[1]);
                MChoice.addElement(dt.G_TIPOEXTRA[0]);
            }
                
            cmbState.setModel(MChoice);   
        }
        catch(Exception e){
            System.out.println(_error+"loadTypeextra: "+e);
        }
    }
    
    /*
     * Autocarga de los estados activo, inactivo
     */
    public void loaddiseño(JComboBox cmbState){
        try{
            dt = new Data();
            MChoice = new DefaultComboBoxModel();
            MChoice.addElement(dt.G_DISEÑOS[0]);
            MChoice.addElement(dt.G_DISEÑOS[1]);
            MChoice.addElement(dt.G_DISEÑOS[2]);
            MChoice.addElement(dt.G_DISEÑOS[3]);
            MChoice.addElement(dt.G_DISEÑOS[4]);
            MChoice.addElement(dt.G_DISEÑOS[5]);
            MChoice.addElement(dt.G_DISEÑOS[6]);
            MChoice.addElement(dt.G_DISEÑOS[7]);
            MChoice.addElement(dt.G_DISEÑOS[8]);
            MChoice.addElement(dt.G_DISEÑOS[9]);
            MChoice.addElement(dt.G_DISEÑOS[10]);
            MChoice.addElement(dt.G_DISEÑOS[11]);
            MChoice.addElement(dt.G_DISEÑOS[12]);
            cmbState.setModel(MChoice);   
        }
        catch(Exception e){
            System.out.println(_error+"loaddiseño: "+e);
        }
    }
    
    public int loadGlobal(int op, JComboBox cmbType, int value){
        int id = 0;
        try{
            dt = new Data();
            int tamaño=0;
            String G_global[];
                switch(op){
                    case 1:
                        tamaño = dt.G_TYPEHOR.length;
                        G_global = new String[tamaño];
                        G_global = dt.G_TYPEHOR;
                        break;
                    case 2: 
                        tamaño = dt.G_DIAS.length;
                        G_global = new String[tamaño];
                        G_global = dt.G_DIAS;
                        break;
                    case 3: 
                        tamaño = dt.G_TIPOH.length;
                        G_global = new String[tamaño];
                        G_global = dt.G_TIPOH;
                        break;
                    case 4:
                        tamaño = dt.G_TIPOREG.length;
                        G_global = new String[tamaño];
                        G_global = dt.G_TIPOREG;
                        break;
                    default : G_global = new String[0];
                    break;
                }
            if(value > 0){
                MChoice = new DefaultComboBoxModel();
                MChoice.addElement(G_global[value]);
                
                for(int i=1;i<G_global.length;i++){
                    if(value!=i){
                      MChoice.addElement(G_global[i]);  
                    }
                }
                cmbType.setModel(MChoice);     
            } else {
                for(int i=1;i<G_global.length;i++){
                    if(cmbType.getSelectedItem() == G_global[i]){
                        return i;
                    }
                }
            }
        }
        catch(Exception e){
            System.out.println(_error+"loadType: "+e);
        }
        return id;
    }
     /*
     * Autocarga de los combos
     */
    public void loadChoice(JComboBox cmbChoice, String Tbl, String Campo){
        try{
            getConexion();
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            rs = s.executeQuery("select " +Campo+ " from " +Tbl);
            while(rs.next()) {
              MChoice.addElement(rs.getString(Campo));
            }     
            
            cmbChoice.setModel(MChoice);
        }
        catch(Exception e){
            System.out.println(_error+"loadChoice: "+e);
        }
    }
       /*
     * Autocarga de los combos
     */
    public void loadChoiceDefault(JComboBox cmbChoice, String Tbl, String Campo, int value){
        try{
            boolean op = false;
            getConexion();
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            if("".equals(this.idcamp)){
                this.idcamp = getIdentify(Tbl);
                op = true;
            }
            rs = s.executeQuery("select " +Campo+ " from " +Tbl + " where " + this.idcamp + "=" +value);
            while(rs.next()) {
              MChoice.addElement(rs.getString(Campo));
              
            }
            if(op){
                rs = s.executeQuery("select " +Campo+ " from " +Tbl + " where " + this.idcamp + "!=" +value);
                while(rs.next()) {
                  MChoice.addElement(rs.getString(Campo));
                } 
            }
            this.idcamp = "";
            cmbChoice.setModel(MChoice);   
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"loadChoiceDefault: "+e);
        }
    }
     
     /*
     * Me devuelve el id de 
     */
    public String idChoice(String Tbl, String Campo, String value){
        String campo = "0";
        String type="int";
        try{
            getConexion();
            String identify = "";
            String query="";
            if("".equals(this.identify)){
                identify = getIdentify(Tbl);
            } else {
                identify = this.identify;
                type = identify.substring(0, 3);
                switch(type){
                    case "int":identify = identify.substring(4, identify.length());
                         break;
                    case "str":identify =  identify.substring(4, identify.length());
                         break;
                    default:type="int";
                        ;break;
                        
                }
            }
            MChoice = new DefaultComboBoxModel();
            s = conexion.createStatement();
            value =  value.toUpperCase();
            query  = "select " +identify+ " from " +Tbl+ " where " +Campo+ " = '"+value+"'";
            rs = s.executeQuery(query);
            while(rs.next()) {
                switch(type){
                    case "int":campo = String.valueOf(rs.getInt(identify));
                         break;
                    case "str":campo =  rs.getString(identify);
                         break;
                }
            }     
            this.identify = "";
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"idChoice: "+e);
        }
        return campo;
    }
    public String getIdMltiSentences(String Table,String id, String[] campos){
        String campo="";
        try{
            getConexion();
            if("".equals(id)){
                id = getIdentify(Table);
            }

            String query  = "select " +id+ " from " +Table+ " where ";
            for(int i=0;i<campos.length;i++){
                query = query + campos[i] + "='" + campos[i+1]+"' ";
                i++;
                if(i < campos.length - 1) {
                    query = query + "and ";
                }
            }
            s = conexion.createStatement();
            rs = s.executeQuery(query);
            while(rs.next()) {
                campo = String.valueOf(rs.getInt(id));
            }
            closeConexion(); 
        } catch(Exception e){
            System.out.println(_error + "getIdMltiSentences: "+e);
        }
        return campo;
    }
    
    /*
     * Obtener valores de la tabla 
     */
        public  String[] getRecords(String Table,int Id){
        String campos[] = new String[0];
        try{
            getConexion();
            String query;
            String identify="";
            identify = getIdentify(Table);
            if(identify.equals("NMID")){
            identify="\"NMID\"";
            }
            query= "select * from "+Table+" where "+ identify +" = "+Id+"";
            s = conexion.createStatement();
            rs = s.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            campos = new String[nCols+1];
            
            rs.next();
            for(int i=1;i<=nCols;i++){
                    campos[i]=rs.getString(i);
            }
            rs.close();
            closeConexion(); 
        }
        catch(Exception e){
            System.out.println(_error+"getRecords: "+e);
        }
        return campos;
    }
        /*
         * Obetener el indice de una tabla
         */
        private  String getIdentify(String Table){
            String identify="id";
            try{  
                getConexion();
                Statement s = null;

                s = conexion.createStatement();
                rs = s.executeQuery("select * from "+Table +" LIMIT 1 ");
                //Llenado Cabecera Jtable
                ResultSetMetaData meta = rs.getMetaData();
                int nCols = meta.getColumnCount();
                
                for(int i=1;i<=nCols;i++){
                    if(meta.isAutoIncrement(i)){
                        identify = meta.getColumnName(i);
                    }
                }
                rs.close();
                if ("NMID".equals(identify)) {
                    identify = "\"NMID\"";
                }
            } catch (Exception e) {
                System.out.println(_error+"getIdentify: " +e);
            }
                
            return identify;
        }
        /*
         * Obtener la cantidad de registros en una tabla
         */
        public  int getCountRegister(String[] args){
            int cant=0;
            try{  
                getConexion();
                Statement s = null;
                s = conexion.createStatement();
                String query="";
                if(args.length>0){
                    if(args.length==1){
                        query = "select count(*) from "+args[0];
                    }
                    else if(args.length>=3){
                        query = "select count(*) from "+args[0]+" where ";
                        for(int i=1;i<args.length;i++){
                            query = query + args[i]+" = '"+args[i+1]+"'";
                            if(args.length!=i+2){ 
                                query = query + " and ";
                            }
                            i++;
                        }
                    }
                    rs = s.executeQuery(query);
                    rs.next();
                    cant = rs.getInt(1);
                }
                
            }catch(Exception e){
                System.out.println(_error+"getCountRegister"+e);
            }
            return cant;
         }
        /*
         * Validar si es integer or String
         */
        public int tipodato(){
            int i=0;
        return i;
        }
        /*
         * Validar si es integer or String
         */
        public int gettamColumn(String table,int pos) throws SQLException{
            getConexion();
            Statement s = null;
            s = conexion.createStatement();
            rs = s.executeQuery("select * from "+table +" LIMIT 1 ");
            ResultSetMetaData meta = rs.getMetaData();
            int pres = meta.getPrecision(pos);
            return pres;
            
        }
        /*
         * Filtro de fehcas (rango)
         */
        public  DefaultTableModel getFechafilter(String[] args, String Table, String inicio,String fin,String id_emp, int idemp){
        try{
            datos = new DefaultTableModel();
            getConexion();
            String id;
            Object[] fila; 
            s = conexion.createStatement();
            String qs = "select ";
            for(int i=0;i<args.length;i++){
                qs = qs + args[i];
                qs = qs + ",";
            }
            qs = qs +" from "+Table;
            qs = qs.replace(", "," ");
            qs = qs + " where ";
            qs=qs+" (fecha >='"+inicio+"') and (fecha=<'"+fin+"') and "+id_emp+" = "+idemp;
            rs = s.executeQuery(qs);
            //Llenado Cabecera Jtable
            ResultSetMetaData meta = rs.getMetaData();
            int nCols = meta.getColumnCount();
            for(int i=0; i<nCols; ++i){    
                datos.addColumn(meta.getColumnName(i+1));
                id = meta.getColumnName(i+1).substring(0, 2);
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
        catch(Exception e){
            System.out.println(_error+"getFechaFilter: "+e);
        }
        
        return datos;
        }
        

        public Time[] getHora(String[] args, int max){
            Time hora[] = new Time[0];
            int k = 1;
            if (max > 0){
                try{
                    getConexion();
                    Statement s = null;
                    s = conexion.createStatement();
                    String query = "select hora from "+ args[0]+" where ";
                    for(int i=1;i<args.length;i++){
                         query = query + args[i]+" = "+args[i+1];
                         if(args.length!=i+2){ 
                            query = query + " and ";
                         }
                         i++;
                    }
                    rs = s.executeQuery(query);
                    hora = new Time[max+1];
                    while (rs.next()) {
                        hora[k]= rs.getTime(1);
                        k++;
                    }
                    rs.close();
                    closeConexion();
                } catch (Exception e) {
                     System.out.println(_error+"getHora: "+e);
                }
            }
            return hora;
        }
        //Obtener cantidad de registro de una tabla
        public int getcount(String tabla)
        {
            int num=0;
            try{
                getConexion();
                s = conexion.createStatement();
                String qs = "select count(*) from " + tabla;
                rs = s.executeQuery(qs);
                rs.next();
                num = rs.getInt(1);

                closeConexion();
                rs.close();
            }
            catch(Exception e){
                System.out.println(_error+"getcount: "+e);
            }return num;

        }
        //Creacion de tabla temporal de reportes
        public void create_report(String[] args) {
            try {
                getConexion();
                pt = null;
                String qs = "create table report(";
                for(int i=0;i<args.length;i++){
                    qs = qs + args[i] + " varchar(150)";
                    if(args.length!=i+1){ 
                        qs = qs + ",";
                    }
                }
                qs = qs + ")";
                pt  = conexion.prepareStatement(qs);
                pt.executeUpdate();
                pt.close();
                System.out.append("Se Creo");
                closeConexion();
            } catch(Exception e) {
                destroid_report();
                create_report(args);
            }
        }
        //Eliminar tabla temporal de reportes
        public void destroid_report() {
            try {
                getConexion();
                pt = null;
                pt  = conexion.prepareStatement("drop table report");
                pt.executeUpdate();
                pt.close();
                closeConexion();
            } catch(Exception e) {
                System.out.println(_error+"destroid_report: "+e);
            }
        }
        //Ejecutar consultas
        public String Execute(String query) {
            String result = "";
            try{
                getConexion();
                s = conexion.createStatement();

                rs = s.executeQuery(query);
                rs.next();
                result = rs.getString(1);

                closeConexion();
                rs.close();
            }
            catch(Exception e){
                System.out.println(_error+"Execute: "+e);
            }
            return result;

        }
        //Obtener dia a partir de la fecha
        public String getDayOfTheWeek(String Fecha) {
            String StrDia="";
            try {
                String query="select dia_semana('"+Fecha+"');";
                StrDia = Execute(query);
            }
            catch(Exception e) {
                System.out.println(_error + "getDayOfTheWeek: "+e);
            }
        return StrDia;
        }
        //Obtener el dia siguiente o previo
        public String getDay(String Fecha,String Op) {
            String StrDia="";
            try {
                String query="select Date '"+Fecha+"' "+Op+" Integer '1'";
                StrDia = Execute(query);
            }
            catch(Exception e) {
                System.out.println(_error + "getDay: "+e);
            }
        return StrDia;
        }
        //Obtener el dias entre dos fechas
        public String getDayToRange(String FechaI,String FechaF) {
            String StrDia="";
            try {
                String query="select to_date('"+FechaI+"','dd-mm-yyyy') - to_date('"+FechaF+"','dd-mm-yyyy')";
                StrDia = Execute(query);
            }
            catch(Exception e) {
                System.out.println(_error + "getDayToRange: "+e);
            }
        return StrDia;
        }
    }
        

