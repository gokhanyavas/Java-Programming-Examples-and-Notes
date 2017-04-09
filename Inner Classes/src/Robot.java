/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class Robot {

    private int id;

    private class Brain{
        public void think(){
            System.out.println("Robot " + id + " is thinking..");
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("Battery charging...");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start(){
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        final String name = "Gokhan";

        class Temp{
            public void doSomething(){
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
