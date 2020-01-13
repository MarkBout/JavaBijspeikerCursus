package H06;
import java.util.*;
public class Opdracht5 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.println("Van welk nummer wilt u de weekdag weten");
        System.out.println(bepaalDag(invoer.nextInt()));
    }

    public static String bepaalDag(int getal){
        String weekdag = "unknown";

        switch (getal){
            case 1:
                weekdag = "Bij nummer " + getal + " hoort maandag";
                break;
            case 2:
                weekdag = "Bij nummer " + getal + " hoort dinsdag";
                break;
            case 3:
                weekdag = "Bij nummer " + getal + " hoort woensdag";
                break;
            case 4:
                weekdag = "Bij nummer " + getal + " hoort donderdag";
                break;
            case 5:
                weekdag = "Bij nummer " + getal + " hoort vrijdag";
                break;
            case 6:
                weekdag = "Bij nummer " + getal + " hoort zaterdag";
                break;
            case 7:
                weekdag = "Bij nummer " + getal + " hoort zondag";
                break;
        }
        return weekdag;
    }
}
