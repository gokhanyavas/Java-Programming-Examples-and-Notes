/**
 * Created by gokhanyavas on 8.04.2017.
 *
 
 Multithreading
 
 Çok akışlı ya da birden fazla iş parçacığı ile programlama denilebilir. Yani bir programın, uygulamanın aynı
 anda birden fazla iş yapabilme yeteneğidir.
 
 Çok akışlı programlama javanın bir kütüphanesi olmayıp yazılım dilinin temel özelliklerinden birisidir.
 Thread, iş parçacığı uygulama içindeki yapılması gereken bir işlemin baştan sona eksizsiz yerine getirilmesidir.

 Thread sınıfının metotları:
 run metodu: Çok akışlılığı sağlamaktadır. Runable arabirimini uygulayan sınıflar bu metodu override etmektedir.
 start metodu: Ana akıştan-işten farklı bir akış-iş parçacığı cağırır ve çağırılan iş parçacığını başlatır.
 sleep(long tipinde değer): Parametrede verilen milisaniye boyutundaki zaman aralığında app'nin duraksamasını sağlar.
 yield() metodu: iş parçacığının durdurulmasını ve diğer iş parçacığının çalışmasına izin vermek için kullanılır.
 interrupt metodu: uyuyan ve geçici olarak durdurulan iş parçacığını başlatmak için kullanılır.
 join() metodu: Özel durumlar dışında iş parçacığı birbirinden bağımsız çalışır.Geçerli iş parçacığının diğer iş parçacıklarını
 beklemesi için kullanılır.
 isAlive(): İş parçacığının o anda çalışıp çalışmadığını kontrol eder.
 setpriority(int tipinde değer): Parametrede 1-10 arasında değer alabilir. Bu değer iş parçacığının çalışma önceliğini belirler.
 getpriority() metodu: Javanın hangi iş parçacığını daha önce çalıştırılacağını belirler. 1-10 arasında değer.

 Synchronization - Eş zamanlama
 Bu anahtar kelime ile java'ya ilgili kod parçacığına aynı anda sadece bir iş parçacığı erişebileceğini ve diğerlerinin onu
 beklemesi gerektiğini söylüyoruz. Yani kod parçacığı çalıştırılacak ilk iş parçacığı ilgili kod parçacığı üzerinde bir kilit
 sahilibi olur. ve o iş parçcığı işini bitirmeden bu kilit açılmaz.

 Monitör
 Bir nesneye erişimde eşzamanlama monitör mekanizması ile olur. Bir nesneye erişen her iş parçacığı monitörde sıraya alınır.
 İşlem bittiğinde diğerleri sırayla erişime devam ederler. Bazı metotları bulunmaktadır. Bunlar;

 wait(): Senkronize edilmemiş(kilitlenmiş) bir durumun serbest kalması için beklemek için kullanılır.
 notify(): Kilit nesnenin serbest olduğunu bildirmek için kullanılır.
 notifyAll(): Kilitli nesnelerinin tümünün serbest olduğunu belirtmek için kullanılır.
 
 
 */
public class App {
    public static void main(String[] args) {

        charYaz karakterYaz = new charYaz('A',5);
        RakamYaz rakamYaz = new RakamYaz(14,5);
        charYaz karakterYaz2 = new charYaz('B',2);

        // is parcagina ait thread olusturalim

        Thread isparcasi1 = new Thread(karakterYaz);
        isparcasi1.start();

        Thread isparcasi2 = new Thread(rakamYaz);
        isparcasi2.start();

        Thread isparcasi3 = new Thread(karakterYaz2);
        isparcasi3.start();

        // her calistirmada farkli sekilde dizilecektir.
        // Diger bahsettigim metotlarinda ornekleri buna benzer olarak cogaltilabilir.
        

    }
}
