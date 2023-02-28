package Easy.LongestCommonPrefix;

public class Solution{
    public static String longestCommonPrefix(String[] strs){
        for (int i = 0; i < strs[0].length(); i++){
            for (int c = 1; c < strs.length; c++){
                if (i == strs[c].length() || strs[c].charAt(i) != strs[0].charAt(i)) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }


    public static void main(String[] args){
        System.out.printf("Example 1: %s\nExample 2: %s",
            Solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}),
            Solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }
}
