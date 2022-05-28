package modulo3;

import javax.swing.*;

public class Sum {

    public static void main(String[] args) {

        int somma = 0;

        for (int numero = 2; numero <= 100; numero += 2) {
            somma += numero;

            JOptionPane.showMessageDialog(null, "La somma è " + somma,
                    "Somma degli interi compressi tra 2 e 100", JOptionPane.INFORMATION_MESSAGE);

        }// end loop  for (int numero =2; numero <=100; numero+=2)

        System.exit(0);

    }// end main mehtod
}// end class Sum
