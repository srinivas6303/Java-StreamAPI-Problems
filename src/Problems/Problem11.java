package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Multiple filter in a single stream
 */
public class Problem11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);

        ArrayList<Integer> al=list.stream()
                .filter(n->n>4)
                .filter(n->n%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Numbers greater than 4 and even: "+al);
    }
}
