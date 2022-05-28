package modulo4;

import javax.swing.*;

public class AnalisiLancio2Dadi {

    public static void main(String[] args) {

        final int LANCI_TOTALI = 10000000;

        int  frequenza2 = 0, frequenza3 = 0,
                frequenza4 = 0, frequenza5 = 0, frequenza6 = 0,
                frequenza7 = 0, frequenza8 = 0, frequenza9 = 0,
                frequenza10 = 0, frequenza11 = 0, frequenza12 = 0;

        int risultato;
        String output = "Lanci = " + LANCI_TOTALI;

        JTextArea outputArea = new JTextArea(9, 20);

        for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {

            risultato = lancia2Dadi();

            switch (risultato) {
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
                case 7:
                    frequenza7++;
                    break;
                case 8:
                    frequenza8++;
                    break;
                case 9:
                    frequenza9++;
                    break;
                case 10:
                    frequenza10++;
                    break;
                case 11:
                    frequenza11++;
                    break;
                case 12:
                    frequenza12++;
                    break;
                default:
                    System.exit(-1);
            }//fine switch

        }//fine for (int lancio = 1; lancio <= LANCI_TOTALI; lacnio++)

        output += "\n\nFaccia\tFrequenza";
        output += "\n2\t" + frequenza2 + "\n3\t" + frequenza3
                + "\n4\t" + frequenza4 + "\n5\t" + frequenza5 + "\n6\t" + frequenza6
                + "\n7\t" + frequenza7 + "\n8\t" + frequenza8 + "\n9\t" + frequenza9
                + "\n10\t" + frequenza10 + "\n11\t" + frequenza11 + "\n12\t" + frequenza12;

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

    }//fine metodo lancioDado()

}//fine classe AnalisiLancioDado
