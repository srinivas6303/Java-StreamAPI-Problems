package Problems;

import java.util.Arrays;
import java.util.List;

//Longest word in a list
public class Problem24 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","date","cherry");

        String longestWord=list.stream()
                .max((a,b)->Integer.compare(a.length(),b.length()))
                .orElse(null);

        System.out.println(longestWord);
    }
}
