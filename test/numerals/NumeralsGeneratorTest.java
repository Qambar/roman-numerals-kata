package numerals;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.bbc.roman.*;
import java.util.LinkedList;

public class NumeralsGeneratorTest {
	@Test
	public void testSingleDigit() {
		NumeralGenerator ng = new NumeralGenerator();
        assertEquals("Single Digit Test for 1", "I", ng.generate(1));
        assertEquals("Single Digit Test for 5", "V", ng.generate(5));
	}

    @Test
    public void testDoubleDigit() {
        NumeralGenerator ng = new NumeralGenerator();
        assertEquals("Double Digit Test for 10", "X", ng.generate(10));
    }

    @Test
    public void testLargestNumber() {
        NumeralGenerator ng = new NumeralGenerator();
        assertEquals("Largest Number Test for 3999", "MMMCMXCIX", ng.generate(3999));
    }
}
