package TDD_StingCal;
import org.junit.*;
import static org.junit.Assert.*;

public class JUnitCalculatorTest {
    @Test
    public void inputEmptyString(){
        assertEquals(0,JUnitCalculator.Add(""));
    }
    @Test
     public void returnnumfornum(){
        assertEquals(1,JUnitCalculator.Add("1"));
     }
     @Test
     public void sumof2numns(){
        assertEquals(3,JUnitCalculator.Add("1,2"));
     }
    
}