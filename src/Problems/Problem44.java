package Problems;
//Question: Generate Summary Statistics of a List
//🧠 Problem:
// Using Java 8 Streams, how do you quickly find minimum,
// maximum, sum, average, and count of numbers in a list without writing separate loops?

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Problem44 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 7);
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Max value: "+stats.getMax());
        System.out.println("Min value: "+stats.getMin());
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Count : "+stats.getCount());
    }
}
