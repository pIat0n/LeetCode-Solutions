from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_strStrTest(self):
        self.assertEquals(0, Solution.strStr("sadbutsad", "sad"))


    def test_strStrTest2(self):
        self.assertEquals(-1, Solution.strStr("leetcode", "leeto"))


if __name__ == "__main__":
    main()
