package modulo5;

import javax.swing.*;

public class Craps {
    static int dado1, dado2;

    public static void main(String[] args) {
        //Dichiarazioni delle variabili
        String output = "";
        int punteggio = 0;
        int sommaDadi;
        boolean primoLancio = true;






        while (true) {

            if (primoLancio == true)
                JOptionPane.showMessageDialog(null, toPrint("Click OK per cominciare"));

            //Aquisizione dei dati
            sommaDadi = lancia2Dadi();
            output = "Dado1 = " + dado1 + "\tDado2 = " + dado2 + "\nSomma = " + sommaDadi;

            //Elaborazioni dati
            if (primoLancio == true) {

                if (sommaDadi == 7 || sommaDadi == 11)

                    output += "\n\nHai vinto";

                else if (sommaDadi == 2 || sommaDadi == 3 || sommaDadi == 12)

                    output += "\n\nHai perso";

                else {

                    punteggio = sommaDadi;
                    primoLancio = false;
                    output += "\n\nContinua";

                }//end ele of else if (sommaDadi == 2 && sommaDadi == 3 && sommaDadi == 12)

                JOptionPane.showMessageDialog(null, toPrint(output));

            }//end if (primoLancio == true)
            else {
                output = "Dado1 = " + dado1 + "\tDado2 = " + dado2 + "\nSomma = " + sommaDadi + "\tPunteggio = " + punteggio;
                if (sommaDadi == punteggio) {

                    output += "\n\nHai vinto";
                    primoLancio = true;

                }//end if (sommaDadi == punteggio)
                else if (sommaDadi == 7) {

                    output += "\n\nHai perso";
                    primoLancio = true;


                }// end else if (sommaDadi == 7)
                else
                    output += "\n\nLancia ancora";

                JOptionPane.showMessageDialog(null, toPrint(output));

            }// end else of if (primoLancio == true)

        }//end while (true)

    }// end main method

    public static int lancia2Dadi() {
        int risultato;
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        risultato = dado1 + dado2;
        return risultato;
    }//fine metodo lancio2Dadi()

    public static JTextArea toPrint(String out){

        JTextArea outputArea = new JTextArea(5, 10);
        outputArea.setText(out);
        outputArea.setEditable(false);

        return outputArea;
    }//end method toPtint(String out)

}//end class CrapsUltimatum
