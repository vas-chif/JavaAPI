package modulo5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GestioneArrayAndrea {

    static int a[];

    public static void main(String[] args) {

        boolean creaArray = true;
        boolean ordinaArray = true;

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
        String output;

        do {

            do {
                scelta = JOptionPane.showInputDialog(input);
                valScelta = Integer.parseInt(scelta);
                if ((valScelta < 0) || (valScelta > 7))
                    JOptionPane.showMessageDialog(null, "Range [0..7]",
                            "Scelta errata", JOptionPane.ERROR_MESSAGE);
            } while ((valScelta < 0) || (valScelta > 7));


            switch (valScelta) {
                case 1:
                    if (creaArray) {
                        creaArray();
                        creaArray = false;
                    } else
                        JOptionPane.showMessageDialog(null, "Array gi� creato");
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
                    else
                        JOptionPane.showMessageDialog(null, "Prima occorrenza della chiave di ricerca"
                                + " trovata alla posizione #" + esitoRicerca);

                    break;
                case 5:
                    eliminaElemento(a);
                    break;
                case 6:
                    if (ordinaArray) {
                        ordinaArray(a);
                        ordinaArray = false;
                    } else
                        JOptionPane.showMessageDialog(null, "Array � gi� ordinato");

                    break;

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

    public static void ordinaArray(int x[]) {

        int temp;

        for (int passaggio = 1; passaggio < x.length; passaggio++)
            for (int i = 0; i < x.length - passaggio; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                } //if(x[i]>x[i+1])

        JOptionPane.showMessageDialog(null, "Array ordinato");

    } //fine metodo ordinaArray(int x[])

    public static void popolaArray(int x[]) {

        String userInput, n;
        int valUserInput, valN;

        userInput = JOptionPane.showInputDialog("Popolamento array"
                + "\n[1] manuale\n"
                + "\n[2] random\n");
        valUserInput = Integer.parseInt(userInput);

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

    public static void eliminaElemento(int x[]) {

        // chiedo elemnto da eliminare

        String userIn;
        int valUserInput, nconta = 0;

        userIn = JOptionPane.showInputDialog("Elemento da cancellare");
        valUserInput = Integer.parseInt(userIn);


        String output = "\nArray\tindice \tvalore\n";

        JTextArea outputArea = new JTextArea(30, 40);
        JScrollPane sp = new JScrollPane(outputArea);


        for (int i = 0; i < x.length; i++) {

            if (x[i] == valUserInput) {
                nconta++;
                x[i] = 0;
                output += "Azzerato :\t [" + i + "] \t " + x[i] + "\n";

            }// fine if (x[i]) == valUserInput)
        }

        if (nconta == 0)
            output = "\nNumero " + valUserInput + " non trovato";

        outputArea.setText(output);
        outputArea.setEditable(false);
        JOptionPane.showMessageDialog(null, sp);

    } //fine metodo eliminaElemnto()


} //fine classe RicercaLineare
