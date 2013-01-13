
package Javabeans;
import Utilitarios.JCMail;

public class Restauracion implements Runnable{
    JCMail mail = new JCMail();
    public static boolean band=false;  
    private String pass = " ";
    private String from = " ";
    private String to = " ";
    private String subject = " ";
    private String mensage = " ";

    public Restauracion(String pass, String from, String to, String subject, String mensage) {
        this.pass = pass;
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.mensage = mensage;
    }

    public void run() {
        band=false;
            try
            {
                mail.setFrom( from );
                mail.setPassword( pass );        
                mail.setTo( to );
                mail.setSubject( subject );
                mail.setMessage(mensage);
                mail.SEND();
            }
            catch (Exception e){
                System.err.println( e.getMessage() );
        }
        band=true;
    }

}
