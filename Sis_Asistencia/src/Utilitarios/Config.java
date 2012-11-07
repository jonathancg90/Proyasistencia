package Utilitarios;


public class Config {
    //Generales
    public String G_TITLE;
    public String G_BUSINESS;
    public String G_VERSION;
    //MDI
    public String G_MAIN_WIDTH;
    public String G_MAIN_HEIGHT;
    //Forms
    public String G_STATES[] = new String[2];
           
    
    public Config()
    {
        G_TITLE = "Sistema de asistencias";
        G_BUSINESS = "(Spiral producciones S.a.c)";
        G_VERSION = "0.1";
        
        G_MAIN_WIDTH = "";
        G_MAIN_HEIGHT = "";
        
        G_STATES[0]="Inactivo";
        G_STATES[1]="Activo";
        
    }
    
}
