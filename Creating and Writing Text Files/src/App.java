import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class App {

    public static void main(String[] args) {

        File file = new File("text.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){

            br.write("This is line one");
            br.newLine();
            br.write("This is line two");
            br.newLine();
            br.write("Last line.");

        } catch (IOException e) {
            System.out.println("Unable to read file " +file.toString());
        }
    }
}
