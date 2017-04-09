import java.util.Scanner;

/**
 * Created by gokhanyavas on 16.03.2017.
 
 Switch - Case : Verilen değişken değerlerine göre işlem yapılmasını sağlar. Tam sayılar ile kullanılabilir fakat
 double, float gibi sayılarla kullanılmaz. 
 
 Her koşuldan sonra break; deyimi kullanılmalıdır. Aksi halde sağlanan koşuldan sonraki tüm koşullar java tarafından
 doğruluğu kontrol edilmeksizin çalıştırılır.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a command: ");
        String text = input.nextLine();

        switch (text){
            case "start":
                System.out.println("Machine Started!");
                break;

            case "stop":
                System.out.println("Machine Stopped!");
                break;

            default:
                System.out.println("Command not recognized");
        }
    }
}
