
package Javabeans;


public class Empresa {
    private int idempr;
    private String name;
    private String ruc;
    private boolean estado;
    private int idemp;
    private String created;
    private String modified;
    
    /* Constructor final
     */
    public Empresa(int idempr, String name, String ruc, boolean estado, String created, String modified) {
        this.idempr = idempr;
        this.name = name;
        this.ruc = ruc;
        this.estado = estado;
        this.created = created;
        this.modified = modified;
    }
    
    /* Constructor por Omision
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
