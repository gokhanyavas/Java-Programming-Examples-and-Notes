/**
 * Created by gokhanyavas on 17.04.2017.
 */

class Thing {
    public final static int LUCKY_NUMBER = 7;

    public String name;  // Nesne degiskeni
    public static String description; // Sinif degiskeni

    public static int count = 0; // Sinif degiskeni

    public int id;  // Nesne degiskeni

    public Thing() {

        id = count;
        // Her nesne yaratildiginda sinif degiskenini artiriyoruz.
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}


public class App {

    public static void main(String[] args) {

        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Gökhan";
        thing2.name = "Gürkan";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);

        System.out.println(Thing.LUCKY_NUMBER);
    }
}
