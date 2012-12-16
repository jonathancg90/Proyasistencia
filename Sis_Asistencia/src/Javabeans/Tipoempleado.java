
package Javabeans;


public class Tipoempleado {
    private int idtip;
    private String name;
    private boolean estado;
    private String created;
    private String modified;
    
    /* Constructor final
     */
    public Tipoempleado(int idtip, String name, String created, String modified, boolean estado) {
        this.idtip = idtip;
        this.name = name.toUpperCase();
        this.estado = estado;
        this.created = created;
        this.modified = modified;
    }
    
    /* Constructor por Omision
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
        this.name = name.toUpperCase();
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
