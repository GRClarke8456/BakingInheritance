package bakery;

import flavour.Flavour;

public class Sponge extends Cake{

    private String icing;
    private String topping;

    public Sponge(String name, Flavour baseFlavour,
                  String methodOfCooking, int sugarContentScore,
                  String icing, String topping){
        super(name, methodOfCooking, sugarContentScore);
        this.icing = icing;
        this.topping = topping;
    }
}
