/**
 * Created by gokhanyavas on 20.03.2017.
 
 Çok Biçimlilik - Polymorphism
 
 Java'da farklı şekilde çalışan nesnelere aynı şekilde erişmek şeklinde tanımlayabiliriz.
 Diğer bir tanım olarak bir nesnenin farklı bir nesne gibi davranmasıdır...
 
 Geç Bağlama - Late Binding
 
 En genel tanımıyla çok biçimliliğin oluştuğu anda, yani run time sırasında nesne örneğinin bağlanacağı nesne türünün
 belirlenmesi ve buna uygun işlemlerin tamamlası sürecinde yapılan işlemlerdir.
 Çok biçimlilik olmadan geç bağlamadan bahsedilemez..
 
 instanceof Metodu: 
 Çok biçimlilik olmadığında kullanılır. Bu metot solunda ifade edilen referansın sağında ifade edilen tipten 
 olup olmadığını kontrol eder. Doğru ise true yanlış ise false değerini döndürür.
 
 
 
 */
public class App {
    public static void main(String[] args) {

        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

        doGrow(tree);

       // plant2.shedLeaves();
    }

    public static void doGrow(Plant plant){
        plant.grow();

    }


}
