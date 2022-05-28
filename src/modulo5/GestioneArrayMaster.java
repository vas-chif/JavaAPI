package modulo5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class GestioneArrayMaster {

    static int a[];
    static boolean CREATO = false;
    static boolean POPOLATO = false;
    static boolean ORDINATO = false;
    static String input = "Inserisci operazione"
            + "\n[1] crea array"
            + "\n[2] stampa array"
            + "\n[3] popola array"
            + "\n[4] cerca elemento"
            + "\n[5] elimina elemento"
            + "\n[6] ordina array"
            + "\n[7] exit";

    static int valScelta;

    public static void main(String[] args) {

        int esitoRicerca;
        String scelta, chiave, risposta;
        int valChiave;


        String output = "";

        do {

            scelta = JOptionPane.showInputDialog(input);
            valScelta = Integer.parseInt(scelta);

            switch (valScelta) {
                case 1:
                    creaArray();
                    break;
                case 2:
                   conrollo();
                    stampaArray(a);
                    break;
                case 3:
                    conrollo();
                    popolaArray(a);
                    break;
                case 4:
                    conrollo();
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
                    conrollo();
                    chiave = JOptionPane.showInputDialog("Inserisci elemento da eliminare");
                    valChiave = Integer.parseInt(chiave);
                    risposta = eliminaElemento(a, valChiave);
                    if (risposta == "")
                        JOptionPane.showMessageDialog(null, "Nessun elemento trovato");
                    else
                        JOptionPane.showMessageDialog(null, risposta);
                    break;
                case 6:
                    conrollo();
                    ordinaArray(a);
                    JOptionPane.showMessageDialog(null, "Array e stato ordinato!");
                    break;
                case 7:
                    System.exit(0);

            } //end switch(valScelta)

        } while (valScelta != 7);


    } //end method main()

    public static void creaArray() {

        String lunghezzaArray;
        int valLunghezzaArray;

        lunghezzaArray = JOptionPane.showInputDialog("Lunghezza array");
        valLunghezzaArray = Integer.parseInt(lunghezzaArray);

        a = new int[valLunghezzaArray];

        JOptionPane.showMessageDialog(null, "Creazione array di " + valLunghezzaArray + " elementi");
        CREATO = true;
    } //end method creaArray()

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

    } //end method StampaArray()

    public static int cercaElemento(int x[], int key) {

        boolean trovato = false;
        int i = 0;

        while ((i < x.length) && (trovato == false)) {
            if (x[i] == key)
                trovato = true;
            else
                i++;
        } //end ciclo while((i<x.length)&&(travato==false))

        if (trovato == true)
            return i;
        else
            return -1;

    } //end method cercaElemento(int x[], int key)

    public static int cercaOccorrenze(int x[], int key) {

        int occ = 0;

        for (int i = 0; i < x.length; i++)
            if (x[i] == key)
                occ++;

        return occ;

    } //end method cercaOccorrenze(int x[], int key)

    public static String eliminaElemento(int[] x, int key) {
        String index = "";

        for (int i = 0; i < x.length; i++)
            if (key == x[i]) {
                index += String.format("Indice %s azzerato\n", i);
                x[i] = 0;
            }//if (key == x[i])

        return index;
    }//end method String eliminaElemento(int[] x, int key)

    public static void ordinaArray(int x[]) {

        int temp;

        for (int passaggio = 1; passaggio < x.length; passaggio++)
            for (int i = 0; i < x.length - passaggio; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                } //end if(x[i]>x[i+1])
        ORDINATO = true;
    } //end end method ordinaArray(int x[])

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
            for (int i = 0; i < x.length; i++) {
                n = JOptionPane.showInputDialog("array[" + i + "] = ");
                valN = Integer.parseInt(n);
                x[i] = valN;
            } //end loop for(int i=0; i<a.length; i++)
        else
            for (int i = 0; i < x.length; i++)
                x[i] = 1 + (int) (Math.random() * 90);

        JOptionPane.showMessageDialog(null, "Popolamento array completato");
        POPOLATO = true;
    } //end method popolaArray()

    public static void controlloCreato() {
        while (CREATO == false) {
            JOptionPane.showMessageDialog(null, "Array non creato seleziona \"1\"");
            int userTinput = Integer.parseInt(JOptionPane.showInputDialog(input));
            if (userTinput == 1) {
                creaArray();
                CREATO = true;
            }// end if (valScelta == 1)
            else if (userTinput == 7)
                System.exit(0);
        }// while (creato == false)
    }//end method controlloCreato

    public static void controllaPopolato() {
        while (POPOLATO == false) {
            JOptionPane.showMessageDialog(null, "Array non popolato seleziona \"3\"");
            int userTinput = Integer.parseInt(JOptionPane.showInputDialog(input));
            if (userTinput == 3) {
                popolaArray(a);
                POPOLATO = true;
            }// end if (valScelta == 1)
            else if (userTinput == 7)
                System.exit(0);
        }// end while (pollato == false)
    }// end method controllaPopolato

    public static void conrollo() {
        switch (valScelta){
            case 2:
            case 3:
                controlloCreato();
                break;
            case 4:
            case 5:
            case 6:
                controlloCreato();
                controllaPopolato();
                break;
        }// end switch (valScelta)
    }// end method controllo
} //fine classe RicercaLineare
