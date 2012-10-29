
package Javabeans;


public class Tipoempleado {
    private int idtip;
    private String name;
    
    /* Constructor final
     */
    public Tipoempleado(int idtip, String name) {
        this.idtip = idtip;
        this.name = name;
    }
    
    /* Constructor por omisión
     */
    public Tipoempleado() {
    }

    /**
     * @return the idtip
     */
    public int getIdtip() {
        return idtip;
    }

    /**
     * @param idtip the idtip to set
     */
    public void setIdtip(int idtip) {
        this.idtip = idtip;
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
    
}
