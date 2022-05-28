package modulo3;

import javax.swing.*;

public class SommaNumeriCicloFor {
    public static void main(String[] args) {
        final int NUMERI_TOTALI = 3;

        int somma = 0;
        //int cont = 1;
        String numero;
        int valNumero;

        for (int cont = 1; cont <= NUMERI_TOTALI; cont++) {
            numero = JOptionPane.showInputDialog("Inserisci numero #" + cont);
            valNumero = Integer.parseInt(numero);
            somma += valNumero;
            //  cont++;
        }//end loop while(cont <5)
        JOptionPane.showMessageDialog(null, somma, "Soma", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }//end method main
}// end class SommaNumeriCicloFor