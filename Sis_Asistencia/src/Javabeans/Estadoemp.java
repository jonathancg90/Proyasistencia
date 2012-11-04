
package Javabeans;


public class Estadoemp {
    private int idest;
    private String name;
    
    /* Constructor final
     */
    public Estadoemp(int idest, String name) {
        this.idest = idest;
        this.name = name;
    }
    
    /* Constructor por omisión
     */
    public Estadoemp() {
    }

    /**
     * @return the idest
     */
    public int getIdest() {
        return idest;
    }

    /**
     * @param idest the idest to set
     */
    public void setIdest(int idest) {
        this.idest = idest;
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
