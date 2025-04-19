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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return divide(nums,0, nums.length -1);
    }

        private TreeNode divide(int[] nums, int l, int r){
        if(l == r) return new TreeNode(nums[l]);
        
        int mid = l+ (r-l)/2;

        TreeNode left_sub = divide(nums,l, mid);
        TreeNode right_sub = divide(nums,mid+1,r);
        
        return merge(left_sub,right_sub);

    }

    private TreeNode merge(TreeNode left_sub, TreeNode right_sub){
        TreeNode iterator;

        if(left_sub.val > right_sub.val){
            iterator = left_sub;
            
            while(iterator.right != null && iterator.right.val > right_sub.val) iterator = iterator.right;
            if(iterator.right != null){
                TreeNode tmp_left = iterator.right;
                iterator.right = right_sub;
                merge(tmp_left,right_sub); 
            }
            else{
                iterator.right = right_sub;
            }
            return left_sub;
        } 
        else{
            iterator = right_sub;
            while(iterator.left != null && iterator.left.val > left_sub.val) iterator = iterator.left;
            if(iterator.left != null){
                TreeNode tmp_right = iterator.left;
                iterator.left = left_sub;
                merge(left_sub,tmp_right);
            }
            else{
                iterator.left = left_sub;
            }
            return right_sub;
        }
    }
}