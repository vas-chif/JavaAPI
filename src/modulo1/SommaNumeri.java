/*
 * methodo showInputDialog(String s): String
 * Classe JOptionPane
 *
 * method parseInt(String n):int -> convert String in int
 */
package modulo1;

import javax.swing.*;

public class SommaNumeri {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        String primoNumero, secondoNumero;
        int valPrimooNumero, valSecondoNumero, risultato;

        //Aquisizione dei dati
        primoNumero = JOptionPane.showInputDialog("Inserisci il primo nr.");
        valPrimooNumero = Integer.parseInt(primoNumero);

        secondoNumero = JOptionPane.showInputDialog("Inserisci il secondo nr.");
        valSecondoNumero = Integer.parseInt(secondoNumero);

        //Elaborazioni dati
        risultato = valPrimooNumero + valSecondoNumero;

        //Produzione output
        JOptionPane.showMessageDialog(null, risultato);
        JOptionPane.showMessageDialog(null, "Somma = " + risultato);

        System.exit(0);
    }//end method main
}//end class Sommanumeri
