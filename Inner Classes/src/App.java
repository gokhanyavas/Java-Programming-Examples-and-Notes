/**
 * Created by gokhanyavas on 22.03.2017.
 
 Dahili - İç Sınıflar
 
 Java'da ayrı ayrı sınıflar tanımlamak yerine mantıksal olarak bir bütünün parçaları olan
 sınıfları veya aynı işlevi yapması tasarlanan sınıfları tek bir sınıf içerisinde iç içe 
 tanımlayabiliriz.
 
 Dahili sınıflar; dahili üye sınıflar, static dahili sınıflar, yerel dahili sınıflar ve
 anonim dahili sınıflar o.ü 4'e ayrılır.

 	  
 
 */
public class App {

    public static void main(String[] args) {

        Robot robot = new Robot(7);
        robot.start();

        //Robot.Brain brain = robot.new Brain();
        //brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }
}
