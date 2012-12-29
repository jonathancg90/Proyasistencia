package Javabeans;

import java.sql.Time;


public class DetailHorario {
    
    private int iddet_hor;
    private int dia;
    private int idtip_reg;
    private Time ingreso;
    private Time salida;
    private int horarios_idhor;

    public DetailHorario(int iddet_hor, int dia, int idtip_reg, Time ingreso, Time salida, int horarios_idhor) {
        this.iddet_hor = iddet_hor;
        this.dia = dia;
        this.idtip_reg = idtip_reg;
        this.ingreso = ingreso;
        this.salida = salida;
        this.horarios_idhor = horarios_idhor;
    }

    public DetailHorario() {
    }

    public void setIddet_hor(int iddet_hor) {
        this.iddet_hor = iddet_hor;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setIdtip_reg(int idtip_reg) {
        this.idtip_reg = idtip_reg;
    }

    public void setIngreso(Time ingreso) {
        this.ingreso = ingreso;
    }

    public void setSalida(Time salida) {
        this.salida = salida;
    }

    public void setHorarios_idhor(int horarios_idhor) {
        this.horarios_idhor = horarios_idhor;
    }

    public int getIddet_hor() {
        return iddet_hor;
    }

    public int getDia() {
        return dia;
    }

    public int getIdtip_reg() {
        return idtip_reg;
    }

    public Time getIngreso() {
        return ingreso;
    }

    public Time getSalida() {
        return salida;
    }

    public int getHorarios_idhor() {
        return horarios_idhor;
    }

    
    
    
}
