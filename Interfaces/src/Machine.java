/**
 * Created by gokhanyavas on 17.03.2017.
 */
public class Machine implements Info{

    private int Id = 7;

    public void start(){
        System.out.println("Machine started.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + Id);
    }
}
