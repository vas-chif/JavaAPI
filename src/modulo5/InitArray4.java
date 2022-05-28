package modulo5;

//inizializzaione di array multidimensionli

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InitArray4 extends JApplet {
    JTextArea outputArea;

    public static void main(String[] args) {
        Frame frame = new Frame("array Bidimensional");
        frame.setSize(500, 500);
        frame.setVisible(true);
        JApplet InitArray4 = new InitArray4();
        frame.add(InitArray4);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        InitArray4.init();

    }// end main method

    //disegna l'applet
    @Override
    public void init() {
        super.init();

        outputArea = new JTextArea();
        Container c = getContentPane();
        c.add(outputArea);

        int array1[][] = {{1, 2, 3}, {4, 5, 6,}};
        int array2[][] = {{1, 2}, {3}, {4, 5, 6,}};

        outputArea.setText("\n\n\tContenuto di array 1\n");
        costruisciOutput(array1);
       // outputArea.setText("\n\tContenuto di array 2\n");
        costruisciOutput(array2);

    }// end method init()

    public void costruisciOutput(int a[][]) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                outputArea.append("     a[" + i + "][" + j + "] =" + a[i][j] + "");
            outputArea.append("\n");
        }// end loop  for (int i = 0; i<a.length;i++)

    }// end method costruisciOutput(int a [])

}// end class InitArray4
