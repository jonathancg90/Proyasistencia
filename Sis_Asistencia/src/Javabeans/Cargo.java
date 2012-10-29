
package Javabeans;


public class Cargo {
    private int idcar;
    private String name;
    private int idare;
    
    /* Constructor final
     */
    public Cargo(int idcar, String name, int idare) {
        this.idcar = idcar;
        this.name = name;
        this.idare = idare;
    }
    
    /* Constructor por omisión
     */
    public Cargo() {
    }

    /**
     * @return the idcar
     */
    public int getIdcar() {
        return idcar;
    }

    /**
     * @param idcar the idcar to set
     */
    public void setIdcar(int idcar) {
        this.idcar = idcar;
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
    
}