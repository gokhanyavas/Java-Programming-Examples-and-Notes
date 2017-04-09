import java.util.*;

/**
 * Created by gokhanyavas on 24.03.2017.
 */

class Person implements Comparable<Person>{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public int compareTo(Person person) {
        //return -name.compareTo(person.name);
        // - ters siralama

        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2){
            return  1;
        }
        else if (len1 < len2){
            return -1;
        }
        else {
        return name.compareTo(person.name);
        }
    }
}

public class App {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        SortedSet<Person> set = new TreeSet<Person>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    public static void addElements(Collection<Person> col){
        col.add(new Person("Joe"));
        col.add(new Person("Sue"));
        col.add(new Person("Juliet"));
        col.add(new Person("Clare"));
        col.add(new Person("Mark"));

    }

    public static void showElements(Collection<Person> col){
       for (Person element: col){
           System.out.println(element);
       }

    }
}
