package modulo5;

import javax.swing.*;

/* Una dado a 6 facce viene lanciato 6000 volte. Scrivere un programma che
Restituisca la frequenza di ogni singola faccia */
public class RollDie {
    public static void main(String[] args) {

        int faccia, frequenza[] = new int[7];
        String output= "";

        for (int lancio=1; lancio<=6000; lancio++){

            faccia = 1 +(int) (Math.random()*6);
            ++frequenza[faccia];

        }// end loop for (int lancio=1; lancio<=6000; lancio++)

        output += "Faccia\tFrequenza";

        for (faccia = 1; faccia<frequenza.length; faccia++)
            output += "\n" + faccia +"\t" +frequenza[faccia];

        JTextArea outputArea = new JTextArea(7,10);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null,outputArea,
                "Lancio di un dado 6000 volte", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }// end main method
}//end class RollDie
