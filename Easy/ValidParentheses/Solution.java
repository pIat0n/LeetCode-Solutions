package Easy.ValidParentheses;

public class Solution{
    public static boolean isValid(String s){
        while (s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}
