package Easy.ValidParentheses;

public class Solution{
    public boolean isValid(String s){
        while (s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %b\nExample 2: %b\nExample 3: %b",
            new Solution().isValid("()"),
            new Solution().isValid("()[]{}"),
            new Solution().isValid("(]")); 
    }
}
