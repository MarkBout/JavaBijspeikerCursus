package H05;
import java.util.*;
public class Opdracht5 {
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        double cijfer = 0;
        String student = "";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hoe heet student " + i);
            String name = invoer.nextLine();
            System.out.println("Wat is het cijfer");
            double grade = invoer.nextDouble();
            invoer.nextLine();
            if (i == 1){
                cijfer = grade;
                student = name;
            }else {
                if (grade > cijfer){
                    cijfer = grade;
                    student = name;
                }
            }
        }
        System.out.println("Het hoogste cijfer is: " + cijfer + " en is gehaald door: " + student);
    }
}
