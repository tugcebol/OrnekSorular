package MethodOlusturma;

import java.util.Scanner;

public class Soru3 {

    /*
     Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı değeri girin: ");
        int girilenSayi = scan.nextInt();

        sayiAsalMi(girilenSayi);
    }

    private static boolean sayiAsalMi(int girilenSayi) {

        boolean sonuc = true;

        // asal sayi kendisine ve 1 e bölünen sayı

        for (int i = 2; i <girilenSayi ; i++) {

            if (girilenSayi % i == 0){
                sonuc = false;
                break;
            }
        }

        System.out.println(sonuc ? girilenSayi + " sayısı asal sayıdır." : girilenSayi + " sayısı asal sayı değildir.");

        return sonuc;
    }
}
