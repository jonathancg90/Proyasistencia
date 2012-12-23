
package Javabeans;

public class Usuario {
    private int idusu;
    private String username;
    private String password;
    private int idemp;
    private String created;
    private String modified;
    private boolean estado;
    private int rol;
    private String correo;

    public Usuario(int idusu, String username, String password, int idemp, 
            String created, String modified, boolean estado, int rol,
            String correo) {
        this.idusu = idusu;
        this.username = username.toUpperCase();
        this.password = password;
        this.idemp = idemp;
        this.created = created;
        this.modified = modified;
        this.estado = estado;
        this.rol = rol;
        this.correo = correo.toUpperCase();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo.toUpperCase();
    }

    public Usuario() {
    }

    /**
     * @return the idusu
     */
    public int getIdusu() {
        return idusu;
    }

    /**
     * @param idusu the idusu to set
     */
    public void setIdusu(int idusu) {
        this.idusu = idusu;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username.toUpperCase();
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the idemp
     */
    public int getIdemp() {
        return idemp;
    }

    /**
     * @param idemp the idemp to set
     */
    public void setIdemp(int idemp) {
        this.idemp = idemp;
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
     * @return the rol
     */
    public int getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(int rol) {
        this.rol = rol;
    }

    
}
