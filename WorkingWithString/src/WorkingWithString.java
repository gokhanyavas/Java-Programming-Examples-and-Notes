/**
 * Created by gokhanyavas on 16.03.2017.
 
 stringler karakter katarı olarak da ifade edilirler. Java'da stringler nesne olarak
 ele alınmaktadırlar. String değişkenler ile her çeşit karakterler saklanabilmektedir.
 
 String nesneler oluşturulduktan sonra değiştirilemez nesnelerdir. (bknz: Immutable Objects)
 
 Değişebilir nesneler oluşturmak için StringBuilder sınıfı kullanılabilir.
 
 String Metodlar:
 
 lengh(): İfadenin karakter uzunluğunu öğrenmek için kullanılır.
 charAt(): İfade içindeki sorgulanan indise ait karakteri döndürür. İfadenin 0'dan başladığını unutmayın.
 substring: İfadenin başlangıç ve bitiş indisleri arasındaki karakterleri döndürür.
 lastindexOf: İfade içindeki sorgulanan karakterin bulunduğu son pozisyonu döndürür.
 replace(x,y): İfade içindeki karakterler ile verilecek gelişi güzel karakterin yerini değiştirir.
 toUpperCase: İfadenin karakterlerini büyük yapar.
 toLowerCase: İfadenin karakterlerini küçük yapar.
 parse: String veri tipini diğer veri tiplerine dönüştürür.
 
 String ifadelerde karşılaştırma için equals() metodu ile yapılır.
 
 
 */
public class WorkingWithString {
    public static void main(String[] args) {
        int myInt = 10;
        double myDouble = 6.7;

        String text = "Hello";
        String blank = " ";
        String name = "Gokhan";

        String greeting = text + blank + name;

        System.out.println(greeting);

        System.out.println("Hello" + " " + "Gurkan");

        System.out.println("My Integer is: " + myInt);
        System.out.println("My Double is: " + myDouble);
    }
}
