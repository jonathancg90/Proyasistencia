
package Javabeans;

public class TipoJustificacion {
    
    private int idjus;
    private String name;

    public TipoJustificacion() {
    }

    public TipoJustificacion(int idjus, String name) {
        this.idjus = idjus;
        this.name = name;
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
  
}
