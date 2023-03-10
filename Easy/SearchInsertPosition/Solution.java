package Easy.SearchInsertPosition;

public class Solution{
    public int searchInsert(int[] nums, int target){
        int lo = 0;
        int hi = nums.length;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d\nExample 3: %d",
            new Solution().searchInsert(new int[]{1, 3, 5, 6}, 5),
            new Solution().searchInsert(new int[]{1, 3, 5, 6}, 2),
            new Solution().searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
