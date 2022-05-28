package modulo6;

import java.text.DecimalFormat;

// le carateritiche dei un oggeto devono essere globali/public ed hanno spazio dedicato
public class Orologio {
    private int ora;
    private int minuti;
    private int secondi;
    private static int cont;
    private String numeroSeriale = "Prodact Serial Number A000#";

    public Orologio() {
        // viene creato implicitamente

        setSerialNumber();
        setTime(0, 0, 0);// esplictiamo cosa fa il metodo ma non è oblicatorio
    }// end Orologio()

    public Orologio(int h, int m) {

        setSerialNumber();
        setTime(h, m);

    }// end constructor Orologio(int h, int m)

    public Orologio(int h, int m, int s) {

        setSerialNumber();
        setTime(h, m, s);
    }//end constructor Orologio(int h, int m, int s)

    private void setSerialNumber() {

        cont++;
        numeroSeriale += cont;

    }// end method setSerialNumber()

    public void setTime(int hour, int minuts, int seconds) {

        //ora = ((hour >= 0 && hour < 24) ? hour : 0);
        setHour(hour);
        // minuti = ((minuts >= 0 && minuts < 60) ? minuts : 0);
        setMinutes(minuts);
        //secondi = ((seconds >= 0 && seconds < 60) ? seconds : 0);
        setSeconds(seconds);

    }//end method setTime(int hour, int minuts, int seconds)

    public void setTime(int hour, int minuts) {

        //ora = ((hour >= 0 && hour < 24) ? hour : 0);
        setHour(hour);
        // minuti = ((minuts >= 0 && minuts < 60) ? minuts : 0);
        setMinutes(minuts);
        //secondi = 0;
        setSeconds(0);

    }//end method setTime(int hour, int minuts)

    private void setHour(int h) {
        /*  if (hour >= 0 && hour < 24) ora = hour;
        else  ora = 0;  */
       /* String dueZeri;
        int valDueZeri;
        valDueZeri = ((h >= 0 && h < 24) ? h : 0);
        dueZeri = dueCifre.format(valDueZeri);
        */
        ora = ((h >= 0 && h < 24) ? h : 0);

    }//end method setHour(int h)

    private void setMinutes(int m) {

        minuti = ((m >= 0 && m < 60) ? m : 0);

    }//end method minuts(int m)

    private void setSeconds(int s) {

        secondi = ((s >= 0 && s < 60) ? s : 0);

    }//end method setSeconds(int s)

    private int getHour() {

        return ora;

    }// end method getHour()

    private int getMinutes() {

        return minuti;

    }// end methond getMinutes()

    private int getSeconds() {

        return secondi;

    }// end methond getSeconds()

    public String showSerialNumber() {

        return numeroSeriale;

    }// end method showSerialNumber()

    public String showUniversalTime(boolean showSeconds) {
        //formato 0-24
        //ES: 14:18 --> 14:18
        DecimalFormat dueCifre = new DecimalFormat("00");
        String outPutTime;

        outPutTime = dueCifre.format(getHour()) + ":" + dueCifre.format(getMinutes());
        if (showSeconds == true)

            outPutTime += ":" + dueCifre.format(getSeconds());

        return outPutTime;

    }//end method showUniversalTime()

    public String showStandardTime(boolean showSeconds) {
        /**formato 0-12 AM/PM
        //ES: 14:18 --> 2:18 PM
         */
        String outPutTime;

        DecimalFormat dueCifre = new DecimalFormat("00");
        int ore = getHour();

        ore = (ore >= 0 && ore <= 12) ? getHour() : getHour() - 12;

        outPutTime = dueCifre.format(ore) + ":" + dueCifre.format(getMinutes());

        if (showSeconds == true)

            outPutTime += ":" + dueCifre.format(getSeconds());

        outPutTime += (getHour() < 12) ? " AM" : " PM";

        return outPutTime;
    }

    public String showStandardTimeMaster(boolean showSeconds) {
        //formato 0-12 AM/PM
        //ES: 14:18 --> 2:18 PM
        String outPutTime;

        DecimalFormat dueCifre = new DecimalFormat("00");

        outPutTime = ((getHour() == 12) || (getHour() == 0) ? 12 : getHour() % 12) + ":" +
                dueCifre.format(getMinutes());

        if (showSeconds == true)

            outPutTime += ":" + dueCifre.format(getSeconds());

        outPutTime += (getHour() < 12) ? " AM" : " PM";
        return outPutTime;
    }

}// end class Orologio
// va getito creare un oggeto globale un oggeto decimla format
// nella documentazione si splicitano solo i metodi pblici e cio che fano.. non si specifica che sono metodi @Override