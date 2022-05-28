package modulo3;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwitchTest extends JApplet {
    static int scelta;


    public static void main(String[] args) {

        String input = "3";

        input = JOptionPane.showInputDialog("Inserisci 1 per diseganre una linea\n" +
                "Inserisci 2 per diseganre un rettangolo\n" +
                "Inserisci 3 per diseganre un cerchio\n");

        scelta = Integer.parseInt(input);

        Frame frame = new Frame("Switch select");
        frame.setSize(500, 500);
        Applet SwitchTest = new SwitchTest();
        frame.add(SwitchTest);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }// end main method

    public void init() {

        String input = "3";

        input = JOptionPane.showInputDialog("Inserisci 1 per diseganre una linea\n" +
                "Inserisci 2 per diseganre un rettangolo\n" +
                "Inserisci 3 per diseganre un cerchio\n");

        scelta = Integer.parseInt(input);

    }// end mehtod init()

    public void paint(Graphics g) {

        for (int i = 0; i < 10; i++) {

            switch (scelta) {
                case 1://coord x sup sx,coord y sup sx, lrgheza, alteza
                    g.drawLine(10, 10, 250, 10 + i * 10);
                    break;
                case 2:
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                case 3://coord x sup sx, coord y sup sx, larghezza quadrato, altezza quadrato che circoscrive il cerchio
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Scelta non valida");

            }// end switch (scelta)

        }// end for (int i = 0; i< 10; i++)

    }// end method paint(Graphics g)

    public void reWind() {

    }// end method reWind()

}// ens class SwitchTest
