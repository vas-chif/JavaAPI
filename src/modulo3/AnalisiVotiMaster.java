package modulo3;
// da fare reversiing
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class AnalisiVotiMaster {

    public static void main(String[] args) {

        final int VOTI_TOTALI = 10;

        String voto, decimali;
        int conta = 1;
        int nrPromossi = 0;
        int nrBocciati = 0;
        int sommaVoti = 0;
        int valVoto, valDecimali;
        double mediaVoti;
        String mediaVotiArrotondata = "";
        String modellamento;
        String output = "Voti inseriti: ";

        DecimalFormat cifre;

        while (conta <= VOTI_TOTALI) {

            // Chiedo i voti
            voto = JOptionPane.showInputDialog("inserisci voto #" + conta);
            valVoto = Integer.parseInt(voto);

            // Conto Promossi e Bocciati
            if (valVoto >= 18)
                nrPromossi++;
            else
                nrBocciati++;

            //Somma dei voti
            sommaVoti += valVoto;

            // Accodo i voti di input ed elimino in stampa virgola finale dopo inserimento utltimo numero

            if (conta < VOTI_TOTALI)
                output += voto + ",  ";
            else
                output += voto;
            // fine if(conta<VOTI_TOTALI)

            // incremento contatore ciclo WHILE
            conta++;

        } // fine  while(conta<= VOTI_TOTALI)


        // Calcoli Fuori dal ciclo

        // Chiedo quanti decimali in stampa per mediaVoti

        decimali = JOptionPane.showInputDialog("Quanti decimali in stampa per media voti [0..3]");
        valDecimali = Integer.parseInt(decimali);

        if (valDecimali == 0)
            modellamento = "0";
        else if (valDecimali == 1)
            modellamento = "0.0";
        else if (valDecimali == 2)
            modellamento = "0.00";
        else
            modellamento = "0.000";

        cifre = new DecimalFormat(modellamento);

        // Calcolo media voti
        mediaVoti = (double) sommaVoti / VOTI_TOTALI;
        mediaVotiArrotondata = cifre.format(mediaVoti);

        output += "\n\nMedia voti: " + mediaVotiArrotondata
                + "\nTotale promossi: " + nrPromossi
                + "\nTotale bocciati: " + nrBocciati;

        // mediaVoti > 25 aggiungo commento
        if (mediaVoti >= 25)
            output += "\n\nMedia Voti soddisfacente";

        // nrPromossi > LIMITE_PROMOSSI
        if (nrPromossi > 7)
            output += "\n\nEsito dell'esame soddisfacente ";

// Stampa Finale     
        //  STAMPA RISULTATI

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    } // fine metodo main AnalisiVoti

} // fine classe AnalisiVoti
