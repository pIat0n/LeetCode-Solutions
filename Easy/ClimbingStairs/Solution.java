package Easy.ClimbingStairs;

public class Solution{
    public int climbStairs(int n){
        int fib1 = 1;
        int fib2 = 1;
        for (int i = 2; i <= n; i++){
            int temp = fib1;
            fib1 = fib2;
            fib2 += temp;
        }
        return fib2;
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            new Solution().climbStairs(2),
            new Solution().climbStairs(3));
    }
}
