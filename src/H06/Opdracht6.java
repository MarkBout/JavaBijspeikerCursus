package H06;
import java.util.*;
public class Opdracht6 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        System.out.println("Van welk getal wil je weten of het een even getal is?");
        isEvenGetal(invoer.nextInt());

    }

    public static boolean isEvenGetal(int getal){
        boolean isEvenGetal;
        if (getal % 2 == 0){
            isEvenGetal = true;
        }else{
            isEvenGetal = false;
        }
        if (isEvenGetal){
            System.out.println(getal + " is een even getal");
        }else {
            System.out.println(getal + " is een oneven getal");
        }
        return isEvenGetal;
    }
}
