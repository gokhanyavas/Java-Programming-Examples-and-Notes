import java.io.*;

/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class App {

    public static void main(String[] args) {

        File file = new File("text.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

            String line;
            try {
               while ( (line = br.readLine()) != null){
                   System.out.println(line);
               }

            } catch (IOException e) {
                System.out.println("Unable to read file: " + file.toString());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }
        finally {
            try {
                br.close();
            } catch (NullPointerException ex){
                //File was probably never opened!

            } catch (Exception e) {
                System.out.println("Unable to close file: " + file.toString());
            }
        }




    }
}
