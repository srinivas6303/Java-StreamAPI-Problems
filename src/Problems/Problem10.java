package Problems;


//Find first non-repeated character in a string
public class Problem10 {
    public static void main(String[] args) {
        String str="swiss";

        Character ans=str.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->str.indexOf(ch)==str.lastIndexOf(ch))
                .findFirst()
                .orElse(null);

        System.out.println(ans);

    }
}
