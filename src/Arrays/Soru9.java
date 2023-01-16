package Arrays;

public class Soru9 {

    /* Arraydeki en uzun ve en kısa kelimeyi bulan ve yazdıran bir method oluşturun. */

    public static void main(String[] args) {

        String [] arr = {"elma", "armut", "muz", "karpuz", "portakal"};

        enUzunEnKisaKelime(arr);
    }

    private static void enUzunEnKisaKelime(String[] arr) {

       String enKisa = arr[0];
       String enUzun = "";

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].length()<enKisa.length()){
                enKisa = arr[i];
            }
            if (arr[i].length()>enUzun.length()){
                enUzun = arr[i];
            }

        }

        System.out.println("En uzun kelime: " + enUzun + ". En kısa kelime: " + enKisa);

    }
}
