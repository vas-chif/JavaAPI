package modulo5;

import javax.swing.*;

public class SumArray {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totale = 0;

        for (int i = 0; i<a.length; i++)
            totale+= a[i];

        JOptionPane.showMessageDialog(null, "Somma totale: " + totale,
                "Somma degli elementi dell'array",
                JOptionPane.QUESTION_MESSAGE);
        System.exit(0);

    }// end method main
}// end class SumArray
