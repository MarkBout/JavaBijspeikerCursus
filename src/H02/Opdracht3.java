package H02;
import java.util.Scanner;

public class Opdracht3 {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);


        System.out.print("Typ het Startbedrag ");
        double startbedrag = invoer.nextDouble();

        System.out.print("Typ het rentepercentage ");
        double rentepercentage = invoer.nextDouble();

        double rente = (rentepercentage / 100 * startbedrag);
        System.out.println("De rente is " + rente + " en het totaalbedrag is " + (startbedrag + rente));
    }
}
