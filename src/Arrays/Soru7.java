package Arrays;


import java.util.Arrays;

public class Soru7 {

    // Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        arrayeElemanEkleme(arr,6);

    }

    private static int [] arrayeElemanEkleme(int[] arr, int eklenecekEleman) {

       int [] yeniArr = new int [arr.length+1];

        for (int i = 0; i <arr.length ; i++) {

            yeniArr[i] = arr[i];
            
        }

        yeniArr[yeniArr.length-1] = eklenecekEleman;

        System.out.println(Arrays.toString(yeniArr));

        return yeniArr;
    }
}
