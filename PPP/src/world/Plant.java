package world;

/**
 * Created by gokhanyavas on 20.03.2017.
 */

class Something{

}

public class Plant {

    // bad practice
    public String name;

    // Acceptable practice --- it's final.
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant(){
        this.name = "Gokhan";
        this.type = "plant";
        this.size = "Large";
        this.height = 8;
    }
}
