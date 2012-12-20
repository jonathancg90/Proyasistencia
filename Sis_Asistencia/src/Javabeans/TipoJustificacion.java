
package Javabeans;

public class TipoJustificacion {
    
    private int idjus;
    private String name;
    private boolean state;
    private String created;
    private String modified;

    public TipoJustificacion() {
    }

    public TipoJustificacion(int idjus, String name, boolean state, String created, String modified) {
        this.idjus = idjus;
        this.name = name;
        this.state = state;
        this.created = created;
        this.modified = modified;
    }

    public int getIdjus() {
        return idjus;
    }

    public void setIdjus(int idjus) {
        this.idjus = idjus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }
    
    
}
