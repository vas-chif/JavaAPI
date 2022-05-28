package modulo1;

import javax.swing.*;

public class CalcoloMediaVotiAltraVariante {
    public static void main(String[] args) {
//dichiarazione variabili

        String primoVoto, secondoVoto, terzoVoto, output;
        int valPrimoVoto, valSecondoVoto, valTerzoVoto, mediaVoti;

        //acquisizione variabili

        primoVoto = JOptionPane.showInputDialog("inserisci il primo voto");
        valPrimoVoto = Integer.parseInt(primoVoto);

        secondoVoto = JOptionPane.showInputDialog("inserisci il secondo voto");
        valSecondoVoto = Integer.parseInt(secondoVoto);

        terzoVoto = JOptionPane.showInputDialog("inserisci il terzo voto");
        valTerzoVoto = Integer.parseInt(terzoVoto);

        output = "Voto 1 = " + primoVoto + "\nVoto 2 = " + secondoVoto + "\nVoto 3 = " + terzoVoto;

        //elaborazione dati

        mediaVoti = (valPrimoVoto + valSecondoVoto + valTerzoVoto) / 3;

        output = output + "\n\nMedia = " + mediaVoti + "\nEsito: ";

        // if-else

        if (mediaVoti >= 18) {
            output = output + "Promosso";
            if (mediaVoti > 28)
                output = output + "\nEccellente";
        } //fine  if (mediaVoti >= 18)
        else
            output = output + "Bocciato";

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }//enr method main
}// end class CalcoloMediaVotiAltraVariante
