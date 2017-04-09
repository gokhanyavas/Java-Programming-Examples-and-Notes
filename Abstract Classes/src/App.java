import javax.crypto.Mac;

/**
 * Created by gokhanyavas on 22.03.2017.
 
 Abstract sınıflar,genellikle ortak özellikleri olan nesneleri tek bir çatı altında toplamak için kullanılır.
 Abstract sınıflarda içi boş yada dolu metodlar tanımlanır.
 Abstract sınıflardan new kelimesi ile nesne oluşturulmaz.
 En az 1 abstract metod varsa sınıf abstract olmalıdır.
 Bir sınıfı abstract sınıf yapmak için abstract kelimesi kullanılır.
 
 */
public class App {

    public static void main(String[] args) {

        Camera cam1 = new Camera();
        cam1.setId(5);

        Car car1 = new Car();
        car1.setId(4);

       car1.run();

    }
}
