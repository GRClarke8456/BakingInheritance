package bakery;

import flavour.Flavour;

import java.util.ArrayList;

public class Cupcake extends Sponge {

    private int sizeInInch;

    public Cupcake (String name, Flavour baseFlavour, String methodOfCooking,
                    int sugarContentScore, String icing, String topping,
                    int sizeInInch){
        super(name, baseFlavour, methodOfCooking, sugarContentScore, icing, topping);
        this.sizeInInch = sizeInInch;
    }

}
