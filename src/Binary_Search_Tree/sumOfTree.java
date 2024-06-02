package Binary_Search_Tree;

public class sumOfTree {
    private static insertion.Node root;


    public static int sum(insertion.Node root){
        if(root==null){
            return 0 ;
        }
        int leftNodes=sum(root.left);
        int rightNodes=sum(root.right);
        return leftNodes+rightNodes+root.data;
    }

}
