package H02;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht1 {
    private static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    private static double mijl;
    private static double km;

    public static void main(String[] args) {
        System.out.print("Voer het aantal mijlen in: ");
        mijl = invoer.nextDouble();
        km = mijl * 1.6;

        System.out.println(mijl + " mijlen is " + km + " kilometer");
    }
}
