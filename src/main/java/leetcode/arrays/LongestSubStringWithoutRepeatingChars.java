package leetcode.arrays;

import java.util.Set;
import java.util.HashSet;


/**
 * Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Example 4:
Input: s = ""
Output: 0
 */
public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args){
        var test = "abcabcbb";
        System.out.println(getSolution(test));
    }

    private static int getSolution(String s){
        int n = s.length();
        int maxLenght = 0;
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxLenght = Math.max(maxLenght, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLenght;
    }
}
