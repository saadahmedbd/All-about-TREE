package Binary_Search_Tree;

public class inOrderTraversal {
    public static void inOrder(insertion.Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
}
