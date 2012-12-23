
package Javabeans;


public class Permisos_has_Roles {
    
    private int nmid;
    private int idrol;
    private int modulos_idmod;

    public Permisos_has_Roles(int nmid, int idrol, int modulos_idmod) {
        this.nmid = nmid;
        this.idrol = idrol;
        this.modulos_idmod = modulos_idmod;
    }

    public Permisos_has_Roles() {
    }

    public int getNmid() {
        return nmid;
    }

    public int getIdrol() {
        return idrol;
    }

    public int getModulos_idmod() {
        return modulos_idmod;
    }

    public void setNmid(int nmid) {
        this.nmid = nmid;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public void setModulos_idmod(int modulos_idmod) {
        this.modulos_idmod = modulos_idmod;
    }
    
    
    
}
