class Solution(object):
    def isValid(self, s):
        while "()" in s or "{}" in s or "[]" in s:
            s = s.replace("()", "")
            s = s.replace("{}", "")
            s = s.replace("[]", "")
        return 0 == len(s)


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        solution.isValid("()"),
        solution.isValid("()[]{}"),
        solution.isValid("(]")))
