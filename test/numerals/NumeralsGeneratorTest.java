package numerals;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.bbc.roman.NumeralGenerator;
import uk.co.bbc.roman.NumeralGeneratorInterface;

public class NumeralsGeneratorTest {
    NumeralGeneratorInterface numeralGeneratorTest = new NumeralGenerator();

    @Test(expected = IllegalArgumentException.class)
    public void itThrowsException() {
        numeralGeneratorTest.generate(-2);
    }

    @Test
    public void itReturnsOne() {
        assertEquals("Single Digit Test for 1", "I", numeralGeneratorTest.generate(1));
    }

    @Test
    public void itReturnsTwo() {
        assertEquals("Single Digit Test for 2", "II", numeralGeneratorTest.generate(2));
    }

    @Test
    public void itReturns() {
        assertEquals("Single Digit Test for 3", "III", numeralGeneratorTest.generate(3));
    }

    @Test
    public void itReturnsTen() {
        assertEquals("Double Digit Test for 10", "X", numeralGeneratorTest.generate(10));
    }

    @Test
    public void itReturns3999() {
        assertEquals("Largest Number Test for 3999", "MMMCMXCIX", numeralGeneratorTest.generate(3999));
    }
}
