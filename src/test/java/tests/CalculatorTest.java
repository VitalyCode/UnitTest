package tests;

import CalculatorPackage.Calculate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private static Calculate calculate;
    @BeforeAll
    static void setUp(){
        calculate = new Calculate();
    }
    @Test
    public void testAdd_positiveNumbers(){
        int x = 2;
        int y= 3;
        final int result = calculate.add(x,y);
        Assertions.assertEquals(5,result);
    }
    @Test
    public void testAdd_negativeNumbers(){
        int x = -3;
        int y=  -7;
        final int result = calculate.add(x,y);
        Assertions.assertEquals(-10,result);
    }
    @Test
    public void testAdd_zeroArguments(){
        int x=  0;
        int y=  0;
        final int result = calculate.add(x,y);
        Assertions.assertEquals(0,result);
    }
    @Test
    public void testZero_Exeption(){
        int x = 10;
        int y= 0;
        final int result = calculate.zero_Exeption(x,y);
        Assertions.assertEquals(1,result);
    }
    @Test
    public void testConcatString(){
        String original = "Test String";
        String argument = null;
        final String result = calculate.string_Concat_Null(original,argument);
        Assertions.assertEquals("Test String",result);
    }
}
