package modulo5;

import javax.swing.*;

public class AnalisiLanciDado {
    public static void main(String[] args) {
        final int LANCI_TOTALI = 100;
        int[] frequenza = new int[7];


        int faccia;
        String output = "";
        JTextArea outputAreaTxt = new JTextArea(20, 20);
        for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {

            //popolazione array
            faccia = lanciaDado();
            frequenza[faccia]++;

        }// end while while (lancio <= 10)

        output += "\n Faccia\tFrequenza";

        for (int i = 1; i < frequenza.length; i++) {
            output += "\n" + i + "\t" + frequenza[i];
        }

        outputAreaTxt.setText(output);
        outputAreaTxt.setEditable(false);
        JOptionPane.showMessageDialog(null, outputAreaTxt);
        System.exit(0);

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
