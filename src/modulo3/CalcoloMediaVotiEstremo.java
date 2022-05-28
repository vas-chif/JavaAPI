package modulo3;

import javax.swing.*;
import java.text.DecimalFormat;

public class CalcoloMediaVotiEstremo {
    public static void main(String[] args) {

        //Dichiarazioni delle variabili
        int count = 1, sommaVoti = 0, totPromossi = 0, totBocciati = 0;
        double mediaVoti;
        String cifreDecimali, output = "", voto;
        String modelamento;
        int valoreCiflreDecimale, valVoto;

        //Dichiaro i riferimeti agli oggeti
        DecimalFormat nrDecimali;

        //Aquisizione dei dati
        cifreDecimali = JOptionPane.showInputDialog("Quanti decimmali stampare nella media voti [1..5]");
        valoreCiflreDecimale = Integer.parseInt(cifreDecimali);

        //Elaborazioni dati
        if (valoreCiflreDecimale == 1)
            modelamento = "0.0";
        else if (valoreCiflreDecimale == 2)
            modelamento = "0.00";
        else if (valoreCiflreDecimale == 3)
            modelamento = "0.000";
        else if (valoreCiflreDecimale == 4)
            modelamento = "0.0000";
        else
            modelamento = "0.00000";

        //Dichiarazione di riferimenti a oggetti
        nrDecimali = new DecimalFormat(modelamento);


        //Aquisizione dei dati
        voto = JOptionPane.showInputDialog("Inserisca il voto" + "\nRange [0..30]" + "\nEnter \"-1\" exit");
        valVoto = Integer.parseInt(voto);

        //Elaborazioni dati
        while (valVoto != -1) {
            sommaVoti += valVoto;

            if (valVoto >= 18)
                totPromossi++;
            else
                totBocciati++;

            count++;

            voto = JOptionPane.showInputDialog("Inserisca il voto" + "\nRange [0..30]" + "\nEnter \"-1\" exit");
            valVoto = Integer.parseInt(voto);
        }//end while (valVoto !=-1)

        if (count == 1) {
            //Produzione output
            JOptionPane.showMessageDialog(null, "Nessun voto inserito!", "Errore", JOptionPane.QUESTION_MESSAGE);
        }//end if (count == 1)
        else {
            output += String.format("\nTotali voti inseriti = %s \nTotali pomossi = %s \nTotali Bociato = %s \n", count - 1, totPromossi, totBocciati);

            mediaVoti = sommaVoti / (count - 1);
            cifreDecimali = nrDecimali.format(mediaVoti);
            output += "Media Voti = " + cifreDecimali;

            if (mediaVoti > 28) {
                output += "\nEcelente";
            }// end if (mediaVoti > 28)
            else if (mediaVoti > 25) {
                output += "\nBuono";
            }//end else if (mediaVoti > 25)
            else if (mediaVoti > 20) {
                output += "\nDiscreto";
            } // end else if (mediaVoti >20)

            // Produzione output
            JOptionPane.showMessageDialog(null, output);
        }// end  else of if (count == 1)

        System.exit(0);
    }// end method main
}// end class CalcoloMediaVotiEstremo
