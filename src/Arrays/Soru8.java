package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru8 {

    /* Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
       donduren bir method olusturun.*/

    public static void main(String[] args) {

        arrayOlustur();
    }

    public static String []  arrayOlustur() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen eklemek istediğiniz kelime sayısını giriniz: ");
        int kelimeSayisi = scan.nextInt();

        String [] arr = new String[kelimeSayisi];

        for (int i = 0; i < kelimeSayisi; i++) {

            System.out.println("Lütfen eklemek istediğiniz kelimeyi girin");
            String kelime = scan.next();

            arr[i] = kelime;

        }

        System.out.println(Arrays.toString(arr));


        return arr;
    }
}
