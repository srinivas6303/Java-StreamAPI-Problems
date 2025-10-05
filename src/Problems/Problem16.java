package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
convert nested list into single list
 */
public class Problem16 {
    public static void main(String[] args) {
        List<List<Integer>> multiList= Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10));

        System.out.println(multiList);

        List<Integer> singleList=multiList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(singleList);
    }
}
