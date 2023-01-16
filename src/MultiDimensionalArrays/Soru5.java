package MultiDimensionalArrays;

import java.util.Arrays;

public class Soru5 {

    /* Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
       olusturacagimiz tek katli bir array’e bu toplamlari atayin.
          input : int[][] arr = {{3,4,5}, {2,3,6,7}};
          output: [5, 7, 11] */

    public static void main(String[] args) {

        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int enKisaArray = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].length<enKisaArray){

                enKisaArray = arr[i].length;
            }
        }

        int [] yeniArr = new int[enKisaArray];

        int toplam = 0;

        for (int i = 0; i <yeniArr.length ; i++) {

            for (int j = 0; j < arr.length ; j++) {

                toplam += arr[j][i];
            }

            yeniArr[i] = toplam;
            toplam = 0;
        }

        System.out.println(Arrays.toString(yeniArr));


    }
}
