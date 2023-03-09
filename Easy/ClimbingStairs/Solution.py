class Solution:
    def climbStairs(n):
        fib1 = fib2 = 1
        for _ in range(2, n + 1):
            fib1, fib2 = fib2, fib1 + fib2
        return fib2
