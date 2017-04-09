import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects....");

        Person mike = new Person(1,"Mike");
        Person sue = new Person(2,"Sue");

        System.out.println(mike);
        System.out.println(sue);

        try(FileOutputStream fs = new FileOutputStream("people.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
