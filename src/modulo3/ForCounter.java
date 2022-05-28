package modulo3;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ForCounter extends JApplet {
    public static void main(String[] args) {

        Frame frame = new Frame("Draw line whir loop for");
        frame.setSize(500, 400);
        Applet ForCounter = new ForCounter();
        frame.add(ForCounter);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });


    }// end main method

    public void paint(Graphics g) {

        for (int count = 1; count <= 10; count++) {
            g.drawLine(10, 10, 250, count + 10);
        }// end loop for (int count = 1; count <= 10; count++)

    }// end method paint(Graphics g)

}// end class Forcounter
