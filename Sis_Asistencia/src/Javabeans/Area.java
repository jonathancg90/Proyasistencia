
package Javabeans;


public class Area {
    private int idare;
    private String name;
    
    /* Constructor final
     */
    public Area(int idare, String name) {
        this.idare = idare;
        this.name = name;
    }
    
    /* Constructor por omisión
     */
    public Area() {
    }

    /**
     * @return the idare
     */
    public int getIdare() {
        return idare;
    }

    /**
     * @param idare the idare to set
     */
    public void setIdare(int idare) {
        this.idare = idare;
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
