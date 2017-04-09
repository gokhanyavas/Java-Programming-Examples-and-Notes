/**
 * Created by gokhanyavas on 16.03.2017.
 
 Sınıflar ve Nesneler: 
 Java programları sınıflardan oluşur. Nesneler ise sınıflardan türerler.
 
 New Operatörü:
 Bu operatör sınıf adı ile birlikte kullanılarak bellekte sınıfa ait yeni bir nesne oluşturulmasını sağlar. 
 Eğer nesneler new operatörü ile oluşturulmazsa null varsayılan değerini alırlar. Böyle bir durumda uygulamada 
 bu nesnelerin üyelerine erişmeye çalışıldığında java NullPointerException hatası üretir.
 
 Nokta(.) operatörü: 
 Nesneler new op. ile oluşturulduktan sonra, nesnelere dışarıdan erişim sağlayabilmek için kullanılır.
 
 */

class Person{
    //Instance variable (data or "state")
    String name;
    int age;
    //Classes can contain
    // 1. Data
    // 2. Subroutines (method)
}
public class App {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Gokhan Yavas";
        person1.age = 28;

        Person person2 = new Person();
        person2.name = "Gurkan Yavas";
        person2.age = 21;

        System.out.println(person1.name);
    }
}
