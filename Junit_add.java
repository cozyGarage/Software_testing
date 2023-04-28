package Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class Junit_add {

    @Test
    public void testAddPositiveNumbers() {
        Calc calculator = new Calc();
        int result = calculator.add(5, 10);
        assertEquals(15, result);
    }
    
    @Test
    public void testAddNegativeNumbers() {
        Calc calculator = new Calc();
        int result = calculator.add(-5, -10);
        assertEquals(-15, result);
    }
    
    @Test
    public void testAddZeroToPositiveNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(0, 10);
        assertEquals(10, result);
    }
    
    @Test
    public void testAddZeroToNegativeNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(0, -10);
        assertEquals(-10, result);
    }
    
    @Test
    public void testAddPositiveNumberToNegativeNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(5, -10);
        assertEquals(-5, result);
    }
    
    @Test
    public void testAddNegativeNumberToPositiveNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(-5, 10);
        assertEquals(5, result);
    }
    
    @Test
    public void testAddMaxIntToPositiveNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(Integer.MAX_VALUE, 10);
        assertEquals(-2147483639, result);
    }
    
    @Test
    public void testAddMaxIntToNegativeNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(Integer.MAX_VALUE, -10);
        assertEquals(2147483637, result);
    }
    
    @Test
    public void testAddMinIntToPositiveNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(Integer.MIN_VALUE, 10);
        assertEquals(-2147483638, result);
    }
    
    @Test
    public void testAddMinIntToNegativeNumber() {
        Calc calculator = new Calc();
        int result = calculator.add(Integer.MIN_VALUE, -10);
        assertEquals(2147483638, result);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testAddInvalidStringInput() {
        Calc calculator = new Calc();
        int result = calculator.add(Integer.parseInt("not a number"), 5);
    }
    
    @Test(expected = NullPointerException.class)
    public void testSubNullInput() {
        Calc calculator = new Calc();
        Integer a = null;
        Integer b = null;
        calculator.add(a, b);
    }
}
