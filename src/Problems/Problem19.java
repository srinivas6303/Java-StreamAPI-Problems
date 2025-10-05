package Problems;


import java.util.Map;
import java.util.stream.Collectors;

//count the frequency of character in a string
public class Problem19 {
    public static void main(String[] args) {
        String str="java";

        Map<Character,Long> map=str.chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors.groupingBy(ch->ch, Collectors.counting()));

        for(char c:map.keySet()){
            System.out.println(c+" -> "+map.get(c));
        }
    }
}
