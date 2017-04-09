import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class ReadObjects {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Reading objects....");

        try(FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person[] people = (Person[])os.readObject();

            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

            for (Person person: people){
                System.out.println(person);
            }

            for (Person person: peopleList){
                System.out.println(person);
            }

            int num = os.readInt();

            for (int i = 0; i < num; i++){
                Person person = (Person)os.readObject();
                System.out.println(person);
            }

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
