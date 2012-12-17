
package Dao;

import Javabeans.Horarios;
import Utilitarios.Helpers;
import Utilitarios.Query;
import Utilitarios.Validators;
import java.sql.PreparedStatement;


public class HorariosDAO {
    
    
    private Query qs;
    private Horarios objHor;
    private Helpers hp;
    private Validators objVal;
    private String filter[][];
    private String campos[];
    private int witdhcolum[];
    private String _table;
    private String _error;
    
    PreparedStatement  pt = null;
    
     public HorariosDAO(){
        _table = "horarios";
        _error = "Dao_HorariosDAO_";
        filter = new String[0][0];
        campos = new String[2];
        campos[0]="idhor";
        campos[1]="nombre";
        witdhcolum = new int[1];
        witdhcolum[0]=50;
    }
    
}
