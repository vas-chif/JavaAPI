package modulo4.craps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//il gioco dei dadi craps
//Paramentri della finestra: width = 360, height = 110;

public class CrapsSlide extends JApplet implements ActionListener {
    //altre variabili  costanti per lo stato del gioco
    final int VINCE = 0, PERDE = 1, CONTINUA = 2;

    //altre variabili usate nel programa
    boolean primoLancio = true; //true sè il primo lancio
    int sommaDadi;              //somma dei dadi
    int punteggio;              //punteggio se non vince al primo lancio
    int statoGioco = CONTINUA;

    //componenti interfaccia utente grafica
    JLabel primoDadoEtichetta, secondoDadoEtichetta,
            sommaDadoEtichetta, punteggioEtichetta, showMessageEticheta;

    JTextField primoDadoCampoTesto, secondoDadoCampoTesto,
            sommaDadoCampoTesto, punteggioCampoTesto, showMessageTesto;

    JButton lancio;

    public void init() {

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        showMessageEticheta = new JLabel("Message");
        c.add(showMessageEticheta);
        showMessageTesto = new JTextField("Init", 35);
        showMessageTesto.setEditable(false);
        c.add(showMessageTesto);

        primoDadoEtichetta = new JLabel("Dado 1");
        c.add(primoDadoEtichetta);
        primoDadoCampoTesto = new JTextField(5);
        primoDadoCampoTesto.setEditable(false);
        c.add(primoDadoCampoTesto);

        secondoDadoEtichetta = new JLabel("dado 2");
        c.add(secondoDadoEtichetta);
        secondoDadoCampoTesto = new JTextField(5);
        secondoDadoCampoTesto.setEditable(false);
        c.add(secondoDadoCampoTesto);

        sommaDadoEtichetta = new JLabel("Somma");
        c.add(sommaDadoEtichetta);
        sommaDadoCampoTesto = new JTextField(5);
        sommaDadoCampoTesto.setEditable(false);
        c.add(sommaDadoCampoTesto);

        punteggioEtichetta = new JLabel("Punteggio");
        c.add(punteggioEtichetta);
        punteggioCampoTesto = new JTextField(5);
        punteggioCampoTesto.setEditable(false);
        c.add(punteggioCampoTesto);

        lancio = new JButton("Lancia i dadi");
        lancio.addActionListener(this);
        c.add(lancio);

    }// end method init()

    //chiama il metodo iniziaGioco quando vine premuto il pulsante
    @Override
    public void actionPerformed(ActionEvent e) {

        gioco();

    }// end method actionPerformed(ActionEvent e)

    public void gioco() {

        if (primoLancio) {           //primo lancio

            sommaDadi = lannacioDadi();

            switch (sommaDadi) {
                case 7:
                case 11:
                    statoGioco = VINCE;                 //vince al primo lancio
                    punteggioCampoTesto.setText("");    //svuota il campo punteggio
                    break;
                case 2:
                case 3:
                case 12:
                    statoGioco = PERDE;                 //perde al primo lancio
                    punteggioCampoTesto.setText("");    //svuota il campo punteggio
                    break;
                default:
                    statoGioco = CONTINUA;
                    punteggio = sommaDadi;
                    punteggioCampoTesto.setText(Integer.toString(punteggio));
                    primoLancio = false;
                    break;
            }// end switch (sommaDadi)

        }// end if (primoLancio)
        else {

            sommaDadi = lannacioDadi();
            if (sommaDadi == punteggio)      //vince con punteggio
                statoGioco = VINCE;
            else if (sommaDadi == 7)        //perde lanciando 7
                statoGioco = PERDE;

        }// end else of if (primoLancio)

        if (statoGioco == CONTINUA)
            showMessageTesto.setText("Lancia Ancora");
            // showStatus("Lancia Ancora");
        else {
            if (statoGioco == VINCE)
                showMessageTesto.setText("Hai vinto!! Clicca su \"Lancia i dadi\" \nper una nuova partita");
                //showStatus("Hai vinto!! Clicca su \"Lancia i dadi\" per una nuova partita");
            else
                showMessageTesto.setText("Hai perso!! Clicca su \"Lancia i dadi\" \nper una nuova partita");
            //showStatus("Hai perso!! Clicca su \"Lancia i dadi\" per una nuova partita");
            primoLancio = true;
        }// end elese of if (statoGioco == CONTINUA)

    }// end method gioco()

    public int lannacioDadi() {

        int dado1, dado2, somma;
        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        somma = dado1 + dado2;

        primoDadoCampoTesto.setText(Integer.toString(dado1));
        secondoDadoCampoTesto.setText(Integer.toString(dado2));
        sommaDadoCampoTesto.setText(Integer.toString(somma));
        return somma;

    }//end method lannacioDadi()

}// end class CrapsSlide
