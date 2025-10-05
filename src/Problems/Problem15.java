package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// sort  a list of strings alphabetically and in reverse order
public class Problem15 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("srinivas","vamshi","mahesh","Anu");

        List<String> ls=list.stream()
                                .sorted((a,b)->b.compareTo(a))
                                .collect(Collectors.toList());

        System.out.println(ls);
   }
}