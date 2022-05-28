package modulo3;


import javax.swing.*;

public class Averange {
    public static void main(String[] args) {
        int sommaVoti,          //somma voti
                contavoti,      //numero di voti inseriti
                valVoto,        //valore del voto
                media;          //media voto
        String voto;            // voto digitato dall'utente

        //fase della inizializzazione
        sommaVoti = 0;          //inizzializa a zero la somma dei voti
        contavoti = 1;          //prepara in contatore del cisclo

        //ciclo ripetuto 5 volte
        while (contavoti <= 5){
            voto = JOptionPane.showInputDialog("Inserisci voto: "); //chiede all'utente e lege il voto inserito
            valVoto = Integer.parseInt(voto);                       //converte voto da stringa a intero
            sommaVoti += valVoto;                                   //aggiunge il voto al totale dei voti
            contavoti = contavoti +1;                               //incremente il contatore di 1
        }//end  while (contavoti <= 5)

        //fase di elaborazione finale
        media = sommaVoti/5;                                        //esegue divisione intera

        //visualizza la media dei voti
        JOptionPane.showMessageDialog(null, "La medi dei voti è "+ media,
                "Media dei voti", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);                                         //termina il programa
    }// end method main
}//end class Averange
