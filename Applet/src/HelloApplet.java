import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet{
    public void paint(Graphics g){


        String message =getParameter("message");

        
        //this msg will appear in the applet
        g.drawString( message, 20,20);



        //this msg will display on the web page
        //g.drawString( "Hello World!", 20,20);
    }
}
