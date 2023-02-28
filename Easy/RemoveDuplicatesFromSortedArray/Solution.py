class Solution(object):
    def removeDuplicates(self, nums):
        nums[:] = sorted(set(nums))
        return len(nums)


if __name__ == "__main__":
    solution = Solution()
    print("Example 1: {}\nExample 2: {}".format(
        solution.removeDuplicates([1, 1, 2]),
        solution.removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4])))
