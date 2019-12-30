package H02;
import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        int jaarsec = 31556926;
        int maandsec = 525948;
        Scanner invoer = new Scanner(System.in);

        System.out.print("Hoeveel jaar oud ben je? ");
        int jaren = invoer.nextInt();
        System.out.print("Hoeveel maanden komen daar nog bij? ");
        int maanden = invoer.nextInt();

        int uitkomst = (jaren * jaarsec) + (maanden * maandsec);

        System.out.print("Je bent ongeveer: " + uitkomst + " minuten oud");

    }
}
