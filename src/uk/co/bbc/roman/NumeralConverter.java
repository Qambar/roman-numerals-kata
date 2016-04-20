package uk.co.bbc.roman;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class NumeralConverter implements NumeralConverterInterface {
    private static final Map<Integer, String> decToRoman = new TreeMap<Integer,String>(Collections.reverseOrder());

    static
    {
        decToRoman.put(new Integer(1000), "M");
        decToRoman.put(new Integer(900), "CM");
        decToRoman.put(new Integer(500), "D");
        decToRoman.put(new Integer(400), "CD");
        decToRoman.put(new Integer(100), "C");
        decToRoman.put(new Integer(90), "XC");
        decToRoman.put(new Integer(50), "L");
        decToRoman.put(new Integer(40), "XL");
        decToRoman.put(new Integer(10), "X");
        decToRoman.put(new Integer(9), "IX");
        decToRoman.put(new Integer(5), "V");
        decToRoman.put(new Integer(4), "IV");
        decToRoman.put(new Integer(1), "I");
    }

    private StringBuilder result = new StringBuilder();
    /**
     * [generate generates a roman numeral between 1-3999]
     * @param  num [takes int as input ]
     * @return     [returns a String roman numeral]
     */
    public String convert(int num) {
        if (!isValid(num)) {
            throw new IllegalArgumentException();
        }

        for(Map.Entry<Integer, String> entrySet: decToRoman.entrySet()){

            while(num >= entrySet.getKey()){
                result.append(entrySet.getValue());
                num -= entrySet.getKey();
            }
        }

        return result.toString();
    }

    /**
     * [isValid checks the conditions for a valid input]
     * @param  num [int]
     * @return     [String]
     */
    private Boolean isValid(int num) {
        return num > 0 && num < 4000;
    }

}
