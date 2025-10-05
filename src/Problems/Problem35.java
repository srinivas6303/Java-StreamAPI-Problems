package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//🧠 Problem: Given a list of strings,
// how do you filter only those strings that start with a digit using Java 8 Streams?
public class Problem35 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1Orange", "Banana", "2Papaya", "Grapes", "3Pineapple", "Cherry");

        List<String> startWithInteger = list.stream()
                .filter(s->!s.isEmpty() && Character.isDigit(s.charAt(0)))
                .collect(Collectors.toList());

        System.out.println(startWithInteger);
    }
}
