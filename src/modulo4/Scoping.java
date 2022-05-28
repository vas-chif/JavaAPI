package modulo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Scoping extends JApplet {
    JTextArea outputArea;
    int x = 1; //variabile di instanza

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(600, 350);
        frame.setVisible(true);
        JApplet Scoping = new Scoping();
        frame.add(Scoping);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        Scoping.init();
        Scoping.start();

    }// end main method

    public void init() {

        outputArea = new JTextArea();
        Container c = getContentPane();
        c.add(outputArea);

    }// end class init()

    public void start() {

        int x = 5; // variabile locale per il methodo start

        outputArea.append("La variabile locale x in statrt è " + x);
        methodA();  //methodA usa la variabile locale x
        methodB();  //methodB usa varibile di instanza x
        methodA();  //methodA reinizializza variabile locale x
        methodB();  //variabile di instanza x mantine il suo valore

        outputArea.append("\n\nLA variabile locale x in start è " + x);

    }// end method start()

    public void methodA() {

        int x = 25; //inizializza ognivolta che è chiamato

        outputArea.append("\n\nLa variabile locale x in methodA è " + x +
                " dopo aver chiamto methodA()");

        ++x;

        outputArea.append("\nLa variabile locale x in methodA è " + x +
                " prima di uscire dal methodA");

    }// end methodA()

    public void methodB() {

        outputArea.append("\n\nLa variabile di instanza x è " + x +
                " entrando in methodB");

        x *= 10;

        outputArea.append("\nLa variabile di instanza x è " + x +
                " uscendo dal methodB");

    }//end methodB()
}//end class Scoping
