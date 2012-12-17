
package Javabeans;

public class Tipomoneda {
    private int idtipmon;
    private String nombre;
    private String simbol;
    private boolean por_defecto;
    private String created;
    private String modified;

    public Tipomoneda(int idtipmon, String nombre, String simbol, boolean por_defecto, String created, String modified) {
        this.idtipmon = idtipmon;
        this.nombre = nombre.toUpperCase(); 
        this.simbol = simbol.toUpperCase(); 
        this.por_defecto = por_defecto;
        this.created = created;
        this.modified = modified;
    }

    public Tipomoneda() {
    }

    public int getIdtipmon() {
        return idtipmon;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbol() {
        return simbol;
    }

    public boolean isPor_defecto() {
        return por_defecto;
    }

    public String getCreated() {
        return created;
    }

    public String getModified() {
        return modified;
    }

    public void setIdtipmon(int idtipmon) {
        this.idtipmon = idtipmon;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase(); 
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol.toUpperCase(); 
    }

    public void setPor_defecto(boolean por_defecto) {
        this.por_defecto = por_defecto;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }


    
}
