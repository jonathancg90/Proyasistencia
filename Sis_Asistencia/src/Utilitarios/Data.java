package Utilitarios;


public class Data {
    //MDI
    public String G_MAIN_WIDTH;                     //Tamaño de MDI
    public String G_MAIN_HEIGHT;                    //Tamaño de MDI
    public String G_STATES[] = new String[2];       //Valores de los estados para formularios
    public String G_BOOLEAN[] = new String[2];      //Valores de los estados para la base de datos
    public String G_TYPEHOR[] = new String[4];      //Valores de los estados para la base de datos
    public static String G_EXCLUDE[] = new String[1];      //Datos excluidos para la actualizacion de registros
    public String G_AREA[] = new String[3];
    public String G_DIAS[] = new String[8];
    
    public Data()
    {
        
        G_MAIN_WIDTH = "";
        G_MAIN_HEIGHT = "";
        
        G_STATES[0]="Inactivo";
        G_STATES[1]="Activo";
        
        G_BOOLEAN[0]="false";
        G_BOOLEAN[1]="true";
        
        G_AREA[0]="PRODUCCION";
        G_AREA[1]="ADMINISTRACION";
        G_AREA[2]="SISTEMAS";
        
        G_TYPEHOR[1]="Full time";
        G_TYPEHOR[2]="Part time";
        G_TYPEHOR[3]="Night time";
        
        G_EXCLUDE[0]="created";
        
        G_DIAS[1]="Lunes";
        G_DIAS[2]="Martes";
        G_DIAS[3]="MIercoles";
        G_DIAS[4]="JUeves";
        G_DIAS[5]="Viernes";
        G_DIAS[6]="Sabado";
        G_DIAS[7]="Domingo";
    }
    
}
