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
    public int[] findFrequentTreeSum(TreeNode root) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=sum(root,map);
        int max=0;
        int count=0;
        for(Integer key:map.keySet()){
            max=Math.max(max,map.get(key));
        }
       
        for(Integer key:map.keySet()){
            if(max==map.get(key)){
                count++;
            }
        }
        int[] ans=new int[count];
        int counter=0;
        for(Integer key:map.keySet()){
            if(max==map.get(key)){
                ans[counter++]=key;
            }
        }
        
        
        
        return ans;
        
    }
    public int sum(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null)return 0;
        int lh=sum(root.left,map);
        int rh=sum(root.right,map);
        map.put(lh+rh+root.val,map.getOrDefault(lh+rh+root.val,0)+1);
        return lh+rh+root.val;
    }
}

