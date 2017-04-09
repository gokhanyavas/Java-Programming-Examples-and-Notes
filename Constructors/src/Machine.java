/**
 * Created by gokhanyavas on 16.03.2017.
 
 Yapılandırılar, sınıf ismi ile aynı ismi taşıyan değer döndürmeyen metotlardır.Örnekte olduğu gibi 
 parametreli ve parametresiz olabilirler.
 Yapılandırı metotların dönüş tipi yoktur. Yapılandırıcı metot kullanmak zorunda değiliz çünkü derleyici
 default olarak yapılandırıcı olduğunu varsayar.
 
 */
public class Machine {

    private String name;
    private int code;

    public Machine(){
        this("Arnie",0);
        System.out.println("Constructor running!");

    }

    public Machine(String name){
        this(name,0);
        System.out.println("Second constructor runnnig!");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third constructor runnig.");
        this.name = name;
        this.code = code;
    }

}
