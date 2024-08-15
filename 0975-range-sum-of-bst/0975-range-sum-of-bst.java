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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        sumBST(root,low,high);
        return sum;
    }
    public void sumBST(TreeNode root,int low,int high){
        if(root==null) return;
        if(root.val<low){
            sumBST(root.right,low,high);
        }else if(root.val>high){
            sumBST(root.left,low,high);
        }else{
            sum+=root.val;
            sumBST(root.left,low,high);
            sumBST(root.right,low,high);
        }
    }
}