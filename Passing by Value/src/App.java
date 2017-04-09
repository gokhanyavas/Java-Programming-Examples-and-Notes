/**
 * Created by gokhanyavas on 23.03.2017.
 */
public class App {

    public static void main(String[] args) {

        App app = new App();

        //===========================================

        int value = 7;

        System.out.println("1. Value is:" + value);

        app.show(value);

        System.out.println("4. Value is:" + value);

        //===========================================
        System.out.println();

        Person person = new Person("Bob");
        System.out.println("1. Person is: "+person);

        app.show(person);

        System.out.println("4. Person is: "+person);

    }

    public void show(int value){

        System.out.println("2. Value is:" + value);

        value = 8;

        System.out.println("3. Value is:" + value);

    }

    public void show(Person person){

        System.out.println("2. Person is: "+person);

        person.setName("Sue");

        person = new Person("Mike");

        System.out.println("3. Person is: "+person);
    }
}
