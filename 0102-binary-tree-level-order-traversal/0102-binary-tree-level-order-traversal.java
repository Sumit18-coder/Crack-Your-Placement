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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        List<List<Integer>> ans= new ArrayList<>();
        if(root == null) return ans;
        queue.offer(root);  
        while(!queue.isEmpty()){
            int currLevel= queue.size();
            List<Integer> temp= new ArrayList<>();
            for(int i=0; i< currLevel; i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);  
                if(queue.peek().right != null) queue.offer(queue.peek().right); 
                temp.add(queue.poll().val);  
            }
            ans.add(temp);
        }
        return ans;
    }
}