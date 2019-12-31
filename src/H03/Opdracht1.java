package H03;
import java.util.Scanner;
import java.util.Random;

public class Opdracht1 {
    private static Random rand = new Random();
    private static Scanner invoer = new Scanner(System.in);

    public static void main(String[] args) {

        //nummers en antwoord klaarzetten
        int nummer1 = rand.nextInt(100);
        int nummer2 = rand.nextInt(100);
        int antword = nummer1 + nummer2;

        System.out.print("Hoeveel is " + nummer1 + " + " + nummer2 + "? ");
        int userinput = invoer.nextInt();

        //kijken of het klopt
        if (userinput == antword){
            System.out.println("Dat is correct!");
        }else {
            System.out.println("Dat is onjuist het antwoord was " + antword);
        }
    }
}
