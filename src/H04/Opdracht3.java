package H04;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
public class Opdracht3 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.print("Van welk karakter wil je weten of het een klinker of medeklinker is? ");
        char userinput = invoer.nextLine().toLowerCase().charAt(0);
        if (!Character.isLetter(userinput)){
            System.out.println("Het ingevoerde character was geen letter alleen letters invoeren");
            System.exit(0);
        }
        ArrayList<Character> arr = new ArrayList<Character>(5);
        arr.add('a');
        arr.add('e');
        arr.add('i');
        arr.add('o');
        arr.add('u');
        boolean controleren = arr.contains(userinput);

        if (controleren){
            System.out.println("De " + userinput + " is een klinker");
        }else {
            System.out.println("De " + userinput + " is een medeklinker");
        }
    }
}