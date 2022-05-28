package modulo4;

import javax.swing.*;

public class AnalisiLanciDado {
    public static void main(String[] args) {
        final int LANCI_TOTALI = 100;
        int frequenza1 = 0, frequenza2 = 0, frequenza3 = 0;
        int frequenza4 = 0, frequenza5 = 0, frequenza6 = 0;

        int faccia;
        String output = "";
        JTextArea outputAreaTxt = new JTextArea(8, 20);
        for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {

            faccia = lanciaDado();

            switch (faccia) {
                case 1:
                    frequenza1++;
                    break;
                case 2:
                    frequenza2++;
                    break;
                case 3:
                    frequenza3++;
                    break;
                case 4:
                    frequenza4++;
                    break;
                case 5:
                    frequenza5++;
                    break;
                case 6:
                    frequenza6++;
                    break;
            }// end switch (faccia)

        }// end while while (lancio <= 10)

        output += "\n Faccia\tFrequenza";
        output += "\n   1\t" + frequenza1 + "\n   2\t" + frequenza2 + "\n   3\t" + frequenza3
                + "\n   4\t" + frequenza4 + "\n   5\t" + frequenza5 + "\n   6\t" + frequenza6;
        outputAreaTxt.setText(output);
        JOptionPane.showMessageDialog(null, outputAreaTxt);


/*  while (lancio <= 10) {
            faccia = lanciaDado();
            if (faccia == 1)
                frequenza1++;
            else if (faccia == 2)
                frequenza2++;
            else if (faccia == 3)
                frequenza3++;
            else if (faccia == 4)
                frequenza4++;
            else if (faccia == 5)
                frequenza5++;
            else if (faccia == 6)
                frequenza6++;
        }// end while while (lancio <= 10)  */


    }// end method main

    public static int lanciaDado() {
        //1 --> faccia1
        //2 --> faccia2
        //3 --> faccia3
        //4 --> faccia4
        //5 --> faccia5
        //6 --> faccia6
        int risultato;
        risultato = 1 + (int) (Math.random() * 6);
        return risultato;
    }//fine metodo lanciaDado()

}//end class AnalisiLanciDado
