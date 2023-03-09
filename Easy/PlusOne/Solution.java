package Easy.PlusOne;

public class Solution{
    public static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--){
            if (++digits[i] != 10) return digits;
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
