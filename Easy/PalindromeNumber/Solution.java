package Easy.PalindromeNumber;

public class Solution{
    public static boolean isPalindrome(int x){
        return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
    }
}
