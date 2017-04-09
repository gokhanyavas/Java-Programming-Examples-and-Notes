import world.Plant;

/**
 * Created by gokhanyavas on 20.03.2017.
 */
public class Oak extends Plant {

    public Oak(){

        // won't work -- type is private
       // type = "tree";

        // this works -- size is protected, oak is subclass of plant.
        this.size = "medium";

        //no acces speccifler
        this.height = 10;

    }
}
