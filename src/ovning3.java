import java.util.Scanner;

public class ovning3 {
    public static void main(String[] args) {

        //3. Skapa ett program som läser in antal timmar, beräknar och skriver ut hur mycket det
        //blir omvandlat till minuter resp sekunder.

        Scanner scan = new Scanner(System.in);

        System.out.println("Var god skriv in ett antal timmar:");

        int timmar = scan.nextInt();

        int minut = timmar * 60;

        int sekund = timmar * 3600;

        System.out.println("Det går " + minut + " minuter eller " + sekund +  " sekunder på " + timmar +  " timmar.");

    }
}
