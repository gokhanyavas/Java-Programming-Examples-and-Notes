import javax.jws.soap.SOAPBinding;

/**
 * Created by gokhanyavas on 22.03.2017.
 
 Enum Türleri:
 
 Java dilinde Enum türleri önceden tanımlanmış sabit değerleri ifade etmede kullanılır.
 Burada kastedilen, bir haftanın kaç günden ve hangi günlerde oluştuğudur.
 
 Enum için yapıcı metot tanımlandığında private erişim belirleyici kullanılması zorunludur.
 Aksi durumda derleme hatası alırız.
 
 Enum türler dışarıdan new operatörü ile türetilemezler. Enumlar içinde yazılan yapıcı metotlar
 sadece enum sabitleri tarafından çağırılabilirler.
 
 
  
 */
public class App {

    public static final int DOG = 0;
    public static final int CAT = 1;
    public static final int MOUUSE = 2;


    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal) {

            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());

        System.out.println(Animal.DOG.getClass());

        System.out.println(Animal.DOG instanceof Animal);//Enum

        System.out.println(Animal.MOUSE.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);

    }
}
