/**
 * Created by gokhanyavas on 16.03.2017.
 
 Tam sayılar:
 
 Byte: -128 ve 127 arasında değerler alır. (8 bit)
 Short: -32768 ve 32767 arasında değerler alır. (16 bit)
 Integer: Orta uzunluktaki sayıları tutmak için kullanılır. En fazla kullanılan veri tipidir. (32 bit)
 Long: Çok uzun sayıları tutmak için kullanılır. (64 bit)
 
 Ondalıklı Sayılar:
 
 Float: Bu tip virgülden sonra 7 haneye kadar yeterli duyarlılıktadır. (Tek duyarlı - 32 bit)
 Double: Bu tip virgülden sonra 17 haneye kadar yeterli duyarlılıktadır. (Çift duyarlı - 64 bit)
 Char: Javada karakterleri temsil eder. 16 bit yer kaplar.
 Boolean: Bu tip sadece True-False değerini alabilir.
 
 
 */
public class Variables {
    public static void main(String[] args) {

        //primitif tipler - degiskenler
        int myNumber = 143;
        short myShort = 856;
        long myLong = 9032;

        double myDouble = 5.23;
        float myFloat = 342.3f;

        char myChar = 'y';
        boolean myBoolean = false;

        byte myByte = 127;
        String myName = "Gokhan Yavas";

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
        System.out.println(myName);


    }
}
