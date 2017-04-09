import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by gokhanyavas on 23.03.2017.
 */
public class App {

    public static void main(String[] args) {

        // Hashset does not retain order.
       // Set<String> set = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in
       // Set<String> set = new LinkedHashSet<>();

        // TreeSet sorts in natural order
        Set<String> set = new TreeSet<>();

        if (set.isEmpty()){
            System.out.println("Set is empty at start");
        }


        set.add("dog");
        set.add("cat");
        set.add("bear");
        set.add("snake");
        set.add("rabbit");

        if (set.isEmpty()){
            System.out.println("Set is empty after adding (!no)");
        }

        // Adding duplicate item does nothing.
        set.add("dog");

        System.out.println(set);

        ///////////////////// Iteration //////////////////

        for (String element: set){
            System.out.println(element);
        }

        ////////////////////// Does set contains a given item? ///////////////////

        if (set.contains("asdasdas")){
            System.out.println("Contains asdasdas");
        }

        if (set.contains("cat")){
            System.out.println("Contains cat");
        }

        //set1 contains some common elements with set, and some new

        Set<String> set1 = new TreeSet<>();


        set1.add("dog");
        set1.add("cat");
        set1.add("giraffe");
        set1.add("ant");
        set1.add("monkey");

        ////////////// Intersection ///////////////////////////

        Set<String> intersection = new HashSet<String>(set1);

        intersection.removeAll(set1);

        System.out.println(intersection);

        //////////////// Difference ////////

        Set<String> difference = new HashSet<String>(set1);

        difference.removeAll(set);
        
        System.out.println(difference);


    }
}
