
package Javabeans;


public class Area {
    private int idare;
    private String name;
    private boolean state;
    private String created;
    private String modified;
    /* 
     * Constructor final
     */
    public Area(int idarea, String name, String created, String modified, boolean state) {
        this.idare = idarea;
        this.name = name.toUpperCase();
        this.state = state;
        this.created = created;
        this.modified = modified;
    }
    /* 
     * Constructor por Omision
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
        this.name = name.toUpperCase();
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

    /**
     * @return the estado
     */
    public boolean getState() {
        return state;
    }

    /**
     * @param estado the estado to set
     */
    public void setState(boolean estado) {
        this.state = estado;
    }
}
