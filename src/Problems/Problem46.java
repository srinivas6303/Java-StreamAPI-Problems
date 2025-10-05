package Problems;

import java.util.stream.Collectors;

//Problem: Check if a string has all unique characters using Java 8 Streams.
public class Problem46 {
    public static void main(String[] args) {
        String str="stream";

        boolean allUnique = str.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.toSet())
                .size()==str.length();

        System.out.println(allUnique);
    }
}
