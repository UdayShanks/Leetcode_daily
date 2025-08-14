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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;

        Queue<Pair<TreeNode,Boolean>> q=new LinkedList<>();
        q.add(new Pair<>(root,false));
        int sum=0;

        while(!q.isEmpty()){
            Pair<TreeNode,Boolean> pair=q.remove();
            TreeNode node=pair.getKey();
            boolean isLeft=pair.getValue();


            if(isLeft && node.left==null && node.right==null){
                sum+=node.val;
            }
            if(node.left!=null){
                q.add(new Pair<>(node.left,true));
            }
            if(node.right!=null){
                q.add(new Pair<>(node.right,false));
            }
        }
        return sum;
    }
}