package Easy.PlusOne;

import java.util.Arrays;

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

    public static void main(String[] args){
        System.out.printf("Example 1: %s\nExample 2: %s\nExample 3: %s",
            Arrays.toString(Solution.plusOne(new int[]{1, 2, 3})),
            Arrays.toString(Solution.plusOne(new int[]{4, 3, 2, 1})),
            Arrays.toString(Solution.plusOne(new int[]{9})));
    }
}
