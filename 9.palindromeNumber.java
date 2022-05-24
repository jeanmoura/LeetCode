/*Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int sub = x;
        int reversed = 0;
        while (sub != 0) {
            reversed = reversed * 10 + sub % 10;
            sub /= 10;
        }
        
        return x == reversed;
    }
}