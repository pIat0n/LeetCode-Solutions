class Solution:
    def longestCommonPrefix(strs):
        for i, c in enumerate(min(strs)):
            if c != max(strs)[i]:
                return min(strs)[:i]
        return min(strs)
