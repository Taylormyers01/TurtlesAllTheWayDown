import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {

    @Test
    public void testFact(){
        int expected = 120;
        int actual = Turtles.factorial(5);

        assertEquals(expected, actual);
    }

    @Test
    public void testGCD(){
        int expected = 24;
        int actual = Turtles.gcd(1440, 408);

        assertEquals(expected, actual);
    }


}