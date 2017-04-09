package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by gokhanyavas on 21.03.2017.
 
 Hata yakalama işlemi.
 
 İstisnalar - Exceptions
 
 İstisna, işlerin kontrolden çıkarak beklenmeyen durumlarda ortaya çıkamasıdır.
 Java'da istisna işleme konusunda 5 anahtar sözcük kullanılmaktadır. try-catch, throw, throws, finally ... 
 
 Try - Catch Blokları
 
 İstisnaların oluşma aşamasını incelersek;
 1- İstisna meydana geldiğinde ilk olarak bir nesne oluşturulur.
 2- Bu istisnayı yakalamak için catch bloğu olup olmadığı kontrol edilir. Catch bloğu varsa uygulama sonlanmaz bu catch bloğundan devam eder.
 3- Beklenen Catch bloğu yok ise istisna; istisnanın meydana geldiği komuta çağıran satıra istisna nesnesi fırlatılır.
 4- Şayet söz konusu istisnanın old. komutu çağıran komut satırında ilgili istisnaya ait catch bloğu var ise uyg. bu catch bloğundan devam eder.
 5- Burada da catch bloğu yoksa istisna oluşturulduğu metodu çağıran bir üst metoda fırlatılır. Catch olup olmadığı kontrol edilir. 
  varsa buradan yoksa bir üst metoda fırlatılır. bu işlem uygulamadaki main metoduna kadar devam eder yoksa uygulama sonlanır.
  
 İstisna Sınıfları 
 
 İstisnaların yakalanarak ele alındığı sınıflardır. Bu sınıflar en süper sınıf olan Object sınıfından türetilmiş THROWABLE 
 sınıfından türetilmektedir. Throwable sınıfı 2 alt başlıkta toplanır. Error ve Exception sınıfları. Error sınıfı sistem kaynaklı
 sorunlar meydana geldiğinde çalıştırılmaktadır. Bu durumda yazılımcıların birşey yapması imkansızdır. Exception sınıfı ise 
 çalışma sırasında oluşan hataları ele almaktadır. Bu hatalar çoğunlukla uygulama geliştirilirken yapılan hatalardan kaynaklanmaktadır.
 
 Kontrollü İstisnalar: Derleyicinin try-catch bloklarını kullanmaya zorlandığı istisna şeklidir.
 
 Kontrolsüz İstisnalar: Derleyicinin try-catch bloklarını kullanmaya zorlamadığı istisna şeklidir.
 
 İstisna Tanımlama
 
 https://docs.oracle.com/javase/tutorial/essential/exceptions/throwing.html dökümanından faydalanılabilir.
 
 İstisna Sınıfının Yapılandırıcıları:
 
 Tüm istisna sınıfları 2 yapılandırıcı barındırırlar. Bir tanesi hiç parametre almayan yapılandırıcı diğeri ise istisnanın
 açıklandığı String tipinden parametre alan yapılandırıcıdır. Bu parametre istisnanın mesaj alanına atanmakta ve getMessage
 yöntemi ile alınmaktadır.
 
 Error ve Exception sınıfına ait birkaç alt sınıfı inceleyelim:
 
 1- Error Sınıfı: 
    VirtualMachineError: JVM'nin çalışmasını etkileyen durumları inceler.
    AWTError: Grafik arayüze ait hataları inceler.
    OutOfMemoryError: Bellek yetersizliği durumlarını inceler.
 
 2- Exception Sınıfı: 
 	ClassNotFoundException Sınıfı: Olmayan bir dosyaya erişme istediği durumlarını inceler.
 	IOException: Giriş çıkış işlemlerindeki istenmeyen durumları inceler.
 	RunTimeException: Çalışma zamanı hatalarını inceler. 
 	AritmeticException: Aritmetik hataları inceler.
 	NullPointerException: Herhangi bir nesneye null referanslı bir değişken ile ulaşılmaya çalışılan durumlarda fırlatılır.
 	IllegalArgumentException: Metotlara geçersiz argüman atamalarında fırlatılır.
 	
 	istisna durumları bunlarla sınırlı değildirler. Değişik istisna sınıflarıda bulunmaktadır.
 	
 	
 İstisna Sınıflarında Ortak kullanılan Metotlar
 
 getMessage() metodu: İstisna nesnesi içersindeki mesajı döner.
 toString(): istisna mesajını istisna adını ili nokta ve arada bir boşluk ile döner.
 printStackTrace(): oluşan istisnanın bilgilerini aşama aşama ekrana yazdırır.
 getStackTrace(): oluşan istisnanın bilgilerini aşama aşama stacktrace tipinde bir dizi olarak döner.
 
 Finally Bloğu
 Herhangi bir istisna oluşşsun veya oluşmasın bazı durumlarda uygulamanın devam etmesini isteyebiliriz. Bunun için try-catch
 bloklarından sonra bir de finally bloğunu oluşturmalıyız.
 
 kalıp şu şekildedir:
 
 try{
       -- istisnaye sebep olabilecek komutlar
 }
 catch(İstisna türü istisna Nesnesi){
    -- istisna da yakanması ve ele alınmasını sağlayan komutlar
 }
 finally{
 
     -- her durumda çalışması istenen komutlar
 }
 
 
 
 
 */
public class App {

    public static void main(String[] args) {

        try {
            openFile();
        } catch (FileNotFoundException e) {

            // PS. This message is too vague :)
            System.out.println("Could not open file");
        }

    }

    public static void openFile() throws FileNotFoundException {

        File file = new File("text.txt");

        FileReader fr = new FileReader(file);

    }
}
