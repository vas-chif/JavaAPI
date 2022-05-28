package modulo4;

import javax.swing.*;

public class TestaOCroceBase {


    public static void main(String[] args) {

        final int TESTA = 1;
        final int CROCE = 2;

        int budget = 100;
        String puntata, scommessa;
        int valPuntata, valScommessa;
        String output = "";
        int risultato;
        //esito = (int)(Math.random()* 2 + 1);

        output = "Benvenuto al gioco di Testa o Croce! \nIl tuo budget iniziale � di: " + budget + " euro";

        JOptionPane.showMessageDialog(null, output);

        while ((budget > 0) && (budget < 1000)) {

            output = "Budget: " + budget + " euro\nQuanto vuoi puntare?";

            puntata = JOptionPane.showInputDialog(output);
            valPuntata = Integer.parseInt(puntata);

            budget -= valPuntata;

            output = "Hai puntato " + valPuntata + " euro" + "\nNuovo budget: " + budget + " euro" + "\n\nScegli: Testa [1] oppure Croce [2]";

            scommessa = JOptionPane.showInputDialog(output);
            valScommessa = Integer.parseInt(scommessa);

            risultato = lanciaMoneta();

            output = "Hai puntato su ";

            if (valScommessa == TESTA)
                output += "testa";
            else
                output += "croce";
            output += "\nE' uscito ";

            if (risultato == TESTA)
                output += "testa";
            else
                output += "croce";

            if (risultato == valScommessa) {
                budget += (valPuntata) * 2;
                output += "\nHai vinto la mano! Vinci:  " + valPuntata * 2 + " euro";
            } //fine if(esito == valLanciaMoneta)
            else
                output += "\nHai perso la mano! Perdi : " + valPuntata + " euro";

            JOptionPane.showMessageDialog(null, output);

        } //fine ciclo while;

        if (budget >= 1000) JOptionPane.showMessageDialog(null, "Complimenti ! Hai Vinto");
        else JOptionPane.showMessageDialog(null, "Hai Perso");

        System.exit(0);

    } //fine metodo main()

    public static int lanciaMoneta() {

        // 1 --> testa
        // 2 --> croce

        int risultato;

        risultato = 1 + (int) (Math.random() * 2);
        return risultato;

    } //fine metodo lanciaMoneta()

} //fine classe

