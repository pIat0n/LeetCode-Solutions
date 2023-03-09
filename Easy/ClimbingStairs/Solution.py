class Solution:
    def climbStairs(n):
        if n <= 3: return n
        stack = list(range(4))
        for i in range(4, n + 1):
            stack.append(stack[i - 1] + stack[i - 2])
        return stack.pop()


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution.climbStairs(2),
        Solution.climbStairs(3)))
