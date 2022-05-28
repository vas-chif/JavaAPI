package modulo6.time;

import javax.swing.*;

public class TimeTest {
    public static void main(String[] args) {

        Time1 t = new Time1();
        String output;

        output = "Orario universale iniziale: " + t.toUniversalTimeString()
                + "\nOrario standard iniziale " + t.toUniversalTimeString()
                + "\nChiamata implicita a toString() " + t;

        t.setTime(13, 27, 6);

        output += "\n\nOrario universale dopo setTime: " + t.toUniversalTimeString()
                + "\nOrario standard dopo setTime " + t.toStandardtimestring();

        t.setTime(99, 99, 99);

        output += "\n\nOrario a seguito di  settaggi errati: "
                + "\nOrarop universale: " + t.toUniversalTimeString()
                + "\nOrario standard: " + t.toStandardtimestring();

        JOptionPane.showMessageDialog(null, output, "Utilizzo della calsse Time1", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }// end main method

}//edn class YimeTest
