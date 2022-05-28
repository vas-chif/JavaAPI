/*GERARCHIE DEI METOI
 * javax.swimg -->package
 * JOptionPane --> class
 * showMessageDialog --> method*/
package modulo1;

import javax.swing.JOptionPane;

public class Test2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Test ok!");
        JOptionPane.showMessageDialog(null, "Tra un po' si va a fare aperitivo!");
        JOptionPane.showMessageDialog(null, "Buongiorno!", "avvio", JOptionPane.WARNING_MESSAGE);

        System.exit(0);
    }//end method main
}//end class Test2
