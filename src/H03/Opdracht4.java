package H03;
import java.util.Scanner;

public class Opdracht4 {
    private static Scanner invoer = new Scanner(System.in);
    private static int weekdag;
    private static int userinput;
    private static int nieuweWeekdag;

    private static String weekdagStr;

    public static void main(String[] args) {
        System.out.println("welke weekdag is het nu?");
        weekdag = invoer.nextInt();
        checkWeekdag();

        System.out.println("Het is nu " + weekdagStr);

        System.out.println("En van hoeveel dagen in de toekomst wil je de weekdag berekenen?");
        userinput = invoer.nextInt();
        nieuweWeekdag = userinput + weekdag;
        checkNieuweWeekdag();

        System.out.println("Over " + userinput + " dagen " + weekdagStr);
    }

    private static void checkWeekdag() {
        if(weekdag == 1) {
            weekdagStr = "maandag";
        }
        if(weekdag == 2) {
            weekdagStr = "dinsdag";
        }
        if(weekdag == 3) {
            weekdagStr = "woensdag";
        }
        if(weekdag == 4) {
            weekdagStr = "donderdag";
        }
        if(weekdag == 5) {
            weekdagStr = "vrijdag";
        }
        if(weekdag == 6) {
            weekdagStr = "zaterdag";
        }
        if(weekdag == 7) {
            weekdagStr = "zondag";
        }
    }

    private static void checkNieuweWeekdag() {
        if(nieuweWeekdag % 7 == 1) {
            weekdagStr = "maandag";
        }
        if(nieuweWeekdag % 7 == 2) {
            weekdagStr = "dinsdag";
        }
        if(nieuweWeekdag % 7 == 3) {
            weekdagStr = "woensdag";
        }
        if(nieuweWeekdag % 7 == 4) {
            weekdagStr = "donderdag";
        }
        if(nieuweWeekdag % 7 == 5) {
            weekdagStr = "vrijdag";
        }
        if(nieuweWeekdag % 7 == 6) {
            weekdagStr = "zaterdag";
        }
        if(nieuweWeekdag % 7 == 0) {
            weekdagStr = "zondag";
        }
    }
}