package Easy.LengthOfLastWord;

public class Solution{
    public int lengthOfLastWord(String s){
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public static void main(String[] args){
        System.out.printf("example 1: %d\nExample 2: %d\nExample 3: %d",
            new Solution().lengthOfLastWord("Hello World"),
            new Solution().lengthOfLastWord("   fly me   to   the moon  "),
            new Solution().lengthOfLastWord("luffy is still joyboy"));
    }
}
