package modulo5;

/*Si vuole effettuare un sondaggio sulla qualità dell’università italiana.
A 40 studenti viene richiesto di esprimere un voto da uno a 10.
Trasferire le risposte in un array e visualizzare, per ogni voto, il numero di
preferenze e la frequenza */

import javax.swing.*;

public class StudentPoll {
    public static void main(String[] args) {
        int esiti[] = {1, 2, 3, 4, 5, 6, 3, 1, 2, 7, 4, 5, 8, 3, 4, 5, 6, 7, 7,
                1, 3, 4, 7, 8, 5, 6, 8, 3, 2, 1, 2, 2, 3, 4, 3, 2, 4, 1, 5, 3};

        int frequenza[] = new int[11];
        String output = "";

        for (int risposta = 0; risposta < esiti.length; risposta++)
            ++frequenza[esiti[risposta]];
        output += "Voto\tFrequenza\n";

        for (int voto = 1; voto< frequenza.length; voto++)
            output+= voto+"\t"+frequenza[voto] + "\n";

        JTextArea outputArea = new JTextArea(11,10);
        outputArea.setText(output);

        JOptionPane.showMessageDialog(null,outputArea,
                "Esiti songaggio", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// edn main mehtod
}// end class StudentPoll
