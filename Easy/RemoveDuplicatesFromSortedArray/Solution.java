package Easy.RemoveDuplicatesFromSortedArray;

import java.util.LinkedHashSet;

public class Solution{
    public int removeDuplicates(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num: nums) set.add(num);
        int i = 0;
        for (int s: set) nums[i++] = s; 
        return set.size();
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %d\nExample 2: %d",
            new Solution().removeDuplicates(new int[]{1, 1, 2}),
            new Solution().removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
