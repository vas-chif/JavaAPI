package modulo4;

import javax.swing.*;
import java.text.DecimalFormat;

public class CalcolaDivisione {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        int c, d, ilResto;
        double risultatoDellaDivisione;
        String output = "";

        //Dichiaro i riferimeti agli oggeti
        DecimalFormat dueCifre = new DecimalFormat("0.00");

        //Aquisizione dei dati
        c = Integer.parseInt(JOptionPane.showInputDialog("Inserisca il valore c "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Inserisca il valore d "));

        //Elaborazioni dati
        risultatoDellaDivisione = calcolaDivisioneMethod(c, d);
        output += "Il risultato è " + dueCifre.format(risultatoDellaDivisione);

        ilResto = calcolaIlresto(c, d);
        if (ilResto > 0)
            output += "\nIl resto è " + ilResto;

        //Produzione output
        JOptionPane.showMessageDialog(null, output);


    }// end method main

    public static double calcolaDivisioneMethod(int a, int b) {
        double ris;
        if (b == 0)
            return -1;
        else {
            ris = (double) a / b;
            return ris;
        }// end else of if (b == 0)
    }// end method calcolaDivisioneMethod

    public static int calcolaIlresto(int a, int b) {
        if (b == 0)
            return -1;
        else {
            int resto = a % b;
            return resto;
        }// end  else of if (b == 0)
    }// end method calcolaIlresto
}// end class CalcolaDivisione
