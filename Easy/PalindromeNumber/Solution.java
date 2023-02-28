package Easy.PalindromeNumber;

public class Solution{
    public static boolean isPalindrome(int x){
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }


    public static void main(String[] args){
        System.out.printf("Example 1: %b\nExample 2: %b\nExample 3: %b",
            Solution.isPalindrome(121),
            Solution.isPalindrome(-121),
            Solution.isPalindrome(10));
    }
}
