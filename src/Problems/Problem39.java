package Problems;

import java.util.Arrays;
import java.util.List;

// sum of first 2 numbers
public class Problem39 {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(5,8,9,6,5,8);

//        int sum=numbers.stream()
//                .limit(2)
//                .reduce(0,(a,b)->a+b);

        int ans=numbers.stream()
                        .limit(2)
                                .mapToInt(Integer::intValue)
                                        .sum();

        System.out.println(ans);
    }
}
