package Binary_Search_Tree;

public class searching {
    private static insertion.Node root;

    public static void main(String[] args) {
        System.out.println(searchNode(root,6));
    }
    public static boolean searchNode(insertion.Node root, int target){
        if(root==null){
            return false;
        }
        if(root.data>target){
            return searchNode(root.left, target);

        }else if(root.data<target){
            return searchNode(root.right, target);
        }
        else{
            return true;
        }
    }
}
