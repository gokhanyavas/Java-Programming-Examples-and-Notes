import java.util.Scanner;

/**
 * Created by gokhanyavas on 16.03.2017.
 
 Do While Döngüsü: Bu yapı diğerlerinden farklı olarak koşulu döngü sonunda kontrol eder.
 Yani döngü tamamen kontrol edilene kadar kod blogu en az bir kez çalıştırılmış olur. 
 Koşul sağlanıyorsa - true dönüyorsa kod blogu tekrar çalıştırılır.
 */
public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Enter a number: ");

        int value = scanner.nextInt();

        while (value != 5){
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        */
        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        while (value != 5);

        System.out.println("Got 5!");
    }
}
