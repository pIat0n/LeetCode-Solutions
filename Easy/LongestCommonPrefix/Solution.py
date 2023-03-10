class Solution:
    def longestCommonPrefix(self, strs):
        for i, c in enumerate(min(strs)):
            if c != max(strs)[i]:
                return min(strs)[:i]
        return min(strs)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\n".format(
        Solution().longestCommonPrefix(["flower", "flow", "flight"]),
        Solution().longestCommonPrefix(["dog", "racecar", "car"])  
    ))
