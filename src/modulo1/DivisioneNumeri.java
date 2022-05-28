/*
 * methodo showInputDialog(String s): String
 * Classe JOptionPane
 *
 * method parseInt(String n):int -> convert String in int
 */
package modulo1;

import javax.swing.*;

public class DivisioneNumeri {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        String primoNumero, secondoNumero;
        int valPrimoNumero, valSecondoNumero;
        double risultato;

        //Aquisizione dei dati
        primoNumero = JOptionPane.showInputDialog("Inserisci il primo numero");
        valPrimoNumero = Integer.parseInt(primoNumero);

        secondoNumero = JOptionPane.showInputDialog("Inserisci il secondo numero");
        valSecondoNumero = Integer.parseInt(secondoNumero);

        //Elaborazioni dati
        risultato = (double) valPrimoNumero / valSecondoNumero;

        //Produzione output
        //JOptionPane.showMessageDialog(null, risultato);
        JOptionPane.showMessageDialog(null, "Divisione = " + risultato);
        System.exit(0);
    }//end method main
}//end class SommaNumeri
