package modulo5;

import javax.swing.*;

public class InitArray {
    public static void main(String[] args) {

        String output = "";

        int n[];        //dichiaro il riferimento all'array
        n = new int[10];//alloca dinamicamente l'array

        output+= "Posizione\tValore\n";

        for (int i = 0; i<n.length; i++)
            output += i + "\t" + n[i] + "\n";

        JTextArea outputArea = new JTextArea(11,10);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea,
                "Inizializzare un array di interi", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }// end main method

}//end class InitArray
