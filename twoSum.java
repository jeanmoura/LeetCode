//https://leetcode.com/problems/two-sum/

public class Solution {
    public int[] twoSum(int[] nums, int target) {   
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (target == nums[j] + nums[j-i]) {
                    return new int[]{j-i, j};
                }
            }
        }
        return null;
    }    
}
