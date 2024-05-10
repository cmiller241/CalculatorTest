package harnessio;

import org.junit.jupiter.api.Test;  
import static org.junit.jupiter.api.Assertions.*;  
  
public class CalculatorTest {  
    private Calculator calculator = new Calculator();  
  
    @Test  
    public void testAdd() {  
        int result = calculator.add(2, 3);  
        assertEquals(5, result);  
    }  
  
    @Test  
    public void testSubtract() {  
        int result = calculator.subtract(5, 3);  
        assertEquals(2, result);  
    }  
  
    @Test  
    public void testMultiply() {  
        int result = calculator.multiply(2, 3);  
        assertEquals(6, result);  
    }  
  
    @Test  
    public void testDivide() {  
        int result = calculator.divide(6, 3);  
        assertEquals(2, result);  
    }  
  
    @Test  
    public void testDivideByZero() {  
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(6, 0));  
    }  
}  