package Arrays;

public class Soru6 {

    /* Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       kullanildigini yazdiran bir method olusturun.*/

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 2, 4, 5, 6, 7, 8, 6, 5, 3, 3, 2, 4, 5, 7, 9, 5, 4};
        int eleman = 0;

        elemanVarMi(arr, eleman);

    }

    private static void elemanVarMi(int[] arr, int eleman) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == eleman) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("İstenen eleman arrayde bulunmuyor");
        }
        else {
            System.out.println("İstenen elaman arrayde " + sayac + " adet var");
        }

    }
}
