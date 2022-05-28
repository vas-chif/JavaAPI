package modulo4;

import javax.swing.*;

public class CalcoloMassimo {
    public static void main(String[] args) {
        int x = 0, y= 0, z= 0;
        int max;
        x = Integer.parseInt(JOptionPane.showInputDialog("Inserisce il valore x "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Inserisce il valore y "));
        z = Integer.parseInt(JOptionPane.showInputDialog("Inserisce il valore z "));
        /* Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for x = ");
        x = sc.nextInt();
        System.out.print("Enter value for y = ");
        y = sc.nextInt();
        System.out.print("Enter value for z = ");
        z = sc.nextInt(); */

        max = calcolaIlMassimo(x, y, z);
        JOptionPane.showMessageDialog(null,"Il mavore massino è " + max);
       // System.out.println("\nThe max value is = " + max);


    }//end method main

    public static int calcolaIlMassimo(int a, int b, int c) {
        int massimo;
        if (a > b)
            massimo = a;
        else
            massimo = b;
        if (c > massimo)
            massimo = c;
        return massimo;
    }// end method calcolaIlMassimo(int a, int b, int c)

}// end class ClcoloMassimo
