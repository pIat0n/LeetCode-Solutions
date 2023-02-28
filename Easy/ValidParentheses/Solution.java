package Easy.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class Solution{
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');brackets.put('{', '}');brackets.put('[', ']');
        for (char c: s.toCharArray()){
            if (brackets.containsKey(c)) stack.push(c);
            else if (stack.isEmpty() || brackets.get(stack.lastElement()) != c) return false;
            else stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %b\nExample 2: %b\nExample 3: %b",
            Solution.isValid("()"),
            Solution.isValid("()[]{}"),
            Solution.isValid("(]"));
    }
}
