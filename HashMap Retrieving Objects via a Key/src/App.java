import java.util.HashMap;
import java.util.Map;

/**
 * Created by gokhanyavas on 23.03.2017.
 */
public class App {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(3,"Uc");
        map.put(2,"Iki");
        map.put(4,"Dort");
        map.put(6,"Alti");
        map.put(9,"Dokuz");

        String text = map.get(9);

        System.out.println(text);

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }

    }
}
