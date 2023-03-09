from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_lengthOfLastWord(self):
        self.assertEqual(5, Solution().lengthOfLastWord("Hello World"))


    def test_lengthOfLastWord2(self):
        self.assertEqual(4, Solution().lengthOfLastWord("   fly me   to   the moon  "))


    def test_lengthOfLastWord3(self):
        self.assertEqual(6, Solution().lengthOfLastWord("luffy is still joyboy"))


if __name__ == "__main__":
    main()
