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
    private int total = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        sumOfLeavesHelper(root,false);
        return total;
    }
    private void sumOfLeavesHelper(TreeNode root,boolean isLeft){
        if(root == null){
            return;
        }
        if(isLeft && root.left == null && root.right == null){
            total += root.val;
            return;
        }
        sumOfLeavesHelper(root.left,true);
        sumOfLeavesHelper(root.right,false);
        return;
    }
}