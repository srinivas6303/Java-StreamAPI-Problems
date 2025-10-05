package Problems;

// Using Java 8 Streams, how do you find the first repeating character in a given string?
public class Problem43 {
    public static void main(String[] args) {
        String input = "repeating-characters";
        char ans= input.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->input.indexOf(ch)!=input.lastIndexOf(ch))
                .findFirst()
                .orElse('*');

        System.out.println(ans);

    }
}
