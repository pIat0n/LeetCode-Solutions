package Easy.RemoveElement;

public class Solution{
    public int removeElement(int[] nums, int val){
        int i = 0;
        for (int num = 0; num < nums.length; num++) if (nums[num] != val) nums[i++] = nums[num];
        return i;
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            new Solution().removeElement(new int[]{3, 2, 2, 3}, 3),
            new Solution().removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
