
package Javabeans;


public class Cargo {
    private int idcar;
    private int idare;
    private String name;
    private String created;
    private String modified;
    
    /* Constructor final
     */
    public Cargo(int idcar, String name, int idare, String created, String modified) {
        this.idcar = idcar;
        this.idare = idare;
        this.name = name.toUpperCase();
        this.created = created;
        this.modified = modified;
    }
    
    /* Constructor por Omision
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
        this.name = name.toUpperCase();
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
