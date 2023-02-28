class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        solution.twoSum([2, 7, 11, 15], 9),
        solution.twoSum([3, 2, 4], 6),
        solution.twoSum([3, 3], 6)))
