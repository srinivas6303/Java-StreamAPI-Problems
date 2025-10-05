package Problems;
//🧠 Problem: How do you check whether a string is a palindrome using Java 8 Streams (without reversing it)?
//A palindrome is a string that reads the same forwards and backwards — like "madam" or "level".

import java.util.stream.IntStream;

public class Problem36 {
    public static void main(String[] args) {
        String input="madam";

        boolean ans = IntStream.range(0,input.length()/2)
                .allMatch(i->input.charAt(i)==input.charAt(input.length()-1-i));

        System.out.println(ans);
    }
}
