package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//merge two lists into single list
public class Problem25 {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4);
        List<Integer> l2= Arrays.asList(5,6,7,8);

//        List<Integer> mergedList= Stream.of(l1,l2)
//                .flatMap(List::stream)
//                .collect(Collectors.toList());

        List<Integer> mergedList= Stream.concat(l1.stream(), l2.stream())
                .collect(Collectors.toList());

        System.out.println(mergedList);
    }
}
