package MethodOlusturma;

import java.util.Scanner;

public class Soru4 {

    /*
      Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
     bolenleri sayisini bulup bize donduren bir method olusturun.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı değeri giriniz: ");
        int sayi = scan.nextInt();

        tamSayiBolenleriniBul(sayi);
    }

    private static int tamSayiBolenleriniBul(int sayi) {

        int tamsayiBolenleri = 0;

        for (int i = 1; i <=sayi ; i++) {

           if (sayi % i == 0){

               tamsayiBolenleri +=1;
           }
        }

        System.out.println("Girilen " + sayi + " sayısının " + tamsayiBolenleri +  " tamsayı böleni vardır.");

        return tamsayiBolenleri;
    }
}
