/**
 * Created by gokhanyavas on 22.03.2017.
 */
class Temp implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class App {

    public static void main(String[] args) {

        /*
        Temp temp = new Temp();
        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        try(Temp temp = new Temp()){

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
