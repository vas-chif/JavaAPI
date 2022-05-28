package modulo3;


import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;

public class Averange2 {
    public static void main(String[] args) {
        int sommaVoti,          //somma voti
                contavoti,      //numero di voti inseriti
                valVoto;        //valore del voto
        double media;           //media voto
        String voto;            // voto digitato dall'utente

        //fase della inizializzazione
        sommaVoti = 0;          //inizzializa a zero la somma dei voti
        contavoti = 1;          //prepara in contatore del cisclo

        //fase di elaborazione
        voto = JOptionPane.showInputDialog("inserisci voto(-1 fine): ");    //chiede all'utente e lege il voto inserito
        valVoto = Integer.parseInt(voto);                                   //converte voto da stringa a intero

        //ciclo ripetuto 5 volte
        while (valVoto != -1) {

            sommaVoti += valVoto;                                    //aggiunge il voto al totale dei voti
            contavoti = contavoti + 1;                               //incremente il contatore di 1
            voto = JOptionPane.showInputDialog("Inserisci voto: "); //chiede all'utente e lege il voto inserito
            valVoto = Integer.parseInt(voto);                       //converte voto da stringa a intero

        }//end  while (contavoti <= 5)

        //fase di terminazione
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        if (contavoti < 0) {
            //fase di elaborazione finale
            media = (double) sommaVoti / contavoti;                   //esegue divisione ed conversione de intero a double

            //visializza la media dei voti
            JOptionPane.showMessageDialog(null, "La media dei voti è: " + twoDigits.format(media),
                    "Media dei voti", JOptionPane.INFORMATION_MESSAGE);
        }// end if (contavoti != 0)
        else {
            JOptionPane.showMessageDialog(null,"Nessun voto Inserito",
                    "Media dei voti", JOptionPane.INFORMATION_MESSAGE);
        }// end eles of if(contavoti != 0)

        System.exit(0);                                         //termina il programa
    }// end method main
}//end class Averange
