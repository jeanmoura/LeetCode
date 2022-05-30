/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 // https://leetcode.com/problems/maximum-depth-of-binary-tree/
class Solution {
    public int maxDepth(TreeNode root) {
    if (root == null) {
        return 0;
    }   
    
    if (root.left == null && root.right == null) {
        return 1;
    }
        else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return (1 + ((l > r) ? l : r));
        }
        
    
    }
}
 //T O(n) S O(n)
