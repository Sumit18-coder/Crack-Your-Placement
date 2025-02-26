class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        findPaths(0,graph,ans,new ArrayList<>());
        return ans;
    }
    private void findPaths(int node, int[][] graph, List<List<Integer>> ans, List<Integer> curr){
        curr.add(node);
        if(node == graph.length - 1){
            ans.add(new ArrayList<>(curr));
            curr.remove(curr.size() - 1);
            return;
        }
        for(int i : graph[node]){
            findPaths(i,graph,ans,curr);
        }
        curr.remove(curr.size() - 1);
    }
}