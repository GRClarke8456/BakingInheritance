package bakery;

import flavour.Flavour;

import java.util.ArrayList;

public abstract class Cake {
    protected String name;  // "Lemon cake"
    protected ArrayList<Flavour> baseFlavour;  // "Lemon"
    private String methodOfCooking;  // "Oven-baked"
    private int sugarContentScore;   // 71

    public Cake(String name, String methodOfCooking,
                int sugarContentScore){
        this.name = name;
        this.baseFlavour = new ArrayList<>();
        this.methodOfCooking = methodOfCooking;
        this.sugarContentScore = sugarContentScore;
    }

    public String sugarLevel(){
        if(sugarContentScore >= 75 && sugarContentScore <= 100){
            return "High amount of sugar";
        }
        if (sugarContentScore <75 && sugarContentScore <= 35){|
            return "Medium amount of sugar";
        }
        if (sugarContentScore <35){
            return "Low amount of sugar";
        }}


        public String getSugarLevel(){
            return sugarLevel();
        }



    //    Getters & Setters for ArrayList


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flavour> getBaseFlavour() {
        return baseFlavour;
    }

    public void setBaseFlavour(ArrayList<Flavour> baseFlavour) {
        this.baseFlavour = baseFlavour;
    }
}
