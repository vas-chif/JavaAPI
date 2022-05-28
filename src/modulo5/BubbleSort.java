package modulo5;
/*il programa ordina i valori di un array in ordine ascendente*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Comparator;

public class BubbleSort extends JApplet {
    public static void main(String[] args) {
        Frame frame = new Frame("BubbleSort");
        frame.setSize(400, 300);
        frame.setVisible(true);
        JApplet BubbleSort = new BubbleSort();
        frame.add(BubbleSort);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        BubbleSort.init();
    }// edn main method

    @Override
    public void init() {
        super.init();
        JTextArea outputArea = new JTextArea();
        Container c = getContentPane();
        c.add(outputArea);

        int a[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};

        String output = "Elementi dell'array nel ordine originale\n";
        for (int i = 0; i < a.length; i++)
            output += " " + a[i];

        bubbleSort(a);

        output += "\n\nElemtni dell'array in ordine ascendenete\n";
        for (int i = 0; i < a.length; i++)
            output += " " + a[i];

        outputArea.setText(output);
    }// end method init()

    public void bubbleSort(int b[]) {

        //ordinamento a bolle degli elementi di un array
        for (int passaggio = 1; passaggio < b.length; passaggio++)
            for (int i = 0; i < b.length - 1; i++)
                if (b[i] > b[i + 1])
                    scambia(b, i, i + 1);

    }// end method bubbleSort(int b[])

    //scambia due elementi in un array
    public void scambia(int c[], int primo, int secondo) {

        int temp;  //variabile temporanea per lo scambio

        temp = c[primo];
        c[primo] = c[secondo];
        c[secondo] = temp;
    }// end method scambia(int c[], int primo, int secondo)

}// edn class BubbleShort
