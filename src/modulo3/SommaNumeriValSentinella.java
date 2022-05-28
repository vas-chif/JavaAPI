package modulo3;

import javax.swing.*;

public class SommaNumeriValSentinella {
    public static void main(String[] args) {
        int somma = 0;
        int cont = 1;
        String numero;
        int valNumero;

        numero = JOptionPane.showInputDialog("Inserisci numero " + cont + "\nRange [0..30]\n[-1] exit");
        valNumero = Integer.parseInt(numero);

        while (valNumero != -1) {
            somma += valNumero;
            cont++;
            numero = JOptionPane.showInputDialog("Inserisci numero "+cont + "\nRange [0..30]\n[-1] exit");
            valNumero = Integer.parseInt(numero);
        }//end loop while(cont <5)
        JOptionPane.showMessageDialog(null, "Somma = " + somma);
        System.exit(0);

    }//end method main
}// end class SommaNumeri