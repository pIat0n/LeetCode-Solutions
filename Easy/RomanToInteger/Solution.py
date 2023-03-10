class Solution:
    def romanToInt(self, s):
        roman = {"I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100, "D" : 500, "M" : 1000}
        count = 0
        for i in range(len(s) - 1):
            if roman[s[i]] < roman[s[i + 1]]:
                count -= roman[s[i]]
            else:
                count += roman[s[i]]
        return count + roman[s[-1]]


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        Solution().romanToInt("III"),
        Solution().romanToInt("LVIII"),
        Solution().romanToInt("MCMXCIV")))
