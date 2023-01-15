package Arrays;

public class Soru5 {

    /* Bir markettin fiyatlarını tutan bir array var.
       Bu marketteki en yüksek ve en düşük fiyatları yazdıran
       bir method oluşturun.*/

    public static void main(String[] args) {

        double[] fiyatListesi = {12.5, 34.2, 3.5, 50, 29.99, 25};

        enYuksekEnDusukFiyat(fiyatListesi);

    }

    private static void enYuksekEnDusukFiyat(double[] fiyatListesi) {

        double enDusuk = fiyatListesi[0];
        double enYuksek = fiyatListesi[0];

        for (int i = 0; i <fiyatListesi.length; i++) {

            if (fiyatListesi[i] < enDusuk) {
                enDusuk = fiyatListesi[i];
            }

            if (fiyatListesi[i] > enYuksek){
                enYuksek = fiyatListesi[i];
            }

        }

        System.out.println("En yüksek fiyatlı ürün " + enYuksek + " En düşük fiyatlı ürün " + enDusuk );
    }

}
