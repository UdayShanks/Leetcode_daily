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

    public int maxpathsumrec(TreeNode root,int[] res){
        if(root==null){
            return 0;
        }

        int l=Math.max(0,maxpathsumrec(root.left,res));
        int r=Math.max(0,maxpathsumrec(root.right,res));

        res[0]=Math.max(res[0],l+r+root.val);
        return Math.max(l,r)+root.val;
    }

    public int maxPathSum(TreeNode root) {
        int[] res=new int[1];
        res[0]=root.val;
        maxpathsumrec(root,res);
        return res[0];
    }
}