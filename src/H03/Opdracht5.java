package H03;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Opdracht5 {

    private static DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static Scanner invoer = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        System.out.println("Wat is uw gewicht? (kg)");
        double userGewicht = invoer.nextDouble();
        System.out.println("Wat is uw lengte? (m)");
        double userlengte = invoer.nextDouble();

        double uitkomst = userGewicht / (userlengte * userlengte);
        dfs.setDecimalSeparator('.');
        df2.setDecimalFormatSymbols(dfs);
        uitkomst = Double.parseDouble(df2.format(uitkomst));

        if (uitkomst <= 18.5){
            System.out.println("Uw BMI is: " + uitkomst);
            System.out.println("Als u minstens 20 jaar bent heeft u ondergewicht");
        }else if (uitkomst > 18.5 && uitkomst <= 25){
            System.out.println("Uw BMI is: " + uitkomst);
            System.out.println("Als u minstens 20 jaar bent is uw gewicht normaal");
        }else if (uitkomst > 25 && uitkomst <= 30){
            System.out.println("Uw BMI is: " + uitkomst);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u overgewicht hebt.");
        }else if (uitkomst > 30){
            System.out.println("Uw BMI is: " + uitkomst);
            System.out.println("Als u minstens 20 jaar bent betekent dit dat u zwaar overgewicht hebt.");
        }
    }
}