package modulo4;

public class LancaiMonetaRandom {
    public static void main(String[] args) {
        int a;
        a = lanciaMoneta();
        System.out.println(a);
    }

    public static int lanciaMoneta() {
        // 1 --> testa
        // 2 --> croce
        int risultato;
        risultato = 1 + (int) (Math.random() * 2);
        return risultato;
    } //fine metodo lanciaMoneta()


}
