/**
 * Created by gokhanyavas on 16.03.2017.
 */
public class Person {
    String name;
    int age;

    void speak(){
        for (int i=0; i<3; i++){
            System.out.println("My name is: " + name + ". I am " + age + " years old");
        }
    }

    void sayHello(){
        System.out.println("Hello there!");
    }
}
