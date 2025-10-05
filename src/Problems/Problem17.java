package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//group even and odd numbers using partitioningBy
public class Problem17 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,List<Integer>> map=list.stream()
                .collect(Collectors.partitioningBy(n ->n%2==0));

        System.out.println("Even number: "+map.get(true));
        System.out.println("Odd number: "+map.get(false));
    }
}
