package H04;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int randomnumber = (int) (Math.random() * 26 + 97);
            char ASCII = (char) randomnumber;
            System.out.println("Uw willekeurige letter is de " + ASCII);
        }
    }
}
