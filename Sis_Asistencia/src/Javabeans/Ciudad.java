
package Javabeans;


public class Ciudad {
    private int idciu;
    private String name;

    /* Constructor final
     */
    public Ciudad(int idciu, String name) {
        this.idciu = idciu;
        this.name = name.toUpperCase();
    }
    
    /* Constructor por omisión
     */
    public Ciudad() {
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
}
