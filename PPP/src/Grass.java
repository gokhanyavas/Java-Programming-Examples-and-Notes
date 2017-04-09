import world.Plant;

/**
 * Created by gokhanyavas on 20.03.2017.
 */
public class Grass extends Plant{
    public Grass(){

        //won't work -- grass not in same package as plant even tough it's a subclass
        //System.out.println(this.height);
    }

}
