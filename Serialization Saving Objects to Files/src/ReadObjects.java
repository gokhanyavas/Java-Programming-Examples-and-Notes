import java.io.*;

/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class ReadObjects {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Reading objects....");

        try(FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();

            os.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
