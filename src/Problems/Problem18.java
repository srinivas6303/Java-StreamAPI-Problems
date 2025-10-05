package Problems;

import java.util.Arrays;
import java.util.List;

//find second max value
public class Problem18 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,6,3,8);

        int max=list.stream()
                .sorted((a,b)->Integer.compare(b,a))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println("Second max value: "+max);

    }
}
