package modulo5;

import javax.swing.*;

public class Azzardo {
    public static void main(String[] args) {
        //Dichiarazioni delle variabili

        int budget = 1000;
        String puntata, output = "";
        int valPuntata, punti;
        int vincita;

        //Aquisizione dei dati
        while (budget > 0 && budget < 5000) {
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

            punti = lancia2Dadoi();

            output = "Punteggi dadi " + punti;

            switch (punti) {
                case 2:
                case 12:
                    vincita = valPuntata * 5;
                    output += "\n\nHai VINTO la mano\n\nVinice " + vincita + " €";
                    break;
                case 3:
                case 11:
                   vincita= valPuntata *3;
                    output += "\n\nHai VINTO la mano\n\nVinice " + vincita + " €";
                    break;
                case 4:
                case 10:
                   vincita= valPuntata * 2;
                    output += "\n\nHai VINTO la mano\n\nVinice " + vincita + " €";
                    break;
                case 5:
                    vincita = valPuntata;
                    output += "\n\nPATTA\n\nRecupera la puntata" + vincita + " €";
                    break;
                default:
                    output += "\n\nHai PERSO lamano:(\n\nPerdi " + puntata + " €";
                    vincita = 0;
            }//end switch (punti)

            //Produzione output
            JOptionPane.showMessageDialog(null, output);

            budget += vincita;
        }//end while (budget > 0 && budget < 5000)
        if (budget >= 5000)
            output = "\nComplimenti ha VINTO\n\n Budget vinto " + budget;
        else
            output = "\nCi dispiace\n\nHa PERSO: vince il BANCO";

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
