package MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Soru3 {

    /* Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
       toplaminini yazdiran bir method olusturun. */

    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4},{5,2},{1,5,7},{6}};

        sonElementiYazdir(arr);
    }

    private static void sonElementiYazdir(int[][] arr) {

        int [] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                int sonElementIndexi = arr[i].length - 1;
                arr2[i] = arr[i][sonElementIndexi];

            }
        }

        System.out.println(Arrays.toString(arr2));


    }


}
