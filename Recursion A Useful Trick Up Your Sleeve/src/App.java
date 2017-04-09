/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class App {

    public static void main(String[] args) {

        // E.g 4! = 4 3 2 1 (faktoriyel)
        System.out.println(factoial(4));
    }

    private static int factoial(int value){

        //System.out.println(value);

        if (value == 1){
            return 1;
        }
        return factoial(value - 1) * value;
    }
}
