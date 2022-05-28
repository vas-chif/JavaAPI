package modulo2;
/*
--> La classe Graphics si trova nel package ||java.awt|| . Serve per disegnare
immagini grafiche (linee, rettangoli, ovali) in un applet Java

--> JApplet  superclasse (o classe di base)
• WelcomeApplet  sottoclasse (o classe derivata)*/

import javax.swing.JApplet;// importa la classe JApplet
import java.awt.Graphics; // Importa la classe Graphics

public class WelcomeApplet extends JApplet {

    @Override
    public void paint(Graphics g) {

        g.drawString("Welcome to\n", 25, 25);
        g.drawString("Java Programing", 25, 40);
    }//end method paint
}//end class WelcomeApplet

