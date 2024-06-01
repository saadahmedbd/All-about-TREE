package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {
    public static void inOrder(insertion.Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    // arrayList
    public static List<Integer> ans= new ArrayList<>();
    public static List<Integer>  inorderTravarsal(insertion.Node root){
        helper(root);
        return ans;
    }
    //helper method for inorder traversal
    public static void helper(insertion.Node root){
        if(root==null){
            return;
        }
        helper(root.left);
        ans.add(root.data);
        helper(root.right);
    }
}
