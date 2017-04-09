/**
 * Created by gokhanyavas on 16.03.2017.
 
 Koşul sağlandığı sürece çalışan döngüdür.
 
 Dallanma ifadeleri: 
 break:
 continue: İşlevsel olarak break deyiminin benzeridir. Uygulandığı döngünün pas geçilmesini sağlar.
 return: Fonksiyon ya da metodun değerlerini geri döndürmek için kullanılır.
 */
public class WhileLoops {
    public static void main(String[] args) {
        int loop = 0;
        while (loop < 5){
            System.out.println("Looping: " + loop);
            loop++;
        }
    }
}
