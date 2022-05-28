package modulo4;

public class TestSwitch {
    public static void main(String[] args) {
        int anni = 23;
        switch (anni) {
            case 18:
                System.out.println("Hai 18 anni");
                break;
            case 19:
                System.out.println("Hai 19 anni");
                break;
            case 20:
                System.out.println("Hai 20 anni");
                break;
            default:
                System.out.println("Non hai 18, 19 o 20 anni, ma hai " + anni + " sei fuori rangge :(");
                break;// eun break facoltativo si mete solo per simetria
        }//switch (anni)

        System.out.println("continua ...");
    }// end main method
}// end class TestSwitch
