package Problems;

import java.util.Arrays;
import java.util.List;

//Find the 3rd Longest Word in a List
public class Problem45 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "mango", "kiwi");
        String ans=words.stream()
                .sorted((w1,w2)->Integer.compare(w2.length(),w1.length()))
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println(ans);
    }
}
