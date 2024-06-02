package Binary_Search_Tree;

public class BuildTree {
    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,5,-1,6,-1,-1};
        binarySearchTree tree = new binarySearchTree();
        TreeNode root =tree.buildingTree(nodes);
        System.out.println(root.val);
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public static  class binarySearchTree{
        public static int idx=-1;
        public static TreeNode buildingTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            TreeNode newNode =new TreeNode(nodes[idx]);
            newNode.left = buildingTree(nodes);
            newNode.right=buildingTree(nodes);
            return newNode;
        }
    }
}
