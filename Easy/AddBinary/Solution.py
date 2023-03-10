class Solution:
    def addBinary(self, a, b):
        return bin(int(a, 2) + int(b, 2))[2:]


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution().addBinary("11", "1"),
        Solution().addBinary("1010", "1011")))
