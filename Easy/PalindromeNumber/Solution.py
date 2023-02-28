class Solution(object):
    def isPalindrome(self, x):
        return str(x) == str(x)[::-1]


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        solution.isPalindrome(121),
        solution.isPalindrome(-121),
        solution.isPalindrome(10)))
