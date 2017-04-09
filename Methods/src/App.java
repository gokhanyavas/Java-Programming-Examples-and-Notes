/**
 * Created by gokhanyavas on 16.03.2017.
 
 Metotlar: 
 
 Metotlar bir grup kod bloğunun belirli bir işlevi gerçekleştirmek için bir araya gelmesiyle 
 oluşurlar. Genelde programlar küçük parçalara bölünmüş şekle getirilmeye çalışılır. Bu küçük 
 parçalara metot adı verilir. Java programları; metotları içeren java sınıflarıyla class alan metotların
 birleşmesinden oluşur.
 
 Java temel parçaları : modüller, sınıf ve metotlar proje geliştirme sürecinde yeniden kullanılarak kodu ve yazılım
 geliştirme süresini kısaltmaktadır. 
 
 Metotlar 2 kısıma ayrılır: 
 Parametresiz metotlar ve Parametre alan metotlar. Bu örneğimizde kullandığımız metotlar parametre almıyorlar.
 
 
 */
public class App {
    public static void main(String[] args) {

        //Person 1
        Person person1 = new Person();
        person1.name = "Gokhan";
        person1.age = 27;
        person1.speak();
        person1.sayHello();

        //Person 2
        Person person2 = new Person();
        person2.name = "Gurkan";
        person2.age = 21;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);

    }
}
