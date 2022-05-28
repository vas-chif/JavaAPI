package modulo3;

import javax.swing.*;

public class Analisi {
    public static void main(String[] args) {

        int promossi = 0,           //nr. di studenti promossi
                bocciti = 0,        //nr. di studenti bocciati
                studenti = 1,       //contatore studenti
                esito;              //risultato dell'esame
        String input,               //valore inserito dall'utente
                output;             //stringa di output

        // elabora 10 studenti: ciclo controllato da contare

        while (studenti <= 10) {

            input = JOptionPane.showInputDialog("Inserire esito\n(1 = promosso, 2 = respinto");
            esito = Integer.parseInt(input);

            if (esito == 1)
                promossi = promossi + 1;
            else
                bocciti = bocciti + 1;

            studenti = studenti + 1;

        }// end while(studenti <= 10)

        //fase di terminazione
        output = "Promossi:" + promossi + "\nBocciati:" + bocciti;

        if (promossi > 8)
            output = output + "\nEsito dell'esame soddisfacente";

        JOptionPane.showMessageDialog(null, output, "Annalisidei risultati", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }//end main method
}//end class Analisi
