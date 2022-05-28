package modulo5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

public class BinarySearch extends JApplet implements ActionListener {
    JLabel chiaveLable, risultatoLable;
    JTextField chiaveTF, rislutatoTF;
    JTextArea output;

    int a[];
    String display = "";

    public static void main(String[] args) {
        Frame frame = new Frame("Binary Search");
        frame.setSize(500, 200);
        frame.setVisible(true);
        JApplet BinarySearch = new BinarySearch();
        frame.add(BinarySearch);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        BinarySearch.init();
    }// end main method

    @Override
    public void init() {
        super.init();

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        chiaveLable = new JLabel("Chiave di ricerca");
        c.add(chiaveLable);
        chiaveTF = new JTextField(5);
        chiaveTF.addActionListener(this::actionPerformed);
        c.add(chiaveTF);

        risultatoLable = new JLabel("Risultato");
        c.add(risultatoLable);
        rislutatoTF = new JTextField(22);
        rislutatoTF.setEditable(false);
        c.add(rislutatoTF);

        output = new JTextArea(6, 67);
        output.setFont(new Font("Courier", Font.PLAIN, 12));
        c.add(output);
        //creare l'array e lo riempi di interi pari da 0 a 28
        a = new int[15];
        for (int i = 0; i < a.length; i++)
            a[i] = 2 * i;

    }//end method init()

    @Override
    public void actionPerformed(ActionEvent e) {
        String chiave = e.getActionCommand();

        //inizializza la sctinga per la nuova ricerca
        display = "Porzione di array sulla quale viene effetuata la ricerca\n";

        //esegue la ricerca binaria
        int elemto = ricercaBinaria(a, Integer.parseInt(chiave));

        output.setText(display);

        if (elemto != -1)
            rislutatoTF.setText("Valore trovato nel elemento " + elemto);
        else
            rislutatoTF.setText("Valore non trovato");

    }//end method actionPerformed(ActionEvent e)

    //ricerca binaria
    public int ricercaBinaria(int array[], int key) {

        int low = 0;
        int high = array.length - 1;
        int middle;

        while (low >= high) {

            middle = (low + high) / 2;

            //la seguente riga viasualizza parte dell'array attualmente in uso durante ogni iterazione
            //del ciclo di ricerca binaria
            costruisciOutput(low, middle, high);

            if (key == array[middle])//corrispondenza
                return middle;
            else if (key < array[middle])   //ricerca nell aprima parte
                high = middle - 1;
            else
                low = middle + 1;              //ricerca nell seconda parte
        }// end while (low>=high)

        return -1; //chiave di ricerca non trovata

    }// end method ricercaBinaria(int array[], int key)

    //crea una riga output che mostra la parte dell'array
    // sulla quale viene effetuata la ricerca

    void costruisciOutput(int lo, int mmid, int hi) {

        DecimalFormat dueCifre = new DecimalFormat("00");

        for (int i = 0; i < a.length; i++) {

            if (i < lo || i > hi)
                display += "    ";
            else if (i == mmid) //marca l'elemnto di mezzo
                display += dueCifre.format(a[i]);
            else
                display += dueCifre.format(a[i]);

        }// end loop for

    }// end method costruisciOutput(int lo, int mmid, int hi)

}// end class BinarySearch
