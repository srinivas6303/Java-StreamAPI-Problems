package Problems;

import java.util.Arrays;
import java.util.List;

//find first element greater than 10
public class Problem26 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,8,12,3,20);

        int val=list.stream()
                .filter(n->n>10)
                .findFirst()
                .orElse(0);

        System.out.println(val);
    }
}
