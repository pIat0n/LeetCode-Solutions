package Easy.RemoveDuplicatesFromSortedArray;

import java.util.LinkedHashSet;

public class Solution{
    public static int removeDuplicates(int[] nums){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num: nums) set.add(num);
        int i = 0;
        for (int s: set) nums[i++] = s; 
        return set.size();
    }
}
