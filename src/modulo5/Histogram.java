package modulo5;

/*Leggere i numeri da un array e creare un istogramma (grafico a barre) sulla base
di questi valori.
Per ogni numero viene visualizzata una barra composta da tanti asterischi quanto
è il valore del numero*/

import javax.swing.*;

public class Histogram {

    public static void main(String[] args) {

        int n[] = {19, 3, 15, 7, 11, 9, 13, 5, 17, 1};
        String output = "";

        output += "elemento\tValore\tIstogramma";

        for (int i = 0; i < n.length; i++) {
            output += "\n" + i + "\t" + n[i] + "\t";

            for (int j = 0; j <= n[i]; j++) //mostra un barra
                output += "*";

        }// end loop for (int i = 0; i < n.length; i++)

        JTextArea outputArea = new JTextArea(11, 30);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null, outputArea, "stampa di un istogramma", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// end main method

}// end class Histogram
