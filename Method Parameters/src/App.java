/**
 * Created by gokhanyavas on 16.03.2017.
 
 Metotlara parametreler atayabilir ve bu değerleri metotlar içersinde çalıştırabiliriz.
 Bu örnekte parametreli metot oluşumu incelenmektedir. 
 Metot kullanımının faydaları şöyledir:
 1- Karmaşık programları küçük yapılara bölerek daha anlaşılır ve yönetilebilir seviyeye getiririz.
 2- Bir uygulamada değişiklik yapılmak istenildiğinde tüm uygulamada ilgili ifadelerin geçtiği tüm
 	parçalar üzerinde değişiklik yapılması gerekir. Ancak metotlarda bu gibi bir sorunlar görülmez.
 	İlgili metot üzerinde yapılan değişiklik tüm uygulamayı etkiler. Bu da büyük ve performans kazandırır.
 

 */
public class App {
    public static void main(String[] args) {

        Robot sam = new Robot();
        sam.speak("Hi I`m Sam.");
        sam.jump(8);
        sam.move("East", 18.2);

        //look at me
        String greeting = "Hello there!";
        sam.speak(greeting);
    }
}
