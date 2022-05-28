package modulo5;

import javax.swing.*;

// creare un metodo lancio dado che getisce la soma dei dadi
public class AnalisiSingoloLanciDado {

    static int dado1, dado2;

    public static void main(String[] args) {

        int somaDadi;
        String output = "";

        somaDadi = lancia2Dadi();

        output += "Dado1 = " + dado1 + "\nDado2 = " + dado2 + "\nSoma dadi  = " + somaDadi;

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);

    }// end method main

    public static int lancia2Dadi() {
        int risultato;
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        risultato = dado1 + dado2;
        return risultato;
    }//fine metodo lanciaDado()

}//end class AnalisiLanciDado

// quanto vale dado uno e quanto vale dado 2?
