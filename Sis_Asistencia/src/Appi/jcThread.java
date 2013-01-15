package Appi;
import Javabeans.Restauracion;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
/**
 * @web http://www.jc-mouse.net
 * @author Mouse
 */
public class jcThread implements Runnable{

    private JProgressBar jProgressBar;
    private int i = 1;
    private int value = 0;//retardo en milisegundos

    /**
     * Constructor de clase
     */
    public jcThread( JProgressBar jProgressBar  )
    {
        this.jProgressBar = jProgressBar;
        this.value = 100;
    }

    @Override
    public void run() {
        i=1;        
        //mientra el trabajo en paralelo no finalice el jProgressBar continuara su animacion una y otra vez
        while( !Restauracion.band )
        {
            //si llega al limite 100 comienza otra vez desde 1, sino incrementa i en +1
            i = (i > 150) ? 1 : i+1;
            jProgressBar.setValue(i);
            jProgressBar.repaint();  
            //retardo en milisegundos
            try{Thread.sleep( this.value );}            
            catch (InterruptedException e){ System.err.println( e.getMessage() ); }            
            //si el trabajo en paralelo a terminado
            if( Restauracion.band )
            {
                jProgressBar.setValue(100);
                System.out.println("Trabajo finalizado...");
                JOptionPane.showMessageDialog(null, "Correo enviado. Enjoy!!!");
                jProgressBar.setValue(0);
                break;//rompe ciclo     
            }            
        }
    }

}
