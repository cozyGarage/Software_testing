package Calculator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class Junit_rec {

    @Test
    public void testCalculateRectangleAreaWithPositiveValues() {
        Calc calc = new Calc();
        int result = calc.calculateRectangleArea(3, 4);
        assertEquals(12, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateRectangleAreaWithZero() {
        Calc calc = new Calc();
        int result = calc.calculateRectangleArea(3, 0);
    }

    @Test
    public void testCalculateRectangleAreaWithNegativeValues() {
        Calc calc = new Calc();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(-3, 4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(3, -4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(-3, -4);
        });
    }
    
    @Test
    public void testCalculateRectangleAreaWithSmallValues() {
        Calc calc = new Calc();
        int result = calc.calculateRectangleArea(1, 1);
        assertEquals(1, result);
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(1, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(0, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(0, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(-1, 1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateRectangleArea(1, -1);
        });
    }
}
