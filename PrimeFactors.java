package misc;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors{
 
    public static void main(String args[]) {
 
        System.out.print(primeFactors(18));
    }
 
    public static List<Integer> primeFactors(long number) {
        List<Integer> primefactors = new ArrayList<>();
        
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                primefactors.add(i); 
                number /= i;
                i--;
            }
        }
        return primefactors;
    }
 
}
