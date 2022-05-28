package modulo3;

import javax.swing.*;
import java.text.DecimalFormat;

// montante = capitaleInvetito * (1+interesse)(elevato)anno
//classe Math
// method pow(double b, double e):double --> b = base, e = exponente

public class CalcoloInteressi {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili static
        final int ANNI_TOTALI = 50;
        //Dichiarazioni delle variabili
        int capitaleInvetito = 1000;
        //int anno = 1;
        double interessePercentuale = 5;
        double interesse = interessePercentuale / 100;
        double montatnte;
        String output = "Anno\tMontante";

        //Dichiaro i riferimeti agli oggeti
        JTextArea outputArea = new JTextArea(11, 20);// 11 = righe, 20 = carateri :: ed oucpiamo spazio ai parmetri indicati
        JScrollPane sp = new JScrollPane(outputArea);
        DecimalFormat dueCifre = new DecimalFormat("0.00");

        //Elaborazioni dati
        for (int anno = 1; anno <= ANNI_TOTALI; anno++) {
            montatnte = capitaleInvetito * Math.pow(1 + interesse, anno);
            output += "\n" + anno + "\t" + dueCifre.format(montatnte);
        }// end loop for (int anno = 1; anno <= ANNI_TOTALI; anno++)

        //Produzione output
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, sp);
        System.exit(0);
    }// en method main
}//end class CalcoloInteressi
