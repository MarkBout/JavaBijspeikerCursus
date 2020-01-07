package H04;
import java.util.Scanner;

public class Opdracht1 {
    private static Scanner invoer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Van welk karakter wil je de ASCII waarde weten? ");
        char userinput = invoer.nextLine().charAt(0);
        int ASCII = (int) userinput;
        System.out.println("De ASCII waarde van het karakter " + userinput + " is " + ASCII);
    }
}
