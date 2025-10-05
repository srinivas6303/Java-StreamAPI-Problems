package Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Apple, Banana, Grapes, Blueberry -> [Apple, Banana, Grapes, Blueberry]
// - , between each word
// - [ at the beginning
// - ] at the end
public class Problem38 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Grapes", "Blueberry");

        String str=words.stream()
                .collect(Collectors.joining(", ","[","]"));

        System.out.println(str);
    }
}
