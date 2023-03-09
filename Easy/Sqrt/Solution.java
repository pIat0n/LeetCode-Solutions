package Easy.Sqrt;

public class Solution {
    public static int mySqrt(int x){
        return (int) Math.pow(x, 0.5);
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            Solution.mySqrt(4),
            Solution.mySqrt(8));
    }
}
