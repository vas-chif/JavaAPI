package modulo5;

import java.lang.reflect.Array;

public class TestArray {
    public static void main(String[] args) {
        int b; //-- > ho allocato memorai
        int[] a;//-- > NON ho allocato memorai
        a = new int[5];// -- > ho allocato memoria

        // vista del array
        for (int i = 0; i < a.length; i++) {
            System.out.println(String.format("a[%s], %s", i, a[i]));
        }// end for (int i = 0; i < a.length; i++)

        //popolamento dell'array
        for (int i = 0; i < a.length; i++)
            a[i] = 1 + (int) (Math.random() * 10000);

        System.out.println();

        //vista del array
        for (int i = 0; i < a.length; i++) {
            System.out.println(String.format("na[%s], %s", i, a[i]));
        }// end for (int i = 0; i < a.length; i++)

    }//end main method
}//end class TestArray
