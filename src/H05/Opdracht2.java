package H05;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Opdracht2 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static Random rand = new Random();
    public static int counter = 0, score = 0;

    public static void main(String[] args) {

        while (counter < 10) {
            //Array vor de random nummers maken en deze vullen
            int[] numArray = new int[2];
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = rand.nextInt(11);
            }
            //optelsom maken en aan de user vragen
            int antwoord = numArray[0] + numArray[1];
            System.out.println("Hoevel is " + numArray[0] + " + " + numArray[1]);
            int userinput = invoer.nextInt();
            //kijken of het antwoord klopt en score toepassem
            if (userinput == antwoord) {
                System.out.println("Dat klopt! We doen er nog eentje");
                score++;
            }
            else {
                System.out.println("Dat was onjuist het antwoord was " + antwoord + ". We doen er nog eentje");
                score--;
            }
            counter++;
        }
        //cijfer controleren
        if (score > 5){
            System.out.println("De score is: " + score + " dat is een voldoende");
        }else {
            System.out.println("De score is: " + score + " dat is een onvoldoende");
        }
    }
}
