package H08;
import java.util.*;
public class Television {
    public Scanner invoer = new Scanner(System.in).useLocale(Locale.US);
    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;


    public void turnOn(){
        on = true;
            System.out.println("De TV is nu aan");
    }
    public void turnOff(){
        on = false;
            System.out.println("De TV staat nu uit");
    }
    public void setChannel(int newChannel){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            newChannel = invoer.nextInt();
            channel = newChannel;
            System.out.println("De TV staat nu op " + channel);
        }
    }

    public void setVolume(int newVolumeLevel){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            newVolumeLevel = invoer.nextInt();
            if (newVolumeLevel > 100) {
                System.out.println("Het volume kan maar tot 100");
            } else {
                volumeLevel = newVolumeLevel;
                System.out.println("Het volume is nu " + volumeLevel);
            }
        }
    }

    public void channelUp(){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            channel++;
            System.out.println("De TV staat nu op " + channel);
        }
    }

    public void channelDown(){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            channel--;
            System.out.println("De TV staat nu op " + channel);
        }
    }

    public void volumeUp(){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            volumeLevel++;
            System.out.println("Het volume is nu: " + volumeLevel);
        }
    }

    public void volumeDown(){
        if (!on){
            System.out.println("De TV staat uit");
        }else {
            volumeLevel--;
            System.out.println("Het volume is nu: " + volumeLevel);
        }
    }
}