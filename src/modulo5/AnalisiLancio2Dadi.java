package modulo5;

import javax.swing.*;

public class AnalisiLancio2Dadi {

    public static void main(String[] args) {

        final int LANCI_TOTALI = 100;

        int[] frequenza = new int[13];

        int risultato;
        String output = "Lanci = " + LANCI_TOTALI;

        JTextArea outputArea = new JTextArea(9, 20);

        for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {

            risultato = lancia2Dadi();
            frequenza[risultato]++;

        }//fine for (int lancio = 1; lancio <= LANCI_TOTALI; lacnio++)

        output += "\n\nFaccia\tFrequenza";

        for (int i = 2; i < frequenza.length; i++)
            output+= "\n "+ i + "\t"+ frequenza[i];


        outputArea.setText(output);
        outputArea.setEditable(false);
        JOptionPane.showMessageDialog(null, outputArea);
        System.exit(0);

    }//fine metodo main()

    public static int lancia2Dadi() {
        int risultato;
        int dado1, dado2;

        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        return risultato = dado1 + dado2;

    }//fine metodo lancio2Dadi()

}//fine classe AnalisiLancioDado
