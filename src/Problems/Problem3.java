package Problems;

import java.util.Arrays;
import java.util.List;

/*
Find max value using stream
 */
public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,6,7,8,10,2);

        int maxval=list.stream()
                .min(Integer::compare)
                .orElse(0);
//        int maxval=list.stream()
//                .max((a,b)->Integer.compare(a,b))
//                .orElse(0);

        System.out.println(maxval);
    }
}
