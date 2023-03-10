class Solution:
    def mySqrt(self, x):
        return int(x ** 0.5)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution().mySqrt(4),
        Solution().mySqrt(8)))
