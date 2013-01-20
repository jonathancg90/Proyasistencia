
package Javabeans;

import java.sql.Time;

public class Justificaciones {
    private int idjus;
    private int empleado_idemp;
    private int tipo_justificaciones_idtip_jus;
    private int fecha;
    private String motivo;
    private String recibo;
    private Time horas;

    public Justificaciones() {
    }

    public Justificaciones(int idjus, int empleado_idemp, int tipo_justificaciones_idtip_jus, int fecha, String motivo, String recibo, Time horas) {
        this.idjus = idjus;
        this.empleado_idemp = empleado_idemp;
        this.tipo_justificaciones_idtip_jus = tipo_justificaciones_idtip_jus;
        this.fecha = fecha;
        this.motivo = motivo;
        this.recibo = recibo;
        this.horas = horas;
    }

    /**
     * @return the idjus
     */
    public int getIdjus() {
        return idjus;
    }

    /**
     * @param idjus the idjus to set
     */
    public void setIdjus(int idjus) {
        this.idjus = idjus;
    }

    /**
     * @return the empleado_idemp
     */
    public int getEmpleado_idemp() {
        return empleado_idemp;
    }

    /**
     * @param empleado_idemp the empleado_idemp to set
     */
    public void setEmpleado_idemp(int empleado_idemp) {
        this.empleado_idemp = empleado_idemp;
    }

    /**
     * @return the tipo_justificaciones_idtip_jus
     */
    public int getTipo_justificaciones_idtip_jus() {
        return tipo_justificaciones_idtip_jus;
    }

    /**
     * @param tipo_justificaciones_idtip_jus the tipo_justificaciones_idtip_jus to set
     */
    public void setTipo_justificaciones_idtip_jus(int tipo_justificaciones_idtip_jus) {
        this.tipo_justificaciones_idtip_jus = tipo_justificaciones_idtip_jus;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the recibo
     */
    public String getRecibo() {
        return recibo;
    }

    /**
     * @param recibo the recibo to set
     */
    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    /**
     * @return the horas
     */
    public Time getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(Time horas) {
        this.horas = horas;
    }
    
}
