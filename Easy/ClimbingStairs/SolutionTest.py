from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_climbStairs(self):
        self.assertEqual(2, Solution().climbStairs(2))


    def test_climbStairs2(self):
        self.assertEqual(3, Solution().climbStairs(3))


    def test_climbStairs3(self):
        self.assertEqual(1134903170, Solution().climbStairs(44))


if __name__ == "__main__":
    main()
