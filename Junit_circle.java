package Calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Junit_circle {
    
    private Calc calc;
    
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        // code to run once before all tests
    }
    
    @AfterAll
    static void tearDownAfterClass() throws Exception {
        // code to run once after all tests
    }
    
    @BeforeEach
    void setUp() throws Exception {
        calc = new Calc();
        // code to run before each test
    }
    
    @AfterEach
    void tearDown() throws Exception {
        // code to run after each test
    }
    
    @Test
    public void testCalculateCircleCircumferenceWithPositiveDiameter() {
        double result = calc.calculateCircleCircumference(4.5);
        assertEquals(14.137, result, 0.001);
    }
    
    @Test
    public void testCalculateCircleCircumferenceWithZeroDiameter() {
        double result = calc.calculateCircleCircumference(0);
        assertEquals(0, result, 0.001);
    }
    
    @Test
    public void testCalculateCircleCircumferenceWithNegativeDiameter() {
        double result = calc.calculateCircleCircumference(-2.3);
        assertEquals(0, result, 0.001);
    }
}

