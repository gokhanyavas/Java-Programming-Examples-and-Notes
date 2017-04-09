/**
 * Created by gokhanyavas on 16.03.2017.
 
 Tanımlanmış olan private değişkenlerin kullanılmasını sağlayarak data encapsulation
 durumunun sağlanmasına olanak tanıyan metotlara Getter ve Setter denir.
 
 Get, almak set ise vermek anlamına gelmektedir.
 
 Data Encapsulation: Verilerin dış ortamdan olası aksaklıklar karşısında 
 koruma mekanızması olarak adlandırılır.
  
 
 */
public class Person {

    String name;
    int age;

    void speak(){
        System.out.println("My name is: " + name);
    }

    int calculateYearsToRetirement(){
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}
