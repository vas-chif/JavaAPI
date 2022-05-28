package modulo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FactorialTest extends JApplet {

    JTextArea outputArea;

    public static void main(String[] args) {

        Frame frame = new Frame("Fattoreiale");
        frame.setSize(400, 400);
        frame.setVisible(true);

        JApplet FactorialTest = new FactorialTest();
        frame.add(FactorialTest);

        frame.addWindowStateListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        FactorialTest.init();

    }// end main methhod

    public void init() {

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        Container c = getContentPane();
        c.add(outputArea);

        //calcola i fattoriali da 0 a 10

        for (long i = 0; i <= 10; i++) {

            outputArea.append("\n\t" + i + "! = " + fattoriale(i) + "\n");

        }// end loop for (long i = 0; i <= 10; i++)

    }// end method init()

    //definizione ricorsiva del methodo fattoriale
    public long fattoriale(long numero) {

        if (numero <= 1)
            return 1;
        else
            return numero * fattoriale(numero - 1);

    }//end method fattoriale(long numero)
}// end class FactorialTest
