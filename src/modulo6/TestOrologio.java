package modulo6;

// new DecimalFormat("00")
public class TestOrologio {
    public static void main(String[] args) {
        Orologio t1;// non ho ocupato memoria
        t1 = new Orologio(12, 21, 36); // oucupo area di memeoria ::: 3 area di memori ora, minuti, seconti
        Orologio t2 = new Orologio();// oucupo nuova area di memeoria ::: 3 area di memori ora, minuti, seconti
        Orologio t3 = new Orologio(12, 10);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println();

        System.out.println(t1.showUniversalTime(true));
        System.out.println(t2.showUniversalTime(false));

        t1.setTime(11, 30);
        t2.setTime(11, 18, 4);

        System.out.println(t1.showUniversalTime(true));
        System.out.println(t2.showUniversalTime(false));

        System.out.println(t1.showStandardTime(true));
        System.out.println(t2.showStandardTime(false));
        System.out.println(t3.showStandardTime(true));
        System.out.println(t3.showStandardTimeMaster(true));


    }// end main method
}// end calss TestOrologio
