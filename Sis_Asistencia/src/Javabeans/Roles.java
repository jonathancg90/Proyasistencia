
package Javabeans;


public class Roles {
    private int idrol;
    private String name;

    public Roles() {
    }

    public Roles(int idrol, String name) {
        this.idrol = idrol;
        this.name = name;
    }

    /**
     * @return the idrol
     */
    public int getIdrol() {
        return idrol;
    }

    /**
     * @param idrol the idrol to set
     */
    public void setIdrol(int idrol) {
        this.idrol = idrol;
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
        this.name = name;
    }
    
    
}
