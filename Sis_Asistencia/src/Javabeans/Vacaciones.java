
package Javabeans;


public class Vacaciones {
    
    private int idvac;
    private int idemp;
    private String f_ini;
    private String f_final;
    private String created;
    private String modified;

    public Vacaciones() {
    }

    public Vacaciones(int idvac, int idemp, String f_ini, String f_final, String created, String modified) {
        this.idvac = idvac;
        this.idemp = idemp;
        this.f_ini = f_ini;
        this.f_final = f_final;
        this.created = created;
        this.modified = modified;
    }

    /**
     * @return the idvac
     */
    public int getIdvac() {
        return idvac;
    }

    /**
     * @param idvac the idvac to set
     */
    public void setIdvac(int idvac) {
        this.idvac = idvac;
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
     * @return the f_ini
     */
    public String getF_ini() {
        return f_ini;
    }

    /**
     * @param f_ini the f_ini to set
     */
    public void setF_ini(String f_ini) {
        this.f_ini = f_ini;
    }

    /**
     * @return the f_final
     */
    public String getF_final() {
        return f_final;
    }

    /**
     * @param f_final the f_final to set
     */
    public void setF_final(String f_final) {
        this.f_final = f_final;
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
