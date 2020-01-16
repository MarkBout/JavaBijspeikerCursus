package H07;
import java.util.*;

public class Opdracht3 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static double[] numList = new double[10];
    private static double gem;
    public static void main(String[] args) {
        for (int i = 0; i < numList.length; i++) {
            System.out.println("Voer cijfer " + i + " in");
            numList[i] = invoer.nextDouble();
        }

        for (double i : numList) {
            gem += i;
        }
        gem /= numList.length;

        System.out.println("Het gemidelde is " + gem);
    }
}
