package modulo5;

/*Gli array (ogetti) vengono sempre passati ai metodi per RIFERIMENTO -->
 * Viene creata un copia delle RIFERIMENTO (collegamento) che punta alla array di origine*/
public class PassaggioRiferimenti {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};

        for (int i = 0; i < a.length; i++)
            System.out.println(String.format("a [%s] =  %s", i, a[i]));

        metodoArray(a);

        System.out.println("Arrai modificato?");
        for (int j = 0; j < a.length; j++)
            System.out.println(String.format("a [%s] =  %s", j, a[j]));


    }// end main method

    public static void metodoArray(int x[]) {
        x[2] = 100;
    }// end method metodoArray
}//end class PassaggioRiferimenti
