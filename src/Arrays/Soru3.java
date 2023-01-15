package Arrays;

import java.util.Arrays;

public class Soru3 {

    /*
    Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
    basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
     */

    public static void main(String[] args) {

        int [] arr = {4, 5, 6, 7};

        arrayiSagaKaydir(arr);
    }

    private static void arrayiSagaKaydir(int[] arr) {

        int temp = arr [arr.length-1];


        for (int i = arr.length-1; i >= 1 ; i--) {

          arr[i] = arr[i-1];

        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
