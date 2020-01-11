package H04;
import java.util.Locale;
import java.util.Scanner;
public class Opdracht6 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Typ een String: ");
        String userinput = invoer.nextLine();
        char[] ch = new char[userinput.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = userinput.charAt(i);
        }
        System.out.println("De lengte van de String is " + ch.length);
        System.out.println("De eerste letter is: " + ch[0]);
        System.out.println("De laatste letter is: " + ch[ch.length-1]);
    }
}