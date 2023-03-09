from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_longestCommonPrefix(self):
        self.assertEqual("fl", Solution().longestCommonPrefix(["flower", "flow", "flight"]))


    def test_longestCommonPrefix2(self):
        self.assertEqual("", Solution().longestCommonPrefix(["dog", "racecar", "car"]))


if __name__ == "__main__":
    main()
