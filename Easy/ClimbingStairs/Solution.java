package Easy.ClimbingStairs;
import java.util.Stack;

public class Solution {
    public static int climbStairs(int n){
        if (n <= 3) return n;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 3; i++) stack.add(i);
        for (int i = 4; i <= n; i++) stack.add(stack.get(i - 1) + stack.get(i - 2));
        return stack.pop(); 
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            Solution.climbStairs(2),
            Solution.climbStairs(3));
    }
}
