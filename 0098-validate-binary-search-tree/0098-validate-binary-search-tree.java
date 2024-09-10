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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        inorder(root,a);
       for(int i=0;i<a.size()-1;i++)
       {
        if(a.get(i)>=a.get(i+1))
        return false;
       }
       return true;
    }
    public void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if(root!=null)
        {
            inorder(root.left,a);
            a.add(root.val);
            inorder(root.right,a);
        }
    }
}