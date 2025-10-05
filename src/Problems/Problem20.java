package Problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//generate even using stream and limit
public class Problem20 {
    public static void main(String[] args) {
        List<Integer> even= Stream.iterate(0,n->n+2)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(even);

    }
}
