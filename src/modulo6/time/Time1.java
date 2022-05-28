package modulo6.time;

import java.text.DecimalFormat;

public class Time1 extends Object {

    private int ora;            // 0 - 23
    private int minuti;         // 0 - 59
    private int secondi;        // 0 - 59

    //Il construttore time1 inizializza ogni variabile di instanza a zero.
    //Assicurarsi che ogni oggetto Time! inizi in uno stato consistente


    public Time1() {

        setTime(0, 0, 0);

    }//end constructor Time1

    //Imposta valore Time con il fromato universale
    //controlla la validità dei dati e imposta i valori non validi a zero
    public void setTime(int h, int m, int s) {

        ora = ((h >= 0 && h < 24) ? h : 0);
        minuti = ((m >= 0 && m < 60) ? m : 0);
        secondi = ((s >= 0 && s < 60) ? s : 0);

    }//end method setTime(int h, int m, int s)

    //converte le varibili di instanza in una stringa con formato orrario universale (hh:mm:ss)
    public String toUniversalTimeString() {

        DecimalFormat dueCifre = new DecimalFormat("00");

        return dueCifre.format(ora) + ":" + dueCifre.format(minuti) + ":" + dueCifre.format(secondi);
    }// end method toUniversalTimeString()

    //converte le varibile in un instanza in un stringa con formato orario standard (AM/PM)
    public String toStandardtimestring() {

        DecimalFormat dueCifre = new DecimalFormat("00");

        return ((ora == 12) || (ora == 0) ? 12 : ora % 12) + ":" +
                dueCifre.format(minuti) + ":" +
                dueCifre.format(secondi) + (ora < 12 ? " AM" : " PM");

    }// end method toStandardtimestring()

}// end class Time1
