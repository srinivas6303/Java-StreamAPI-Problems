package Problems;

import java.util.Arrays;
import java.util.List;

//Given a list of integers,
// how do you check whether it contains at least one prime number using Java 8 Streams?
public class Problem34 {

    public static  boolean isPrime(int num){
        if(num<2){
            return  false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(58, 60, 62, 63, 64, 65);

        boolean isContainPrime=numbers.stream()
                .anyMatch(Problem34::isPrime);

        System.out.println(isContainPrime);
    }
}
