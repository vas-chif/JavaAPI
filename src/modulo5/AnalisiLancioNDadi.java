package modulo5;

import javax.swing.*;
import java.text.DecimalFormat;

// se selezioniamo un 50 dadi da introudure anche la barra di scorimento
//JScropPane su una JTextArea dimensionata opportunamente
public class AnalisiLancioNDadi {

    public static void main(String[] args) {

        final int LANCI_TOTALI = 1000;
        int valNumeroDadi,//range[1..50]
                risultato;
        String numeroDadi,
                output = "";
        double frequenzaPercentuale;
        int[] frequenza;

        DecimalFormat fifreDecimeale = new DecimalFormat("0.00000");
        JTextArea outputArea = new JTextArea(45, 90);
        JScrollPane sp = new JScrollPane(outputArea);

        output = "Quanti dadi vuole lanciare?\nNumero min dadi 1\nNumero max dadi 50";

        do {
            numeroDadi = JOptionPane.showInputDialog(output);
            valNumeroDadi = Integer.parseInt(numeroDadi);

            if ((valNumeroDadi < 1) || (valNumeroDadi > 50)) {
                JOptionPane.showMessageDialog(null, output,
                        "Dadi non selezionati cortamente", JOptionPane.ERROR_MESSAGE);
            }
        } while ((valNumeroDadi < 1) || (valNumeroDadi > 50));// per il valore di range

        frequenza = new int[(valNumeroDadi * 6) + 1];// modificato


        for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
            risultato = lanciaNDadiMAster(valNumeroDadi);// -- nr dadi
            frequenza[risultato]++;
        }//fine for (int lancio = 1; lancio <= LANCI_TOTALI; lacnio++)

        output = "\nSoma Faccia\tFrequenza\tFrequenza%\tIstograma";
        for (int i = valNumeroDadi; i < frequenza.length; i++) {//modificato  nr dadi////()
            frequenzaPercentuale = (double) frequenza[i] / LANCI_TOTALI * 100;
            output += "\n " + i + "\t" + frequenza[i] + "\t" +
                    fifreDecimeale.format(frequenzaPercentuale) +
                    "\t" + stampaIstograma(frequenzaPercentuale * valNumeroDadi);

        }//end   for (int i = valNumeroDadi; i < frequenza.length; i++)

        outputArea.setText(output);
        outputArea.setEditable(false);
        JOptionPane.showMessageDialog(null, sp);
        System.exit(0);

    }//end method main()


    public static int lanciaNDadiMAster(int nDadi) {//modifca lanciaNDadi
        int sommaDadi = 0;
        int risultato;
        for (int dado = 1; dado <= nDadi; dado++) {
            risultato = 1 + (int) (Math.random() * 6);
            System.out.println("Dado " + dado + " faccia " + risultato);

            sommaDadi += risultato;
            // System.out.println(sommaDadi);
        }
        //System.out.println(sommaDadi);
        return sommaDadi;

    }//end metodo  lanciaNDadiMAster()

    public static String stampaIstograma(double n) {
        String output = "";
        for (int i = 1; i <= n; i++)
            output += "*";
        return output;
    }// end method   public static int stampaIstograma(double n)

}//end class AnalisiLancioDado
