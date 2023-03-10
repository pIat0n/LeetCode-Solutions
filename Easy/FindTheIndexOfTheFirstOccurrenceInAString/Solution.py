class Solution:
    def strStr(self, haystack, needle):
        return haystack.find(needle)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution().strStr("sadbutsad", "sad"),
        Solution().strStr("leetcode", "leeto")))
