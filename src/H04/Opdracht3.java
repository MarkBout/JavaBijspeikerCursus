package H04;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht3 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Van welk karakter wil je weten of het een klinker of medeklinker is? ");
        char userinput = invoer.nextLine().charAt(0);
        if (Character.isLetter(userinput)){
            
        }
    }
}
