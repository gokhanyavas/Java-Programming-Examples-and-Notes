/**
 * Created by gokhanyavas on 17.03.2017.
 
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
public class App {
    public static void main(String[] args) {
        // Inefficient
        String info = "";

        info += "My name is Gokhan.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        // More efficient
        StringBuilder sb = new StringBuilder();

        sb.append("My name is Gurkan.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        //Diffrent
        StringBuilder s = new StringBuilder();
        s.append("My name is Roger.")
                .append(" ")
                .append("I am a skydiver.");

        System.out.println(s.toString());

        // Formatting //

        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");

        //formatting integer point value
        System.out.printf("Total cost %d; quantity is %d\n", 5, 120);//-10d

        for (int i=0; i<5; i++){
            System.out.printf("%2d: some text here\n",i);
            //"%2d: %s\n",i, "some text here"
        }

        //formatting floating point value
        System.out.printf("Total value: %.2f\n",5.6);
        System.out.printf("Total value: %.2f\n",5.6874);

    }
}
