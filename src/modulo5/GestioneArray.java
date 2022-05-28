package modulo5;

import javax.swing.*;

public class GestioneArray {

    static int[] arrayA;

    public static void main(String[] args) {

        creaArray();        //crea array

        stampaArray(arrayA);

        popolaArray(arrayA);      //popola array

        stampaArray(arrayA);

        cercaElemento(arrayA);    //cerca elemento

        stampaArray(arrayA);

        System.exit(0);
    }// end main method


    public static void creaArray() {//size = length
        String userInput;
        userInput = JOptionPane.showInputDialog("Inserisca la grandeza del array!");
        int size = Integer.parseInt(userInput);
        arrayA = new int[size];
        JOptionPane.showMessageDialog(null, "È stato creato un arrai di " + size + " elemnti");
    }// end creaArray( int y)

    public static void popolaArray(int[] x) {
        String userInput, index;
        int valUserInput, valIndex;
        do {
            userInput = JOptionPane.showInputDialog("Se vuole popolare l’array \n“a mano”\n" +
                    "scelta [1]\n" +
                    "random\n" +
                    "scelta [2]");
            valUserInput = Integer.parseInt(userInput);
        } while (valUserInput != 1 && valUserInput != 2);

        if (valUserInput == 1) {
            for (int i = 0; i < x.length; i++) {
                index = JOptionPane.showInputDialog("Array index [" + i + "]");
                valIndex = Integer.parseInt(index);
                x[i] = valIndex;
            }// end  for (int i = 0; i < arrayA.length; i++)
        }// end if (valUserInput == 1)
        else
            for (int i = 0; i < x.length; i++)
                x[i] = 1 + (int) (Math.random() * 90);
        JOptionPane.showMessageDialog(null, "Array popolato");
    }// end popolaArray()

    public static int cercaElemento(int[] x) {
        String userInput;
        userInput = JOptionPane.showInputDialog("Che key vuole trovare ?");
        int key = Integer.parseInt(userInput);

        boolean trovato = false;
        int i = 0;
        int occorenza = 0;
        while ((i < x.length) && (trovato == false)) {
            if (x[i] == key) {
                trovato = true;
                occorenza++;
            } else {
                i++;
            }
        }// end loop while ((i<=x.length) && (trovato == false))

        if (trovato == true) {
            JOptionPane.showMessageDialog(null, "Prima Occorenza = " + occorenza
                    + "\nTotale occorenze trovate " + cercaOccorenzae(x, key));

            return i;
        } else {
            JOptionPane.showMessageDialog(null, "Nessuna ccorenza trovata.");
            return -1;
        }// end else o if (trovato == true)
    }// end method cercaElemento(int[] x, int key)

    public static int cercaOccorenzae(int[] x, int key) {
        //return numero di occorenze
        int occorenza = 0;
        for (int i = 0; i < x.length; i++)
            if (key == x[i])
                occorenza++;

        return occorenza;
    }// end method cercaOcorenzae(int[] x, int key)

    public static String eliminaElementoArray(int key) {
        String userInput;
        userInput = JOptionPane.showInputDialog("Che key vuole eliminare ?");
        key = Integer.parseInt(userInput);

        int elemento = 0;
        String indiceElementieliminati = "";
        for (int i = 0; i < arrayA.length; i++)
            if (key == arrayA[i]) {
                arrayA[i] = 0;
                elemento++;
                indiceElementieliminati += "" + elemento + "\n";
            }
        return indiceElementieliminati;
    }//eliminaElementoArray()

    public static void ordinaArray(int[] x) {
        int temp;
        for (int passaggio = 1; passaggio < x.length; passaggio++)
            for (int i = 0; i < x.length - passaggio; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i]; // salvo il valore del indice i in una variabile
                    x[i] = x[i + 1];// do il valore al indice "i = 0" il valore del indice "i+1 = 2
                    x[i + 1] = temp;// il valore salvato
                }//end if (x[i] > x[i + 1])
    }// end method ordinaArray(int[] x)

    public static void stampaArray(int[] x) {
        String output = "\nArray\tindice \tvalore\n";
        JTextArea outputArea = new JTextArea(45, 40);
        for (int i = 0; i < x.length; i++) {
            //    System.out.println("Array [" + i + "] = " + x[i]);
            output += "ArrayA\t [" + i + "] \t " + x[i] + "\n";
            outputArea.setText(output);
        }
        outputArea.setEditable(false);
        JScrollPane sp = new JScrollPane(outputArea);
        JOptionPane.showMessageDialog(null, sp);
    }// end method stampaArrayy(int[] x)
}// end class GestioneArray
