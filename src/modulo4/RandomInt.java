package modulo4;
//interi casuali ridimensioati in scala e fatti slitare

import javax.swing.*;

public class RandomInt {
    public static void main(String[] args) {

        int valore;
        String output = "";

        for (int i = 1; i <= 20; i++) {

            valore = 1 + (int) (Math.random() * 6);
            output += valore + " ";

            if (i % 5 == 0)
                output += "\n";

        }// end  for (int i = 1; i <= 20; i++)

        JOptionPane.showMessageDialog(null, output,
                "Generazione di 20 numri casuali tra 1 e 6", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// end main method
}// end class RandomInt
