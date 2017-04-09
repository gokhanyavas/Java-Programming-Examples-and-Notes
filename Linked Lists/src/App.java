import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gokhanyavas on 23.03.2017.
 */
public class App {

    public static void main(String[] args) {

        /*

        ArrayLists manage array internally.
        [0][1][2][3][4][5] .....
        Arraylist daha hizli
         */

        List<Integer> arrayList = new ArrayList<Integer>();

        /*
            LinkedLista consists of elements where each element
            has a reference to the previous and next element
            [0]->[1]->[2].....
                  <-   <-
            Linkedlist daha yavas.
         */
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("Array",arrayList);
        doTimings("LinkedList", linkedList);

    }

    public static void doTimings(String type, List<Integer> list){

        for (int i = 0; i < 1E5; i++ ){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        // Add items at end of list
        for (int i = 0; i < 1E5; i++ ){
            list.add(i);
        }
        */

        // Add items elsewhere in list
        for (int i = 0; i < 1E5; i++ ){
            list.add(list.size(), i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
