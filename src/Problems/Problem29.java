package Problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//find duplicates in a list
public class Problem29 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,2,1,4,5);

        Set<Integer> duplicates=list.stream()
                .filter(x-> Collections.frequency(list,x)>1)
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
