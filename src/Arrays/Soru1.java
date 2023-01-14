package Arrays;

import java.util.Arrays;

public class Soru1 {

    /*
         Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.
     */

    public static void main(String[] args) {

        int [] arr = {2, 4, 6, 8, 10};


        arrayArttirma(arr);

    }

    private static int[] arrayArttirma(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            arr[i]+=2;

        }

        System.out.println(Arrays.toString(arr));


        return arr;
    }
}
