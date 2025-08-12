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

    public int help(TreeNode root)
    {
        if(root==null){
            return 0;
        }
        int l=help(root.left);
        int b=help(root.right);
        if(root.left==null || root.right==null)
        {
            return 1+Math.max(l,b);
        }
        return 1+Math.min(l,b);

    }
    public int minDepth(TreeNode root) {
        return help(root);
        
    }
}