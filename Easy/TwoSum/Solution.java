package Easy.TwoSum;

import java.util.Arrays;

public class Solution{
    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        System.out.printf("Example 1: %s\nExample 2: %s\nExample 3: %s",
            Arrays.toString(Solution.twoSum(new int[]{2, 7, 11, 15}, 9)),
            Arrays.toString(Solution.twoSum(new int[]{3, 2, 4}, 6)),
            Arrays.toString(Solution.twoSum(new int[]{3, 3}, 6)));
    }
}
