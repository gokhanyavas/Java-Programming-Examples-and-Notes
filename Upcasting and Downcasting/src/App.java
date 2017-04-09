/**
 * Created by gokhanyavas on 21.03.2017.
 
 
Nesneler arasında Casting(Dönüştürme) işlemi yapabilmemiz için mutlaka aralarında inheritance ilişkisi olması lazım.

İki Tür Casting İşlemi var.

Üst Sınıf Tipine Dönüştürme (UpCast)

Üst sınıfa dönüştürülürken dikkat edilmesi gereken şudur. Üst sınıfa dönüştürülen nesne kendi sınıfındaki özel metotlara 
erişemezler. Sadece Override edilmiş metotlara ve üst sınıfın metotlarına erişebilirler.

Alt Sınıf Tipine Dönüştürme(DownCast)

Üst sınıftaki Nesneyi alt sınıflara Cast etmemizin sebebi. İstenilen Nesnenin sadece istenilen metotlarına erişmesini 
sağlamaktır.

 */

class Machine{

    public void start(){
        System.out.println("Machine Started");
    }
}

class Camera extends Machine{

    public void start(){
        System.out.println("Camera Started");
    }

    public void snap(){
        System.out.println("Photo taken");
    }
}

public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting
        Machine machine2 = camera1;
        machine2.start();

        // error: machine2.snap();

        // Downcasting
        Machine machine3 = new Machine();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        // Doesn't work -- runtime error.
        Machine machine4 = new Machine();
        //Camera camera3 = (Camera) machine4;
        //camera3.start();
        //camera3.snap();

    }
}
