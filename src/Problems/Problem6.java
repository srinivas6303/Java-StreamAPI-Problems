package Problems;

import java.util.Arrays;
import java.util.List;

/*
sum of the list of integers using reduce()
 */
public class Problem6 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);

        int sum=list.stream()
                .reduce(Integer::sum)
                .orElse(0);//.reduce(0,(a,b)->a+b);

        System.out.println(sum);
    }
}
