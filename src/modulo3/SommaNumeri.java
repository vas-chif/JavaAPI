package modulo3;

import javax.swing.*;

public class SommaNumeri {
    public static void main(String[] args) {
        final int NUMERI_TOTALI = 5;

        int somma = 0;
        int cont = 1;
        String numero;
        int valNumero;

        while (cont <= NUMERI_TOTALI) {
            numero = JOptionPane.showInputDialog("Inserisci numero #" + cont);
            valNumero = Integer.parseInt(numero);
            somma += valNumero;
            cont++;
        }//end loop while(cont <5)
        JOptionPane.showMessageDialog(null, "Somma = " + somma);
        System.exit(0);

    }//end method main
}// end class SommaNumeri