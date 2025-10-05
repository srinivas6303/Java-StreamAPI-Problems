package Problems;

import java.util.Arrays;
import java.util.List;

//find small element in a list
public class Problem27 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,8,12,3,20);

        int minVal=list.stream()
                .min((a,b)->Integer.compare(a,b))
                .orElse(0);

        System.out.println(minVal);
    }
}
