import java.io.IOException;
import java.text.ParseException;

/**
 * Created by gokhanyavas on 21.03.2017.
 */
public class App {
    public static void main(String[] args) {

        Test test = new Test();

        /*
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command ile.");
        }
        */

        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
