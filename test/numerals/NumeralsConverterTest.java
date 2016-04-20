package numerals;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.co.bbc.roman.NumeralConverter;
import uk.co.bbc.roman.NumeralConverterInterface;

public class NumeralsConverterTest {
    NumeralConverterInterface numeralConverterTest = new NumeralConverter();

    @Test(expected = IllegalArgumentException.class)
    public void itThrowsException() {
        numeralConverterTest.convert(-2);
    }

    @Test
    public void itReturnsOne() {
        assertEquals("Single Digit Test for 1", "I", numeralConverterTest.convert(1));
    }

    @Test
    public void itReturnsTwo() {
        assertEquals("Single Digit Test for 2", "II", numeralConverterTest.convert(2));
    }

    @Test
    public void itReturns() {
        assertEquals("Single Digit Test for 3", "III", numeralConverterTest.convert(3));
    }

    @Test
    public void itReturnsTen() {
        assertEquals("Double Digit Test for 10", "X", numeralConverterTest.convert(10));
    }

    @Test
    public void itReturns3999() {
        assertEquals("Largest Number Test for 3999", "MMMCMXCIX", numeralConverterTest.convert(3999));
    }
}
