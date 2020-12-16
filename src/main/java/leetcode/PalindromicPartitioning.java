package leetcode;

import java.util.*;

public class PalindromicPartitioning{
    static List<List<String>> result = new ArrayList<>();
    public static void main(String[] args){
        var test = "aab";
        System.out.println(getSolution(test));
    }

    private static List<List<String>> getSolution(String s){
        dfs(0, s, new ArrayList<>());
        return result;
    }

    private static void dfs(int index, String s, List<String> current){
       if(index == s.length()){
           result.add(new ArrayList<>(current));
           return;
       }

       for(int i = index; i< s.length();i++){
           if(isPalindrome(index, i, s)){
             var choice = s.substring(index, i+1);
             current.add(choice);
             dfs(index + 1, s, current);
             current.remove(current.size() - 1);
           }
       }
    }

    private static boolean isPalindrome(int left, int right, String s){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }    
}