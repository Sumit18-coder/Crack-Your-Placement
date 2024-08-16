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
    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        int diameter = 0;

        if(root != null)
            stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();

            //fill up stack to perform post-order traversal
            if(node.left != null && !map.containsKey(node.left)){
                stack.push(node.left);
            }else if(node.right != null && !map.containsKey(node.right)){
                stack.push(node.right);
            }else{
                //process the root once left and right subtree have been processed
                stack.pop();
                int leftDepth = map.getOrDefault(node.left,0);
                int rightDepth = map.getOrDefault(node.right,0);

                //put the max depth at a node in the map
                map.put(node,1 + Math.max(leftDepth,rightDepth));

                //update the max diameter found so far
                diameter = Math.max(diameter, leftDepth + rightDepth);
            }
        }
        return diameter;
    }
}