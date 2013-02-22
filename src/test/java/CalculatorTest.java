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
}
