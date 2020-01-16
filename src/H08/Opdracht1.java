package H08;

public class Opdracht1 {
    public static Television myFirstTelevision = new Television();
    public static void main(String[] args) {
        int userChoice = 0;
        while (userChoice != 9){
            System.out.println("1 ON");
            System.out.println("2 OFF");
            System.out.println("3 CHANNEL UP");
            System.out.println("4 CHANNEL DOWN");
            System.out.println("5 VOLUME UP");
            System.out.println("6 VOLUME DOWN");
            System.out.println("7 SET CHANNEL");
            System.out.println("8 SET VOLUME LEVEL");
            System.out.println("9 EXIT");
            userChoice = myFirstTelevision.invoer.nextInt();

            switch (userChoice){
                case 1:
                    myFirstTelevision.turnOn();
                    break;
                case 2:
                    myFirstTelevision.turnOff();
                    break;
                case 3:
                    myFirstTelevision.channelUp();
                    break;
                case 4:
                    myFirstTelevision.channelDown();
                    break;
                case 5:
                    myFirstTelevision.volumeUp();
                    break;
                case 6:
                    myFirstTelevision.volumeDown();
                    break;
                case 7:
                    myFirstTelevision.setChannel(userChoice);
                    break;
                case 8:
                    myFirstTelevision.setVolume(userChoice);
                    break;
                case 9:
                    System.out.println("Tot ziens!");
                    System.exit(0);
            }
        }
    }
}