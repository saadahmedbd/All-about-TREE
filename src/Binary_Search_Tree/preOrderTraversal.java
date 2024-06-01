package Binary_Search_Tree;

public class preOrderTraversal {
    public static void preOrder(insertion.Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
