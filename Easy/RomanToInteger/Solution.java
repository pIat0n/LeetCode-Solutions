package Easy.RomanToInteger;
import java.util.HashMap;

public class Solution{
    public static int romanToInt(String s){
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);roman.put('V', 5);roman.put('X', 10);roman.put('L', 50);roman.put('C', 100);roman.put('D', 500);roman.put('M', 1000);
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++){
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) count -= roman.get(s.charAt(i));
            else count += roman.get(s.charAt(i));
        }
        return count + roman.get(s.charAt(s.length() - 1));
    }


    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d\nExample 3: %d",
            Solution.romanToInt("III"),
            Solution.romanToInt("LVIII"),
            Solution.romanToInt("MCMXCIV"));
    }
}
