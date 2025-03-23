class Solution {
    //bfs
    private boolean isBinaryTreeValid(int root,int[] leftChild,int[] rightChild){
        boolean[] visited = new boolean [leftChild.length];
        Queue<Integer> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        visited[root] = true;
        
        while(!nodeQueue.isEmpty()){
            int current = nodeQueue.poll();
            //check leftChild
            if(leftChild[current] != -1){
               if(visited[leftChild[current]]){
                return false;
               }
               nodeQueue.offer(leftChild[current]);
               visited[leftChild[current]] = true;
            }
            if(rightChild[current] != -1){
               if(visited[rightChild[current]]){
                return false;
               }
               nodeQueue.offer(rightChild[current]);
               visited[rightChild[current]] = true;
            }
        }
            for(boolean visit : visited){
                if(!visit){
                    return false;
                }
                return true;
            }
        return true;
    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] childCount = new boolean[n];
        //update child count based on left child
        for(int left : leftChild){
            if(left != -1){
                childCount[left] = true;
            }
        }
        //update child count based on rightchild
        for(int right : rightChild){
            if(right != -1){
                if(childCount[right]){//check if right child already have a parent
                     return false;
                }
                childCount[right] = true;
            }
        }
        int root= -1;
        for(int i= 0;i < n; i++){
            if(!childCount[i]){
               if(root == -1)
                  root = i;
               else
                  return false;
            }
        }
        if(root == -1){
            return false;
        }
        return isBinaryTreeValid(root ,leftChild, rightChild);
    }
}