package modulo4;

public class CalcolaPotenza {
    public static void main(String[] args) {
        int risultato = 1;
        //int cont = 1;
        int base = 4;
        int esponente = 4;

        if ((base == 0)&&(esponente ==0))
            System.out.println("Indeterminato");
        else {
            for (int cont = 1; cont <= esponente; cont++)
                risultato *= base;
            System.out.println(risultato);
        }//end else of if ((base == 0)&&(esponente ==0))

        System.exit(0);
    }//end method main
}//end class CalcolaPotenza
