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
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> listinorder = new ArrayList<>();

        inorder(root,listinorder);
        for(int target : queries){
            List<Integer> curr = binarySearch(target,listinorder);
            res.add(curr);
        }
        return res;
    }
    private void inorder(TreeNode node,List<Integer> listinorder){
        if(node == null)
           return;

        inorder(node.left,listinorder);
        listinorder.add(node.val);
        inorder(node.right,listinorder);
    }
    private List<Integer> binarySearch(int target,List<Integer> list){
        int left = 0;
        int right= list.size() - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(list.get(mid) == target){
                return List.of(target,target);
            }else if(list.get(mid) > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        int smallres = right == -1 ? -1 : list.get(right);
        int largeres = left == list.size() ? -1 : list.get(left);

        return List.of(smallres,largeres);
    }
}