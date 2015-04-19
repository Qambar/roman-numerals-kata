package uk.co.bbc.roman;

import java.util.Collections;
import java.util.LinkedList;
import org.apache.commons.lang3.StringUtils;
import uk.co.bbc.utils.DigitsUtils;

public class NumeralGenerator implements NumeralGeneratorInterface  {
    private String[] key = {
        "", "C", "CC","CCC","CD","D","DC","DCC","DCCC","CM",
        "","X","XX","XXX","XL","L","LX","LXX","LXXX","XC",
        "","I","II","III","IV","V","VI","VII","VIII","IX"
    };

    /**
     * [generate generates a roman numeral between 1-3999]
     * @param  num [takes int as input ]
     * @return     [returns a String roman numeral]
     */
    public String generate(int num) {
        if (!isValid(num)) {
            throw new IllegalArgumentException();
        }

        //Index for the keys
        int index                   = 0;

        //Return Result
        String result               = "";        

        //Numbers to reverse digitsStack linkedlist 
        LinkedList<Integer> digitsStack  = DigitsUtils.convertNumberToReverseDigits(num);
        
    
        int sizeOfKeyArray = key.length;
        int numberOfDigits = digitsStack.size();

        // This loop works for 1-999
        for (int i = 2; numberOfDigits > 0; i--, numberOfDigits--) {
            index = digitsStack.pop() + (i * 10);
            if ( index < sizeOfKeyArray && key[index] != null) {
                result =  key[index] + result;
                System.out.println("Letter: " + key[index]);
            }
        }

        //For thousands we put 'M'
        int thousands = digitsStack.pop();

        //We append it to the begining of the String
        result = StringUtils.repeat("M", thousands) + result;

        return result;
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
