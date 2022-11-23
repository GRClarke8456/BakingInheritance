package bakery;

import java.util.ArrayList;

public class Bakery {

    private String name;
    private ArrayList<Cake> cake;

    public Bakery(String name){
        this.name = name;
        this.cake = new ArrayList<>();
    }



//    Methods
    public void addCake(Sponge cake){
        this.cake.add(cake);
    }

    public int countCake(){
        return this.cake.size();
    }

    public int howManySlices(Cheesecake name, Sponge cake){
        if (name.equals("Cheesecake")){
            return 12;
        }
        if (name.equals("Cake")){
            return 8;
        }
        return 0;
    }



}
