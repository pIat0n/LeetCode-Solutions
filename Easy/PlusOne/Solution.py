class Solution:
    def plusOne(self, digits):
        a = str(int("".join(map(str, digits))) + 1)
        return [int(i) for i in a]
