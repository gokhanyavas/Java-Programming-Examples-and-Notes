import java.util.*;

/**
 * Created by gokhanyavas on 24.03.2017.
 */

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class StringLenghtComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int len1 = o1.length();
        int len2 = o2.length();

        if (len1>len2){
            return 1;
        }
        else if (len1<len2){
            return -1;
        }
        return 0;
    }
}

class AlphabeticalComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2); // a dan z ye  yazar.
        //return -o1.compareTo(o2); // z den a ya yazar.
    }
}

public class App {

    public static void main(String[] args) {

        //////////////////////// Sorting Strings //////////////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Snake");
        animals.add("Mongoose");

        // Collections.sort(animals, new StringLenghtComparator());

        Collections.sort(animals, new AlphabeticalComparator());

        for (String animal: animals){
            System.out.println(animal);
        }

        //////////////////////// Sorting Numbers //////////////////////////

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(44);
        numbers.add(12);
        numbers.add(48);
        numbers.add(1);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(02);
                // sayilari buyukten kucuge siraladik.
            }
        });

        for (Integer number: numbers){
            System.out.println(number);
        }
        //////////////////////// Sorting Arbitary Objects //////////////////////////

        List<Person> people = new ArrayList<Person>();

        people.add(new Person(1,"John"));
        people.add(new Person(2,"Sue"));
        people.add(new Person(3,"Clare"));
        people.add(new Person(4,"Bob"));

        //Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.getId() > p2.getId()){
                    return 1;
                }
                else if(p1.getId() < p2.getId()){
                    return -1;
                }
                return 0;
            }
        });

        for (Person person: people){
            System.out.println(person);
        }

        System.out.println("\n");
        // Sort in order of Name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                return p1.getName().compareTo(p2.getName());
            }
        });

        for (Person person: people){
            System.out.println(person);
        }

    }
}
