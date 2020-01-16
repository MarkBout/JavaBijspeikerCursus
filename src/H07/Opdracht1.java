package H07;
import java.util.*;

public class Opdracht1 {
    public static int[] getallen = new int[100];
    public static void main(String[] args) {
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 6 + 1);
        }
        for (int getal:getallen){
            System.out.println(getal + " ");
        }
            
        }
}
