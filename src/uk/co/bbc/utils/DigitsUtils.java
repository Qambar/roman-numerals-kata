package uk.co.bbc.utils;

public class DigitsUtils {
    public static LinkedList<Integer> convertNumberToReverseDigits(int num) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (num > 0) {
            stack.push( num % 10 );
            num = num / 10;
        }
        //reverse the stack
        Collections.reverse(stack);
        return stack;
    }
}