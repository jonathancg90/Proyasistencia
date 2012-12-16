
package Javabeans;


public class Tipohorario {
    private int idtiphor;
    private String name;

    public Tipohorario() {
    }

    public Tipohorario(int idtiphor, String name) {
        this.idtiphor = idtiphor;
        this.name = name.toUpperCase();
    }

    public int getIdtiphor() {
        return idtiphor;
    }

    public String getName() {
        return name;
    }

    public void setIdtiphor(int idtiphor) {
        this.idtiphor = idtiphor;
    }

    public void setName(String name) {
        this.name = name.toUpperCase();
    }
    
    
}
