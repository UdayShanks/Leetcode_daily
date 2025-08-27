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
    public int longestUnivaluePath(TreeNode root) {
        int[] res=new int[1];
        helper(root,res);
        return res[0];
    }

    public int helper(TreeNode root,int[] res){
        if(root==null){
            return 0;
        }
        int l=helper(root.left,res);
        int r=helper(root.right,res);

        int lpath=0,rpath=0;
        if(root.left!=null && root.left.val==root.val){
            lpath=l+1;
        }
        if(root.right!=null && root.right.val==root.val){
            rpath=r+1;
        }
        res[0]=Math.max(res[0],lpath+rpath);
        return Math.max(lpath,rpath);
    }
}