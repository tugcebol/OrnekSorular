package Arrays;

import java.util.Arrays;

public class Soru10 {

        // Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.

        public static void main(String[] args) {

            String [] isimler = {"Ali", "Veli", "Can"};
            String eklenecekIsim = "Kemal";

            isimler = arrayeELementEkleme(isimler,eklenecekIsim);

            System.out.println(Arrays.toString(isimler)); // [Ali, Veli, Can, Kemal]
        }

        public static String[] arrayeELementEkleme (String [] eklenecekArray, String eklenecekElement){

            String [] temp = new String[eklenecekArray.length+1];

            for (int i = 0; i <eklenecekArray.length ; i++) {
                temp [i] = eklenecekArray[i];
            }
            temp [temp.length-1] = eklenecekElement;

            return temp;

        }
    }

