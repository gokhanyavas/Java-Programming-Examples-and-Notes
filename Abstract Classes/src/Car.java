/**
 * Created by gokhanyavas on 22.03.2017.
 */

public class Car extends Machine {

    @Override
    public void start() {

        System.out.println("Starting Car...");

    }

    @Override
    public void doStaff() {

        System.out.println("Do stuff in car.");

    }

    @Override
    public void shutdown() {

        System.out.println("Shutdown car.");

    }
}
