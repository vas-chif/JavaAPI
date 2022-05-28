package modulo2;

public class OggettoString {
    public static void main(String[] args) {
        //Dichiaro un riferimento "s" di tipo string
        String s;

        //Instanzio la classe String nell' oggetto String riferimento da "s"
        //modellandolo con la sequenza do char "C" "i" "a" "o"
        s = new String("Ciao"); //un stringa viene equiparata a una varibile anche se è un ogget
        //quindi   s = "Ciao"; -- > per le stringhe sara piu correto instanziarle in queto modo
        System.out.println(s);

        WelcomeApplet wel = new WelcomeApplet();

    }// end method main
}// end class OggettoString
