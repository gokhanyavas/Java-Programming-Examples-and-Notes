/**
 * Created by gokhanyavas on 21.03.2017.
 
 Bir iç sınıf herhangi bir kod bloğunda class anahtar sözcüğü kullanılmadan veya herhangi bir
 isim verilmeden kullanılırsa anonim sınıf oluşturulmul olur.
 
 Anonim sınıflara Java kendi isim verdiğinden isim verilememektedir. Oluşturulan isimsiz sınıflar için 
 java kendisi sıra ile isimler verilmektedir. Bu sınıf sadece tanımlandığı kod bloğunda kullanılır. Bir başka 
 kod bloğunda kullanılmaz. 
 Anonim sınıflar bir sınıfın bir başka sınıfı ve arabirimi genişletip yöntemlerini override etmekte kullanılır.
 
 */

class Machine{
    public void start(){
        System.out.println("Starting machine ...");
    }
}

interface Plant{
    public void grow();
}

public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine(){
            @Override
            public void start() {
                System.out.println("Camera snapping...");
            }
        };

        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant1.grow();
    }
}
