import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testAddNegativeNumbers() {
        Calc calc = new Calc();
        int result = calc.add(-2, -3);
        assertEquals(-5, result);
    }
    
    @Test
    public void testAddZero() {
        Calc calc = new Calc();
        int result = calc.add(0, 0);
        assertEquals(0, result);
    }
    
    @Test
    public void testAddLargeNumbers() {
        Calc calc = new Calc();
        int result = calc.add(1000000, 2000000);
        assertEquals(3000000, result);
    }
}
