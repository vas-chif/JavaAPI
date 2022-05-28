package modulo3;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DrawLine extends JApplet{
    public static void main(String[] args) {
        Frame drawLineApplet = new Frame("Draw Line in Applet Window");
        drawLineApplet.setSize(500, 450);
        Applet DrawLine = new DrawLine();
        drawLineApplet.add(DrawLine);
        drawLineApplet.setVisible(true);
        drawLineApplet.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
    }

    public void paint(Graphics g) {

        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.drawString("This is Draw Line Example", 100, 70);
        g.setColor(Color.blue);
        g.drawLine(90, 135, 90, 180);
        g.setColor(Color.green);
        g.drawLine(60, 4, 120, 120);
    }
}
