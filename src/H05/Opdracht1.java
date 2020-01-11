package H05;

import java.util.Locale;
import java.util.Scanner;

public class Opdracht1 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static double userinput = 0;

    public static void main(String[] args) {
        while (userinput != -1) {
            System.out.println("Wat is je toetscijfer? ");
            userinput = invoer.nextDouble();
            if (userinput < 5.5 && userinput >= 1) {
                System.out.println("Je cijfer " + userinput + " is een onvoldoende");
            } else if (userinput > 5.5) {
                System.out.println("Je cijfer " + userinput + " is een voldoende");
            }
        }
        System.out.println("tot ziens!");
        System.exit(0);
    }
}