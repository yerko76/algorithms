package algoexpert.arrays;
import java.util.*;

public class ValidateSubsequence {
    public static void main(String[] args){
        List<Integer> array = List.of(5,1,22,25,6,-1,8,10);
        List<Integer> sequence = List.of(1,6,-1,10);
        //output true sequence --> [1,6,-1,10]
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int arrayIndex = 0;
        int sequenceIndex =0;
        while(arrayIndex < array.size() && sequenceIndex < sequence.size()){
            if(array.get(arrayIndex).equals(sequence.get(sequenceIndex))){
                sequenceIndex++;
            }
            arrayIndex++;
        }
        return sequenceIndex == sequence.size();
      }
    
}
