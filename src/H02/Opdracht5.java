package H02;
import java.util.Scanner;

public class Opdracht5 {

    private static Scanner invoer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Typ een getal tussen 0 en 1000: ");
        int userinput = invoer.nextInt();

        if (userinput >= 100 && userinput < 1000){
            int lastdiget = userinput % 10;
            userinput = userinput / 10;

            int midgetal = userinput % 10;
            userinput = userinput /10;

            int firstdigit = userinput;

            int uitkomst = firstdigit * midgetal * lastdiget;

            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstdigit + " x " + midgetal + " x " + lastdiget + " = " + uitkomst);
        }else if (userinput >= 10 && userinput < 100){
            int lastdiget = userinput % 10;
            userinput = userinput / 10;

            int firstdigit = userinput;

            int uitkomst = firstdigit * lastdiget;

            System.out.println("De vermenigvuldiging van de cijfers luidt: " + firstdigit + " x " + lastdiget + " = " + uitkomst);

        }else if (userinput >= 0 && userinput < 10){
            System.out.println("De vermenigvuldiging van de cijfers luidt: " + userinput + " = " + userinput);
        }else {
            System.out.println("Sorry dit getal ligt niet tussen de 0 of 1000");
        }
    }
}