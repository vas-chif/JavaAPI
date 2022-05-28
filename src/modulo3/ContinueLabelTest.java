package modulo3;

import javax.swing.*;

public class ContinueLabelTest {
    public static void main(String[] args) {

        String output = "";

        nextRow:
        {

            for (int riga = 1; riga <= 5; riga++) {
                output += "\n";

                for (int colona = 1; colona <= 10; colona++) {

                  //  if (colona > riga) continue nextRow;
                    //prox iterazione del ciclo
                    output += "+ ";

                }// end  for (int colona = 1; colona <=10; colona++)

            }// end for (int riga = 1; riga<=5; riga++)

        }// end nextRow

        JOptionPane.showMessageDialog(null, output
                , "Test di continue con etichetta", JOptionPane.INFORMATION_MESSAGE);

    }// end main method

}// end class ContinueLabelTest
