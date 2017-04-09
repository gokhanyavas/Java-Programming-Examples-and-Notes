package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by gokhanyavas on 21.03.2017.
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("text.txt");

        FileReader fr = new FileReader(file);

    }
}
