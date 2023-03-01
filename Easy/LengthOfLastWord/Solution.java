package Easy.LengthOfLastWord;

public class Solution{
    public static int lengthOfLastWord(String s){
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d\nExample 3: %d",
            Solution.lengthOfLastWord("Hello World"),
            Solution.lengthOfLastWord("   fly me   to   the moon  "),
            Solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
