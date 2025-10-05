package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//find all palindrome string
public class Problem30 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("madam","java","level","hello");

        List<String> pal=list.stream()
                .filter(w->w.equals(new StringBuilder(w).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(pal);
    }
}
