package Easy.PalindromeNumber;

public class Solution{
    public boolean isPalindrome(int x){
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %b\nExample 2: %b\nExample 3: %b",
            new Solution().isPalindrome(121),
            new Solution().isPalindrome(-121),
            new Solution().isPalindrome(10));
    }
}
