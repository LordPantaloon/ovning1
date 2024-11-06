import java.util.Scanner;

public class ovning5 {
    public static void main(String[] args) {

        //5. Läs in ett heltal motsvarande svenska kronor och skriv ut motsvarande värde i pund
        //respektive dollar. Antag att kursen är : 1 dollar = 6 kr, 1 pund = 10 kr.
          Scanner scan = new Scanner(System.in);

        System.out.println("Var god skriv in ett antal SEK för att få valutan i GBP samt USD: ");

        double kursusd = 10.0;
        double kursgbp = 6.0;

        int sek = scan.nextInt();
        double usd = sek / kursusd;
        double gbp = sek / kursgbp;

        /*

        double usd = sek / 6;
        double gbp = sek / 10;

         */

        //System.out.println(sek + " svenska kronor är " + usd + " USD och " + gbp + " pund.");
        System.out.printf("%d kronor motsvarar %.2f dollar och %.2f pund.\n", sek, usd, gbp);
        scan.close();
    }
}
