
package Javabeans;


public class Empresa {
    private int idempr;
    private String name;
    private String ruc;
    private boolean estado;
    private int idemp;
    
    /* Constructor final
     */
    public Empresa(int idempr, String name, String ruc, boolean estado, int idemp) {
        this.idempr = idempr;
        this.name = name;
        this.ruc = ruc;
        this.estado = estado;
        this.idemp = idemp;
    }
    
    /* Constructor por omisión
     */
    public Empresa() {
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * @param ruc the ruc to set
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
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
    
}
