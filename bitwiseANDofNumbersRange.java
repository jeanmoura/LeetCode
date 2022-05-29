/* 201. Bitwise AND of Numbers Range
Given two integers left and right that represent the range [left, right], 
return the bitwise AND of all numbers in this range, inclusive. 

Time Complexity O(n), Space Complexity O(1). */

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
            while(left < right)
            right &= right-1;
            return right;    
    }
}

