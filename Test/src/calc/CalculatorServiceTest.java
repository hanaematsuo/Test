package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

    private Calculator calculator;
    private CalculatorService service;
    
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        service = new CalculatorService(calculator);
    }
    
    @Test
    public void testAddAndReport()  {
        assertEquals("Result: 5", service.addAndReport(2, 3));
    }
    
    @Test
    public void testSubtractAndReport() {
        assertEquals("Result: 1", service.subtractAndReport(3, 2));
    }

}
