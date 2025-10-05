package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
frequency of words
 */
public class Problem7 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","graphs","mango","apple");

        Map<String,Long> freq=list.stream()
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));

        for(String x:freq.keySet()){
            System.out.println(x+" -> "+freq.get(x));
        }
    }
}
