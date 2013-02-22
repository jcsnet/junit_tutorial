import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void beforeTest()
    {
        calculator = new Calculator();
    }

    @Test
    public void testAdd()
    {
//        Given
//      Calculator object is created before
//      each test in beforeTest method

//        When
        int result = calculator.add(3,4);

//        Then
        assertEquals(7, result);
    }

    @Test
    public void testCompare()
    {
//        Given
//      Calculator object is created before
//      each test in beforeTest method

//        When
        boolean result = calculator.compare(5, 7);

//        Then
        assertFalse(result);
    }

    @Test
    public void testIsCalcOn()
    {
//        Given
//      Calculator object is created before
//      each test in beforeTest method

//        When
        calculator.setTurnOn(true);
        boolean result = calculator.isTurnOn();

//        Then
        assertTrue(result);
    }
}
