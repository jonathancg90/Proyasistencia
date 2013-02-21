
package Javabeans;


public class Horarios {
    private int idhora;
    private String nombre;
    private int tipo;
    private boolean estado;
    private String created;
    private String modified;

    public Horarios() {
    }

    public Horarios(int idhora, String nombre, int tipo, boolean estado, String created, String modified) {
        this.idhora = idhora;
        this.nombre = nombre.toUpperCase();
        this.tipo = tipo;
        this.estado = estado;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the idhora
     */
    public int getIdhora() {
        return idhora;
    }

    /**
     * @param idhora the idhora to set
     */
    public void setIdhora(int idhora) {
        this.idhora = idhora;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
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
