package Calculators;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by syono on 2016-10-08.
 */
public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator("hi junit");
    }

    @Test
    public void sum() throws Exception {
        assertEquals(777, Calculator.staticSum(666, 111));
    }

    @Test
    public void staticSum() throws Exception {
        assertEquals(777, calc.sum(666, 111));
    }

}