package övningar;

import java.net.Inet4Address;

public class övning76 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 400, 123, 5432, -76, 888, 91, 10000};

        //Skapa en array med 10 positioner.

        int[] reverse = new int[10];

        for(int i=0;i<reverse.length;i++){
            reverse[i] = numbers[2];
        }

        reverse[0] = numbers[2];
        reverse[1] = numbers[1];
        reverse[2] = numbers[0];

        System.out.println(reverse[0]);
        System.out.println(reverse[1]);
        System.out.println(reverse[2]);
    }
}
