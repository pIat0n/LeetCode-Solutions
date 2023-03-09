from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_addBinary(self):
        self.assertEqual("100", Solution().addBinary("11", "1"))


    def test_addBinary2(self):
        self.assertEqual("10101", Solution().addBinary("1010", "1011"))


if __name__ == "__main__":
    main()
