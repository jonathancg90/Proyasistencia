
package Javabeans;


public class Sucursal {
    private int idsuc;
    private String name;
    private String direccion;
    private int idciu;
    private int idempr;
    
    /* Constructor final
     */
    public Sucursal(int idsuc, String name, String direccion, int idciu, int idempr) {
        this.idsuc = idsuc;
        this.name = name;
        this.direccion = direccion;
        this.idciu = idciu;
        this.idempr = idempr;
    }
    
    /* Constructor por omisión
     */
    public Sucursal() {
    }

    /**
     * @return the idsuc
     */
    public int getIdsuc() {
        return idsuc;
    }

    /**
     * @param idsuc the idsuc to set
     */
    public void setIdsuc(int idsuc) {
        this.idsuc = idsuc;
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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the idciu
     */
    public int getIdciu() {
        return idciu;
    }

    /**
     * @param idciu the idciu to set
     */
    public void setIdciu(int idciu) {
        this.idciu = idciu;
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
    
}
