package Problems;
//frequency of each word in a sentence

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem23 {
    public static void main(String[] args) {
        String str="java is fun and java is powerful";

        Map<String,Long> map= Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(n->n,Collectors.counting()));

        for(String x: map.keySet()){
            System.out.println(x+" -> "+map.get(x));
        }
    }
}
