package modulo2;

import javax.swing.JApplet;// importa la classe JApplet
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WelcomeLines extends JApplet {
    public static void main(String[] args) {
        Frame frame = new Frame("Welcome");
        frame.setSize(200,200);
        frame.setVisible(true);
        JApplet WelcomeLines = new WelcomeLines();
        frame.add(WelcomeLines);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }// end main method
    public void paint(Graphics g){
        g.drawLine(15,10,210,10);
        g.drawLine(15,30,210,30);
        g.drawString("Welcome to Java programing", 25,25);
    }
}// end class WellcomeLines
