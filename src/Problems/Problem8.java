package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
concatenate strings using joining
 */
public class Problem8 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("I","Love","Java");

        String str=list.stream()
                .collect(Collectors.joining(" "));

        System.out.println(str);
    }
}
