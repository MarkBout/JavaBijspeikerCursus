package H05;
import java.util.*;
public class Opdracht4 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static int nummers[];
    public static void main(String[] args) {
        nummers = new int[5];
        //gebruiker nummers laten invoeren en in array zetten
        for (int i = 0; i < nummers.length; i++) {
            System.out.print("Voer een nummer in ");
            nummers[i] = invoer.nextInt();
        }
        //sorteren en de laagste pakken
        Arrays.sort(nummers);
        System.out.print("Het laagste getal is: " + nummers[0]);
    }
}