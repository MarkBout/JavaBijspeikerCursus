package H03;
import java.util.Random;

public class Opdracht3 {

    public static void main(String[] args) {
        Random rand = new Random();

        int nummer = rand.nextInt(13);

        switch (nummer){
            case 1:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is januari");
                break;
            case 2:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is februari");
                break;
            case 3:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is maart");
                break;
            case 4:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is april");
                break;
            case 5:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is mei");
                break;
            case 6:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is juni");
                break;
            case 7:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is juli");
                break;
            case 8:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is augustus");
                break;
            case 9:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is september");
                break;
            case 10:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is oktober");
                break;
            case 11:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is november");
                break;
            case 12:
                System.out.println("Het nummer is " + nummer + " en de maand die daar bij hoort is december");
                break;
        }
    }
}
