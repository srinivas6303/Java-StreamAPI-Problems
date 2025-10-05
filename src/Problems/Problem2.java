package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
filter even numbers using stream
 */
public class Problem2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> evennumbers=list.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        evennumbers.forEach(System.out::println);
    }
}
