/**
 * Created by gokhanyavas on 17.03.2017.
 
 toString Metotu: Nesnelerin metin karşılıklarını yazdırmak için kullanılır. Eğer nesnelerin
 metinsel bir karşılığı yoksa nesnenin hafızaki adresi döner.
 
 Not: Java'da bütün sınıflar Object adı verilen sınıftan kalıtılırlar. Dolayısıyla Object sınıfındaki
 tüm metotlar bütün sınıflarda yazılmasalar dahi yazılmış sayılırlar.
 
 
 */
public class Forg {
    private int Id;
    private String name;

    public Forg(int id, String name) {
        this.Id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%-4d: %s", Id, name);
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(Id).append(": ").append(name);
        return sb.toString();
        */
    }
}
