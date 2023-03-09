class Solution:
    def plusOne(digits):
        a = str(int("".join(map(str, digits))) + 1)
        return [int(i) for i in a]
