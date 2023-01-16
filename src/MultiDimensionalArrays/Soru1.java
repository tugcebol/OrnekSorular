package MultiDimensionalArrays;

public class Soru1 {

    /*  Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        method olusturun. */

    public static void main(String[] args) {

        int [][] arr = {{1,2,3},{4},{5,2},{1,5,7},{6}};
        
        ciftSayilariTopla(arr);

    }

    public static void ciftSayilariTopla(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                if(arr[i][j]%2==0){

                    toplam += arr[i][j] ;
                }
            }
        }

        System.out.println("Arraydeki çift sayıların toplamı: " + toplam);
    }
}
