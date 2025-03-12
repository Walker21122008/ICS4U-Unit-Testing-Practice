package testing;
// src/MyMathTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {

    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3));
    }

    @Test
    public void subtract_largerFromSmaller_returnsNegative() {
        assertEquals(-2, MyMath.subtract(3, 5));
    }

    @Test
    public void add_zeroAndPositiveNumber_returnsSameNumber() {
        assertEquals(5, MyMath.add(5, 0));
    }

    @Test
    public void add_twoPositiveNumbers_returnsSum() {
        assertEquals(7, MyMath.add(3, 4));
    }

    @Test
    public void subtract_negativeAndPositive_returnsCorrectResult() {
        assertEquals(-3, MyMath.subtract(-1, 2));
    }


    
}
