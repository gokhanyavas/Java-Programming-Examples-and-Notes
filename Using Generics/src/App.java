import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by gokhanyavas on 21.03.2017.
 
 Generics - Jenerik Sınıflar:
 
 İçerisinde tüm referans veri tiplerini tutan ayrıca hangi referans tipini tutacağına oluştururken karar verebileceğimiz
 ve üzerinde aynı işlemleri işlemleri yapabileceğimiz sınıf türüdür.
 
 */

class Animal{

}

public class App {
    public static void main(String[] args) {

        //////// Before Java 5 /////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String) list.get(1);
        System.out.println(fruit);

        ////////// Modern style /////////////////

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(1);

        System.out.println(animal);


        ///////// There can be than one type argument ///////

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        //////// Java 7 Style ////////////////

        ArrayList<Animal> someList = new ArrayList<>();
    }
}
