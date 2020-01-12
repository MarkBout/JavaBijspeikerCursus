package H05;

public class Opdracht7 {
    public static void main(String[] args) {
        boolean doorgaan = true;
        int counter = 0;
        while (doorgaan){
            int square = counter * counter;
            if (square < 1000){
                System.out.println("Het getal is: " + counter);
                System.out.println("Het kwadraat is: " + square);
                counter++;
            }else {
                doorgaan = false;
            }
        }
    }
}
