/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();

    Set<Integer> visited = new HashSet<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        parentMap.put(root, null);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null){
                parentMap.put(node.left, node);
                queue.add(node.left);
            }
            if(node.right != null){
                parentMap.put(node.right, node);
                queue.add(node.right);
            }
        }
        appendKNodes(target,k);   
        return result;
    }
    private void appendKNodes(TreeNode node, int k){
        if(node == null) return; 
        if(visited.contains(node.val)) return; 
        visited.add(node.val);
        if(k==0){
            result.add(node.val); 
            return; 
        }
        TreeNode parent = parentMap.get(node);
        TreeNode left = node.left;
        TreeNode right = node.right;
        appendKNodes(parent, k-1);
        appendKNodes(left,k-1);
        appendKNodes(right,k-1);   
    }
}