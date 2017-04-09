/**
 * Created by gokhanyavas on 16.03.2017.
 */
public class App {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 25;
        //person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirements " + years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
