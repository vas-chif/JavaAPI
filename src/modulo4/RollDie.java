package modulo4;

import javax.swing.*;

//Lancio di un dado 1000 volte
public class RollDie {
    public static void main(String[] args) {

        int frequenza1 = 0, frequenza2 = 0,
                frequenza3 = 0, frequenza4 = 0,
                frequenza5 = 0, frequenza6 = 0;
        int faccia;

        JTextArea outputArea = new JTextArea(7, 10);
        // riassume i risultati
        for (int lancio = 1; lancio <= 1000; lancio++) {

            faccia = 1 + (int) (Math.random() * 6);

            switch (faccia) {
                case 1:
                    ++frequenza1;
                    break;
                case 2:
                    ++frequenza2;
                    break;
                case 3:
                    ++frequenza3;
                    break;
                case 4:
                    ++frequenza4;
                    break;
                case 5:
                    ++frequenza5;
                    break;
                case 6:
                    ++frequenza6;
                    break;
            }// end switch (faccia)

        }// end for (int lancio = 1; lancio<=1000; lancio++)

        outputArea.setText("faccia\tFrequenza" + "\n1\t" + frequenza1 + "\n2\t" + frequenza2
                + "\n3\t" + frequenza3 + "\n4\t" + frequenza4 + "\n5\t" + frequenza5 + "\n6\t" + frequenza6);

        JOptionPane.showMessageDialog(null, outputArea,
                "Simulazione di 1000 lanci di un dado", JOptionPane.INFORMATION_MESSAGE);

    }// end main method

}// end class RollDie
