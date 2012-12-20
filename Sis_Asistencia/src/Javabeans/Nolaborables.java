
package Javabeans;


public class Nolaborables {
    
    private int idnolab;
    private int idempr;
    private boolean status;
    private String fecha;
    private String created;
    private String modified;

    public Nolaborables() {
    }

    public Nolaborables(int idnolab, int idempr, boolean status, String fecha, String created, String modified) {
        this.idnolab = idnolab;
        this.idempr = idempr;
        this.status = status;
        this.fecha = fecha;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the idnolab
     */
    public int getIdnolab() {
        return idnolab;
    }

    /**
     * @param idnolab the idnolab to set
     */
    public void setIdnolab(int idnolab) {
        this.idnolab = idnolab;
    }

    /**
     * @return the idempr
     */
    public int getIdempr() {
        return idempr;
    }

    /**
     * @param idempr the idempr to set
     */
    public void setIdempr(int idempr) {
        this.idempr = idempr;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
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
