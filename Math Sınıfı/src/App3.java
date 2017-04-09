/**
 * Created by gokhanyavas on 9.04.2017.
 */
public class App3 {
    public static void main(String[] args) {
        // 0 ile 50 arasinda rastgele uretilen 2 sayisidan buyugunu once ekrana yazdiran bir uyg.

        int x,y;

        x = (0 + (int)(Math.random() * 50));
        System.out.println("x = " + x);

        y = (0 + (int)(Math.random() * 50));
        System.out.println("y = " + y);

        System.out.println(Math.max(x,y) + " " + Math.min(x,y));


    }
}
