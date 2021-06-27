package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator testee;

    @Before
    public void setUp() {
        testee = new Calculator();
    }

    @Test
    public void testSummeZweiPositiveIsOk() {
        assertTrue(testee.summe(10, 25) == 35);
    }

    @Test
    public void testSummeZweiNegativeIsOk() {
        assertTrue(testee.summe(-10, -25) == -35);
    }

    @Test
    public void testSummePositivNegativIsOk() {
        assertTrue(testee.summe(10, -25) == -15);
    }

    @Test
    public void testSummePositivNullIsOk() {
        assertTrue(testee.summe(10, 0) == 10);
    }

    @Test
    public void testSummeNegativNullIsOk() {
        assertTrue(testee.summe(-10, 0) == -10);
    }

    @Test
    public void testSummeMaxNullIsOk() {
        assertTrue(testee.summe(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
    }

    @Test
    public void testSummeEinsMaxIsOk() {
        assertTrue(testee.summe(1, Integer.MAX_VALUE) == Integer.MIN_VALUE);
    }

    @Test
    public void testSummeEinsMinIsOk() {
        assertTrue(testee.summe(-1, Integer.MIN_VALUE) == Integer.MAX_VALUE);
    }

    @Test
    public void testSubtractionZweiPositiveIsOk() {
        assertTrue(testee.subtraktion(25, 10) == 15);
    }

    @Test
    public void testSubtractionZweiNegativeIsOk() {
        assertTrue(testee.subtraktion(-25, -10) == -15);
    }

    @Test
    public void testSubtractionPositivNegativIsOk() {
        assertTrue(testee.subtraktion(10, -25) == 35);
    }

    @Test
    public void testSubtractionPositivNullIsOk() {
        assertTrue(testee.subtraktion(10, 0) == 10);
    }

    @Test
    public void testSubtractionNegativNullIsOk() {
        assertTrue(testee.subtraktion(-10, 0) == -10);
    }

    @Test
    public void testSubtractionMaxNNullIsOk() {
        assertTrue(testee.subtraktion(Integer.MAX_VALUE, 0) == Integer.MAX_VALUE);
    }

    @Test
    public void testSubtractionEinsMaxIsOk() {
        assertTrue(testee.subtraktion(-1, Integer.MAX_VALUE) == Integer.MIN_VALUE);
    }

    @Test
    public void testSubtractionMinEinsIsOk() {
        assertTrue(testee.subtraktion(Integer.MIN_VALUE, 1) == Integer.MAX_VALUE);
    }

    @Test
    public void testDivisionZweiPositiveIsOk()
            throws ArithmeticException {
        testee.division(10, 2);
    }

    @Test
    public void testDivisionZweiNegativeIsOk() {
        assertTrue(testee.division(-10, -2) == 5);
    }

    @Test
    public void testDivisionPositivNegativIsOk() {
        assertTrue(testee.division(10, -2) == -5);
    }

    @Test
    public void testDivisionMaxPositivIsOk()
            throws ArithmeticException {
        testee.division(Integer.MAX_VALUE, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPositivNullIsNotOk() {
        testee.division(10, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionNegativNullIsNotOk() {
        testee.division(-10, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionMaxNullIsNotOk() {
        testee.division(Integer.MAX_VALUE, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionMinNullIsNotOk() {
        testee.division(Integer.MIN_VALUE, 0);
    }

}