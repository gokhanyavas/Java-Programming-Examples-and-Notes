/**
 * Created by gokhanyavas on 16.03.2017.
 
 if döngüsü: Koşul sağlanırsa true değeri döndürür. Örnekte olduğu gibi belirlenen koşullara göre şekillenilir.
 */
public class If {
    public static void main(String[] args) {
        int myInt = 9;

        if (myInt < 10){
            System.out.println("Yes, it's true!");
        }
        else if (myInt > 20){
            System.out.println("No, it's false!");
        }
        else {
            System.out.println("None of the above.");
        }

    }
}
