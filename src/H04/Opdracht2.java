package H04;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht2 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Van welk karakter wil je weten of het een getal of letter is? ");
        char userinput = invoer.nextLine().charAt(0);
        if (Character.isLetter(userinput)){
            System.out.println("Het karakter " + userinput + " is een letter");
        }else if (Character.isDigit(userinput)){
            System.out.println("Het karakter " + userinput + " is een getal");
        }else {
            System.out.println(userinput + " is geen letter of getal");
        }

    }
}
