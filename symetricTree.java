/**
 * Definition for a symmetric binary tree.
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

 // https://leetcode.com/problems/symmetric-tree/
 
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);    
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
        && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
    }
}
