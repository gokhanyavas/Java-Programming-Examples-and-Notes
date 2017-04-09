import java.util.Scanner;

/**
 * Created by gokhanyavas on 16.03.2017.
 
 Kullanıcıdan Bilgi almak: 
 
 Klavyeden girilen veriye göre çeşitli işlemler yapmak için kullanıldıktan sonra ekrana yazdırma
 ya da herhangi bir yazıcıdan cıktı vs. gibi işlemledir. 
 
 Scanner: Giriş-Çıkış işlemleri için kullanılmaktadır. 
 
 Scanner sınıfına ait yöntemler: 
 next(): klavyeden girilen ifadenin ilk kelimesini okur.(Boşluğa kadar olan kısımı)
 nextLine(): girilen tüm ifadeyi okur.
 findInLine('.')charAt(0): klavyeden girilen ifadeyi karakterlere ayırarak okur.
 nextInt(): girilen ifadeyi int tipini çevirir.
 nextFloat(): girilen ifadeyi float tipini çevirir.
 nextDouble(): girilen ifadeyi double tipini çevirir.
 
 Bilgi Giriş-Çıkış: 
 System.in : klavyeden veri girileceğinde.
 System.out : işlem ve mesajların ekrana yazdırılacağında
 System.err : hata mesajların kullanılmaktadır. Mesajı kırmızı yazdırır.
 
 
 */
public class GettingUserInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        //Output the prompt
        System.out.println("Enter an integer: ");

        //Wait for the user to enter something.
        int value = input.nextInt();
        //double value = input.nextDouble();

        //Tell them what they entered.
        System.out.println("You entered: " + value);
    }
}
