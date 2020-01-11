package H04;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht7 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Kies land 1: ");
        String land1 = invoer.nextLine();
        System.out.print("Kies land 2: ");
        String land2 = invoer.nextLine();
        System.out.print("Kies land 3: ");
        String land3 = invoer.nextLine();
        String[] landen = {land1, land2, land3};
        Arrays.sort(landen);
        System.out.println(landen[0] + " - " + landen[1] + " - " + landen[2]);
    }
}
