package modulo3;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DoWhileTest extends JApplet {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 400);
        Applet DoWhileTest = new DoWhileTest();
        frame.add(DoWhileTest);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }// end method main

    public void paint(Graphics g) {
        int count = 1;

        do {
            g.drawOval(100 - count * 10, 110 - count * 10, count * 20, count * 20);
            count++;
        } while (count <= 10);

    }// end method paint(Graphics g)

}// end class DoWhileTest
