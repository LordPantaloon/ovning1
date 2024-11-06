import java.util.Scanner;

public class ovning2 {
    public static void main(String[] args) {
        //2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        //försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
        //Försäljningssumman ska läsas in.
        Scanner scan= new Scanner(System.in);
        double lon = 8000;

        System.out.println("Var god skriv in din försäljningssumma under denna månaden:");

        int salenum = scan.nextInt();

        double saleprocent = salenum*0.09;

        double total = lon + saleprocent;

        System.out.println("Din slutliga utbetalning blir: " + total);
    }
}
