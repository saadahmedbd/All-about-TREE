package BinaryTree;

public class DiameterOftree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        solution solution =new solution();
        int diameter = solution.diameterOfTree(root);
        System.out.println(diameter);

    }
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class solution{
        //global veriable
        int diameter =0;
        int calculateOfheight(Node root){
            if(root==null){
                return 0;
            }
            int left =calculateOfheight(root.left);
            int right =calculateOfheight(root.right);
            diameter=Math.max(diameter, left+right);
            return 1+Math.max(left, right);
        }
        int diameterOfTree(Node root){
            calculateOfheight(root);
            return diameter;
        }
    }
}
