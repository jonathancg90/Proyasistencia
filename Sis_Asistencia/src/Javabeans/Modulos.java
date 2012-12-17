
package Javabeans;


public class Modulos {
    private int idmod;
    private String name;
    private boolean state;
    private String created;
    private String modified;

    public Modulos(int idmod, String name, boolean state, String created, String modified) {
        this.idmod = idmod;
        this.name = name.toUpperCase();
        this.state = state;
        this.created = created;
        this.modified = modified;
    }

    public Modulos() {
    }

    public int getIdmod() {
        return idmod;
    }

    public String getName() {
        return name;
    }

    public boolean isState() {
        return state;
    }

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public void setIdmod(int idmod) {
        this.idmod = idmod;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

 
    
}
