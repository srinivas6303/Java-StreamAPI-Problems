package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
convert strings into uppercase
 */
public class Problem4 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","graphs");

        ArrayList<String> upperList=list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));

        upperList.forEach(System.out::println);
    }
}
