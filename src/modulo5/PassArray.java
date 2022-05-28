package modulo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PassArray extends JApplet {
    JTextArea outputArea;
    String output = "";

    public static void main(String[] args) {
        Frame frame = new Frame("Passa Array");
        frame.setSize(500,400);
        frame.setVisible(true);
        JApplet PassaArray = new PassArray();
        frame.add(PassaArray);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        PassaArray.init();

    }// end main method

    @Override
    public void init() {
        super.init();
        outputArea = new JTextArea();
        Container c = getContentPane();
        c.add(outputArea);

        int a[] = {1, 2, 3, 4, 5};

        output += "Analisi di una chiamata a un metodo passando un array per riferimento.\n" +
                "Valori iniziali dell'array prima della chiamata al metodo:\n\t";

        for (int i = 0; i < a.length; i++)
            output += " " + a[i];

        modificaArray(a); //chiamata per riferimento

        output += "\n\nI valori dell'array modificato sono:\n\t";

        for (int i = 0; i < a.length; i++)
            output += " " + a[i];

        output += "\n\nEffetti del passaggio di un elemento dell'array per valore: \n" +
                "\ta[3] prima della modifica dell'elemento: " + a[3];

        modificaElemento(a[3]);

        output += "\n\ta[3] dopo la modifica dell'elemento: " + a[3];

        outputArea.setText(output);
    }// end method init()

    public void modificaArray(int b[]) {
        for (int j = 0; j < b.length; j++)
            b[j] *= 2;

    }// end method modificaArray(int b[])

    public void modificaElemento(int e) {
        e *= 2;
    }// end method modificaElemento(int e)
}// end class PassArray
