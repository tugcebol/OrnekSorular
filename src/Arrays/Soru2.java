package Arrays;

public class Soru2 {

    // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,-7};

        sayilariTopla(arr);
    }

    private static int sayilariTopla(int[] arr) {

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }

        System.out.println(toplam);
        return toplam;
    }
}
