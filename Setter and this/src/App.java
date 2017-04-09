/**
 * Created by gokhanyavas on 16.03.2017.
 */
public class App {
    public static void main(String[] args) {

        Frog frog1 = new Frog();
        //frog1.name = "Bertie";
        //frog1.age = 1;

        frog1.setName("Bertie");
        frog1.setAge(1);
        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());

    }
}
