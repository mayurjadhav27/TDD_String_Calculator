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
     
    @Test
    public void multiplenums(){
	   assertEquals(10,JUnitCalculator.Add("1,2,3,4"));
    }
    
    @Test
    public void handleNewLineInNum(){
	   assertEquals(11,JUnitCalculator.Add("1\n2,3,5"));
    }
    
    @Test
    public void differentdelimiter(){
	   assertEquals(6,JUnitCalculator.Add("//;\n1;2;3"));
    }
    @Test
    public void exceptionForNegNum(){
    	try {
			JUnitCalculator.Add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals("Negatives not allowed: -1", "Negatives not allowed: -1");
		}

		try {
			JUnitCalculator.Add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals("Negatives not allowed: -4,-5", "Negatives not allowed: -4,-5");
		}
    }
    @Test
    public void numsOverThousand(){
        try{
    	assertEquals(2, JUnitCalculator.Add("2,1001"));
        JUnitCalculator.Add("2,-4,3,-5");
    }
    catch(IllegalArgumentException e){
        
			assertEquals("Negatives not allowed: -4,-5", "Negatives not allowed: -4,-5");
    }
}
  

}
