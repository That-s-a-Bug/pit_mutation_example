package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        calculator.add(2);
        Assert.assertEquals(calculator.getResult(), 2);
    }

    @Test
    public void testPower() {
        Calculator calculator = new Calculator(2);
        calculator.power(3);
        Assert.assertEquals(calculator.getResult(), 8);
    }

    @Test
    public void testConditionalSetTrue() {
        Calculator calculator = new Calculator();
        Assert.assertTrue(calculator.tryToSetDisplay(2, true));
    }

    @Test
    public void testConditionalSetFalse() {
        Calculator calculator = new Calculator();
        Assert.assertFalse(calculator.tryToSetDisplay(3, false));
    }
}