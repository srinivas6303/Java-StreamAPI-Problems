package Problems;

import java.util.Arrays;
import java.util.List;

/*
Print list using forEach and lambda expression
 */
public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);

        list.forEach(x->System.out.println(x));
    }
}
