package modulo4;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Maximum extends JApplet {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(300, 300);
        frame.setVisible(false);

        JApplet Maximum = new Maximum();
        frame.add(Maximum);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent Maximum) {
                super.windowClosing(Maximum);
                System.exit(0);
            }
        });

        Maximum.init();
    }// end main method

    public void init() {
        JTextArea outputArea = new JTextArea();

        String s1 = JOptionPane.showInputDialog("Inserisci il primo numero double");
        String s2 = JOptionPane.showInputDialog("Inserisci il secondo numero double");
        String s3 = JOptionPane.showInputDialog("Inserisci il terzo numero double");

        double numero1 = Double.parseDouble(s1);
        double numero2 = Double.parseDouble(s2);
        double numero3 = Double.parseDouble(s3);

        double massimo = calcolaMassimo(numero1, numero2, numero3);

        outputArea.setText("Numero1: " + numero1 + "\nnumero2: " + numero2
                + "\nNumero3: " + numero3 + "\nValore massimo: " + massimo);

        //area di visualizzazione del componente GUI dell'Applet
        Container c = getContentPane();

        //aggiunge outputArea a Container c
        c.add(outputArea);

        JOptionPane.showMessageDialog(null,outputArea);
    }// end metho init()

    public double calcolaMassimo(double x, double y, double z) {

        return Math.max(x, Math.max(y, z));
    }// end method
}// edn class MaximumcalcolaMassimo(double x, double y, double z)
