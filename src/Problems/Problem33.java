package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Given a list of integers (which may contain null),
// filter out all the numbers that start with digit '1'.

//Input: (123, null, null, 345, 765, 1876, 90, 100)
//Output: [123, 1876, 100]
public class Problem33 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(123, null, null, 345, 765, 1876, 90, 100);

        List<Integer> startingWithOne = list.stream()
                .filter(num -> num!=null && String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(startingWithOne);
    }
}
