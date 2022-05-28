package modulo3;

import javax.swing.*;
import java.text.DecimalFormat;

public class AnalisoVoti {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        final int NUMERI_STUDENTI = 10;
        String voti, output = "";
        int valVoti, somaVoti = 0, cont = 1, promossi = 0, respinti = 0, decimal;
        double mediaVoti = 0.0;
        String mediaVotiArrotondati = "";
        DecimalFormat nrDecimali;

        //Elaborazioni dati
        while (cont <= NUMERI_STUDENTI) {
            //Aquisizione dei dati
            voti = JOptionPane.showInputDialog(String.format("Inserisci il %s° voto", cont));
            valVoti = Integer.parseInt(voti);

            output += String.format("Voto del %s° studente = %s\n", cont, voti);
            somaVoti += valVoti;

            if (valVoti >= 18) {
                promossi++;
            }
            cont++;
        }// edn while (cont <= NUMERI_STUDENTI)

        respinti = NUMERI_STUDENTI - promossi;
        output += String.format("\nStudenti promossi = %s \nStudenti respinti = %s", promossi, respinti);

        mediaVoti = somaVoti / NUMERI_STUDENTI;

        mediaVotiArrotondati = JOptionPane.showInputDialog("Quanti decimmali stampare nella media voti [0..3]");
         decimal = Integer.parseInt(mediaVotiArrotondati);
        if (decimal == 1)
            //Dichiarazione di riferimenti a oggetti (gia intanziati e non)
            nrDecimali = new DecimalFormat("0.0");
            //end if (mediaVotiArrotondati == "0")
        else if (decimal == 2)
            nrDecimali = new DecimalFormat("0.00");
            // else if (mediaVotiArrotondati == "00")
        else
            nrDecimali = new DecimalFormat("0.000");
        // end else of if (mediaVotiArrotondati == "0...")
        mediaVotiArrotondati = nrDecimali.format(mediaVoti);
        output += "\nMediaVoti = " + mediaVotiArrotondati;

        if (mediaVoti > 25)
            output += "\nMedia voti soddisfacente";

        if (promossi > 7)
            output += "\nEsito dell'esame soddisfaccìente;";

        //Produzione output
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }//end method main
}//end class AnalisiVoti
