package H03;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class opdracht6 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static double getal1, getal2, getal3;


    public static void main(String[] args) {
        System.out.println("Voer het eerste getal in");
        getal1 = invoer.nextDouble();
        System.out.println("Voer het 2de getal is");
        getal2 = invoer.nextDouble();
        System.out.println("Voer het derde getal in");
        getal3 = invoer.nextDouble();
        double[] numsort = {getal1, getal2, getal3};
        Arrays.sort(numsort);
        System.out.println("Van klein naar groot: " + numsort[0] + " - " + numsort[1] + " - " + numsort[2]);
    }
}
