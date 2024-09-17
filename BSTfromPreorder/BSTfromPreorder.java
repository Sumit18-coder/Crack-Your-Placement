import java.util.Arrays;
class BSTfromPreorder{

    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }

    //a utility function to construct a bst from preorder traversal
    public static TreeNode constructBST(int[] preorder,int start,int end){
       if(start > end){
        return null;
       }
       //first element is the root of the current subtree.
       TreeNode root = new TreeNode(preorder[start]);

       //find the 1st element greater than root in tree.
       int i;
       for(i = start + 1;i <= end;i++){
           if(preorder[i] > root.val){
            break;
           }
       } 
       //construct left and right subtree recursively
       root.left = constructBST(preorder,start + 1,i - 1);
       root.right = constructBST(preorder,i,end);

       return root;
    }
    public static void postorderTraversal(TreeNode root){
       if(root == null){
        return;
       }
       postorderTraversal(root.left);
       postorderTraversal(root.right);
       System.out.println(root.val+"");
    }
    public static void main(String[] args) {
        int[] preorder = {40,30,35,80,100};
        int N = preorder.length;
        //construct bst from preorder array
        TreeNode root = constructBST(preorder,0,N-1);
        System.out.println("Postorder of constructed bst:");
        postorderTraversal(root);
    }
}