class Solution:
    def removeElement(self, nums, val):
        while val in nums:
            nums.remove(val)
        return len(nums)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution().removeElement([3, 2, 2, 3], 3),
        Solution().removeElement([0, 1, 2, 2, 3, 0, 4, 2], 2)))
