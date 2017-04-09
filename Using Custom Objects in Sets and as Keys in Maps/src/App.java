import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
public class App {

    public static void main(String[] args) {

        Person p1 = new Person(0,"gokhan");
        Person p2 = new Person(1,"ali");
        Person p3 = new Person(2,"onur");


        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        //map.put("dort",4);

        for (Person key: map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }

        Set<Person> set = new LinkedHashSet<Person>();

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);


    }
}
