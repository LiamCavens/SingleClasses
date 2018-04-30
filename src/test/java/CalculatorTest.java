import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator testCalculator;

    @Before
    public void before() {
        testCalculator = new Calculator(50, 10);
    }

    @Test
    public void hasNumber1() {
        assertEquals(50, testCalculator.getNumber1());
    }

    @Test
    public void addFunction() {
        assertEquals(60, testCalculator.add());
    }

    @Test
    public void subtractFunction() {
        assertEquals(40, testCalculator.subtract());
    }

    @Test
    public void multiplyFunction() {
        assertEquals(500, testCalculator.multiply());
    }

    @Test
    public void divideFunction() {
        assertEquals(5, testCalculator.divide());
    }
}