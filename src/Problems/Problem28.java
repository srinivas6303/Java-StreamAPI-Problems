package Problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem28 {
    public static void main(String[] args) {
        List<Double> list= Stream.generate(Math::random)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
