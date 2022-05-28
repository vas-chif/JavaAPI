package modulo5;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GestioneArrayMePrimo {

    static int a[];

    public static void main(String[] args) {

        int esitoRicerca;
        String scelta, chiave;
        int valScelta, valChiave;

        String input = "Inserisci operazione"
                + "\n[1] crea array"
                + "\n[2] stampa array"
                + "\n[3] popola array"
                + "\n[4] cerca elemento"
                + "\n[5] elimina elemento"
                + "\n[6] ordina array"
                + "\n[7] exit";
        String output = "";

        do {

            scelta = JOptionPane.showInputDialog(input);
            valScelta = Integer.parseInt(scelta);

            switch (valScelta) {
                case 1:
                    creaArray();
                    break;
                case 2:
                    stampaArray(a);
                    break;
                case 3:
                    popolaArray(a);
                    break;
                case 4:
                    chiave = JOptionPane.showInputDialog("Inserisci chiave di ricerca");
                    valChiave = Integer.parseInt(chiave);
                    esitoRicerca = cercaElemento(a, valChiave);
                    if (esitoRicerca == -1)
                        JOptionPane.showMessageDialog(null, "Chiave di ricerca non trovata");
                    else {
                        output = "Prima occorrenza della chiave di ricerca trovata alla posizione #" + esitoRicerca;
                        esitoRicerca = cercaOccorrenze(a, valChiave);
                        JOptionPane.showMessageDialog(null, output + "\nOccorenze trovate " + esitoRicerca);
                    }
                    break;
                case 5:
                    chiave = JOptionPane.showInputDialog("Inserisci elemento da eliminare");
                    valChiave = Integer.parseInt(chiave);
                    String ris = eliminaElemento(a, valChiave);
                    if (ris == "")
                        JOptionPane.showMessageDialog(null, "Nessun elemento trovato");
                    else
                        JOptionPane.showMessageDialog(null, ris);
                    break;
                case 6:
                    ordinaArray(a);
                    JOptionPane.showMessageDialog(null, "Array e stato ordinato!");
                    break;
                case 7:
                    System.exit(0);

            } //fine switch(valScelta)

        } while (valScelta != 7);


    } //fine metodo main()

    public static void creaArray() {

        String lunghezzaArray;
        int valLunghezzaArray;

        lunghezzaArray = JOptionPane.showInputDialog("Lunghezza array");
        valLunghezzaArray = Integer.parseInt(lunghezzaArray);

        a = new int[valLunghezzaArray];

        JOptionPane.showMessageDialog(null, "Creazione array di " + valLunghezzaArray + " elementi");

    } //fine metodo creaArray(int size)

    public static void stampaArray(int x[]) {

        String output = "\nArray\tindice \tvalore\n";

        JTextArea outputArea = new JTextArea(30, 40);
        JScrollPane sp = new JScrollPane(outputArea);

        for (int i = 0; i < x.length; i++) {
            output += "ArrayA\t [" + i + "] \t " + x[i] + "\n";
        }

        outputArea.setText(output);
        outputArea.setEditable(false);
        JOptionPane.showMessageDialog(null, sp);

    } //fine metodo StampaArray()

    public static int cercaElemento(int x[], int key) {

        boolean trovato = false;
        int i = 0;

        while ((i < x.length) && (trovato == false)) {
            if (x[i] == key)
                trovato = true;
            else
                i++;
        } //fine ciclo while((i<x.length)&&(travato==false))

        if (trovato == true)
            return i;
        else
            return -1;

    } //fine metodo cercaElemento(int x[], int key)

    public static int cercaOccorrenze(int x[], int key) {

        int occ = 0;

        for (int i = 0; i < x.length; i++)
            if (x[i] == key)
                occ++;

        return occ;

    } //fine metodo cercaOccorrenze(int x[], int key)

    public static String eliminaElemento(int[] x, int key) {
        String index = "";
        for (int i = 0; i < x.length; i++)
            if (key == x[i]) {
                index += String.format("Indice %s azzerato\n", i);
                x[i] = 0;
            }//if (key == x[i])

        return index;
    }//end String eliminaElemento(int[] x, int key)

    public static void ordinaArray(int x[]) {

        int temp;

        for (int passaggio = 1; passaggio < x.length; passaggio++)
            for (int i = 0; i < x.length - passaggio; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                } //if(x[i]>x[i+1])

    } //fine metodo ordinaArray(int x[])

    public static void popolaArray(int x[]) {

        String userInput, n;
        int valUserInput, valN;
        do {
            userInput = JOptionPane.showInputDialog("Popolamento array"
                    + "\n[1] manuale\n"
                    + "\n[2] random\n");
            valUserInput = Integer.parseInt(userInput);
        } while (valUserInput != 1 && valUserInput != 2);

        if (valUserInput == 1)
            for (int i = 0; i < a.length; i++) {
                n = JOptionPane.showInputDialog("array[" + i + "] = ");
                valN = Integer.parseInt(n);
                x[i] = valN;
            } //fine ciclo for(int i=0; i<a.length; i++)
        else
            for (int i = 0; i < a.length; i++)
                x[i] = 1 + (int) (Math.random() * 90);

        JOptionPane.showMessageDialog(null, "Popolamento array completato");

    } //fine metodo popolaArray()


} //fine classe RicercaLineare
