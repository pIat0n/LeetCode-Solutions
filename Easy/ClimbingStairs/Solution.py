class Solution:
    def climbStairs(n):
        fib1 = fib2 = 1
        for _ in range(2, n + 1):
            fib1, fib2 = fib2, fib1 + fib2
        return fib2


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution.climbStairs(2),
        Solution.climbStairs(3)))
