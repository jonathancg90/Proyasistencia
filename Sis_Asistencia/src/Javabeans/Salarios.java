
package Javabeans;


public class Salarios {
    
   private int idsalario;
   private int idemp;
   private String f_inicio;
   private String f_final;
   private boolean por_defecto;
   private String created;
   private String modified;
   

    public Salarios(int idsalario, int idemp, String f_inicio, String f_final, boolean por_defecto, String created, String modified) {
        this.idsalario = idsalario;
        this.idemp = idemp;
        this.f_inicio = f_inicio;
        this.f_final = f_final;
        this.por_defecto = por_defecto;
        this.created = created;
        this.modified = modified;
    }

    public Salarios() {
    }

    /**
     * @return the idsalario
     */
    public int getIdsalario() {
        return idsalario;
    }

    /**
     * @param idsalario the idsalario to set
     */
    public void setIdsalario(int idsalario) {
        this.idsalario = idsalario;
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
     * @return the f_inicio
     */
    public String getF_inicio() {
        return f_inicio;
    }

    /**
     * @param f_inicio the f_inicio to set
     */
    public void setF_inicio(String f_inicio) {
        this.f_inicio = f_inicio;
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
     * @return the por_defecto
     */
    public boolean isPor_defecto() {
        return por_defecto;
    }

    /**
     * @param por_defecto the por_defecto to set
     */
    public void setPor_defecto(boolean por_defecto) {
        this.por_defecto = por_defecto;
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

