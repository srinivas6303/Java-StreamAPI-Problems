package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//{1,2,3,4,5,6,7,8,9}
//separate even and odd numbers
public class Problem32 {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
//        Map<Boolean,List<Integer>> map=list.stream()
//                .collect(Collectors.partitioningBy(n->n%2==0));
//
//        System.out.println("even no: "+map.get(true));
//        System.out.println("odd no: "+map.get(false));

        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> ans=list.stream()
                .collect(Collectors.partitioningBy(n -> n%2 ==0,Collectors.toList()))
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(ans);


    }
}
