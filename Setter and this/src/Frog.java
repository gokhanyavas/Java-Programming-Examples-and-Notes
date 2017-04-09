/**
 * Created by gokhanyavas on 16.03.2017.
 
  Tanımlanmış olan private değişkenlerin kullanılmasını sağlayarak data encapsulation
 durumunun sağlanmasına olanak tanıyan metotlara Getter ve Setter denir.
 
 Get, almak set ise vermek anlamına gelmektedir.
 
 Data Encapsulation: Verilerin dış ortamdan olası aksaklıklar karşısında 
 koruma mekanızması olarak adlandırılır.
 
 This: Parametre olarak verilen ismin sınıf isimleriyle karışmasını engellemek için kullanılır.
 
 */
public class Frog {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setInfo(String name, int age){
        setName(name);
        setAge(age);
    }
}
