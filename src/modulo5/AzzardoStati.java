package modulo5;

import javax.swing.*;


public class AzzardoStati {
    public static void main(String[] args) {
        //dichiarazione dei stati Partita
        final int CONTINUA = 0;
        final int VITTORIA = 1;
        final int SCONFITA = 2;
        final int PATTA = 3;

        //dichiarazione dei stati della Mano
        // final int PUNTATA = 3;
        //final int LANCIO_DADI = 4;
        //final int MANO = 0;


        //Dichiarazioni delle variabili
        int budget = 1000;
        String puntata, output = "";
        int valPuntata, punti;
        int vincita = 0;
        int statoPartita = CONTINUA;
        int statoMano = CONTINUA;

        //Aquisizione dei dati
        while (statoPartita == CONTINUA) {


            do {
                output = "Budget " + budget + " €\nQuanto vuole puntare?";
                puntata = JOptionPane.showInputDialog(output);
                valPuntata = Integer.parseInt(puntata);

                if (valPuntata < 1 || valPuntata > budget) {
                    JOptionPane.showMessageDialog(null, "È necessario effetuare un apuntata" +
                                    "\ncompressa tra 1 euro e " + budget + " €",
                            "Puntata non corretta", JOptionPane.ERROR_MESSAGE);
                }//end if (valPuntata < 1 || valPuntata > budget)

            } while (valPuntata < 1 || valPuntata > budget);

            budget -= valPuntata;

            JOptionPane.showMessageDialog(null, "La sua puntat è di " + puntata + " €" +
                    "\n\nBudget rimasto è " + budget + " €");

            //LANCIO_DADI
            punti = lancia2Dadoi();

            output = "Punteggi dadi " + punti;

            //MANO
            switch (punti) {
                case 2:
                case 12:
                    statoMano = VITTORIA;
                    vincita = valPuntata * 5;
                    break;
                case 3:
                case 11:
                    statoMano = VITTORIA;
                    vincita = valPuntata * 3;
                    break;
                case 4:
                case 10:
                    statoMano = VITTORIA;
                    vincita = valPuntata * 2;
                    break;
                case 5:
                    statoMano = PATTA;
                    vincita = valPuntata;
                    break;
                default:
                    statoMano = SCONFITA;
                    vincita = 0;
            }//end switch (punti)

            if (statoMano == SCONFITA)
                output += "\n\nHai PERSO lamano:(\n\nPerdi " + puntata + " €";
            else {
                if (statoMano == VITTORIA)
                    output += "\n\nHai VINTO la mano\n\nVinice " + vincita + " €";
                else
                    output += "\n\nPATTA\n\nRecupera la puntata" + vincita + " €";
            }//end else of if (statoMano == SCONFITA)

            //Produzione output
            JOptionPane.showMessageDialog(null, output);

            budget += vincita;

            if (budget >= 5000)
                statoPartita = VITTORIA;
            else if (budget == 0)
                statoPartita = SCONFITA;

        }//end while (budget > 0 && budget < 5000)
        if (statoPartita == VITTORIA)
            output = "\nComplimenti ha VINTO\n\nBudget vinto " + budget;
        else
            //SCONFITA
            output = "\nCi dispiace\n\nHa PERSO";

        //Produzione output finale
        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }//end method main


    public static int lancia2Dadoi() {
        int dado1, dado2;
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        return dado1 + dado2;
    }//end  method lancia2Dadoi


}//end class Azzardo


   
    
