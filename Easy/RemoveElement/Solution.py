class Solution(object):
    def removeElement(self, nums, val):
        while val in nums:
            nums.remove(val)
        return len(nums)


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}".format(
        solution.removeElement([3, 2, 2, 3], 3),
        solution.removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2)))
