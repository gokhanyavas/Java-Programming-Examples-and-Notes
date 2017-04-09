/**
 * Created by gokhanyavas on 20.03.2017.
 *
 * private --- only within same class
 * public --- from anywhere
 * protected --- same class, subclass, and same packages
 * no modifier --- same package only
 
 Erişim Belirleyiciler:
 
 Erişim belirleyiciler sınıf içerisinde bulunan üyelere nasıl erişileceğini ya da nasıl erişilemeyeceğini belirlerler.
 
 Public (Açık):
 Public anahtar kelimesi ile tanımlanan sınıf, metot, data alanları gibi sınıfa ait tüm üyelere tanımlandıkları sınıf
 içerisinden erişilebildiği gibi uygulama içerisindeki tüm sınıf ve fonksiyonlardan erişilebilmektedirler.
 
 Private (Özel): 
 Private anahtar kelimesi ile tanımlanan sınıf üyelerine ve dahili sınıflara başka sınıf ve paketlerden erişilemez.
 Sınıflar private olarak tanımlanamazlar. Sadece dahili - inner sınıflar private olarak tanımlanabilirler.
 Public olarak tanımlanmış sınıfa ait metotu private olarak tanımlamışsak o metot artık o sınıfa özeldir. 
 
 Protected (Korumalı): 
 Protected anahtar kelimesi ile tanımalanan sınıf üyelerine ve dahili sınıflara aynı paket içindeki diğer sınıf ve fonksiyon
 lara erişebilirler. Ancak farklı paketten kalıtım ile oluşturulmuş alt sınıfa erişilebilir.
 
 Default-Friendly:
 Uygulamalarımızda erişim belirleyici tanımlanmadan oluşturulan özellikleri Java otomatik friendly olarak tanımlar.
 Bu tipteki üyelere aynı paketten erişilebilirken farklı paketlerden erişilememektedir. 
 
 
 
 */


import world.*;

public class App {

    // public, private, protected

    public static void main(String[] args) {

        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);

        // Won't work --- type is private

        //System.out.println(plant.type);

        //size is protected; App is not in same package as world.Plant.
        // Won't work.
        //System.out.println(plant.size);

        //won't work; App and plant in different packages, height has package-level visibility.
        //System.out.println(plant.height);

    }
}
