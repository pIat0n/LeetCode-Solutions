class Solution:
    def longestCommonPrefix(strs):
        for i, c in enumerate(min(strs)):
            if c != max(strs)[i]:
                return min(strs)[:i]
        return min(strs)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution.longestCommonPrefix(["flower", "flow", "flight"]),
        Solution.longestCommonPrefix(["dog", "racecar", "car"])))
