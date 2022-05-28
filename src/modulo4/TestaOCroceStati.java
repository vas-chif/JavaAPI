package modulo4;

import javax.swing.*;

public class TestaOCroceStati {


    public static void main(String[] args) {

        final int TESTA = 1;
        final int CROCE = 2;
        final int VICTORIA = 3;
        final int SCONFIATA = 4;
        final int CONTINUA = 5;

        int budget = 100;
        String puntata, scommessa;
        int valPuntata, valScommessa;
        String output = "";
        int risultato;
        int statoPasrtita = CONTINUA;

        //esito = (int)(Math.random()* 2 + 1);

        output = "Benvenuto al gioco di Testa o Croce! \nIl tuo budget iniziale � di: " + budget + " euro";

        JOptionPane.showMessageDialog(null, output);

        // while ((budget > 0) && (budget < 1000))
        while (statoPasrtita == CONTINUA) {

            output = "Budget: " + budget + " euro\nQuanto vuoi puntare?";

            do {
                puntata = JOptionPane.showInputDialog(output);
                valPuntata = Integer.parseInt(puntata);
                if ((valPuntata <= 0) || (valPuntata > budget))
                    JOptionPane.showMessageDialog(null, "È necessario effetuare un apuntata" +
                                    "\ncompressa tra 1 euro e " + budget + " euro",
                            "Puntata non messa", JOptionPane.ERROR_MESSAGE);
            } while ((valPuntata <= 0) || (valPuntata > budget));// per il valore di rancge

            budget -= valPuntata;

            output = "Hai puntato " + valPuntata + " euro" +
                    "\nNuovo budget: " + budget + " euro" +
                    "\n\nScegli: Testa [1] oppure Croce [2]";
            do {
                scommessa = JOptionPane.showInputDialog(output);
                valScommessa = Integer.parseInt(scommessa);
                if ((valScommessa != 1) && (valScommessa != 2))
                    JOptionPane.showMessageDialog(null,
                            "Scomessa non valida", "errore",
                            JOptionPane.ERROR_MESSAGE);

            } while ((valScommessa != 1) && (valScommessa != 2));

            risultato = lanciaMoneta();

            output = "Hai puntato su ";
            if (valScommessa == TESTA)
                output += "testa";
            else
                output += "croce";

            output += "\nE' uscito ";

            if (risultato == TESTA) output += "testa";
            else output += "croce";

            if (risultato == valScommessa) {
                budget += (valPuntata) * 2;
                output += "\nHai vinto la mano! Vinci:  " + valPuntata * 2 + " euro";
            } //fine if(esito == valLanciaMoneta)
            else
                output += "\nHai perso la mano! Perdi : " + valPuntata + " euro";

            JOptionPane.showMessageDialog(null, output);

            if (budget >= 1000)
                statoPasrtita = VICTORIA;
            else if (budget == 0)
                statoPasrtita = SCONFIATA;

        } //fine ciclo while;

        //if (budget >= 1000)
        if (statoPasrtita == VICTORIA)
            JOptionPane.showMessageDialog(null, "Complimenti ! Hai Vinto");
        else
            JOptionPane.showMessageDialog(null, "Hai Perso");

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

