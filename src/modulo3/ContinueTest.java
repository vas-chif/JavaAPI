package modulo3;

import javax.swing.*;

public class ContinueTest {
    public static void main(String[] args) {

        String output = "";

        for (int count = 1; count <= 10; count++) {

            if (count == 5)
                continue;
            //ignora il codice rimanente del ciclo solo se count = 5
            output += count + " ";

        }// end  for (int count = 1; count<= 10; count++)

        output += "\nIstruzione continue eseguita per scelta 5";
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    }// end main method

}// end class ContinueTest
