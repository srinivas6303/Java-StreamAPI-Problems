package Problems;

import java.util.*;
public class Problem41 {
    public static void main(String[] args) {
        List<Integer> uniqueNumbers = Arrays.asList(23, 45, 23, 15, 15, 78, 23, 85, 65);

        int sum=uniqueNumbers.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

//        int sum=uniqueNumbers.stream()
//                        .distinct()
//                                .reduce(0,(a,b)->a+b);

        System.out.println(sum);
    }
}
