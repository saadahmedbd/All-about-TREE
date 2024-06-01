package Binary_Search_Tree;

public class postOrderTraversal {
    public static void postOrder(insertion.Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }
}
