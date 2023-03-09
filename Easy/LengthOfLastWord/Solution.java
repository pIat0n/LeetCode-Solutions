package Easy.LengthOfLastWord;

public class Solution{
    public static int lengthOfLastWord(String s){
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}
