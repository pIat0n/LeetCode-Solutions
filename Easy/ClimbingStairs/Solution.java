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
}
