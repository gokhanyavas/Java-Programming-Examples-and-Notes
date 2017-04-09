/**
 * Created by gokhanyavas on 20.03.2017.
 
 Kapsülleme - Encapsulation
 
 Dışarından ya da yanlış kullanım sonucu kodu ve veriyi koruyan bir mekanızmadır.
 Bir diğer şekliyle iş metot tarafından yapılır fakat metotun içeriği gösterilmez.
 
 Private: Sınıfa özel değişkenlerdir.
Public:Herkese açık olan değişkenlerdir.
Protected:Extends edenlere türetenlere ve aynı pakette olanlara açık olan değişkenlerdir.
Default:Hiçbirşey yazlmazsa aynı pakettekilerin erişebildiği değişkenlerdir.

Statik: public static int ogrenciSayisi = 0; böyle bir tanımlama şekli vardır.
Eğer değişken nesne değişkeni değilde sınıf değişkeni olsun istiyorsak statik anahtar kelimesini kullanmalıyız.

Final:Final olan bir değişkene sadece bir kere değer ataması yapılabilir. 
Final olan bir metot ne alt sınıflarca yeniden yüklenebilir (method overloading) ne de saklı (hidden) tutulabilir.

Public ile Static kavramını karıştırmamalısınız.Bir değişken public olarak oluşturulsa da “static” değil ise 
bu değişkenin dışardan kullanılması için instance oluşturulmalıdır. Burada erişilebilecek olanlara sadece 
get metodu yazıldı.Değiştirileceklere ise set metodu yazıldı.Eğer hiçbir şekilde değiştirilmesini ve erişilmesini 
istemezsek get ve set metodlarını kullanmamamız gerekir.

 */

class Plant{

    public static final int Id = 8;
    private String name;

    public String getData(){
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast(){
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) {

    }
}
