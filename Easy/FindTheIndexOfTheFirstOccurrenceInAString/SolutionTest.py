from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_strStr(self):
        self.assertEqual(0, Solution().strStr("sadbutsad", "sad"))


    def test_strStr2(self):
        self.assertEqual(-1, Solution().strStr("leetcode", "leeto"))


if __name__ == "__main__":
    main()
