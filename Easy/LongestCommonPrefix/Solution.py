class Solution(object):
    def longestCommonPrefix(self, strs):
        for i, c in enumerate(min(strs)):
            if c != max(strs)[i]:
                return min(strs)[:i]
        return min(strs)


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}".format(
        solution.longestCommonPrefix(["flower", "flow", "flight"]),
        solution.longestCommonPrefix(["dog", "racecar", "car"])))
