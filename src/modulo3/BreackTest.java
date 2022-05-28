package modulo3;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class BreackTest {
    public static void main(String[] args) {

        String output = "";
        int count;

        for (count = 1; count <= 10; count++) {

            if (count == 5)
                break;
            output += count + " ";

        }// end for (count = 1; count <= 10; count++)

        output += "\nLoop interrotto quando count = " + count;

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    }// end method main
}// end class BreackTest
