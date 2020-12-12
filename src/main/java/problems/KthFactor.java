package problems;
import java.util.*;

public class KthFactor {
    public static void main(String[] args){
        int n = 4;
        int k = 4;
        System.out.println(getResult(n, k));
    }

    private static int getResult(int n, int k){
        if(k>n) return -1;
        List<Integer> factors = new ArrayList<Integer>();
        for(int i=1; i<=n;i++){
            if(n % i == 0) factors.add(i);
        }
        if(factors.size()<k) return -1;
       return factors.get(k-1);
    }
    
}
