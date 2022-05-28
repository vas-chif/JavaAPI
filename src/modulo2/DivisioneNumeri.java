/* method showInputDialog(String s): String
 * * Classe JOptionPane *
 * * method parseInt(String n):int -> convert String in int *
 * package java.text
 * class DecimalFormat
 * package java.text.DecimalFormat;
 * method format(double n): String    23,4367 --> 23.43
 */
package modulo2;

import javax.swing.*;
import java.text.DecimalFormat;

public class DivisioneNumeri {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        String primoNumero, secondoNumero;
        int valPrimoNumero, valSecondoNumero;
        double risultato;
        String risultatoArrotondato;

        //Dichiarazione di riferimenti a oggetti (gia intanziati e non)
        DecimalFormat dueCifre = new DecimalFormat("0.00"); //Dichiaro un ogetto DecimalFormat  refereziato a 2 cifre
        DecimalFormat treCifre = new DecimalFormat("0.000");//Dichiaro un ogetto DecimalFormat  refereziato a 3 cifre


        //Aquisizione dei dati
        primoNumero = JOptionPane.showInputDialog("Inserisci il primo numero");
        valPrimoNumero = Integer.parseInt(primoNumero);

        secondoNumero = JOptionPane.showInputDialog("Inserisci il secondo numero");
        valSecondoNumero = Integer.parseInt(secondoNumero);

        //Elaborazioni dati
        risultato = (double) valPrimoNumero / valSecondoNumero;
        risultatoArrotondato = treCifre.format(risultato); //i dati arrotondati

        //Produzione output
        //JOptionPane.showMessageDialog(null, risultato);
        JOptionPane.showMessageDialog(null, "Divisione = " + risultatoArrotondato);
        System.exit(0);


    }//end method main
}//end class DivisioneNumeri

