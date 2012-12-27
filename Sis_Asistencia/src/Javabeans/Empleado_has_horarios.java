
package Javabeans;


public class Empleado_has_horarios {
 
    private int NMID;
    private int idemp;
    private int idhor;
    private String inicio;
    private String fin;

    public Empleado_has_horarios() {
    }

    public Empleado_has_horarios(int NMID, int idemp, int idhor, String inicio, String fin) {
        this.NMID = NMID;
        this.idemp = idemp;
        this.idhor = idhor;
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * @return the NMID
     */
    public int getNMID() {
        return NMID;
    }

    /**
     * @param NMID the NMID to set
     */
    public void setNMID(int NMID) {
        this.NMID = NMID;
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
     * @return the idhor
     */
    public int getIdhor() {
        return idhor;
    }

    /**
     * @param idhor the idhor to set
     */
    public void setIdhor(int idhor) {
        this.idhor = idhor;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public String getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(String fin) {
        this.fin = fin;
    }
    
    
    
    
    
}
