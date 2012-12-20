
package Javabeans;


public class EstadoEmp {
    
    private int idest;
    private String nombre;

    public EstadoEmp(int idest, String nombre) {
        this.idest = idest;
        this.nombre = nombre.toUpperCase();
    }

    public EstadoEmp() {
    }

    public int getIdest() {
        return idest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdest(int idest) {
        this.idest = idest;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    
}
