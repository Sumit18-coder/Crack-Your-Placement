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
    public boolean isSymmetric(TreeNode root) {
         Queue<TreeNode> queueOfNodes = new LinkedList<>();

        queueOfNodes.add(root.left);
        queueOfNodes.add(root.right);

        while (!queueOfNodes.isEmpty()) {
            TreeNode left = queueOfNodes.poll();
            TreeNode right = queueOfNodes.poll();

            if (left == null && right == null) 
                continue;

            if (left == null || right == null)
                return false;

            if (left.val != right.val)
                return false;

            queueOfNodes.add(left.left);
            queueOfNodes.add(right.right);

            queueOfNodes.add(left.right);
            queueOfNodes.add(right.left);
        }
        return true;
    }
}