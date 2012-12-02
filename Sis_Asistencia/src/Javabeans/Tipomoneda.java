
package Javabeans;

public class Tipomoneda {
    private int idtipmon;
    private String name;

     /* Constructor final
     */
    public Tipomoneda(int idtipmon, String name) {
        this.idtipmon = idtipmon;
        this.name = name;
    }
    
    /* Constructor por omisión
     */

    public Tipomoneda() 
    {
        
    }

    /**
     * @return the idtipmon
     */
    public int getIdtipmon() {
        return idtipmon;
    }

    /**
     * @param idtipmon the idtipmon to set
     */
    public void setIdtipmon(int idtipmon) {
        this.idtipmon = idtipmon;
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
