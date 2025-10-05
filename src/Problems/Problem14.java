package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Find all elements starts with 'A'
public class Problem14 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Avinash","Bhanu","mashesh","Anu");

        List<String> Alist=list.stream()
                                .filter(s->s.startsWith("A"))
                                .collect(Collectors.toList());

        System.out.println(Alist);
   }
}