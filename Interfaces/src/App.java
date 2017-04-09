/**
 * Created by gokhanyavas on 17.03.2017.
 
 Interface Nedir?

Java dilinde interface adını taşıyan, tasarım şablonlarında ve modellemede kullanılan sınıflar tanımlamak mümkündür.
 Bir interface normal bir Java sınıfından farksız bir şekilde tanımlanır. 
 Sınıf tanımlanırken class yerine interface terimi kullanılır.

Nesneye yönelik programlama dillerinde (örneğin C++) tamamen soyut (abstract) sınıflar
tanımlanarak oluşturulabilecek interface benzeri sınıflar için Java dilinde interface ve
implements gibi özel kelimeler mevcuttur.
Bu Java diline esnek yazılımlar yapılabilmesi adına büyük zenginlik katmaktadır.

Java’da tanımlanmış bir interface sınıftan, normal bir sınıfta olduğu gibi new() operatörü ile
bir nesne oluşturulamaz

Bir interface sınıfında sadece metotlar açıklanır. 
Bu metotların gövdeleri boştur. Alt sınıflar bu metotların gövdeleri için gerekli kodu oluştururlar (implement ederler).
 Metot gövdesi olmayan bir interface sınıftan nesne oluşturulamaz, çünkü sadece metot bildirimine sahip bir 
 nesnenin hiçbir işlevsel görevi olamaz
  
 */
public class App {
    public static void main(String[] args) {

        Machine m1 = new Machine();
        m1.start();

        Person p1 = new Person("Bob");
        p1.greet();

        Info info1 = new Machine();
        info1.showInfo();

        Info info2 = p1;
        info2.showInfo();

        System.out.println("");

        outputinfo(m1);
        outputinfo(p1);
    }

    private static void outputinfo(Info info){
        info.showInfo();
    }
}
