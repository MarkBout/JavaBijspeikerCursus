package H06;
import java.util.*;
public class Opdracht2 {

    public static void main(String[] args) {
        System.out.print("Welke zin moet ik printen? ");
        printZin();
    }

    public static void printZin(){
        Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
        String naam = invoer.nextLine();
        System.out.println("Hallo " + naam);
    }
}
