package Problems;

import java.util.Arrays;
import java.util.List;

//sum of integers
public class Problem12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        int sum=list.stream()
                //.reduce(0,(a,b)->a+b);
                .reduce(Integer::sum)
                .orElse(0);

        System.out.println(sum);
    }
}
