package problems.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        var test =  "(((((())))))";
        System.out.println(getSolution(test));
    }

    private static boolean getSolution(String test){
        Map<Character,Character> mapping = getMapping();
        Stack<Character> stack = new Stack<>();
        char[] letters = test.toCharArray();

        for(Character letter : letters){
            if(mapping.containsKey(letter)){
                char element = stack.empty() ? 'X' : stack.pop();
                if(element  != mapping.get(letter)){
                    return false;
                }
            }else{
                stack.push(letter);
            }
        }
        return stack.isEmpty();
    }

    private static Map<Character, Character> getMapping(){
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');
        return mapping;
    }
    
}
