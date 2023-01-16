package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru4 {

    // Kullanıcıdan bir string array ve bir harf alın, girilen harfi içeren kelimeyi arrayden silip, yerine null yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç kelime girmek istiyorsunuz?");
        int kelimeSayisi = scan.nextInt();

        String[] arr = new String[kelimeSayisi];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Lütfen array elemanlarını giriniz: ");
            String kelime = scan.next();

             arr[i] = kelime;

        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Lütfen çıkarmak istediğiniz harfi giriniz: ");
        String harf = scan.next();

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].contains(harf)) {
                arr[i] = null;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}


