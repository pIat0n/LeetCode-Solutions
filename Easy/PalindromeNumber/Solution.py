class Solution:
    def isPalindrome(x):
        return str(x) == str(x)[::-1]


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        Solution.isPalindrome(121),
        Solution.isPalindrome(-121),
        Solution.isPalindrome(10)))
