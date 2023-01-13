package MethodOlusturma;

import java.util.Scanner;

public class Soru2 {
    /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        isim bosluk soyisim seklinde bize donduren bir method olusturun
                input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        isimDondurme(isim,soyisim);

    }

    public static String isimDondurme(String isim, String soyisim){

        String isimSoyisim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
                            + " " +
                            soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase();


        System.out.println("Girilen isim ve soyisminiz: " + isimSoyisim);


        return isimSoyisim;
    }


}
