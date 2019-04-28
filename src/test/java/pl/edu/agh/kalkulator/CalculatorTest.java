package pl.edu.agh.kalkulator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
      Calculator calc = new Calculator();

      assertEquals(11, calc.sum(5,6));

    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
  
        assertEquals(4, calc.subtract(10,6));
  
      }


    
    //   @Test()
    //   public void testDivideByZero() {
    //       Calculator calc = new Calculator();
    
    //       calc.div(5,0);
    
    //     }

}
