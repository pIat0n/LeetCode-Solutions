from unittest import TestCase, main
from Solution import Solution

class SolutionTest(TestCase):
    def test_climbStairsTest(self):
        self.assertEquals(2, Solution.climbStairs(2))


    def test_climbStairsTest2(self):
        self.assertEquals(3, Solution.climbStairs(3))


    def test_climbStairsTest3(self):
        self.assertEquals(1134903170, Solution.climbStairs(44))


if __name__ == "__main__":
    main()
