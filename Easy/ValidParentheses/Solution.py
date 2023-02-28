class Solution(object):
    def isValid(self, s):
        stack = []
        brackets = {"(" : ")", "{" : "}", "[" : "]"}
        for c in s:
            if brackets.__contains__(c):
                stack.append(c)
            elif len(stack) == 0 or brackets[stack[-1]] != c:
                return False
            else:
                stack.pop()
        return len(stack) == 0


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        solution.isValid("()"),
        solution.isValid("()[]{}"),
        solution.isValid("(]")))
