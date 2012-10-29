
package Javabeans;

public class Usuario {
    private int idusu;
    private String username;
    private String password;
    private int idemp;
    
    /* Constructor final
     */
    public Usuario(int idusu, String username, String password, int idemp) {
        this.idusu = idusu;
        this.username = username;
        this.password = password;
        this.idemp = idemp;
    }
    /* Constructor por omisión
     */
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
        this.username = username;
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
    
}
