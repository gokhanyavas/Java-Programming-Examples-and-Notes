import world.Plant;

/**
 * Created by gokhanyavas on 20.03.2017.
 */
public class Field {

    private Plant plant = new Plant();

    public Field(){
        //size is protected: Field is in the same package as world.Plant.
        System.out.println(plant.size);
    }
}
