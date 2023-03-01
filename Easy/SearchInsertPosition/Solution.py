class Solution:
    def searchInsert(nums, target):
        lo = 0
        hi = len(nums)
        while lo < hi:
            mid = (lo + hi) // 2
            if nums[mid] < target:
                lo = mid + 1
            else:
                hi = mid
        return lo


if __name__ == "__main__":
    print("Example 1: {}\nExample 2: {}\nExample 3: {}".format(
        Solution.searchInsert([1, 3, 5, 6], 5),
        Solution.searchInsert([1, 3, 5, 6], 2),
        Solution.searchInsert([1, 3, 5, 6], 7)))
