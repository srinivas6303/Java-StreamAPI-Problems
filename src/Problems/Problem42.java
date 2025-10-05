package Problems;

import java.util.Arrays;

//Using Java 8 Streams, how do you extract all words from a sentence that contain exactly K vowels?
public class Problem42 {
    public  static  long countVowels(String str){
        return str.chars()
                .mapToObj(ch->(char) ch)
                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }

    public static void main(String[] args) {
        String sentence = "Why only half? Because we compare characters from both ends, no need to go full length.";
        int k=3;

        // each word vowels count
//       Arrays.stream(sentence.split(" "))
//                .forEach(str->System.out.println(str+" -> "+countVowels(str)));

        // In each word equals to k
        Arrays.stream(sentence.split(" "))
                .filter(word->countVowels(word)==k)
                .forEach(System.out::println);

    }
}
