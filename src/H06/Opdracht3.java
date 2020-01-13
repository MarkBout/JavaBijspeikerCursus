package H06;
import java.util.*;
public class Opdracht3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(11);
        int num2 = rand.nextInt(11);
        System.out.println("Het product van " + num1 + " X " + num2 + " = " + multyply(num1,num2));
    }

    public static int multyply(int getal1, int getal2){
        return getal1 * getal2;
    }
}