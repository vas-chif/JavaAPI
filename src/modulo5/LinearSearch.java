package modulo5;
/*ricerca lineare di un elemento in un array*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LinearSearch extends JApplet implements ActionListener {
    JLabel chiaveLable, risultatoLable;
    JTextField chiaveTF, risultatoTF;
    int a[];

    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setSize(300, 250);
        frame.setVisible(true);
        JApplet LinearSearch = new LinearSearch();
        frame.add(LinearSearch);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        LinearSearch.init();

    }// end main method

    @Override
    public void init() {
        super.init();

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        chiaveLable = new JLabel("Inserisci chiave di ricerca");
        c.add(chiaveLable);
        chiaveTF = new JTextField(10);
        chiaveTF.addActionListener(this::actionPerformed);
        c.add(chiaveTF);

        risultatoLable = new JLabel("risutato");
        c.add(risultatoLable);
        risultatoTF = new JTextField(20);
        risultatoTF.setEditable(false);
        c.add(risultatoTF);

        //crea l'arrau e lo popola con interi pari da 0 a 198
        a = new int[100];
        for (int i = 0; i < a.length; i++)
            a[i] = 2 * i;

    }// end method init()

    //ricerca il valore chiave nell'array
    public int ricercaLineare(int array[], int key) {

        for (int n = 0; n < array.length; n++)
            if (array[n] == key)
                return n;
        return -1;
    }//end method ricercaLineare(int array[], int key)

    @Override
    public void actionPerformed(ActionEvent e) {

        String chiave = e.getActionCommand();
        int elemento = ricercaLineare(a, Integer.parseInt(chiave));

        if (elemento != -1)
            risultatoTF.setText("Valore trovto nel elemento " + elemento);
        else
            risultatoTF.setText("Valore non trovato");

    }// end method actionPerformed(ActionEvent e)

}// end class LinearSearch
