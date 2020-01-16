package H07;
import java.util.*;
public class Opdracht2 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static int[] getallen = new int[9];
    public static void main(String[] args) {
        for (int i = 0; i < getallen.length; i++) {
            System.out.println("Voer getal " + i + " in");
            getallen[i] = invoer.nextInt();
        }
        Arrays.sort(getallen);
        System.out.println("Nu omgekeerd");
        System.out.println(Arrays.toString(getallen));
    }
}
