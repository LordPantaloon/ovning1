import java.util.Scanner;

public class ovning4 {
    public static void main(String[] args) {

        //4. Skapa ett program som läser in tre tal och beräknar och skriver ut summan samt medelvärdet
        //av de tre talen.

        Scanner scan = new Scanner(System.in);

        System.out.println("Var god skriv in tre olika tal för att räkna ut medelvärdet.");
        System.out.println("Börja med första talet: ");

        int t1 = scan.nextInt();

        System.out.println("Var god ange tal två:");

        int t2 = scan.nextInt();

        System.out.println("Var god ange det tredje talet: ");

        int t3 = scan.nextInt();

        int total = t1 + t2 + t3;

        total = total / 3;

        System.out.println("Medelvärdet på följande tre tal är: " + total );




    }
}
