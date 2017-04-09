/**
 * Created by gokhanyavas on 17.03.2017.
 
 Kalıtım - Inheritance
 
 Makine ve Araba diye 2 farklı sınıf düşünelim. Makine sınıfının özellikleri başla ve dur olsun.
 Araba sınıfı ise makine sınıfını baz alarak bazı özelliklerini taşıyacaktır. Yani Araba, makine sınıfının
 bazı özelliklerinin bir araya gelmesiyle meydana gelmiştir.
 Burada Makine sınıfı süper sınıf, bu sınıflardan türedilen sınıflarda alt sınıflar denir. Alt sınıflarında içinde 
 alt sınıfların olabileceğini unutmamak gerekir.
 
 Kalıtım, bir sınıfın kendisine ait özellikleri ve işlevleri bir başka sınıfa aynen aktarması ya da bazı özellik ve
 işlevlerini diğer sınıfların kullanmasına izin vermesi şeklinde oluşmaktadır.
 
 Üst sınıf(Süper sınıf) özelliklerini alt sınıflarda kullanmak için extends deyimi ile kullanılırız.
 
 Extends: Herhangi bir sınıfın özelliklerini ve işlevlerini miras olarak alması için kullanılan deyimdir.
 
 Kalıtımın Faydaları: 
 - Daha önce yazılmış sınıf içindeki kod parçacıklarının tekrar tekrar yazılmadan başka sınıflar içinde kullanılması
   sağlar. Bu işlem iş yükünü hafifletir ve zaman kazandırır.
 - Projelerde daha önce kullanılan sınıflar, denenmiş hatasız anlamındadır. Kısaca daha çok güven arz etmektedir.
 - if, else, switch gibi kontrol ifadelerinin kullanıldığı sınıflar kötü tasarım örnekleri olarak ele alındıklarından,
   kalıtımın nimetlerinden faydalanabiliriz.
   
 @Override: Herhangi bir alt sınıfa ait metotlar aynı isim, parametre ve dönüş tipi ile tanımlanırsa
 			o metotu alt sınıfta üzerine yazmış oluruz. Bu alt sınıftan yeni bir nesne ürettiğimizde 
 			süper sınıftan aldığımız metot ilk hali ile değil yeni sınıfımızın yeni nesnesine uygun olarak
 			çalıştırılır. Burada işlev değişmemekle birlikte işlevin döndürdüğü sonuçlar değişebilmektedir.
 			Bu şekilde çalıştırılan metotlar karşımıza override metotlar olarak çıkmaktadır.
 			
 			Bu örneğimizde Machine sınıfındaki start metotu Car sınıfındaki start metotu ile override edilmiştir.
 			
 			Yeşil uyarı ile gösterilen metot başka bir sınıfa ait metodun içinde override edildiğini,
 			Gri renk ile gösterilen metot ise bu sınıfa ait metodun başka sınıflar tarafından override
 			edildiğini göstermektedir.
 			
 super(): Bir alt-sınıf ne zaman üst-sınıfına erişmek isterse super anahtar sözcüğünü kullanabilir. 
 		  super ‘in kullanımı iki türlü olur. Birincisi, üst-sınıfa ait nesne yaratmak içindir. 
 		  İkincisi, üst-sınıfın öğelerine erişmek içindir. 
  
 
 */
public class App {
    public static void main(String[] args) {

        Machine m1 = new Machine();
        m1.start();
        m1.stop();

        Car c1 = new Car();
        c1.start();
        c1.wipeWindShield();
        c1.showInfo();
        c1.stop();

    }
}
