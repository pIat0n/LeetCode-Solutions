class Solution:
    def plusOne(self, digits):
        a = str(int("".join(map(str, digits))) + 1)
        return [int(i) for i in a]


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        Solution().plusOne([1, 2, 3]),
        Solution().plusOne([4, 3, 2, 1]),
        Solution().plusOne([9])))
