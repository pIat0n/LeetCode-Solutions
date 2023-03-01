class Solution:
    def removeDuplicates(nums):
        nums[:] = sorted(set(nums))
        return len(nums)


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}".format(
        Solution.removeDuplicates([1, 1, 2]),
        Solution.removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4])))
