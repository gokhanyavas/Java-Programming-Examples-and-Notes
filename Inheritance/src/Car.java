/**
 * Created by gokhanyavas on 17.03.2017.
 */
public class Car extends Machine {

    @Override
    public void start() {
        //super.start();
        System.out.println("Car started.");
    }

    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }
}
