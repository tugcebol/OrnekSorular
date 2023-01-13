package MethodOlusturma;

import java.util.Scanner;

public class Soru1 {

    /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
            - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
                mesaji verin
            - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
                yazdirin.
     */

    public static void main(String[] args) {

        String input = "Java ogrenmek cok kolay.";
        int baslangic = 6;
        int bitis = 20;

        harfleriYazdir(input,baslangic,bitis);

    }


    public static void harfleriYazdir(String input, int baslangic, int bitis) {


        if (baslangic > bitis) {
            System.out.println("Hata! Başlangıç sayısı, bitiş sayısından büyük olamaz.");
        }

        else if ((baslangic >= input.length()) && (bitis>=input.length())) {
            System.out.println("Hata! Cümle indexlerinin sınırları dışına çıktınız.");

        }

        else {

            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(input.charAt(i));
            }
        }


    }
}