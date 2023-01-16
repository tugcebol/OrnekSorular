package MultiDimensionalArrays;

public class Soru2 {

    /* Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir
       method olusturun. */

    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4},{5,2},{1,5,7},{6}};

        carpiminiBul(arr);


    }

    public static void carpiminiBul(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

               carpim *= arr[i][j];

            }
        }

        System.out.println("Arraydeki tüm sayıların çarpımı: " + carpim);
    }

}
