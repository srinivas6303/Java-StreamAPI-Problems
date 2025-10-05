package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Group strings based on string length
 */
public class Problem5 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","graphs","mango");

        Map<Integer,List<String>> grouplist=list.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouplist);
    }
}
