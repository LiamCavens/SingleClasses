import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle testBottle;

    @Before
    public void before() {
        testBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, testBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        assertEquals(90, testBottle.drink());
    }

    @Test
    public void emptyBotte(){
        assertEquals(0, testBottle.empty());
    }

    @Test
    public void fillBottle(){
        assertEquals(100, testBottle.fill());
    }
}
