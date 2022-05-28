package modulo4;

public class MethodLancaDado {
    public static void main(String[] args) {
        int faccia;
        faccia = lanciaNDadiMAster(4);
        System.out.println(faccia);


    }//end method main

    public static int lanciaDado() {
        //1 --> faccia1
        //2 --> faccia2
        //3 --> faccia3
        //4 --> faccia4
        //5 --> faccia5
        //6 --> faccia6
        int risultato;
        risultato = 1 + (int) (Math.random() * 6);
        return risultato;
    }//fine metodo lanciaDado()

    public static int lancia2Dadi() {
        int risultato;
        int dado1, dado2;

        dado1 = 1 + (int) (Math.random() * 6);
        dado2 = 1 + (int) (Math.random() * 6);
        return risultato = dado1 + dado2;
    }//fine metodo lancioDado()


    public static int lanciaNDadi(int nDadi) {//modifca lanciaNDadi

        int[] dadi = new int[nDadi];
        System.out.println("Length " + dadi.length);
        int somaFace = 0;
        for (int i = 0; i < dadi.length; i++) {
            dadi[i] = 1 + (int) (Math.random() * 6);
            somaFace = somaFace + dadi[i];
            System.out.println("dado nr: " + (i + 1) + " = " + dadi[i]);
        }
        System.out.println(somaFace);
        return somaFace;

    }//end metodo lancioDado()

    public static int lanciaNDadiMAster(int nDadi) {//modifca lanciaNDadi
        int sommaDadi = 0;
        int risultato;
        for (int dado = 1; dado <= nDadi; dado++) {
            risultato = 1 + (int) (Math.random() * 6);
            System.out.println("Dado " + dado + " faccia " + risultato);

            sommaDadi += risultato;
           // System.out.println(sommaDadi);
        }
        //System.out.println(sommaDadi);
        return sommaDadi;

    }//end metodo  lanciaNDadiMAster()

}//end calss LancaDadoMethod


//JScropPane su una JTextArea dimensionata opportunamente
// se selezioniamo un 50 dadi da introudure anche la barra di scorimento