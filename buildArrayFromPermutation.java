/*Given a zero-based permutation nums (0-indexed), build an array ans
of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length 
and return it.

A zero-based permutation nums is an array of distinct integers 
from 0 to nums.length - 1 (inclusive).
*/


public class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        //Creating the new array ans:
        
        int [] ans = new int[n];

        // A for to traverse the array nums, for the array ans to recieve 
        //the value nested inside the index's of nums.
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        //the output
        return ans;
    }
}