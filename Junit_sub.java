package Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class Junit_sub {
    
    @Test
    public void testSubValidPositiveNumbers() {
        Calc calculator = new Calc();
        int result = calculator.sub(5, 2);
        assertEquals(3, result);
    }
    
    @Test
    public void testSubValidPositiveNumberToNegativeNumber() {
        Calc calculator = new Calc();
        int result = calculator.sub(5, -10);
        assertEquals(15, result);
    }
    
    @Test
    public void testSubValidNegativeNumbers() {
        Calc calculator = new Calc();
        int result = calculator.sub(-5, -2);
        assertEquals(-3, result);
    }
    
    @Test
    public void testSubValidNegativeNumberToPositiveNumber() {
        Calc calculator = new Calc();
        int result = calculator.sub(-5, 10);
        assertEquals(-15, result);
    }
    
    @Test
    public void testSubValidZeroAsInput() {
        Calc calculator = new Calc();
        int result = calculator.sub(0, 10);
        assertEquals(-10, result);
    }
    
    @Test
    public void testSubValidLargeNumbers() {
        Calc calculator = new Calc();
        int result = calculator.sub(2147483646, 2);
        assertEquals(2147483644, result);
    }
    
    @Test
    public void testSubValidSameInput() {
        Calc calculator = new Calc();
        int result = calculator.sub(5, 5);
        assertEquals(0, result);
    }
    
    @Test
    public void testSubInvalidInput() {
        Calc calculator = new Calc();
        int result = calculator.sub(Integer.MAX_VALUE, -2);
        assertNotEquals(Integer.MAX_VALUE, result);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubValidMinIntValue() {
        Calc calculator = new Calc();
        int result = calculator.sub(Integer.MIN_VALUE, 1);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testSubValidMaxIntValue() {
        Calc calculator = new Calc();
        int result = calculator.sub(Integer.MAX_VALUE, -1);
    }
    
    @Test(expected = NullPointerException.class)
    public void testSubNullInput() {
        Calc calculator = new Calc();
        Integer a = null;
        Integer b = null;
        int result = calculator.sub(a, b);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testSubInvalidStringInput() {
        Calc calculator = new Calc();
        String a = "not a number";
        String b = "10";
        int result = calculator.sub(Integer.parseInt(a), Integer.parseInt(b));
    }
    
}

