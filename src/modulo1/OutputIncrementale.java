package modulo1;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class OutputIncrementale {
    public static void main(String[] args) {
        int a;
        int b;
        a = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore a"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il valore b"));

        //Creare una stringa in variabile temporanea
        String output = "A = " + a + "\nB = " + b + "\n";
        if (a == b)
            //JOptionPane.showMessageDialog(null, "A è uguale a B");
            output = output + "\nA è uguale a B";
        if (a != b)
            //JOptionPane.showMessageDialog(null, "A è diverso da B");
            output = output + "\nA è diverso da B";
        if (a > b)
            //JOptionPane.showMessageDialog(null, "A è maggiore di B");
            output = output + "\nA è maggiore di B";
        if (a < b)
            output = output + "\nA è minore di B";
        if (a >= b)
            output = output + "\nA è maggior o uguale a B";
        if (a <= b)
            output = output + "\nA è minor o uguele a B";

        //out pop-up the message
        JOptionPane.showMessageDialog(null,output);
        System.exit(0);
    }// end method main
}// end class OutputIncrementale
