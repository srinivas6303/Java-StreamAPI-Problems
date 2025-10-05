package Problems;
// How can you find the 3rd largest element from an integer array using Java 8 Streams?
// {12, 4, 3, 1, 9, 657} -> 9

import java.util.Arrays;

public class Problem37 {
    public static void main(String[] args) {
//        List<Integer> list= Arrays.asList(12, 4, 3, 1, 9, 657);
//
//        int ans=list.stream()
//                .sorted((a,b)->Integer.compare(b,a))
//                .distinct()
//                .skip(2)
//                .findFirst()
//                .orElse(0);
//
//        System.out.println(ans);

        int arr[]={12, 4, 3, 1, 9, 657};
        int i=3;

        int ans= Arrays.stream(arr)
                .boxed()
                .sorted((a,b)->Integer.compare(b,a))
                .skip(i-1)
                .findFirst()
                .orElse(0);

        System.out.println(ans);
    }
}
