package modulo5;

/*Le variabile vengono sempre passati ai metodi per VALORE -->
 * Viene creata un copia delle varibili stesse*/
public class PassaggioValori {
    public static void main(String[] args) {

        int a = 5;
        int b;
      //  b = metodoA(a);
        System.out.println(a);//passagio delle variabili ai metodi per valore
        System.out.println();

    }//end main method

    public static void metodoA(int x) {
        x = 10;
    }//end metodoA

}//end class PassaggioValori
