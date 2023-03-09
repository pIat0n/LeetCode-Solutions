package Easy.RemoveElement;

public class Solution{
    public static int removeElement(int[] nums, int val){
        int i = 0;
        for (int num = 0; num < nums.length; num++) if (nums[num] != val) nums[i++] = nums[num];
        return i;
    }
}
