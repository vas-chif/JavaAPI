package modulo5;

import javax.swing.*;

public class CrapsStatiStatistiche {

    static int dado1, dado2;

    //Dichiarazioni dei STATi
    static int VINCI = 1;
    static int PERDI = 2;
    static int CONTINUA = 3;
    static int RILANCIO = 4;
    static int statoPartita = CONTINUA;
    //dichiaro i contatori
    static int partiteTotali = 0;   // partite totali
    static int partiteVinte = 0;    //partite vinte totali
    static int partiteVintePL = 0;  //partite vinte al primo lancio
    static int partitePerse = 0;    //partite persse totali
    static int partitePersePL = 0;  //partite persse al primo lancio

    public static void main(String[] args) {

        //Dichiarazioni delle variabili
        String output = "";
        int punteggio = 0;
        int sommaDadi;
        boolean primoLancio = true;


        while (true) {

            if (primoLancio == true) {
                JOptionPane.showMessageDialog(null, toPrint("Click OK per cominciare"));
                partiteTotali++;        // partite totali
            }
            //Aquisizione dei dati
            sommaDadi = lancia2Dadi();
            output = "Dado1 = " + dado1 + "\tDado2 = " + dado2 + "\nSomma = " + sommaDadi;

            //Elaborazioni dati
            if (primoLancio == true) {

                if (sommaDadi == 7 || sommaDadi == 11) {

                    statoPartita = VINCI;
                    partiteVinte++;     //partite vinte totali
                    partiteVintePL++;   //partite vinte al primo lancio

                }//end if (sommaDadi == 7 || sommaDadi == 11)
                else if (sommaDadi == 2 || sommaDadi == 3 || sommaDadi == 12) {

                    statoPartita = PERDI;
                    partitePerse++;     //partite persse totali
                    partitePersePL++;   //partite persse al primo lancio

                }// end else if (sommaDadi == 2 || sommaDadi == 3 || sommaDadi == 12)
                else {

                    statoPartita = CONTINUA;
                    punteggio = sommaDadi;
                    primoLancio = false;

                }//end ele of else if (sommaDadi == 2 && sommaDadi == 3 && sommaDadi == 12)

                output += controlloStati(punteggio);

                JOptionPane.showMessageDialog(null, toPrint(output));

            }//end if (primoLancio == true)

            else {
                output = "Dado1 = " + dado1 + "\tDado2 = " + dado2 + "\nSomma = " + sommaDadi +
                        "\tPunteggio = " + punteggio;
                if (sommaDadi == punteggio) {

                    statoPartita = VINCI;
                    primoLancio = true;
                    partiteVinte++;     //partite vinte totali

                }//end if (sommaDadi == punteggio)
                else if (sommaDadi == 7) {

                    statoPartita = PERDI;
                    primoLancio = true;
                    partitePerse++;     //partite persse totali

                }// end else if (sommaDadi == 7)
                else
                    statoPartita = RILANCIO;

                output += controlloStati(punteggio);

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

    public static String controlloStati(int punti) {
        String output = "\n---------------------------------------------------------------\n"
                + "Partite totali = " + partiteTotali +
                "\nPartite vinte = " + partiteVinte + " di cui primo lancio = " + partiteVintePL +
                "\nPartite perse = " + partitePerse + " di cui primo lancio = " + partitePersePL +
                "\n---------------------------------------------------------------\n";

        if (statoPartita == VINCI)

            output += "\nHai vinto";

        else if (statoPartita == PERDI)

            output += "\nHai perso";

        else if (statoPartita == CONTINUA)

            output += "\nContinua";

        else if (statoPartita == RILANCIO)

            output += "\nLancia ancora";

        return output;
    }// end method controlloStati(int punti)

    public static JTextArea toPrint(String out) {

        JTextArea outputArea = new JTextArea(5, 10);
        outputArea.setText(out);
        outputArea.setEditable(false);

        return outputArea;
    }//end method toPtint(String out)

}//end class CrapsUltimatum
