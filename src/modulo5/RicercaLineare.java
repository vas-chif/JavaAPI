package modulo5;

public class RicercaLineare {
    public static void main(String[] args) {

        int esitoRicerca;
        int[] a = {50, 40, 30, 20, 10, 10};

        //stampaArray(a);
        esitoRicerca = cercaElemento(a, 10);
        if (esitoRicerca == -1)
            System.out.println("Chiave di ricerca non trovata");
        else
            System.out.println("Prima occorenza della chiave di ricerca trovata alla posizione # " + esitoRicerca);

        esitoRicerca = cercaOccorenzae(a, 10);
        System.out.println("Nr. occorenze trovate = " + esitoRicerca);

        String ris = eliminaElemento(a,10);
        System.out.println(ris);



      //  ordinaArray(a);
        stampaArray(a);


    }//end main method

    public static void stampaArray(int[] x) {

        for (int i = 0; i < x.length; i++) {
            System.out.println("Array [" + i + "] = " + x[i]);
        }
    }// end method stampaArrayy(int[] x)

    public static int cercaElemento(int[] x, int key) {
        //se l'elemento che cerco "key" si trova nel arrai allora restituisco l'indice del elemento cercato
        //se l'elemto non si trova mel arrai restituisco "-1"
        boolean trovato = false;
        int i = 0;
        while ((i < x.length) && (trovato == false)) {
            if (x[i] == key)
                trovato = true;
            else
                i++;
        }// end loop while ((i<=x.length) && (trovato == false))

        if (trovato == true)
            return i;
        else
            return -1;
    }// end method cercaElemento(int[] x, int key)

    public static int cercaOccorenzae(int[] x, int key) {
        //return numero di occorenze
        int occorenza = 0;
        for (int i = 0; i < x.length; i++)
            if (key == x[i])
                occorenza++;

        return occorenza;
    }// end method cercaOcorenzae(int[] x, int key)

    public static void ordinaArray(int[] x) {
        int temp;
        for (int passaggio = 1; passaggio < x.length; passaggio++)
            for (int i = 0; i < x.length - passaggio; i++)
                if (x[i] > x[i + 1]) {
                    temp = x[i]; // salvo il valore del indice i in una variabile
                    x[i] = x[i + 1];// do il valore al indice "i = 0" il valore del indice "i+1 = 2
                    x[i + 1] = temp;// il valore salvato
                }//end if (x[i] > x[i + 1])
    }// end method ordinaArray(int[] x)

    public static String eliminaElemento(int[] x, int key) {
        String index = "";

        for (int i = 0; i < x.length; i++)
            if (key == x[i]) {
                index += String.format("Indice %s azzerato\n", i);
                x[i] = 0;
            }

        return index;
    }

}// end class RicercaLineare

