package Easy.AddBinary;

import java.math.BigInteger;

public class Solution{
    public String addBinary(String a, String b){
        return new BigInteger(a, 2).add(new BigInteger(b, 2)).toString(2);
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %s\nExample 2: %s",
            new Solution().addBinary("11", "1"),
            new Solution().addBinary("1010", "1011"));
    }
}
