package H02;
import java.util.Scanner;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);

        System.out.print("Voer een getal heel in: ");
        int userinput = invoer.nextInt();
        System.out.println("De vijf getallen zijn: " + (userinput - 2) + " " + (userinput - 1) + " " + userinput + " " + (userinput + 1) + " " + (userinput + 2));
    }
}
