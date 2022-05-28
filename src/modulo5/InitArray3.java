package modulo5;

import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

import javax.swing.*;

public class InitArray3 {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 10;
        int n[];                    //riferimento al arrray int
        String output = "";

        n = new int[ARRAY_SIZE];    //alloca l'array

        output += "Posizione\tValore\n";

        //imposta i valori dell'array
        for (int i = 0; i < n.length; i++) {
            n[i] = 2 + (2 * i);
            output += i + "\t" + n[i] + "\n";
        }

        JTextArea outputArea = new JTextArea(11, 10);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea,
                "Inizializzare un array con numeri da 2 a 20",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        System.exit(0);
    }// end main method
}// end class InitArray3
