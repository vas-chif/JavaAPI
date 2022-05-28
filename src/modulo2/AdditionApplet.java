package modulo2;

import javax.swing.*;// importa il package javax.swing
import java.awt.Graphics; // Importa la classe Graphics

public class AdditionApplet extends JApplet {
    double sum; //soma dei valori inseriti dall'utente


    @Override
    public void init() {
        String firtsNumber;  //prima stinga inserita dall'utente
        String secondNumber; //seconda stinga inserita dall'utente
        double number1;      //primo numero da agiungere
        double number2;      //secondo numero da agiungere

        //legge il primo numero dell'utente
        firtsNumber = JOptionPane.showInputDialog("Inserisci il primo numero a virgola mobile");
        //legge il secondo numero dell'utente
        secondNumber = JOptionPane.showInputDialog("Inserisci il secondo numero a virgola mobile");

        //Converte i numeri del tipo String in tipo double
        number1 = Double.parseDouble(firtsNumber);
        number2 = Double.parseDouble(secondNumber);

        //somma numeri
        sum = number1 + number2;
    }//end method init

    @Override
    public void paint(Graphics g) {
        //mostra i risultati con g.drowString
        g.drawRect(15, 10, 270, 20);
        g.drawString("La sommna è " + sum, 25, 25);
    }//end method paint
}//end class AdditionApplet
