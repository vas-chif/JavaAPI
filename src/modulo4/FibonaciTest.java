package modulo4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FibonaciTest extends JApplet implements ActionListener {

    JLabel numeroLabel, risultatoLabel;
    JTextField numeroTextField, risultatoTextField;


    public static void main(String[] args) {

        Frame frame = new Frame("FibonaciTest");
        frame.setSize(1000, 500);
        frame.setVisible(true);
        JApplet FibonaciTest = new FibonaciTest();
        frame.add(FibonaciTest);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        FibonaciTest.init();

    }// end mai method

    public void init() {

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        numeroLabel = new JLabel("Inserire un intero ed premere enter");
        c.add(numeroLabel);
        numeroTextField = new JTextField(10);
        numeroTextField.addActionListener(this);
        c.add(numeroTextField);

        risultatoLabel = new JLabel("Il numero di Fibonacci è ");
        c.add(risultatoLabel);

        risultatoTextField = new JTextField(15);
        risultatoTextField.setEditable(true);
        c.add(risultatoTextField);


    }// edn mehtod init()

    @Override
    public void actionPerformed(ActionEvent e) {


        long numero, numeroDiFibonacci;
        numero = Long.parseLong(numeroTextField.getText());
        //showStatus("Calcolo in corso ....");
        numeroDiFibonacci = fibonacci(numero);
        //showStatus("Calcolo eseguito");
        risultatoTextField.setText(Long.toString(numeroDiFibonacci));

    }// end method actionPerformed(ActionEvent e)

    public long fibonacci(long n) {

        if ((n == 0) || (n == 1))
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));

    }// end method fibonacci(long n)
}// end class FibonaciTest extends JApplet implements ActionListener
