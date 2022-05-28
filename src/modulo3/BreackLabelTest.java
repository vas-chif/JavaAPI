package modulo3;

import javax.swing.*;

public class BreackLabelTest {
    public static void main(String[] args) {

        String output = "";

        stop:
        {
            for (int riga = 1; riga <= 10; riga++) {
                for (int colona = 1; colona <= 5; colona++) {

                    if (riga == 5)
                        break stop;
                    output += "* ";

                }// end  for (int colona =1; colona <=5; colona++)

                output += "\n";

            }// end  for (int riga =1; riga<=10;riga++)

            output += "\nLoop terminato normalment";    //instruzzione saltata

        }// end stop

        JOptionPane.showMessageDialog(null, output, "Test di breack con eticheta",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// end main method
}// end class BreackLabelTest
