package modulo5;

import javax.swing.*;

public class InitArray2 {
    public static void main(String[] args) {

        String output = "";

        //L'elenco inizializzatori specifica il numero di elementi e il valore di ogni elemtno
        int n[] = {12, -4, 1, 23, 45, 4, -21, 32, 1, -3};

        output += "Posizionw\tvalore\n";

        for (int i=0; i<n.length; i++)
            output+= i +"\t" + n[i] + "\n";

        JTextArea outputArea  = new JTextArea(11,10);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea,
                "Inizializzare un arrai di ineteri", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }// end method main
}// end class InitArray2
