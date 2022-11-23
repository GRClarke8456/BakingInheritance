package BakeryTest;

import bakery.Cheesecake;
import flavour.Flavour;
import bakery.Bakery;
import bakery.Cake;
import bakery.Sponge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakeryTest {
    private Bakery bakery;


    @BeforeEach
    public void setUp(){
        bakery = new Bakery("Angel's Delights");
    }

    @Test
    public void canCountCake(){
        int expected = 0;
        int actual = bakery.countCake();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddCake(){
        Sponge cake = new Sponge("Lemon cake", new Flavour("lemon"), "Oven-baked", 71,
                "Lemon butter-cream", "Candied lemon peel");
        bakery.addCake(cake);
        int expected = 1;
        int actual = bakery.countCake();
        assertEquals(expected, actual);
    }

    @Test
    public void countHowManyCakeSlices(){
        Cheesecake cake = new Cheesecake("Cheesecake", new Flavour("lemon"),
                "refrigerated", 52, true, "Mascarpone",
                "Hobnobs");
        int expected = 12;
        int actual = bakery.howManySlices();
        assertEquals(expected, actual);
    }

    @Test
    public void whatIsTheSugarLevel(){
//        Copy lemon sponge
        String expected = "High";
        String actual = Cake.getSugarLevel();
        assertEquals(expected, actual);
    }


}
