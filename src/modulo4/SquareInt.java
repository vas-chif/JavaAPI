package modulo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SquareInt extends JApplet {

    int risultato;

    public static void main(String[] args) {

        Frame frame = new Frame("Prob");
        frame.setSize(300, 250);
        JApplet SquareInt = new SquareInt();
        frame.add(SquareInt);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        SquareInt.init();
    }// end main method

    public void init() {


        String output = "";

        JTextArea outputArea = new JTextArea(10, 20);

        //area di visualizazione dei componeti GUI dell'Applet
        Container c = getContentPane();

        //aggiunge outputArea a Container c
        c.add(outputArea);

        for (int x = 1; x <= 10; x++) {
            risultato = calcolaQuadrato(x);
            output += "Il quadrato di " + x + " è " + risultato + "\n";
        }// end for (int x = 1; x<=10; x++)

        outputArea.setText(output);
    //    JOptionPane.showMessageDialog(null, outputArea);
    }// end method init()

    // Definizione metodo calcolaQuadrato
    public int calcolaQuadrato(int y) {
        return y * y;
    }// end method calcolaQuadrato(int y)

}// end class SquareInt
