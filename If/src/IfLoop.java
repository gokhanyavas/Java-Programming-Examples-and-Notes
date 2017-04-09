/**
 * Created by gokhanyavas on 16.03.2017.
 */
public class IfLoop {
    public static void main(String[] args) {
        int loop = 0;
        while (true){
            System.out.println("Looping :" + loop);

            if (loop == 5){
                break;// koşul sağlandığında döngüden çık anlamındadır.
            }
            loop++;
            System.out.println("Running");
        }
    }
}
