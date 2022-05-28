package modulo1;

import javax.swing.*;

public class ClacoloMediaVotiBase {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        String voto1, voto2, voto3;
        int valVoto1, valVoto2, valVoto3, media;
        String output = "";

        //Aquisizione dei dati e conversion della stinga in integer
        voto1 = JOptionPane.showInputDialog("Inserisci primo voto");
        valVoto1 = Integer.parseInt(voto1);

        voto2 = JOptionPane.showInputDialog("Inserisci secondo voto");
        valVoto2 = Integer.parseInt(voto2);

        voto3 = JOptionPane.showInputDialog("Inserisci terzo voto");
        valVoto3 = Integer.parseInt(voto3);

        output += "Voto 1 = " + voto1 + "\nVoto 2 = " + voto2 + "\nVoto 3 = " + voto3;

        //Elaborazioni dati
        media = (valVoto1 + valVoto2 + valVoto3) / 3;
        output += "\n\nMedia = " + media;

        //Produzione output
        if (media >= 18) {
            output += "\nPromosso";
        }//end if (media>=18)
        else {
            output += "\nRespinto";
        }//end else of if (media>=18)
        if (media > 28) {
            output += "\n\nMedia Eccelente";
        }// end if (media > 28)

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    }//end method main
}//end class MediaVotiBase
