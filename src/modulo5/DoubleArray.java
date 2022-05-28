package modulo5;
/*Si vuole analizzare l’andamento degli studenti di una classe.
• Utilizzare un array 3x4
• Ogni riga rappresenta uno studente, mentre ogni colonna rappresenta un voto in uno di quattro esami che lo studente
ha sostenuto durante il semestre
• Le manipolazioni dell’array vengono eseguite da quattro metodi:
• minimo: determina il voto più basso tra tutti gli studenti
• massimo: determina il voto più alto tra tutti gli studenti
• media: determina il la media dei voti per studente
• stampaArray: aggiunge l’array a doppio indice a String output*/

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;

// esempio di array doppio indice

public class DoubleArray extends JApplet {
    static int voti[][] = {{21, 24, 27, 29}, {14, 18, 12, 11}, {24, 26, 18, 30}};

    static int studenti, esami;
    static String output;
    static JTextArea outputArea;

    public static void main(String[] args) {
        //inizializazione variabili di istanza
        studenti = voti.length;
        esami = voti[0].length;

        //crea una stringa di output

        output = "Array:\n";
        stampaArray();

        output += "\n\nVoto minimo: " + minimo()
                + "\nVoto massimo: " + massimo() + "\n";

        for (int i = 0; i < studenti; i++)
            output += "\nMedia studenti " + i + ": " + media(voti[i]);

        outputArea = new JTextArea(30,70);
        outputArea.setFont(new Font("Courier", Font.PLAIN,12));
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null,outputArea);
    }// end main method

    public static int minimo() {

        int votoMinimo = 30;

        for (int i = 0; i < studenti; i++)
            for (int j = 0; j < esami; j++)
                if (voti[i][j] < votoMinimo)
                    votoMinimo = voti[i][j];
        return votoMinimo;
    }//end method minimo()

    //trova il voto più alto
    public static int massimo() {

        int votoMassimo = 0;

        for (int i = 0; i < studenti; i++)
            for (int j = 0; j < esami; j++)
                if (voti[i][j] > votoMassimo)
                    votoMassimo = voti[i][j];
        return votoMassimo;
    }//end method massimo()

    public static double media(int setDiVoti[]) {

        int sommaVotiStudente = 0;

        for (int i = 0; i < setDiVoti.length; i++)
            sommaVotiStudente += setDiVoti[i];

        return (double) sommaVotiStudente / setDiVoti.length;
    }//end method media

    public static void stampaArray() {
        //allinea intestazione colone
        output += "        ";//8 spazi

        for (int i = 0; i < esami; i++)
            output += "[" + i + "]\t";

        for (int i = 0; i < studenti; i++) {
            output += "\nVoti[" + i + "] ";

            for (int j = 0; j < esami; j++)
                output += voti[i][j] + "\t";

        }// end loop for (int i = 0; i<studenti; i++)

    }// end method stampaArray()

}// end class DoubleArray
