package Binary_Search_Tree;

import static Binary_Search_Tree.inOrderTraversal.*;
import static Binary_Search_Tree.postOrderTraversal.postOrder;
import static Binary_Search_Tree.preOrderTraversal.preOrder;

public class insertion {
    public static void main(String[] args) {
        int values [] ={4,10, 3, 8, 12};
        Node root = null;
        for(int i =0;i<values.length;i++){
            root=Node.insert(root, values[i]);
           // System.out.println(root.left);
        }
        //preOrder(root);
       //inOrder(root);
        //postOrder(root);
        System.out.println(inorderTravarsal(root));
       // helper(root);

    }
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
        }
        //method crete for insertion
        public static Node insert(Node root, int val){
            if(root==null){
                root =new Node(val);
                return root;
            }
            if(root.data>val){
                root.left=insert(root.left, val);
            }else{
                root.right=insert(root.right, val);
            }
            return root;
        }
    }
}
