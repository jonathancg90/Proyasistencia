
package Javabeans;

import java.sql.Time;

public class Registro {
   
    private int idreg;
    private int idemp;
    private int idtip_reg;
    private String fecha;
    private Time hora;
    private String created;
    private String modified;

    public Registro() {
    }

    public Registro(int idreg, int idemp, int idtip_reg, String fecha, Time hora, String created, String modified) {
        this.idreg = idreg;
        this.idemp = idemp;
        this.idtip_reg = idtip_reg;
        this.fecha = fecha;
        this.hora = hora;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the idreg
     */
    public int getIdreg() {
        return idreg;
    }

    /**
     * @param idreg the idreg to set
     */
    public void setIdreg(int idreg) {
        this.idreg = idreg;
    }

    /**
     * @return the idemp
     */
    public int getIdemp() {
        return idemp;
    }

    /**
     * @param idemp the idemp to set
     */
    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    /**
     * @return the idtip_reg
     */
    public int getIdtip_reg() {
        return idtip_reg;
    }

    /**
     * @param idtip_reg the idtip_reg to set
     */
    public void setIdtip_reg(int idtip_reg) {
        this.idtip_reg = idtip_reg;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * @return the created
     */
    public String getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * @return the modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified the modified to set
     */
    public void setModified(String modified) {
        this.modified = modified;
    }
    
    
    
}
