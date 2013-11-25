package pantallas.de.bd;

import java.awt.Dimension;
import java.awt.Toolkit;

public class PantallasDeBD {
    public static void main(String[] args) throws InterruptedException {
        // Metodo de inicio
        Presentacion idp = new Presentacion();
        idp.setVisible(true);
        Thread.sleep(1500);
        idp.dispose();
        //Metodo de login
        LogIn Log = new LogIn();
        Log.setVisible(true);
            
        //
        
    }
    public static void centrar(Object ventanaObj){
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = null;
        String clase = ventana.getClass().toString();
        
        if(clase.equals("Inicio_del_programa"))
        {
            Presentacion idp = (Presentacion)ventanaObj;
            ventana = idp.getSize();
            int x=(pantalla.width-ventana.width)/2;
            int y=(pantalla.height-ventana.height)/2;
            idp.setLocation(x,y);
        }
        else if(clase.equals("LogIn"))
        {
            LogIn log = (LogIn)ventanaObj;            
            ventana = log.getSize();
            int x=(pantalla.width-ventana.width)/2;
            int y=(pantalla.height-ventana.height)/2;
            log.setLocation(x,y);
        }
    }
}
