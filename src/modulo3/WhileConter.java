package modulo3;

import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WhileConter extends JApplet {
    public static void main(String[] args) {
        Frame frame = new Frame("Draw line whir loop for ");
        frame.setSize(500, 500);
        Applet WhileConter = new WhileConter();
        frame.add(WhileConter);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
                                    public void windowClosing(WindowEvent e) {
                                        System.exit(0);
                                    }
                                }
        );


    }// end main method

    public void paint(Graphics g) {
        int count = 1; // inizializzazione

        while (count <= 50) { // condizione di iterazione

            g.drawLine(10, 10, 250, count * 10);
            ++count;
        }
    }// end mehtod paint (Graphics g)
}// end class WhileConter
