package modulo4;

public class MetodoCalcolaPotenza {
    public static void main(String[] args) {
        int risultato;
        int base = 1;
        int esponente = 0;

        risultato = calcolaPotenza(base,esponente);
        if (risultato == -1)
            System.out.println("Indeterminato");
        else
        System.out.println(risultato);
    }//end method main

    public static int calcolaPotenza(int b, int esp) {
        int ris = 1;
        if ((b == 0) && (esp == 0))
            return -1;
        else {
            for (int cont = 1; cont <= esp; cont++)
                ris *= b;
            return ris;
        }
    }//end method int calcolaPotenza(int b, int esp)
}//end class CalcolaPotenza
