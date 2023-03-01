class Solution(object):
    def lengthOfLastWord(s):
        return len(s.split()[-1])


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        Solution.lengthOfLastWord("Hello World"),
        Solution.lengthOfLastWord("   fly me   to   the moon  "),
        Solution.lengthOfLastWord("luffy is still joyboy")))
