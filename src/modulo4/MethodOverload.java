package modulo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MethodOverload extends JApplet {

    JTextArea outputArea;

    public static void main(String[] args) {
        Frame frame = new Frame("MethodOverload");
        frame.setSize(500, 200);
        frame.setVisible(true);
        JApplet MethodOverload = new MethodOverload();
        frame.add(MethodOverload);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        MethodOverload.init();
    }// end main method

    public void init() {

        outputArea = new JTextArea(1, 20);
        Container c = getContentPane();
        c.add(outputArea);

        outputArea.setText("Il quadrato di integer 7 è "
                + calcolaQuadrato(7)
                + "\nIl quadrato di double 7.5 è "
                + calcolaQuadrato(7.5));
    }// end method init()

    public int calcolaQuadrato(int x) {
        System.out.println("Metodo int calcolaQuadrato(int x)"
                + x);
        return x * x;
    }//end method calcolaQuadrato(int x)

    public double calcolaQuadrato(double y) {
        System.out.println("Metodo double calcolaQuadrato(double y)"
                + y);
        return y * y;
    }// edn method calcolaQuadrato(double y)

}// end class MethodOverload
