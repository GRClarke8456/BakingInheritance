package bakery;

import flavour.Flavour;

import java.util.ArrayList;

public class Cheesecake extends Cake{

    private boolean healthy;
    private String typeOfCheese;
    private String typeOfBiscuit;

    public Cheesecake(String name, Flavour baseFlavour,
                      String methodOfCooking, int sugarContentScore,
                      boolean healthy, String typeOfCheese,
                      String typeOfBiscuit){
        super(name, methodOfCooking, sugarContentScore);
        this.healthy = healthy;
        this.typeOfCheese = typeOfCheese;
        this.typeOfBiscuit = typeOfBiscuit;

    }
}
