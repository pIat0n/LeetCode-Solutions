package Easy.Sqrt;

public class Solution{
    public int mySqrt(int x){
        return (int) Math.pow(x, 0.5);
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            new Solution().mySqrt(4),
            new Solution().mySqrt(8));
    }
}
