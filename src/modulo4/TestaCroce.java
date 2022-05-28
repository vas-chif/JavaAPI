package modulo4;

import javax.swing.*;

public class TestaCroce {
    public static void main(String[] args) {

        final int TESATA = 1;
        final int CROCE = 2;

        //Dichiarazioni delle variabili
        int budget = 100;
        int valPuntata, valScomessa;
        int risultato;

        String scomessa;
        String puntata;
        String name = "";
        String output = "";

        //Aquisizione dei dati
        name = JOptionPane.showInputDialog("Inserisca il suo nome");
       output = "Buongiorno!\n" + name +
                "\nIl suo budget iniziale = 100\nNon puo puntare piu del suo budget\n" +
                "Se vince la puntata radopia\nSe perde!\nPerde solo i soldi puntati";
       JOptionPane.showMessageDialog(null,output);

        while (budget > 0 && budget < 1000) {
            output = "Il suo budget attuale è\n" + budget+ " Euro";
            JOptionPane.showMessageDialog(null,output );

            puntata = JOptionPane.showInputDialog("Quanto vuole puntare");
            valPuntata = Integer.parseInt(puntata);
            budget -= valPuntata;

            output = "Hai puntato " + valPuntata + " Euro"+
                    "Gli rimangono " + budget + " Euro";
            JOptionPane.showMessageDialog(null, output);

            scomessa = JOptionPane.showInputDialog("Testa = [1]\nCroce = [2])");
            valScomessa = Integer.parseInt(scomessa);

            risultato = lanciaMoneta();
            if (risultato == TESATA)
                output = "Testa";
            else
                output = "Croce";
            JOptionPane.showMessageDialog(null, "Il risultato è\n" + output);

            if (risultato == valScomessa) {
                valPuntata = valPuntata * 2;
                output = "Hai Vinto la mano.\n Vinci " + valPuntata + " euro";
                JOptionPane.showMessageDialog(null,output);
                budget += valPuntata;
            }//end if (risultato == valScomessa)
            else
                JOptionPane.showMessageDialog(null, "Hai perso la mano. Perdi "
                        + valPuntata + " euro ");
        }// end while (budget > 0 && budget < 1000)

        if (budget >= 1000)
            JOptionPane.showMessageDialog(null, "Complimneti!", "Hai vinto", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Ci dispiace", "Hai perso", JOptionPane.WARNING_MESSAGE);

        System.exit(0);

    }// end method main

    public static int lanciaMoneta() {
        // 1 --> testa
        // 2 --> croce
        int risultato;
        risultato = 1 + (int) (Math.random() * 2);
        return risultato;
    } //fine metodo lanciaMoneta()

}// end class TestaCroceMaster
