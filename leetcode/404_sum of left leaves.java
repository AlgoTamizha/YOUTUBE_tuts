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
class Solution {
    public int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root,false);
        return sum;
    }
    public void helper(TreeNode root,boolean left)
    {
        if(root.left == null && root.right == null && left )
        {
            sum  = sum + root.val;
            return;
        }
        if(root.left != null)
            helper(root.left,true);
        if(root.right != null)
            helper(root.right,false);
    }
}

//time O(N)
//space O(N)
