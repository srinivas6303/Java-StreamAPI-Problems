package Problems;

import java.util.Arrays;
import java.util.List;

//Average of list
public class Problem21 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40);

        double ans=list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(ans);

    }
}
