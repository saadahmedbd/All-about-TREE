package Binary_Search_Tree;

public class countOfTree {
    public static int count(insertion.Node root){
        if(root==null){
            return 0;
        }
        int leftNode =count(root.left);
        int rightNode =count(root.right);
        return leftNode+rightNode+1;
    }
}
