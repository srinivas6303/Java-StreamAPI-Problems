package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//List contains multiple words,in each word first char covert into uppercase
public class Problem40 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "mango");

        List<String> ans = list.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.toList());

        ans.forEach(System.out::println);
    }
}