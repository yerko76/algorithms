package algoexpert.recursion;

import java.util.ArrayList;
import java.util.List;

public class ProductSum {
    public static void main(String[] args){
        List<Object> array = List.of(5,2,List.of(7,-1),3,
        List.of(6,List.of(-13,8), 4)
        );
        
        System.out.println(getSolution(array));
    }

    private static int getSolution(List<Object> array){
        return helper(array, 1);
    }

    private static int helper(List<Object> array, int multiplier){
        int sum = 0;
        for(Object element : array){
            if(element instanceof ArrayList){
                List<Object> ls = (ArrayList<Object>) element;
                sum+= helper(ls, multiplier + 1);
            }else{
                sum+= (int) element;
            }
        }
        return sum * multiplier;
    }
}
