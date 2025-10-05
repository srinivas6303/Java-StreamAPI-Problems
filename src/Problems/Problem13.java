package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Return distinct values
public class Problem13 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,1,2,3,4);

        List<Integer> distinctlist=list.stream()
                                .distinct()
                                .collect(Collectors.toList());

        System.out.println(distinctlist);
   }
}