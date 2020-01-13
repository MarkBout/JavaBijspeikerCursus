package H06;
import java.util.*;

public class Opdracht4 {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Voer het eerste getal in om te vermenigvuldigen");
        int num1 = invoer.nextInt();
        System.out.println("Voer het tweede getal in om te vermenigvuldigen");
        int num2 = invoer.nextInt();
        System.out.println("Het product van " + num1 + " x " + num2 + " = " + multyply(num1,num2));
    }

    public static int multyply(int getal1, int getal2){
        return getal1 * getal2;
    }
}
